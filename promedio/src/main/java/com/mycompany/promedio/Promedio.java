/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.promedio;

/**
 *
 * @author LENOVO-A8
 */
public class Promedio {

    public static void main(String[] args) {
        int operacion = 1;
        int num_uno = 8;
        int num_dos = 4;
        int resultado = 0;
        
        if (operacion == 1){
        resultado = num_uno + num_dos;
        System.out.println("el resultado de la suma es:" + resultado);
        } else if (operacion == 2){
        resultado = num_uno - num_dos;
        System.out.println("el resultado de la resta es:" + resultado);
        } else{
         System.out.println("la opcion no existe");
        }
        
    }
}
