/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui4;

/**
 *
 * @author DIEGO
 */
public class Pension {
    public double mat;
    public double total;
    public double neto;
    public double pen;
    
    void FCarrera(int fila){
        switch(fila){
            case 0: pen=650; break;
            case 1: pen=790;break;
            case 2: pen=780;break; 
        }
    }
    double Pension(){
        return pen;
    }
    double Total(){
        return total=pen+mat;
    }
    void FMaterial(int opcion){
        switch(opcion){
            case 0: neto=60; break;
            case 1: neto=120;break; 
        }
    }
    double FNeto(){
        return total+neto;
    }
}
