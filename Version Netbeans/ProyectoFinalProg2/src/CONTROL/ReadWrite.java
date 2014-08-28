/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROL;

import MODELO.Concecionaria;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Nestor
 */
public class ReadWrite {
    //Ambos metodos son staticos no hace falta contruir un objeto para accede
    public static Concecionaria readObjeto() throws FileNotFoundException, IOException, ClassNotFoundException, EOFException {
        //Lee el objeto guardado lanza excepciones que deben ser capturadas
        ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("Concecionaria.obj"));
        Concecionaria obj1 = (Concecionaria) entrada.readObject();
        entrada.close();
        return obj1;
    }
    public static void writeObjeto(Object a) {
        //Guarda con el nombre Concecionaria.obj y captura posibles excepciones
        try {
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("Concecionaria.obj"));
            salida.writeObject(a);                                                  //writeUnshared(this);
            salida.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo");
            e.getMessage();
        } catch (IOException e) {
            System.out.println("Hubo un error al guardar");
            e.getMessage();
        }
    }
}
