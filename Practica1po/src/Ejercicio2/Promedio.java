/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

/**
 *
 * @author DIEGO
 */
public class Promedio {
    float n1=0;
    float n2;
    float prom;
    String est;
    
    float FPromedio(){
        return prom=(n1+n2)/2;
    }
    String FEstado(){
        if(prom>=13){
            return est="Aprobado";
        }
        else{
            return est="Desaprobado";
        }
    }
}
