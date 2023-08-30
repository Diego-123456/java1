/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Beans.Vendedor;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USUARIO
 */
public class DVendedor implements IDao<Vendedor>{
     private List<Vendedor> array=new ArrayList<>();

    @Override
    public DefaultTableModel FCargar() {
        DefaultTableModel mdl2=new DefaultTableModel();
        mdl2.addColumn("Codigo");
        mdl2.addColumn("Nombre");
        mdl2.addColumn("Apellido");
        mdl2.addColumn("Cargo");
        mdl2.addColumn("Sueldo");
        for (int i = 0; i < array.size(); i++) {
            Object data[]={
                array.get(i).getCod(),
                array.get(i).getNom(),
                array.get(i).getApe(),
                array.get(i).getCar(),
                array.get(i).getSue()};
            mdl2.addRow(data);
        }
        return mdl2;
    }

    @Override
    public void MGuardar(Vendedor obj) {
        array.add(obj); 
    }

    @Override
    public void MActualizar(int pos, Vendedor obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void MEliminar(Object cod) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int FBuscar(Object bus) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vendedor getVector(int f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
