/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package i_práctica;

/**
 *
 * Mostrar los 10 primeros impares positivos, y al finalizar muestre la suma de
 * los números.
 */
public class I_práctica03 {
    public static void main(String[] args) {
        int xsuma=0;
        for (int i = 1; i <= 10; i++) {
            xsuma = xsuma + (i*2-1);
            System.out.println(i*2-1);
        }
        System.out.println("La suma es : " + xsuma);
    }
}
