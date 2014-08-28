/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROL;

import Excepciones.AnioExcep;
import Excepciones.CamposNulosExcep;
import Excepciones.ConversionExcep;
import Excepciones.PatenteExcep;
import MODELO.Camioneta;

import javax.swing.*;

/**
 *
 * @author claudia
 */
@SuppressWarnings("rawtypes") 

public class ControlIngresaCamioneta {

    private int anio;
    private int kms;
    private String marca;
    private String modelo;
    private String patente;
    private int precio;
    private String cabina;
    private boolean traccion;
    private final boolean estado=true;

    public ControlIngresaCamioneta() {
    }

    public void setValues(JTextField janio, JTextField jkms, JTextField jmarca, JTextField jmodelo, JTextField jpatente, JTextField jprecio, JCheckBox jtrac, JComboBox jCabina, int codigo) throws ConversionExcep, AnioExcep, CamposNulosExcep, PatenteExcep {
        anio = ConversionExcep.convertirInt(janio.getText(), "año");
        AnioExcep.evaluaAnio(anio);
        marca = CamposNulosExcep.validaCampos(jmarca.getText(), "Marca");
        modelo =  CamposNulosExcep.validaCampos(jmodelo.getText(),"modelo");
        patente =  PatenteExcep.validarPatente(CamposNulosExcep.validaCampos(jpatente.getText(),"patente"));
        precio = ConversionExcep.convertirInt(jprecio.getText(), "Precio");
        kms = ConversionExcep.convertirInt(jkms.getText(), "Kilometraje");
        if (jtrac.isSelected()) {
            traccion = true;
        } else {
            traccion = false;
        }
        if (jCabina.getSelectedIndex() == 0) {
            cabina = "Simple";
        } else {
            cabina = "Doble";
        }
        Camioneta c1= new Camioneta(cabina, traccion, marca, modelo, anio, patente, kms, precio, estado, Integer.toString(codigo));
        ControlConcecionaria.setCamioneta(c1);
    }

}
