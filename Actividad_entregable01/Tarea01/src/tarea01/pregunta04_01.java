/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea01;

import java.util.Scanner;

/**
 *Ingrese 5 numeros y hallar el mayor
 */
public class pregunta04_01 {
    public static void main(String[] args) {
        int mayor = 0;
        Scanner sc = new Scanner (System.in);
        for (int i=0;i<=4;i++){
            int a;
            System.out.println("Ingrese número "+(i+1));
            a=sc.nextInt();
            if(a>=mayor){
                mayor=a;
            }
        }
        System.out.println("El mayor es: " + mayor);
    }
}
