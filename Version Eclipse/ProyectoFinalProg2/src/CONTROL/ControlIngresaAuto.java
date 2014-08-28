/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROL;

import Excepciones.AnioExcep;
import Excepciones.CamposNulosExcep;
import Excepciones.ConversionExcep;
import Excepciones.PatenteExcep;

import javax.swing.*;

import MODELO.Auto;

/**
 *
 * @author Nestor
 */
@SuppressWarnings("rawtypes") 

public class ControlIngresaAuto {

    private int anio;
    private int kms;
    private String marca;
    private String modelo;
    private String patente;
    private int precio;
    private boolean gnc;
    private float cilindrada;
    private int cantPuertas;
    private String combustible;
    private final boolean estado=true;

    public ControlIngresaAuto() {
    }

    public void setValues(JTextField janio, JComboBox jcantPuertas, JTextField jcil, JRadioButton jgasoil, JTextField jkms, JTextField jmarca, JTextField jmodelo, JRadioButton jnafta, JTextField jpatente, JTextField jprecio, JCheckBox jGNC, int codigo) throws ConversionExcep, AnioExcep, CamposNulosExcep, PatenteExcep {
        //parsea y valida la excepciones de los atributos adquiridos del control
        anio = ConversionExcep.convertirInt(janio.getText(), "año");
        AnioExcep.evaluaAnio(anio);
        marca = CamposNulosExcep.validaCampos(jmarca.getText(), "Marca");
        modelo =  CamposNulosExcep.validaCampos(jmodelo.getText(),"modelo");
        patente =  PatenteExcep.validarPatente(CamposNulosExcep.validaCampos(jpatente.getText(),"patente"));
        precio = ConversionExcep.convertirInt(jprecio.getText(), "Precio");
        kms = ConversionExcep.convertirInt(jkms.getText(), "Kilometraje");

        cantPuertas = jcantPuertas.getSelectedIndex() + 2;
        cilindrada = ConversionExcep.convertirFloat(jcil.getText(), "cilindrada");
        if (jnafta.isSelected()) {
            combustible = "nafta";
            if (jGNC.isSelected()) {
                gnc = true;
            } else {
                gnc = false;
            }
        } else {
            combustible = "gasoil";
        }
        //Contruye un objeto de auto que luego lo setea en la relacion de concecionaria
        Auto a1 = new Auto(anio, cantPuertas, cilindrada, combustible, kms, marca, modelo, patente, gnc, precio, estado, Integer.toString(codigo));
        ControlConcecionaria.setAuto(a1);
        //metodo enviar a control concecionaria
    }
}
