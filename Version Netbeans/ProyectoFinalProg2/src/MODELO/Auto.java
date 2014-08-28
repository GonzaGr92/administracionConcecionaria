/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

/**
 *
 * @author Alumno
 */
public class Auto extends Vehiculo implements java.io.Serializable{
    private int cantidadPuertas;
    private String combustible;
    private float cilmotor;
    private boolean gnc;

    public Auto(int año, int cantidadPuertas, float cilmotor, String combustible, int kilometraje, String marca, String modelo, String patente, boolean gnc, int precio,boolean estado, String codigo) {
        super(codigo, marca, modelo, año, patente, kilometraje, estado, precio);
        this.cantidadPuertas = cantidadPuertas;
        this.combustible = combustible;
        this.cilmotor = cilmotor;
        this.gnc = gnc;
        es="automovil";
    }
    
    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public float getCilmotor() {
        return cilmotor;
    }


    public String getCombustible() {
        return combustible;
    }
    
    public boolean isGnc() {
        return gnc;
    }
    
}
