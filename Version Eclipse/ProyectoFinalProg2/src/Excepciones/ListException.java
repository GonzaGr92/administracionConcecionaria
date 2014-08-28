/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 *
 * @author Nestor
 */
public class ListException extends Exception{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public ListException(){
        super();
    }
    public ListException(String m){
        super(m);
    }
}
