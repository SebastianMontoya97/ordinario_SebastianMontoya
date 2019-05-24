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
public class GerenteCompras implements Observer{
    public String nombre;
    public String permiso;
    public GerenteCompras(String nombre){
        this.nombre=nombre;
        this.permiso="Ambos";
    }
    public void alertarCorreo(){
        System.out.println("Alerta para "+this.nombre+" alguien esta gastando de mas, correo");
    }
    
    public void alertarCelular(){
        System.out.println("Alerta para "+this.nombre+" alguien esta gastando de mas, celular");
    }
    public void setPermiso(String permiso){
        if(permiso=="Ambos"){
            this.permiso="Ambos";
        }else if(permiso=="Correo"){
            this.permiso="Correo";
        }else if(permiso=="Celular"){
            this.permiso="Celular";
        }else{
            System.out.println("El permiso "+permiso+" no existe");
        }
    }
    
    @Override
    public void update(String nombre, String tipo, String descripcion, double gasto) {
        System.out.println("Notificaciones para "+this.nombre+":");
        if(this.permiso=="Ambos"){
            MensajeCorreo correo = new MensajeCorreo();
            correo.notificacion(this.nombre, nombre, tipo, descripcion, gasto);
            MensajeCelular celular = new MensajeCelular();
            celular.notificacion(this.nombre, nombre, tipo, descripcion, gasto);
        }else if(this.permiso=="Correo"){
            MensajeCorreo correo = new MensajeCorreo();
            correo.notificacion(this.nombre, nombre, tipo, descripcion, gasto);
        }else if(this.permiso=="Celular"){
            MensajeCelular celular = new MensajeCelular();
            celular.notificacion(this.nombre, nombre, tipo, descripcion, gasto);
        }
    }
    
}
