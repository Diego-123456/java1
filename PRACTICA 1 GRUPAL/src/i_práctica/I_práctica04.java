/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package i_práctica;

/**
 *
 * Mostrar los 10 primeros múltiplos de 3, al finalizar muestre su promedio de
 * los números.
 */
public class I_práctica04 {
    public static void main(String[] args) {
        int xsuma=0;
        for (int i = 1; i <= 10; i++) {
            xsuma = xsuma + (i*3);
            System.out.println(i*3);
        }
        System.out.println("El promedio es : " + xsuma/10);
    }
}
