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
        GerenteCompras gerente1 = new GerenteCompras("Luis Sandoval");
        GerenteCompras gerente2 = new GerenteCompras("Chris Santos");
        GerenteCompras gerente3 = new GerenteCompras("Veronica Castillo");
        //CLIENTES
        Cliente cliente1 = new Cliente("Avanti");
        Cliente cliente2 = new Cliente("Rima");
        Cliente cliente3 = new Cliente("Intra");
        //ASIGNAMOS GERENTES A CLIENTES
        cliente1.addObserverToList(gerente1);
        cliente1.addObserverToList(gerente2);
        cliente2.addObserverToList(gerente2);
        cliente3.addObserverToList(gerente1);
        cliente3.addObserverToList(gerente3);
        //CREAMOS TRANSACCIONES, PRIMERO CLIENTE 1, LA CANTIDAD MAXIMA ES 1000
        cliente1.registrarCompra();
        gerente1.setPermiso("Correo");
        cliente1.registrarCompra();
    }
    
}
