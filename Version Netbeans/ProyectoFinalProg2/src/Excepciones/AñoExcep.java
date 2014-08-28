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
public class AñoExcep extends Exception{
    public AñoExcep(){
        super();
    }
    public AñoExcep(String m){
        super(m);
    }
    public static void evaluaAño(int año) throws AñoExcep{
        //Consulta el año actual
        Calendar calendar = Calendar.getInstance();
        int anioact = calendar.get(Calendar.YEAR);
        
        //Compara el año ingresado con un rango de años desde 1940 al año actual
        if (!(año>1940 && año<=anioact)) {
            throw new AñoExcep("ERROR: Año invalido");
        }
    }
    
}
