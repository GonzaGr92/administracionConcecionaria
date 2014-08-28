/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

import java.util.ArrayList;

/**
 *
 * @author Alumno
 */
public class Cliente implements java.io.Serializable{
    private String nombre;
    private String apellido;
    private int dni;
    private String direccion;
    private final String nacionalidad="Argentina";
    private final String provincia="Mendoza";
    private String localidad;
    private int telfijo;
    
    private ArrayList compro;

    public Cliente( String apellido, int dni, String direccion, String localidad, String nombre, int telfijo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.localidad = localidad;
        this.telfijo = telfijo;
        compro = new ArrayList();
    }

    
    
    public ArrayList <Vehiculo> getCompro() {
        return compro;
    }

    public void setComproAuto(Auto a1) {
        compro.add(a1);
    }
    
    public void setComproMoto(Motocicleta m1) {
        compro.add(m1);
    }
    
    public void setComproCamioneta(Camioneta c1) {
        compro.add(c1);
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getDni() {
        return dni;
    }
    
    public String getLocalidad() {
        return localidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelfijo() {
        return telfijo;
    }
    
}
