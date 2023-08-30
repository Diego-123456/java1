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
public class Persona {
    private String nom;
    private String ape;
    
    public Persona(){   //Constructor sin Parametro
        
    }
    
    public Persona(String Nom, String Ape){   //Constructor con Parametros
        this.nom = Nom;
        this.ape = Ape;
    }
    
    public void setNom(String Nom){     //Encapsulamiento Entrada
        this.nom = Nom;
    }
    
    public void setApe(String Ape){     //Encapsulamiento Entrada
        this.ape = Ape;
    }
    
    public String getNom(){     //Encapsulamiento Salida
        return this.nom;
    }
    
    public String getApe(){     //Encapsulamiento Salida
        return this.ape;
    }
}
