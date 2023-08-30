/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.ii;

import java.util.Scanner;

/**
 *
 * 4) Ingresar 5 numeros decimales y luego mostrar el promedio de ellos sin decimales 
 */
public class pregunta3 {
    public static void main(String[] args){
        float xnum, xsuma=0;
        Scanner sc = new Scanner (System.in);
        for (int i = 1; i <= 5; i ++) {
            System.out.println("Ingrese numero "+i);
            xnum= sc.nextFloat(); // Lee numero
            xsuma = xsuma + xnum; // Acumulacion de los # de ingresos
        }
        System.out.println("El promedio de los #s :" +(int)(xsuma/5) );
        
    }
    
}
