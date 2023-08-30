/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

/**
 *
 * @author Lenovo
 */
public class Cliente extends Persona{
    private String cod;
    private String ruc;
    
    public Cliente(){}
    
    public Cliente(String Cod, String Nom, String Ape, String Ruc){
        super(Nom, Ape);
        this.cod = Cod;
        this.ruc = Ruc;
    }
    
    public void setCod(String Cod){
        this.cod = Cod;
    }

    public void setRuc(String Ruc){
        this.ruc = Ruc;
    }
    
    public String getCod(){
        return this.cod;
    }

    public String getRuc(){
        return this.ruc;
    }
}
