/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

import java.util.Calendar;

/**
 *
 * @author Nestor
 */
public class AnioExcep extends Exception{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public AnioExcep(){
        super();
    }
    public AnioExcep(String m){
        super(m);
    }
    public static void evaluaAnio(int anio) throws AnioExcep{
        //Consulta el año actual
        Calendar calendar = Calendar.getInstance();
        int anioact = calendar.get(Calendar.YEAR);
        
        //Compara el año ingresado con un rango de años desde 1940 al año actual
        if (!(anio>1940 && anio<=anioact)) {
            throw new AnioExcep("ERROR: Año invalido");
        }
    }
    
}
