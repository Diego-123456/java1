/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.switch1;

/**
 *
 * @author LENOVO-A8
 */
public class Switch1 {

    public static void main(String[] args) {
        int numUno = 5, numDos = 4, resultado = 0;
        int parametro = 2;
        
        switch(parametro){
        
            case 1 : resultado = numUno + numDos;
                     System.out.println("el resultado de la suma es:" + resultado);
                     break;
            case 2 : resultado = numUno - numDos;
                     System.out.println("el resultado de la resta es:" + resultado);
                     break;
                     
            default:System.out.println("la opcion no existe");
                     break;
        }
                
    }
}
