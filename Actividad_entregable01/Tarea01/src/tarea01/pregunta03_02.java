/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea01;

import java.util.Scanner;

/**
 *Crear un programa que pueda dar a elegir marcas de autos y la cantidad que importara
 *Mostrar el precio de a pagar por todos los autos
 */
public class pregunta03_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Elija la marca de los autos: ");
        System.out.println("1)Hyundai");
        System.out.println("2)Toyota");
        System.out.println("3)KIA");
        System.out.println("4)Suzuki");
        int marca = sc.nextInt();
        int prec= 0;
        switch (marca){
            case 1:
                prec=37000;
                break;
            case 2:
                prec=37200;
                break;
            case 3:
                prec=33000;
                break;
            case 4:
                prec=26900;
                break;
        }
        System.out.println("Ingrese la cantidad de autos que comprara: ");
        int cant = sc.nextInt();
        int costo;
        costo = cant * prec;
        System.out.println("El precio a pagar es: " + costo);
    }
}
