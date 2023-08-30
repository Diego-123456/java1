/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Beans.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class DCliente implements IDao<Cliente>{
    private List<Cliente> array=new ArrayList<>();
    
    @Override
    public DefaultTableModel FCargar() {
        DefaultTableModel mdl=new DefaultTableModel();
        mdl.addColumn("Codigo");
        mdl.addColumn("Nombre");
        mdl.addColumn("Apellido");
        mdl.addColumn("Ruc");
        for (int i = 0; i < array.size(); i++) {
            Object data[]={
                array.get(i).getCod(),
                array.get(i).getNom(),
                array.get(i).getApe(),
                array.get(i).getRuc()};
            mdl.addRow(data);//Agregar Filas a Tablas
        }
        return mdl;
    }

    @Override
    public void MGuardar(Cliente obj) {
        array.add(obj);     //Agregar datos Array - M. Ram
    }

    @Override
    public void MActualizar(int pos, Cliente obj) {
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
    public Cliente getVector(int f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
