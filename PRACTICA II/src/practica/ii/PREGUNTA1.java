/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.ii;

import java.util.Scanner;

/**
 *
 * Pregunta 1
 */
public class PREGUNTA1 {
    public static void main(String[] args) {
        
        int xnum;
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese numero de 2 cifras,");
        xnum = sc.nextInt(); //45/10
        int num = 0;
        if (num >= 10 && xnum <= 99){
            int xcif_uni = xnum % 10; //Se obtiene la cifra de unidad 
            if (xcif_uni == 3){
                System.out.println("El cuadrado es : "+ Math.pow(xnum,2));
            }else{
                System.out.println("El cubo es : "+ Math.pow(xnum,3));
            }   

        }else{ 

    }
}

        
    
    
    
