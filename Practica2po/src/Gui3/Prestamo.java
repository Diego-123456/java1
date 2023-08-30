/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui3;

/**
 *
 * @author DIEGO
 */
public class Prestamo {
    public double pre;
    public double tasa;
    public double cuo;
    
    void MInteres(int fila){
        switch(fila){
            case 0: tasa=pre*0.20; break;//BCP
            case 1: tasa=pre*0.15;break;  //INTERBANK
            case 2: tasa=pre*0.12;break;  //BBVA
        }
    }
    double FComision(){
        return pre+tasa*cuo;
    }
    double FCuotas(){
        return tasa;
    }
}
