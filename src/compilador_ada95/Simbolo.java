/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compilador_ada95;

/**
 *
 * @author David
 */
public class Simbolo {
    String tipo;
    String nombre;
    int offset;

    public Simbolo(String tipo, String nombre, int offset) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.offset = offset;
    }
    
    

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    @Override
    public String toString() {
        return "Simbolo{" + "tipo=" + tipo + ", nombre=" + nombre + ", offset=" + offset + '}';
    }
    
    
}
