/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg4;

import java.util.Scanner;

/**
 *
 * @author LENOVO-A8
 */
public class pregunta2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Ingrese el dinero a convertir");
        float soles = sc.nextFloat();
        if(soles<=0){
            System.out.println("Tiene que ser una cantiad mayor a cero");
        }
        System.out.println("A que moneda desea convertir?");
        System.out.println("1.Dolares");
        System.out.println("2.Dolares");
        int moneda = sc.nextInt();
        
        float cambio;
        if(moneda==1){
            cambio =3.32f;
        }else{
            cambio =4.2f;
        }
        float dinero = soles/cambio;
        System.out.println("El cambio seria: "+dinero);
        }
        
        
    }

