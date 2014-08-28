/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROL;

import Excepciones.AñoExcep;
import Excepciones.CamposNulosExcep;
import Excepciones.ConversionExcep;
import Excepciones.PatenteExcep;
import javax.swing.*;
import MODELO.Auto;

/**
 *
 * @author claudia
 */
public class ControlIngresaAuto {

    private int año;
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

    public void setValues(JTextField jaño, JComboBox jcantPuertas, JTextField jcil, JRadioButton jgasoil, JTextField jkms, JTextField jmarca, JTextField jmodelo, JRadioButton jnafta, JTextField jpatente, JTextField jprecio, JCheckBox jGNC, int codigo) throws ConversionExcep, AñoExcep, CamposNulosExcep, PatenteExcep {
        //parsea y valida la excepciones de los atributos adquiridos del control
        año = ConversionExcep.convertirInt(jaño.getText(), "año");
        AñoExcep.evaluaAño(año);
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
        Auto a1 = new Auto(año, cantPuertas, cilindrada, combustible, kms, marca, modelo, patente, gnc, precio, estado, Integer.toString(codigo));
        ControlConcecionaria.setAuto(a1);
        //metodo enviar a control concecionaria
    }
}
