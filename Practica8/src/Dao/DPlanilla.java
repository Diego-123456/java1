/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Beans.Planilla;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USUARIO
 */
public class DPlanilla implements IDao<Planilla> {
    private List<Planilla> array = new ArrayList<>();

    @Override
    public DefaultTableModel FCargar() {
        Object col[]={"Código","Nombre","Sueldo","Cargo","Bonificación","Neto"};
        DefaultTableModel mdl = new DefaultTableModel(null, col);
        for (Planilla row:array) {
            Object fila[]={
                row.getCod(),
                row.getNom(),
                row.getSue(),
                row.getCar(),
                row.getBon(),
                row.getNeto()
            };
            mdl.addRow(fila);
        }
        return mdl;
    }

    @Override
    public void MGuardar(Planilla obj) {
        array.add(obj);
    }

    @Override
    public Planilla getVector(int f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void MEliminar(Object cod) {
        int f=(int) cod;
        array.remove(0);
    }
    
}
