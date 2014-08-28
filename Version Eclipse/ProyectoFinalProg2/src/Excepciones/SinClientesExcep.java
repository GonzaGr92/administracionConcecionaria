/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 *
 * @author Nestor
 */
public class SinClientesExcep extends Exception {
     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SinClientesExcep() {
    }

    public SinClientesExcep(String message) {
        super(message);
    }
}
