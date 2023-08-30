/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg4;

import java.util.Scanner;

/**
 *
 * @author LENOVO-A8
 */
public class pregunt4 {
    public static void main(String[] args) {
        float num;
        int i = 1;
        int suma = 0;
        int TotalDeNumeros=5;
        double promedio=0;
        Scanner sc = new Scanner(System.in);
        while (i<=TotalDeNumeros) {
            System.out.println("Ingrese numero: ");
            num=sc.nextFloat();
            suma+=num;
            i++;
        }
        promedio=suma/TotalDeNumeros;
        System.out.println("El promedio es: "+promedio);
        
    }
}
