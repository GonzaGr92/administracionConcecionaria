/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROL;

import Excepciones.AnioExcep;
import Excepciones.CamposNulosExcep;
import Excepciones.ConversionExcep;
import Excepciones.PatenteExcep;
import MODELO.Motocicleta;
import javax.swing.*;

/**
 *
 * @author Nestor
 */
public class ControlIngresaMoto {

    private int anio;
    private int kms;
    private String marca;
    private String modelo;
    private String patente;
    private int precio;
    private int cilindrada;
    private final boolean estado=true;

    public ControlIngresaMoto() {
    }

    public void setValues(JTextField janio, JTextField jcil, JTextField jkms, JTextField jmarca, JTextField jmodelo, JTextField jpatente, JTextField jprecio, int codigo) throws ConversionExcep, AnioExcep, CamposNulosExcep, PatenteExcep {
        anio = ConversionExcep.convertirInt(janio.getText(), "año");
        AnioExcep.evaluaAnio(anio);
        marca = CamposNulosExcep.validaCampos(jmarca.getText(), "Marca");
        modelo =  CamposNulosExcep.validaCampos(jmodelo.getText(),"modelo");
        patente =  PatenteExcep.validarPatente(CamposNulosExcep.validaCampos(jpatente.getText(),"patente"));
        precio = ConversionExcep.convertirInt(jprecio.getText(), "Precio");
        kms = ConversionExcep.convertirInt(jkms.getText(), "Kilometraje");
        cilindrada = ConversionExcep.convertirInt(jcil.getText(), "Cilindradada");
        
        Motocicleta m1 = new Motocicleta(cilindrada, marca, modelo, anio, patente, kms, precio, estado, Integer.toString(codigo));
        ControlConcecionaria.setMotocicleta(m1);
    }

}
