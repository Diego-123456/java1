/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

/**
 *
 * @author DIEGO
 */
public class Boleta {
    float horas,monto;
    float inc=0;
    float FMonto(){
        monto=(horas*15);
        return monto;
    }
    float FIncremento(){
        if(horas>60){
            monto=(horas*15);
            inc=monto*0.015f;
            return inc;
        }else{
            return inc=0;
        }
    }
    float FPagoNeto(){
        return monto+inc;
    } 
}
