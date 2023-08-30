/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea01;

import java.util.Scanner;

/**
 *
 * @author SILVIA
 */
public class pregunta02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String nom;
        int est;
        int ch,vh;
        System.out.println("Ignrese sus apellidos y nombres: ");
        nom = sc.nextLine();
        System.out.println("Ingrese su estado civil: ");
        System.out.println("1-Casado");
        System.out.println("2-Soltero");
        est = sc.nextInt();
        System.out.println("Ingrese la cantidad de horas trabajadas: ");
        ch = sc.nextInt();
        System.out.println("Ingrese el valor de hora: ");
        vh =sc.nextInt();
        int sb=ch*vh;
        System.out.println("El sueldo bruto es: "+sb);
        double snp=sb*0.13,bf;
        System.out.println("Descuentos: "+snp);
        if(est==1){
            bf=sb*0.07;
            System.out.println("El bono familiar es de: "+bf);
        }else{
            bf=0;
        }
        double sn=sb-snp+bf;
        System.out.println("El sueldo neto es: "+sn);
    }
}
