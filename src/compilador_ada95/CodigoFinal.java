package compilador_ada95;

import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CodigoFinal {

    private Cuadruplo tablaCuadruplos;
    private Nodo arbol;
    private File archivo;
    private FileWriter fw;

    //
    int contMsg = 1;
    
    
    //
    TablaRegistros tablaRegistro = new TablaRegistros();
    
    

    CodigoFinal(Cuadruplo tablaCuadruplos, Nodo arbol, String nombreArchivo) {
        tablaRegistro.llenar();
        this.tablaCuadruplos = tablaCuadruplos;
        this.arbol = arbol;
        try {
            archivo = new File(nombreArchivo);
            fw = new FileWriter(nombreArchivo);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        
    }

    public void genArchivo() {

        try {
            genMips("   .data");
            buscarVarGlob(arbol);
            fw.write("\n");
            buscarWrites(tablaCuadruplos);
            fw.write("\n");
            genMips("   .text");
            genMips("   .globl main");
            fw.write("\n");
            fw.write("main: \n");
            for (int i = 0; i < tablaCuadruplos.getListaCuadruplo().size(); i++) {
                String operacion, arg1, arg2, destino, linea;
                destino = tablaCuadruplos.getListaCuadruplo().get(i).getDestino();
                operacion = tablaCuadruplos.getListaCuadruplo().get(i).getOp();
                arg1 = tablaCuadruplos.getListaCuadruplo().get(i).getArg1();
                arg2 = tablaCuadruplos.getListaCuadruplo().get(i).getArg2();
                if (operacion.contains("IF")){
                    genIf(operacion, arg1, arg2, destino);
                    String op, a1, a2, dest, lin;
                    dest = tablaCuadruplos.getListaCuadruplo().get(i + 1).getDestino();
                    op = tablaCuadruplos.getListaCuadruplo().get(i + 1).getOp();
                    a1 = tablaCuadruplos.getListaCuadruplo().get(i + 1).getArg1();
                    a2 = tablaCuadruplos.getListaCuadruplo().get(i + 1).getArg2();
                    genGoto(op, a1, a2, dest);
                    genMips("");
                    genEtiqueta("_etiq" + destino,destino);
                    String tam = Integer.toString(tablaCuadruplos.getListaCuadruplo().size());
                    String l = "b _etiq"+a1+"\n";
                    genMips(l);
                    genEtiqueta("_etiq" + a1,tam);
                    i=Integer.parseInt(a1)-1;
                } else if (operacion.contains("PUT") && arg1.equalsIgnoreCase("STRING") ) {
                    genPutString();
                } else if (operacion.contains("PUT") && arg1.equalsIgnoreCase("ID") ) {
                    genPutID(destino);
                } else if (operacion.contains("GOTO") || arg1.equals("-")) {
                    
                }
                else if (operacion.contains("GET")){
                    genGet(destino);   
                }
                else if (operacion.equals("+")){
                      genAdd(operacion, arg1, arg2, destino);
                }
                else{        
                }
            }
            String linea = "li $v0 10\n syscall";
            genMips(linea);
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void genTemporal(String op, String a1, String a2, String des){
        
        
    }
    
    public void genAdd(String op, String a1, String a2, String des){
        String linea="";
        Registro r1;
        Registro r2;
        r1 = tablaRegistro.obtenerTemporalLibre(a1);
        r2 = tablaRegistro.obtenerTemporalLibre(a2);
        genlW(r1.getTemporal(),"_"+a1);
        genlW(r2.getTemporal(),"_"+a2);
        char c = des.charAt(des.length()-1);
        int num = Character.getNumericValue(c)+2;
        des = "$t"+num;
        linea += "add "+des+", "+r1.getTemporal()+", "+r2.getTemporal()+" \n";
        linea +="sw "+des+", _"+a1+"\n";
        tablaRegistro.liberarTemporal(a1);
        genMips(linea);
    }
    
    public void genlW(String temporal, String variable){
        String linea="";
        linea+="lw "+temporal+", "+variable;
        genMips(linea);
    }
    

    public void genEtiqueta(String nombre, String inicio) {
        genMips(nombre + ":");
        int start = Integer.parseInt(inicio);
        for (int i = start; i < tablaCuadruplos.getListaCuadruplo().size(); i++) {
            String operacion, arg1, arg2, destino, linea;
            destino = tablaCuadruplos.getListaCuadruplo().get(i).getDestino();
            operacion = tablaCuadruplos.getListaCuadruplo().get(i).getOp();
            arg1 = tablaCuadruplos.getListaCuadruplo().get(i).getArg1();
            arg2 = tablaCuadruplos.getListaCuadruplo().get(i).getArg2();
            if (operacion.equalsIgnoreCase("PUT") && arg1.equalsIgnoreCase("STRING")) {
                genPutString();
            } else if (operacion.contains("PUT") && arg1.equalsIgnoreCase("ID") ) {
                genPutID(destino);
            } else if (operacion.equals("GOTO") || destino.equals('-')) {
                i=2000;
            }
               else if (operacion.equals("GOTO") && !destino.equals('-')) {
                
            }
            else if (operacion.equalsIgnoreCase("get")){
                genGet(destino);
            }
        }
    }

    public void genPutString() {
        String linea = "";
        linea += "li $v0, 4\n";
        linea += "la $a0, " + "_msg" + contMsg + "\n";
        linea += "syscall\n";
        genMips(linea);
        contMsg++;
    }
    public void genPutID(String id) {
        String linea = "";
        linea += "li $v0, 1\n";
        linea += "la $a0, " + "_" + id + "\n";
        linea += "syscall\n";
        genMips(linea);
    }
    
    public void genGet(String destino){
        String linea = "";
        linea += "li $v0, 5\n";
        linea += "syscall\n";
        linea += "sw $v0, _"+destino+"\n";
        genMips(linea);
        
    }

    public void genIf(String op, String a1, String a2, String des) {
        String linea = "";
        Registro reg1;
        Registro reg2;
        linea += "lw $t0, _" + a1 + "\n";
        linea += "lw $t1, _" + a2 + "\n";
        if (op.contains(">")) {
            linea += "bgt $t0, $t1, _etiq" + des;
            genMips(linea);
        } else if (op.contains("<")) {
            linea += "blt $t0, $t1, _etiq" + des;
            genMips(linea);
        }
    }

    public void genGoto(String op, String a1, String a2, String des) {
        String linea = "b _etiq" + a1;
        genMips(linea);
    }

    public void buscarWrites(Cuadruplo tablaCuadruplos) {
        int count = 1;
        for (FilaCuadruplo filaCu : this.tablaCuadruplos.getListaCuadruplo()) {
            String operacion, destino, linea, nuevoArg2, arg1;
            operacion = filaCu.getOp();
            arg1 = filaCu.getArg1();
            destino = filaCu.getDestino();
            if (operacion.equals("PUT") && arg1.equalsIgnoreCase("STRING")) {
                linea = "_msg" + count + ": .asciiz " + "\"" + destino + "\"";
                nuevoArg2 = "_msg" + count;
                genMips(linea);
                filaCu.setArg2(nuevoArg2);
                count++;
            }
        }
    }

    public void buscarVarGlob(Nodo nodo) {
        for (int i = 0; i < nodo.getHijos().size(); i++) {
            buscarVarGlob(nodo.getHijos().get(i));
            if (nodo.getHijos().get(i).getTipo().equals("INTEGER") && !nodo.getHijos().get(i).getTipo().contains("->")
                    &&
                    nodo.getHijos().get(i).getAmbito().equalsIgnoreCase("Global")) {
                String nombre = nodo.getHijos().get(i).getEtiqueta();
                String tipo = nodo.getHijos().get(i).getTipo();
                String linea = "_" + nombre + ":    .word 0";
                genMips(linea);
            }
        }
    }

    /*
     * public void buscarVarGlob(Nodo arbol) {
     * for (Simbolo simbolo : this.tablaSimbolos.getTabla()) {
     * String[] ambitoS;
     * String id, tipo, ambito, linea;
     * id = simbolo.getIdentificador();
     * tipo = simbolo.getTipo();
     * ambito = simbolo.getAmbito();
     * ambitoS = ambito.split("[.]");
     * if (ambitoS[0].equals("Main")) {
     * linea = "_" + id + "    .word 0";
     * genMips(linea);
     * }
     * }
     * }
     */

    public void genMips(String linea) {
        try {
            fw.write(linea + "\n");

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
    
    public void llenar(ArrayList<Registro> lista){
        for (int i = 0; i < 9; i++) {
            Registro registro = new Registro("$t"+i, " ");
            lista.add(registro);
        }
        
    }
}