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
public class TablaRegistros {
    
    ArrayList<Registro>tablaRegistro = new ArrayList();

    public TablaRegistros() {
    }

    public ArrayList<Registro> getTablaRegistro() {
        return tablaRegistro;
    }

    public void setTablaRegistro(ArrayList<Registro> tablaRegistro) {
        this.tablaRegistro = tablaRegistro;
    }

    @Override
    public String toString() {
        return "TablaRegistros{" + "tablaRegistro=" + tablaRegistro + '}';
    }
    
    public void llenar(){
        for (int i = 0; i < 9; i++) {
            Registro registro = new Registro("$t"+i, " ");
            tablaRegistro.add(registro);
        }
    }
    
    public Registro obtenerTemporalLibre(String Variable){
        Registro registro = new Registro();
        for (int i = 0; i < tablaRegistro.size(); i++) {
            if(tablaRegistro.get(i).getVariable().equals(" ")){
                tablaRegistro.get(i).setVariable(Variable);
                registro = tablaRegistro.get(i);
                break;
            }
        }
        return registro;
    }
    
    public void liberarTemporal(String Variable){
        for (int i = 0; i < tablaRegistro.size(); i++) {
            if(tablaRegistro.get(i).getVariable().equals(Variable)){
                tablaRegistro.get(i).setVariable(" ");
                break;
            }
        }
        
    }
}
