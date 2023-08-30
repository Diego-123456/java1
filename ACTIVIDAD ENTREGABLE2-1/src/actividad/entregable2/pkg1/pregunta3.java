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
public class pregunta3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Elija el producto a llevar; ");
        System.out.println("1)Lata de atun - 5/u");
        System.out.println("2)Bolsa de arroz 5kg - 10/u");
        System.out.println("3)Aceite - 7/u");
        System.out.println("4)Bolsa de sa - 3/u ");
        int pro = sc.nextInt();
        int prec = 0;
        switch (pro){
            case 1:
                prec=5;
                break;
            case 2:
                prec=10;
                break;
            case 3:
                prec=7;
                break;
            case 4:
            prec=3;
            break;
        }
        System.out.println("Ingrese las unidades qe llevara; ");
        int cant = sc.nextInt();
        int costo;
        costo = cant * prec;
        System.out.println("El precio a pagar; " + costo);
        
        }
        
    }

