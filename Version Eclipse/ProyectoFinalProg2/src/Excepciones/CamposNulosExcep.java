/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 *
 * @author Nestor
 */
public class CamposNulosExcep extends Exception {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CamposNulosExcep() {
    }

    public CamposNulosExcep(String message) {
        super(message);
    }

    //Recibe como parametros el valor de un atributo en string y el nombre del mismo
    
    public static String validaCampos(String valor, String msj) throws CamposNulosExcep {
        //Si encuentra que uno no se a ingresado nada o que comienza con un espacio lanza la excepcion
        if ("".equals(valor)) {
            throw new CamposNulosExcep("ERROR: Debe ingresar un " + msj.toUpperCase());
        } else {
            if (valor.charAt(0) == ' ') {
                throw new CamposNulosExcep("ERROR: " + msj.toUpperCase() + " no valido");
            } else {
                return valor;
            }
        }
    }
}
