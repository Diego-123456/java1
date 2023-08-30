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
public class Funcion_propia02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a,suma=0;
        System.out.println("Suma de cuadrados");
        System.out.println("Ingrese 2 números");
        for (int i = 0; i < 2; i++) {
            System.out.println("Número "+(i+1));
            a =sc.nextFloat();
            suma += Math.pow(a, 2);
        }
        System.out.println("La suma de cuadrados es: "+suma);
    }
}
