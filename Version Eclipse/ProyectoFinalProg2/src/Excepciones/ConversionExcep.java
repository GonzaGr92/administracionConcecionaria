/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 *
 * @author Nestor
 */
public class ConversionExcep extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public ConversionExcep(){
        super();
    }
    public ConversionExcep(String m){
        super(m);
    }
    //retorna entero y es estatico
    public static int convertirInt(String valor, String mensaje) throws ConversionExcep{
        int resul;
        //Convierte a un String a entero recibe como parametro el valor y el nombre del atributo
        try {
            resul=Integer.parseInt(valor);
            return (resul);
            //capura la excepcion si no es un numero, si no retorna el entero
        } catch (NumberFormatException e) {
            //Lanza una nueva excepcion propia con un mensaje 
            throw new ConversionExcep("ERROR: Fallo conversion a entero en "+mensaje.toUpperCase());
        }
    }
    //Idem convertirInt pero parsea un float
    public static float convertirFloat(String valor, String mensaje) throws ConversionExcep{
        float resul;
        try {
            resul=Float.parseFloat(valor);
            return (resul);
        } catch (NumberFormatException e) {
            throw new ConversionExcep("ERROR: Fallo conversion a Float en "+mensaje.toUpperCase());
        }
    }
    
}
