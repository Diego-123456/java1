/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones_tarea;

import java.io.File;

/**
 *
 * @author SILVIA
 */
public class Funciones_directorio {
    public static void main(String[] args) {
        File archivo = new File("C:\\Users\\SILVIA\\Desktop\\Clases virtualeas Yisus\\Base de datos\\nombres.txt");
        
        System.out.println("Se puede leer:"+archivo.canRead());
        System.out.println("Se puede ejecutar: "+archivo.canExecute());
        System.out.println("Se puede editar: "+archivo.canWrite());
        System.out.println("El nombre del archivo es: "+archivo.getName());
        System.out.println("Nombre del archivo: "+archivo.getPath());
        System.out.println("Tamaño del archivo: "+archivo.length()+" bytes");
    }
}
