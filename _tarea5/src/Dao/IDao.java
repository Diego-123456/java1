/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Lenovo
 */
public interface IDao<T> {
    DefaultTableModel FCargar();
    void MGuardar(T obj);
    void MActualizar(int pos,T obj);
    void MEliminar(Object cod);
    int FBuscar(Object bus);
    T getVector(int f);
}
