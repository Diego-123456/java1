/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solucionarioiii;

import java.util.Scanner;

/**
 *
 * Ingresar cantidad
 * ------- 20 -------- 50 ---------  
 * 
 * 
 */
public class SolucionarioIII_03 {
    public static void main(String[] args) {
        int xcan;
        String xnom;
        float xdescto=0, xpre;
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese producto");
        xnom = sc.nextLine();
        System.out.println("Ingrese cantidad");
        xcan = sc.nextInt();
        System.out.println("Ingrese precio");
        xpre = sc.nextFloat();
        
        if (xcan < 20){
            xdescto = 0.05f;
        }else if (xcan >= 20 && xcan <=50){
            xdescto = 0.10f;
        }else if (xcan > 50){
            xdescto = 0.15f;
        }
        
        float ximp = xcan * xpre - xdescto * xcan * xpre;
        System.out.println("El importe es : " + ximp);
        
    }
    
    
    
}
