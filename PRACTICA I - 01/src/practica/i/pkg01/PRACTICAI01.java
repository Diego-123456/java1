/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.i.pkg01;

import java.util.Scanner;

/**
 *
 * Ingrese un número entero mayor a 3 cifras. Debe verificar que sea de tres
 * cifras y mostrar un mensaje si es par o impar
 */
public class PRACTICAI01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int xv ;
        Scanner sc = new Scanner(System.in);
        // Leer el dato
         System.out.println("Ingrese número mayor cifras"); 
        xv = sc.nextInt(); 
        if (xv >= 999){
            if (xv % 2 == 0){
                System.out.println("Es par");
            }else{
                System.out.println("Es impar");
            }
        }else{
            System.out.println("Ingrese número de 3 cifras");
        }
    }
    
}
    
    

