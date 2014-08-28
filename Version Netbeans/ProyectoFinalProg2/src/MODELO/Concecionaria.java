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
public class Concecionaria implements java.io.Serializable {
    private final String cuil="A30-435675-X";
    private final String razonSocial="Concecionaria Ejemplo S.A";
    private final String direccion="Aristobulo del Valle 1500";
    private int telefono=43567902;
    
    private ArrayList vende= new ArrayList();
    private ArrayList <Cliente> tiene=new ArrayList();

    public Concecionaria() {
        
    }

    public ArrayList getVende() {
        return vende;
    }

    public ArrayList <Vehiculo> getVehiculo() {
        return vende;
    }
    
    public void setVende(Auto vende) {
        this.vende.add(vende);
    }
    public void setVende(Motocicleta vende) {
        this.vende.add(vende);
    }
    public void setVende(Camioneta vende) {
        this.vende.add(vende);
    }

    public ArrayList<Cliente> getTiene() {
        return tiene;
    }

    public void setTiene(Cliente cl) {
        tiene.add(cl);
    }

    public String getCuil() {
        return cuil;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getTelefono() {
        return telefono;
    }
    
}
