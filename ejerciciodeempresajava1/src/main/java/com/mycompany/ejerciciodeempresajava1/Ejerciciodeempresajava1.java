/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciodeempresajava1;

import java.util.Scanner;

/**
 *
 * @author LENOVO-A8
 */
public class Ejerciciodeempresajava1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre = "";
        int clave = 0, antiguedad = 0;
        
        System.out.println("***********************");
        System.out.println("bienvenidos a la empresa cocacola");
        System.out.println("***********************");
        System.out.println("");
        
        System.out.println(" ¿cual es el nombre del trabajador? ");
        nombre = entrada.nextLine();
        
        System.out.println(" ¿cual es la clave del trabajador ?");
        clave = entrada.nextInt();
        
        System.out.println(" ¿cual es el la antiguedad que tiene el trabajador? ");
        antiguedad = entrada.nextInt();
        
        if( clave == 1){
         if(antiguedad == 1){
            System.out.println("el trabajador " + nombre + " tiene 6 dias de vacaciones");
        
        } else if (antiguedad >=2 && antiguedad <=6){
            System.out.println(" el trabajador " + nombre + "tiene 14 dias de vacaciones");
            
        } else if (antiguedad >= 7){
            System.out.println("el trabajador " + nombre + "tiene 20 dias de vacaciones");
        }
        } else if (clave == 2){
        
          if (antiguedad == 1){
            System.out.println("el trabajador " + nombre + " tiene 7 dias de vacaciones");
        
        } else if (antiguedad >=2 && antiguedad <=6){
            System.out.println(" el trabajador " + nombre + "tiene 15 dias de vacaciones");
            
        } else if (antiguedad >= 7){
            System.out.println("el trabajador " + nombre + "tiene 22 dias de vacaciones");
        }
        }else if (clave == 3){
        
          if (antiguedad == 1){
            System.out.println("el trabajador " + nombre + " tiene 10 dias de vacaciones");
        
        } else if (antiguedad >=2 && antiguedad <=6){
            System.out.println(" el trabajador " + nombre + "tiene 20 dias de vacaciones");
            
        } else if (antiguedad >= 7){
            System.out.println("el trabajador " + nombre + "tiene 30 dias de vacaciones");
        }
        } else {
        System.out.println("ERROR!, la clave del departamento es incorrecto");
        }
        
    
    
      
    }
}
