/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solucionarioiii;

import java.util.Scanner;
import static solucionarioiii.calculo_venta.impor;

/**
 *
 * @author remigio
 */
public class Venta {
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
    
}
