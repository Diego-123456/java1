/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

/**
 *
 * @author DIEGO
 */
public class Sueldo {
    float consumo,desc,monto,igv;
    float Descuento(){
        if(consumo<=60){
            desc=(float)(consumo*0.075);
        }else{
            desc=(float)(consumo*0.12);
        }
        return desc;
    }
    float igv(){
        igv=(float)(consumo*0.18);
        return igv;
    }
    float Monto(){
        monto=consumo+igv-desc;
        return monto;
    }
}
