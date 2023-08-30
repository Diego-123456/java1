/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones_tarea;

import java.util.Scanner;

/**
 *
 * @author SILVIA
 */
public class Funciones_cadena {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("Introduzca su nombre: ");
        String xnom = sc.next();
        
        System.out.println("La inicial de su nombre: ");
        System.out.println(xnom.charAt(0));
        
        System.out.println("Cantidad de letras en el nombre: ");
        System.out.println(xnom.length());
    }
}
