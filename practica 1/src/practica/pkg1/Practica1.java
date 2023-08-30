/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg1;

/**
 *
 * Ingresar  5 numeros enteros y luego mostrar la cantidad de numeros
 * divisibles por 2 y 5
 * 10 20 30 40 50 
 */                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int xcan=0;
        for (int i = 1; i <=5; i++) {
            if (i % 2 == 0){ //i es divisible por 2
                //xcan = xcan + 1;
                xcan += 1;
            if (i % 3 == 0){ //i es divisible por 5
                //xcan = xcan + 1;
                xcan += 1;
            }
            }
        }
        System.out.println("La cantidad de div por 2 : "+ xcan );
        System.out.println("La cantidad de div por 5 : "+ xcan );
    }
    
}
