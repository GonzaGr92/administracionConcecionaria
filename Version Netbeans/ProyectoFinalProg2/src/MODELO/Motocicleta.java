/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

/**
 *
 * @author Alumno
 */
public class Motocicleta extends Vehiculo implements java.io.Serializable{
    private int cilindrada;

    public Motocicleta(int cilindrada, String marca, String modelo, int año, String patente, int kilometraje, int precio, boolean estado, String codigo) {
        super(codigo, marca, modelo, año, patente, kilometraje, estado, precio);
        this.cilindrada = cilindrada;
        es="motocicleta";
    }

    public int getCilindrada() {
        return cilindrada;
    }
    
}
