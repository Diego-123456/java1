/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad.entregable2.pkg1;

import java.util.Scanner;

/**
 *
 * @author LENOVO-A8
 */
public class pregunta4 {
    public static void main(String[] args) {
        int mayor = 0;
        Scanner sc = new Scanner (System.in);
        for (int i=0;i<=4;i++){
            int a;
            System.out.println("Ingrese numero "+(i+1));
            a=sc.nextInt();
            if(a>=mayor){
                mayor=a;
            }
        }
        System.out.println("El mayor es: " +mayor);
            }
        }
    
    

