/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

import CONTROL.ControlConcecionaria;

/**
 *
 * @author Nestor
 */

public class CodigoExcep extends Exception{

    public CodigoExcep(){
        super();
    }
    public CodigoExcep(String m){
        super(m);
    }
    public static void validarCodigo(int valor, final ControlConcecionaria ctrl) throws CodigoExcep{
        if (ctrl.getCtrlConcecionaria().getVehiculo().size()-1<valor) {
            throw new CodigoExcep("ERROR Codigo no encontrado");
        }
    }
}
