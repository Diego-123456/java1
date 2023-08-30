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
public class pregunta2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String nom;
        int est;
        int ch,vh;
        System.out.println("Ingrese sus apellidos y nombres; ");
        nom = sc.nextLine();
        System.out.println("Ingrese su estado civil; ");
        System.out.println("1-casado");
        System.out.println("2-soltero");
        est = sc.nextInt();
        System.out.println("Ingrese la cantidad de horas trabajadas: ");
        ch = sc.nextInt();
        System.out.println("Ingrese el valor de horas ; ");
        vh =sc.nextInt();
        int ab=ch*vh;
        System.out.println("El sueldo bruto es; "+ab);
        double sb = 0;
        double snp=sb*0.13,bf;
        System.out.println("Descuentos; "+snp);
        if(est==1){
            bf=sb*0.07;
            System.out.println("El bono familiar es de; ");
        }else{
            bf=0;
        }
        double sn=sb-snp+bf;
            System.out.println("El sueldo neto: "+sn);
            
        }
        
        
        
    }
    

