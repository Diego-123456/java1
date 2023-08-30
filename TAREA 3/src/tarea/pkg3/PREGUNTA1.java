/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.pkg3;

import java.util.Scanner;

/**
 *
 *  Ingresar 5 alumnos su nombre y sexo
 * Hallar el porcentaje de varones
   
 * 5 .... 100%
 * cv ....X
 * x = (cv * 100)/5
 */
public class PREGUNTA1 {
    public static void main(String[] args) {
        String xnom;  // Nombre
        char xs; // Sexo
        int xcan_varones = 0;
        Scanner sc = new Scanner (System.in);
                
        for (int i = 1; i <= 5; i++) {
            System.out.println("Ingrese nombre");
            xnom = sc.next();
            System.out.println("Ingrese sexo");
            xs = sc.next().toUpperCase().charAt(0); // siempre xs es mayúscula
                       
            if (xs =='H') xcan_varones += 1;
            
        }
       
        float xpor =(float) (xcan_varones * 100 /5); // Fórmula
        System.out.println("El porcentaje de varones es : " +(xpor)+"%");
        
    }
    
}

    

