/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui2;

/**
 *
 * @author DIEGO
 */
public class Sueldo {
    public double sue;
    public double pen;
    
    void MPension(int fila){
        switch(fila){
            case 0: pen=sue*0.05; break;//AFP
            case 1: pen=sue*0.07;break;  //ONP
        }
    }
    double FNeto(){
        double r=0;
        if(sue>1200) return (sue+(sue*0.02))-pen;
        else return sue-pen;
    }
}
