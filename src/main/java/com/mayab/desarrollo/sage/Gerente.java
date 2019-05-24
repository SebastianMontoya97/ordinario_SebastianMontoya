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
public class Gerente implements Observer{
    public String nombre;
    public String permiso;
    public int hora1, hora2;
    public Gerente(String nombre){
        this.nombre=nombre;
        this.permiso="Ambos";
        this.hora1=0;
        this.hora2=24;
    }
    
    public void setHoraLimite(int n1, int n2){
        this.hora1=n1;
        this.hora2=n2;
    }
    
    public void setPermiso(String permiso){
        if(permiso=="Ambos"){
            this.permiso="Ambos";
        }else if(permiso=="Correo"){
            this.permiso="Correo";
        }else if(permiso=="Celular"){
            this.permiso="Celular";
        }else if(permiso=="Ninguno"){
            this.permiso="Ninguno";
        }else{
            System.out.println("El permiso "+permiso+" no existe");
        }
    }
    
    @Override
    public void update(String nombre, String tipo, String descripcion, double gasto, int hora) {
        System.out.println("Notificaciones para "+this.nombre+":");
        if(this.permiso=="Ambos"){
            if(this.hora1<hora && hora<this.hora2){
            MensajeCorreo correo = new MensajeCorreo();
            correo.notificacion(this.nombre, nombre, tipo, descripcion, gasto);
            MensajeCelular celular = new MensajeCelular();
            celular.notificacion(this.nombre, nombre, tipo, descripcion, gasto);
            }else{ }
        }else if(this.permiso=="Correo"){
            if(this.hora1<hora && hora<this.hora2){
            MensajeCorreo correo = new MensajeCorreo();
            correo.notificacion(this.nombre, nombre, tipo, descripcion, gasto);
            }else{}
        }else if(this.permiso=="Celular"){
            if(this.hora1<hora && hora<this.hora2){
                MensajeCelular celular = new MensajeCelular();
            celular.notificacion(this.nombre, nombre, tipo, descripcion, gasto);}
            else{}
        }else if(this.permiso=="Ninguno"){}
    }
    public String getPermiso(){
        return this.permiso;
    }
    public String getNombre(){
        return this.nombre;
    }
    
}
