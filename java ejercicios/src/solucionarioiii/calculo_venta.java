/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solucionarioiii;

/**
 *
 * @author remigio
 */
public class calculo_venta {
    public static void importe(int xc, float xp){
        float xdescto=0;
        if (xc < 20){
            xdescto = 0.05f;
        }else if (xc >= 20 && xc <=50){
            xdescto = 0.10f;
        }else if (xc > 50){
            xdescto = 0.15f;
        }
        
        float ximp = xc * xp - xdescto * xc * xp;
        System.out.println("El importe es : " + ximp);
    }
    
    public static float impor(int xc, float xp){
        float xdescto=0;
        if (xc < 20){
            xdescto = 0.05f;
        }else if (xc >= 20 && xc <=50){
            xdescto = 0.10f;
        }else if (xc > 50){
            xdescto = 0.15f;
        }
        
        float ximp = xc * xp - xdescto * xc * xp;
        return ximp;
    }
}
