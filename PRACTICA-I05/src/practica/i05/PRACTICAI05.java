/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.i05;

import java.util.Scanner;

/**
 *
 * Ingrese su nombre y apellido,
 * y luego mostrar el primer caracter  de nombre seguido de un punto
 * y espacio y finalmente su apellido
 */
public class PRACTICAI05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String xnom, xapellido;
        char xprime;
        int xpos;
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese nombre y apellido");
        xnom = sc.nextLine(); //Remigio Huarcaya
        char xprimer = xnom.charAt(0);
        xpos = xnom.indexOf(" ",0);
        xapellido = xnom.substring(xpos+1);
        
        
        System.out.println("El nombre es : "+xprimer+ ". "+xapellido );
    }
    
}
