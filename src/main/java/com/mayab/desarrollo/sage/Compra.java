/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.desarrollo.sage;

/**
 *
 * @author Sebastian M.M
 */
public class Compra {
    public String tipo;
    public String descripcion;
    public double gasto;
    
    public Compra(){
        this.tipo="";
        this.descripcion="";
        this.gasto=0;
    }
    public void setTipo(String tipo){
        this.tipo=tipo;
    }
    public void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }
    public void setGasto(double gasto){
        this.gasto=gasto;
    }
    public String getTipo(){
        return this.tipo;
    }
    public String getDescripcion(){
        return this.descripcion;
    }
    public double getGasto(){
        return this.gasto;
    }
}
