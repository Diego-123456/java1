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
public class ACTIVIDADENTREGABLE21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String nom,prod;
        double prec,cant;
        System.out.println("Ingrese su nombre; ");
        nom = sc.next();
        System.out.println("Ingrese el producto a consumir; ");
        prod = sc.next();
        System.out.println("Ingrese el precio del producto; ");
        prec = sc.nextDouble();
        System.out.println("Ingrese la cantidad a consumir; ");
        cant=sc.nextDouble();
        double cost_tot=prec*cant;
        double prec_igv=cost_tot*0.18;
        double sub_tot=cost_tot-prec_igv;
        System.out.println(nom + "aqui esta su boleta");
        System.out.println("1-Subtotal: "+sub_tot);
        System.out.println("2-igv: "+prec_igv);
        System.out.println("3-Monto a pagar "+cost_tot);
        
        
        
    }
    
}
