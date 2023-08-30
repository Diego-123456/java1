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
public class pregunta3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre de un producto: ");
        String nombre = sc.next();
        System.out.println("Ingrese el precio del producto: ");
        float precio = sc.nextFloat();
        if(precio<=0){
            System.out.println("Introduzca un precio mayor a cero");
        }
        System.out.println("Ingrese la cantidad a comprar: ");
        int cantidad = sc.nextInt();
        
        float descuento;
        if(cantidad<5){
            descuento=0.05f;
        }else if(cantidad>=5 && cantidad<10){
            descuento=0.08f;
        }else{
            descuento=0.1f;
        }
        
        float precio_neto=cantidad*precio-(cantidad*precio*descuento);
        System.out.println("El precio neto es: "+precio_neto);
            
        }
        
        
        
        
    }

