/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.i03;

import java.util.Scanner;

/**
 *
 * Ingrese el nombre de un producto, su precio y la cantidad a comprar 
 * y luego mostrar el importe a pagar .
 * Debera considerar que , si la cantidad a comprar a 20 unidades ,
 * se aplicara un descuento de 10%
 */
public class PRACTICAI03 {

    private static float xdescto;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String xpro;
        float xpre=0;
        int xcan;
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese nombre de producto");
        xpro = sc.nextLine();
        System.out.println("Ingrese precio");
        xpre = sc.nextFloat();
        xcan = sc.nextInt();
        
        // Hallar el descuento 10/100 = 0.10
        if (xcan > 20){
            float xdscto = (float) 0.10 * xcan * xpre;
        }else{
            int xdescto = 0;
        }
        float ximp = xdescto - xpre * xcan;
        
        System.out.println("El importe a pagar : " + ximp);
        
    }
}                
    
    

