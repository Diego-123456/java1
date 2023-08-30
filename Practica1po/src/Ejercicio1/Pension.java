/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

/**
 *
 * @author DIEGO
 */
public class Pension {
    float pen;
    float desc;
    float FDescuento(){
        if(pen>250){
            desc=(pen*3)/100;
            return desc;
        }
        else{
        desc=(pen*15)/1000;
        return desc;
}
}
    float FPago(){
        return pen-desc;
    }
}
