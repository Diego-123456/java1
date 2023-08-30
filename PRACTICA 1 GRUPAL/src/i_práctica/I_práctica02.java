/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package i_práctica;

import java.util.Scanner;

/**
 *
 * Una empresa decide otorgar una bonificación del 5% del sueldo básico por
 * cada hijo a todos sus trabajadores. Calcule el total a pagar a un trabajador
 */
public class I_práctica02 {
    public static void main(String[] args) {
        int xnh;
        float xsb, xneto;
        Scanner sc = new Scanner(System.in);
        // Leer el dato
        System.out.println("Ingrese sueldo básico"); 
        xsb = sc.nextFloat();
        System.out.println("Ingrese número de hijos"); 
        xnh = sc.nextInt();
        
        xneto = xsb + 0.05f* xsb * xnh;
        System.out.println("Le neto a pagar es : " + xneto);
        
    }
}
