/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg4;

import java.util.Scanner;

/**
 *
 * pregunta 5 
 */
public class pregunta5 {
    public static void main(String[] args) {
        String nombre,apellido;
        char primernom;
        int pos;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingres nombre y apellido: ");
        nombre = sc.nextLine();
        
        primernom = nombre.charAt(0);
        pos = nombre.indexOf(" ", 0);
        apellido = nombre.substring(pos + 1);
        
        System.out.println("El nombre es: "+ primernom + ". " + apellido);
        
        
        
        
    }
    
}
