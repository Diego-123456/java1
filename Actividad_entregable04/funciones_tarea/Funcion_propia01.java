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
public class Funcion_propia01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a, suma=0;
        System.out.println("Promedio de notas");
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese nota "+(i+1));
            a=sc.nextInt();
            suma += a;
        }
        float prom = suma/5;
        System.out.println("El promedio de notas es: "+prom);
    }
}
