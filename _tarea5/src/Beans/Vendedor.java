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
public class Vendedor extends Persona{
    private String cod;
    private String car;
    private String sue;
    
    
    public Vendedor(){}
    
    public Vendedor(String Cod, String Nom, String Ape, String Car, String Sue){
        super(Nom, Ape);
        this.cod = Cod;
        this.car = Car;
        this.sue = Sue;
    }
    public void setCod(String Cod){
        this.cod = Cod;
    }
    public void setCar(String Car){
        this.car = Car;
    }
    public void setSue(String Sue){
        this.sue = Sue;
    }
    public String getCod(){
        return this.cod;
    }
    public String getCar(){
        return this.car;
    }
    public String getSue(){
        return this.sue;
    }
}
