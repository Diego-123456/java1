/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.i.pkg01;

/**
 *
 * Programa que permita el ingreso de un número de botellas retornable de
   vidrio de Inka Kola y el precio de la botella retornable; los cuales se desean
   poner en cajas de 12 unid., y luego se deberá mostrar: (10 puntos)
   - El total de cajas llenas
   - El precio de la caja de Inka Kola
   - El Importe total por todas las cajas llenas.
   -La cantidad de botellas sobrantes.
 */
public class pregunta6 {
     int xbotellas, tot_cajas;
        float xprecio;
        Scanner sc = new Scanner(System.in);
        // Leer el dato
        System.out.println("Ingrese número  de botellas"); 
        xbotellas = sc.nextInt();
        System.out.println("Ingrese precio por unidad"); 
        xprecio = sc.nextFloat();
        tot_cajas = (int)(xbotellas/12) ; // Hay 12 unidades por caja
        // resultados
        System.out.println("Total de cajas llenas : " + tot_cajas);
        System.out.println("Precio de la caja : " + xprecio*12 );
        System.out.println("Importe de las cajas : " + tot_cajas*xprecio*12);
        System.out.println("Cantidad de botellas sobrantes : "+ (xbotellas - tot_cajas*12));
    }
}
    
}
