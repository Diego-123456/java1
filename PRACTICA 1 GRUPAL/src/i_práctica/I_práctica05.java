/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package i_práctica;

import java.util.Scanner;

/**
 *
 * En una empresa se necesita datos estadísticos de su personal, para esto se
   solicita un programa que permita el ingreso de los nombres, año de ingreso y
   sexo (M o F) de sus 500 trabajadores. Se debe mostrar los siguientes:
    
    • Número de damas.
    • Número de varones
    • Promedio de tiempo de servicio de todos los trabajadores.
 */
public class I_práctica05 {
    public static void main(String[] args) {
        String xnom;
        char xs;
        int xnro_damas=0, xservicio=0,xaño, xsuma_año=0;
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.println("Ingrese nombre");
            xnom = sc.nextLine();
            System.out.println("Ingrese año de ingreso");
            xaño = sc.nextInt();
            System.out.println("Ingrese sexo");
            xs = sc.nextLine().charAt(0);
            
            if (xs == 'F'){
                xnro_damas = xnro_damas + 1;
            }
            xsuma_año = xsuma_año + xaño;
        }
        System.out.println("Cantidad de damas es : " + xnro_damas);
        System.out.println("Cantidad de varones es : " + (5 - xnro_damas));
        System.out.println("El promedio de año es " +xsuma_año/5 );
    }
}
