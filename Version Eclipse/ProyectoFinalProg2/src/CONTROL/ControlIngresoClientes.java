/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROL;

import Excepciones.AnioExcep;
import Excepciones.CamposNulosExcep;
import Excepciones.ConversionExcep;
import MODELO.Auto;
import MODELO.Camioneta;
import MODELO.Cliente;
import MODELO.Motocicleta;

import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author Nestor
 */
@SuppressWarnings("rawtypes") 

public class ControlIngresoClientes {
    private String apellido; 
    private String nombre;
    private String localidad;
    private String direccion;
    private int telefono;
    private int dni;
    private ControlConcecionaria ctrl;
    
    public ControlIngresoClientes(ControlConcecionaria ctrl){
        this.ctrl=ctrl;
    }
    public void setValues(JTextField japellido, JTextField jdni, JTextField jdireccion, JTextField jnombre, JTextField jlocalidad, JTextField jtelefono, JComboBox indexAuto) throws ConversionExcep, AnioExcep, CamposNulosExcep {
        int codigo;
        String es;
        apellido=CamposNulosExcep.validaCampos(japellido.getText(),"apellido");
        dni=ConversionExcep.convertirInt(jdni.getText(),"DNI");
        direccion=CamposNulosExcep.validaCampos(jdireccion.getText(),"direccion");
        nombre=CamposNulosExcep.validaCampos(jnombre.getText(),"nombre");
        localidad=CamposNulosExcep.validaCampos(jlocalidad.getText(),"localidad");
        telefono=ConversionExcep.convertirInt(jtelefono.getText(),"TELEFONO");
        
        Cliente cl1= new Cliente(apellido, dni, direccion, localidad, nombre, telefono);
        
        codigo=Integer.parseInt(indexAuto.getSelectedItem().toString());
        
        ctrl.getCtrlConcecionaria().getVehiculo().get(codigo).setEstado(false);
        es=ctrl.getCtrlConcecionaria().getVehiculo().get(codigo).getEs();
             
        if (es.equals("automovil")) {
            cl1.setComproAuto(irAuto(codigo));
        }
        if (es.equals("camioneta")) {
            cl1.setComproCamioneta(irCamioneta(codigo));
        }
        if (es.equals("motocicleta")) {
            cl1.setComproMoto(irMoto(codigo));
        }
        ctrl.getCtrlConcecionaria().setTiene(cl1);
        
    }
    public void relaciona(JComboBox indexAuto,JComboBox indexCliente){
        int codigoAuto;
        int codigoCliente;
        String es;
        
        codigoAuto=Integer.parseInt(indexAuto.getSelectedItem().toString());
        codigoCliente=indexCliente.getSelectedIndex();
        
        ctrl.getCtrlConcecionaria().getVehiculo().get(codigoAuto).setEstado(false);
        es=ctrl.getCtrlConcecionaria().getVehiculo().get(codigoAuto).getEs();
             
        if (es.equals("automovil")) {
            ctrl.getCtrlConcecionaria().getTiene().get(codigoCliente).setComproAuto(irAuto(codigoAuto));
        }
        if (es.equals("camioneta")) {
            ctrl.getCtrlConcecionaria().getTiene().get(codigoCliente).setComproCamioneta(irCamioneta(codigoAuto));
        }
        if (es.equals("motocicleta")) {
            ctrl.getCtrlConcecionaria().getTiene().get(codigoCliente).setComproMoto(irMoto(codigoAuto));
        }
    }
    
    private Auto irAuto(int i) {
        return ((Auto) ctrl.getCtrlConcecionaria().getVehiculo().get(i));
    }
    private Camioneta irCamioneta(int i) {
        return ((Camioneta) ctrl.getCtrlConcecionaria().getVehiculo().get(i));
    }
    private Motocicleta irMoto(int i) {
        return ((Motocicleta) ctrl.getCtrlConcecionaria().getVehiculo().get(i));
    }

}
