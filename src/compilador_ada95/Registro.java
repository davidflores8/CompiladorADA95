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
public class Registro {
    String Temporal;
    String Variable;

    public Registro(String Temporal, String Variable) {
        this.Temporal = Temporal;
        this.Variable = Variable;
    }

    public Registro() {
    }

    public String getTemporal() {
        return Temporal;
    }

    public void setTemporal(String Temporal) {
        this.Temporal = Temporal;
    }

    public String getVariable() {
        return Variable;
    }

    public void setVariable(String Variable) {
        this.Variable = Variable;
    }

    @Override
    public String toString() {
        return "Registro{" + "Temporal=" + Temporal + ", Variable=" + Variable + '}';
    }
    
    
}
