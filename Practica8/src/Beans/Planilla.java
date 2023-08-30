/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

/**
 *
 * @author USUARIO
 */
public class Planilla {
    private int cod;
    private String nom;
    private double sue;
    private String car;
    private double bon;
    private double neto;
    
    public Planilla(){}

    public Planilla(int cod, String nom, double sue, String car, double bon, double neto) {
        this.cod = cod;
        this.nom = nom;
        this.sue = sue;
        this.car = car;
        this.bon = bon;
        this.neto = neto;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getSue() {
        return sue;
    }

    public void setSue(double sue) {
        this.sue = sue;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public double getBon() {
        return bon;
    }

    public void setBon(double bon) {
        this.bon = bon;
    }

    public double getNeto() {
        return neto;
    }

    public void setNeto(double net) {
        this.neto = neto;
    }
    
    
}
