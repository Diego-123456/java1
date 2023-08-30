/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solucionarioiii;

import java.util.Scanner;

/**
 *
 * Ingressar 5 nombre y contar los que empiezan con A
 */
public class SolucionarioII_02 {
    public static void main(String[] args) {
        
        char car ;
        int xc = 0 ;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese apellidos");
            car = sc.next().toUpperCase().charAt(0);
            if (car == 'A') xc += 1;
        }
        System.out.println("La cantidad de apellidos con A son "+ xc);
    }
}
