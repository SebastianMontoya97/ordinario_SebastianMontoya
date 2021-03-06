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
public class SageController {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //GERENTES
        Gerente gerente1 = new Gerente("Luis Sandoval");
        Gerente gerente2 = new Gerente("Abigail Mendoza");
        //CLIENTES
        Cliente cliente1 = new Cliente("Avanti");
        gerente1.setHoraLimite(10, 20);//ESTABLECEMOS UNA HORA DONDE SE PERMITE RECIBIR MENSAJES
        //SI NO SE ESTABLECE SE PUEDE RECIBIR NOTIFICACIONES A TODAS HORAS
        //ASIGNAMOS GERENTES A CLIENTES
        cliente1.addObserverToList(gerente1);
        cliente1.addObserverToList(gerente2);
        //CREAMOS TRANSACCIONES, PRIMERO CLIENTE 1, LA CANTIDAD MAXIMA ES 1000 POR DEFAULT
        cliente1.registrarCompra();
        gerente1.setPermiso("Celular");
        //PODEMOS CAMBIAR LA CANTIDAD MAXIMA A 2000 O MÁS
        cliente1.setMaximoGasto(2000);
        cliente1.registrarCompra();
    }
    
}
