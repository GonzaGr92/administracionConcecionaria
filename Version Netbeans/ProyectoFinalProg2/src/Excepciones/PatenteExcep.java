/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 *
 * @author Nestor
 */
public class PatenteExcep extends Exception {

    public PatenteExcep() {
    }

    public PatenteExcep(String message) {
        super(message);
    }

    public static String validarPatente(String patente) throws PatenteExcep {
        //formato XXX 000

        for (int i = 0; i < 3; i++) {
            if(isNumeric(patente.charAt(i))){
                throw new PatenteExcep("PATENTE no valida, ingrese una patente XXX999");
            }
        }
        for (int i = 3; i < 6; i++) {
            if(!(isNumeric(patente.charAt(i)))){
                throw new PatenteExcep("PATENTE no valida, ingrese una patente XXX999");
            }
        }
        //Maximo y minimo de cacteres 6
        if (patente.length()!=6) {
            throw new PatenteExcep("PATENTE no valida, ingrese una patente XXX999");
        }
        return patente;
    }
    private static boolean isNumeric(char patente) {
        try {
            Integer.parseInt(""+patente);
            return (true);
        } catch (NumberFormatException e) {
            return(false);
        }
    }
}
