/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROL;

import MODELO.Auto;
import MODELO.Camioneta;
import MODELO.Concecionaria;
import MODELO.Motocicleta;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author claudia
 */
public class ControlConcecionaria {
   
    //invocar en el constructor de principal

    private static Concecionaria ctrlConcecionaria;
    private static Auto auto;
    private static Motocicleta motocicleta;
    private static Camioneta camioneta;
    
    public ControlConcecionaria() {
        //Cada vez que arranca se crea este objeto y se llama a check
        ctrlConcecionaria = check();
    }

    private Concecionaria check() {
        //Lee el objeto en caso de que no exista (FileNot Found) crea un objeto nuevo de concecionaria
        Concecionaria auxConcecionaria;
        try {
            auxConcecionaria = (Concecionaria) ReadWrite.readObjeto();
            return (auxConcecionaria);
        } catch (FileNotFoundException e) {
            auxConcecionaria = new Concecionaria();
            return (auxConcecionaria);
        } catch (Exception e) {
            System.out.println("Se produjo un error al intentar leer el archivo");
            return (null);
        }
    }
    
    public int consultaCodigo() {
        if (ctrlConcecionaria != null) {
            return (ctrlConcecionaria.getVende().size());
        } else {
            return (0);
        }
    }
    
    public void guardar(){
        ReadWrite.writeObjeto(ctrlConcecionaria);
    }
    public static void setAuto(Auto aAuto) {
        auto = aAuto;
        setVendeAuto();
    }
    public static void setMotocicleta(Motocicleta aMotocicleta) {
        motocicleta = aMotocicleta;
        setVendeMotocicleta();
    }

    public static void setCamioneta(Camioneta aCamioneta) {
        camioneta = aCamioneta;
        setVendeCamioneta();
    }
    private static void setVendeAuto (){
        ctrlConcecionaria.setVende(auto);
    }
    private static void setVendeCamioneta (){
        ctrlConcecionaria.setVende(camioneta);
    }
    public static void setVendeMotocicleta (){
        ctrlConcecionaria.setVende(motocicleta);
    }

    public Concecionaria getCtrlConcecionaria() {
        return ctrlConcecionaria;
    }
}
