/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

/**
 *
 * @author Alumno
 */
public class Camioneta extends Vehiculo implements java.io.Serializable{
    //Valores posibles: simple o doble
    private String cabina;
    //true= 4x4 false=4x2
    private boolean traccion;

    public Camioneta(String cabina, boolean traccion, String marca, String modelo, int año, String patente, int kilometraje, int precio, boolean estado,String codigo) {
        super(codigo, marca, modelo, año, patente, kilometraje, estado, precio);
        this.cabina = cabina;
        this.traccion = traccion;
        es="camioneta";
    }

    public String getCabina() {
        return cabina;
    }

    public boolean isTraccion() {
        return traccion;
    }
    
}
