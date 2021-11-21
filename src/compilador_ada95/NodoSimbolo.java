/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compilador_ada95;

import java.util.ArrayList;

/**
 *
 * @author David
 */
public class NodoSimbolo {
    Simbolo simbolo;
    ArrayList<Simbolo> hijos;
    int id;

    public NodoSimbolo() {
    }

    public NodoSimbolo(Simbolo simbolo, int id) {
        this.simbolo = simbolo;
        this.hijos = new ArrayList();
        this.id = id;
    }
    
    public Simbolo getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(Simbolo simbolo) {
        this.simbolo = simbolo;
    }

    public ArrayList<Simbolo> getHijos() {
        return hijos;
    }

    public void setHijos(ArrayList<Simbolo> hijos) {
        this.hijos = hijos;
    }

    @Override
    public String toString() {
        return "NodoSimbolo{" + "simbolo=" + simbolo.toString() + ", hijos=" + hijos + '}';
    }
    
    
    
}
