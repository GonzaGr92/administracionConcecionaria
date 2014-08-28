/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

/**
 *
 * @author Alumno
 */
public abstract class Vehiculo implements java.io.Serializable{
    private String codigo;
    private String marca;
    private String modelo;
    private int año;
    private String patente;
    private int kilometraje;
    private String estado;
    private int precio;
    protected String es;
    
    public Vehiculo() {
    }

    public Vehiculo(String codigo, String marca, String modelo, int año, String patente, int kilometraje, boolean estado, int precio) {
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.patente = patente;
        this.kilometraje = kilometraje;
        if (estado==true) {
            this.estado="En Venta";
        }else{
            this.estado="Vendido";
        }
        this.precio = precio;
    }

    
    public int getPrecio() {
        return precio;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public String getEstado() {
        return estado;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public String getMarca() {
        return marca;
    }

    public int getAño() {
        return año;
    }

    public String getPatente() {
        return patente;
    }

    public String getTipo() {
        return modelo;
    }

    public String getEs() {
        return es;
    }

    public String getModelo() {
        return modelo;
    }

    public void setEstado(boolean estado) {
        if (estado==true) {
            this.estado="En Venta";
        }else{
            this.estado="Vendido";
        }
    }
    
}
