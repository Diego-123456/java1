/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

/**
 *
 * @author DIEGO
 */
public class Consumo {
    public double consumo;
    public double neto;
    
    double FDescuento(){
        double r=0;
        if(consumo>60)r=consumo*0.12;
        else r=consumo*0.075;
        return r;
      
    }
    double Figv(){
        return consumo*0.18;
    }
    void MNeto(){
        neto=(consumo-FDescuento())+Figv();
    }
}
