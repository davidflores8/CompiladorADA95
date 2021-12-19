package compilador_ada95;
import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CodigoFinal {

    private Cuadruplo tablaCuadruplos;
    private Nodo arbol;
    private File archivo;
    private FileWriter fw;

    CodigoFinal(Cuadruplo tablaCuadruplos, Nodo arbol, String nombreArchivo) {
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
            genMips("   .globl Main");
            fw.write("\n");
            for (FilaCuadruplo filaCu : tablaCuadruplos.getListaCuadruplo()) {
                String destino, operacion, arg1, arg2, linea;
                destino = filaCu.getDestino();
                operacion = filaCu.getOp();
                arg1 = filaCu.getArg1();
                arg2 = filaCu.getArg2();
                if (operacion.equals("ETIQ")) {

                    genMips(arg1+":"); 
                }else{
                    genMips("   blabla");
                }
            }
            fw.close();
        } catch (Exception e) {
        }
    }

    public void buscarWrites(Cuadruplo tablaCuadruplos) {
        int count = 1;
        for (FilaCuadruplo filaCu : this.tablaCuadruplos.getListaCuadruplo()) {
            String operacion, destino, linea, nuevoArg2;
            operacion = filaCu.getOp();
            destino = filaCu.getDestino();
            if (operacion.equals("PUT")) {
                linea = "_msg" + count + ": .asciiz " + "\"" + destino + "\"";
                nuevoArg2 = "_msg" + count;
                genMips(linea);
                filaCu.setArg2(nuevoArg2);
                count++;
            }
        }
    }
    
    public void buscarVarGlob(Nodo nodo){
    for (int i = 0; i <nodo.getHijos().size(); i++) {
            buscarVarGlob(nodo.getHijos().get(i));
            if(nodo.getHijos().get(i).getTipo().equals("INTEGER") && !nodo.getHijos().get(i).getTipo().contains("->") && 
                    nodo.getHijos().get(i).getAmbito().equalsIgnoreCase("Global")){
                        String nombre = nodo.getHijos().get(i).getEtiqueta();
                        String tipo = nodo.getHijos().get(i).getTipo();
                        String linea = "_" + nombre + "    .word 0";
                        genMips(linea);
            }   
        }
    }

    /* public void buscarVarGlob(Nodo arbol) {
        for (Simbolo simbolo : this.tablaSimbolos.getTabla()) {
            String[] ambitoS;
            String id, tipo, ambito, linea;
            id = simbolo.getIdentificador();
            tipo = simbolo.getTipo();
            ambito = simbolo.getAmbito();
            ambitoS = ambito.split("[.]");
            if (ambitoS[0].equals("Main")) {
                linea = "_" + id + "    .word 0";
                genMips(linea);
            }
        }
    } */

    public void genMips(String linea) {
        try {
            fw.write(linea + "\n");
            
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}