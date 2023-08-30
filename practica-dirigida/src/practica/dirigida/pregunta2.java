/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.dirigida;

/**
 *
 * WHILE
 */
public class pregunta2 {
    public static void main(String[] args) {
        //Arreglo unidimensional  de 9 elementos 
        float num[] = {12, 45, 13, 67, 1.62f, 45, 7, 14, 9, 56.7f};
        int in = 0;
        // El while como el for usan break (romper el ciclo)
        while(in < num.length){
            System.out.println(num[in]);
            in= in + 1 ;
        }
    }
    
}
