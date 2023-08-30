/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.pkg3;

import java.util.Scanner;

/**
 *
 * @author LENOVO-A8
 */
public class problemadeventa {
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

    private static String impor(int xcan, float xpre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
    


    
