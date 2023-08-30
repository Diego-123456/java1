/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solucionarioiii;

import java.util.Scanner;

/**
 *
 * @author remigio
 */
public class SolucionarioIII_04 {
    public static void main(String[] args) {
        int xcan;
        String xnom;
        float xpre;
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese producto");
        xnom = sc.nextLine();
        System.out.println("Ingrese cantidad");
        xcan = sc.nextInt();
        System.out.println("Ingrese precio");
        xpre = sc.nextFloat();
        // Llamamos a un método void
        //importe(xcan, xpre);
        
        System.out.println("El importe es : " + impor(xcan, xpre));
    }
    private static void importe(int xc, float xp){
        float xdescto=0;
        if (xc < 20){
            xdescto = 0.05f;
        }else if (xc >= 20 && xc <=50){
            xdescto = 0.10f;
        }else if (xc > 50){
            xdescto = 0.15f;
        }
        
        float ximp = xc * xp - xdescto * xc * xp;
        System.out.println("El importe es : " + ximp);
    }
    
    private static float impor(int xc, float xp){
        float xdescto=0;
        if (xc < 20){
            xdescto = 0.05f;
        }else if (xc >= 20 && xc <=50){
            xdescto = 0.10f;
        }else if (xc > 50){
            xdescto = 0.15f;
        }
        
        float ximp = xc * xp - xdescto * xc * xp;
        return ximp;
    }
}
