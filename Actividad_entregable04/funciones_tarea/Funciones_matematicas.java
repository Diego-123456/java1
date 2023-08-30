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
public class Funciones_matematicas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número");
        float xnum = sc.nextFloat();
        System.out.println("=====================");
        System.out.println("La raiz cuadrada es:");
        float raiz=(float) Math.sqrt(xnum);
        System.out.println(raiz);
        System.out.println("=====================");
        System.out.println("El cuadrado del número es:");
        float cuadrado = (float) Math.pow(xnum, 2);
        System.out.println(cuadrado);
    }
}
