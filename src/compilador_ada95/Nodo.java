package compilador_ada95;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author David
 */
public class Nodo {
    private String etiqueta;
    private ArrayList<Nodo> hijos = new ArrayList<>();
    private int idNodo;
    private String Ambito="";
    private String tipo=" ";
    private int offset=1000;

    public Nodo() {
    }

    public Nodo(String etiqueta, int idNodo, String tipo, int offset, String Ambito) {
        this.etiqueta = etiqueta;
        this.idNodo = idNodo;
        this.tipo = tipo;
        this.offset = offset;
        this.Ambito=Ambito;
    }
    
    public Nodo(String _etiqueta, int _idNodo, String Ambito) {
        this.etiqueta = _etiqueta;
        this.idNodo = _idNodo;
        this.Ambito = Ambito;
    }

    public String getTipo() {
        return tipo;
    }

     
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public String getAmbito() {
        return Ambito;
    }

    public void setAmbito(String Ambito) {
        this.Ambito = Ambito;
    }
    
    
    

    

    public void exportarArbol(String dotFormat, String fileName) {
        GraphViz gv = new GraphViz();
        gv.addln(gv.start_graph());
        gv.add(dotFormat);
        gv.addln(gv.end_graph());
        String type = "png";
        String repesentationType = "dot";
        gv.decreaseDpi();
        gv.decreaseDpi();
        // linux
        //File out = new File("./" + fileName + gv.getImageDpi() + "." + type);
        //windows
        File out = new File(fileName + "." + type);
        gv.writeGraphToFile(gv.getGraph(gv.getDotSource(), type, repesentationType), out);
    }

    @Override
    public String toString() {
        return idNodo + " [label=\"" + etiqueta + "  ID: "+ idNodo+ " Ambito: "+ Ambito+"\"];";
    }

    public void addHijo(Nodo hijo) {
        this.hijos.add(hijo);
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public ArrayList<Nodo> getHijos() {
        return hijos;
    }

    public void setHijos(ArrayList<Nodo> hijos) {
        this.hijos = hijos;
    }

    public int getIdNodo() {
        return idNodo;
    }

    public void setIdNodo(int idNodo) {
        this.idNodo = idNodo;
    }

}
