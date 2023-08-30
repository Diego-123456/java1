/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.ii;

import java.util.Scanner;

/**
 *
 * Ingrese un importe de dolares y el tipo de cambio (ambos numeros deben ser de 
 * tipo float, luego mostrar el importe en soles 
 */
public class PRACTICAII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float ximp_dol, tipo_cambio;
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese importe en dolares");
        ximp_dol = sc.nextFloat();
        System.out.println("Ingrese tipo de cambio");
        float xtipo_cambio = sc.nextFloat();
        
        if (ximp_dol>0 && xtipo_cambio>0){
            
            float ximp_soles = ximp_dol * xtipo_cambio;
            System.out.println("El importe en soles : " + ximp_soles);
            
        }else{
            System.out.println("Verificar datos de entrada");
        }
        
        
        
    }
    
}
