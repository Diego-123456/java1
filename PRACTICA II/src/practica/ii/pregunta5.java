/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.ii;

import java.util.Scanner;

/**
 *
 * @author LENOVO-A8
 */
public class pregunta5 {
    public static void main (String[] args) {
        String xnombre;
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese nombre ");
        xnombre = sc.nextLine(); // Dany
        
        char x1 = xnombre.charAt(0);
        char xu = xnombre.charAt(xnombre.length()-1);
        
        String xn = String.valueOf(x1) + String.valueOf(xu);
        
        System.out.println("La respuesta "+ xn.toUpperCase());
        
    }
}
