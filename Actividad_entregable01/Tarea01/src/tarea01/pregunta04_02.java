/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea01;

import java.util.Scanner;

/**
 *Ingresar 5 notas y sacar el promedio
 */
public class pregunta04_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int xsuma = 0;
        for (int i=0;i<=4;i++){
            int a;
            System.out.println("Ingrese número "+(i+1));
            a=sc.nextInt();
            xsuma += a;
        }
        double xprom=xsuma/3;
        System.out.println("El promedio es: " + xprom);
    }
}
