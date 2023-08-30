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
public class pregunta301 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Elija la marca de los autos: ");
        System.out.println("1)Hyundai");
        System.out.println("2)kia");
        System.out.println("3)Toyota");
        System.out.println("4)Susuki");
        int marca = sc.nextInt();
        int prec= 0;
        switch (marca){
            case 1:
                prec=37000;
                break;
            case 2:
                prec=372000;
                break;
            case 3:
                prec=33000;
                break;
            case 4:
                prec=26900;
                break;
        }
        System.out.println("Ingrese la cantidad de autos que comprara; ");
        int cant = sc.nextInt();
        int costo;
        costo = cant * prec;
        System.out.println("El precio a pagar es; " + costo);
    }
    
}
