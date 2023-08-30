/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg4;

import java.util.Scanner;

/**
 *
 * @author LENOVO-A8
 */
public class PRACTICA4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String poi;
        System.out.println("Ingrese un número de 2 cifras: ");
        int xnum=sc.nextInt();
        int a = xnum/10;
        int d = xnum%10;
        if(xnum%2==0){
            poi="par";
        }else{
            poi="impar";
        }
        System.out.println("La suma de cifras es: "+(a+d));
        System.out.print("El numero es "+poi);
    }
    
}
