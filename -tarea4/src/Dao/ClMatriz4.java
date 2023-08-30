/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SHAYLA
 */
public class ClMatriz4 {
    private final static int c=3, f=3,c2=2,f2=3;
    private int matriz[][]=new int[f][c];
    private String promedio[][]=new String[f2][c2];
    public DefaultTableModel mdl1=new DefaultTableModel();
    public DefaultTableModel mdl2=new DefaultTableModel();
    
    public void MCargarTabla(){
        mdl1.setColumnCount(c);
        mdl1.setRowCount(f);
        mdl2.setColumnCount(c2);
        mdl2.setRowCount(f2);
    }
    
    public void MAgregar(){
        for (int ff = 0; ff < f; ff++) {
            int suma=0;
            for (int cc = 0; cc < c; cc++) {
                matriz[ff][cc]=Integer.parseInt(JOptionPane.showInputDialog("Ing.Numero"));
                suma=suma+matriz[ff][cc]; 
            }
            promedio[ff][0]=(""+(suma/3));
            if (Double.parseDouble(promedio[ff][0])>=11) {
                promedio[ff][1]="Aprobado";
            }else{
                promedio[ff][1]="Desaprobado";
            }
        } 
    }
    public void MMostrar(){
        for (int ff = 0; ff < f; ff++) {
            for (int cc = 0; cc < c; cc++) {
                mdl1.setValueAt(matriz[ff][cc], ff, cc);  
                if (cc<=1) {
                mdl2.setValueAt(promedio[ff][cc],ff, cc);   
                }
            }
        }
 
    }
}
