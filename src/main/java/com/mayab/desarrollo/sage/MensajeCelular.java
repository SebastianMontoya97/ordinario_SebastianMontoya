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
public class MensajeCelular extends Mensaje{
    @Override
    public void notificacion(String gerente, String nombre, String tipo, String descripcion, double gasto) {
        System.out.println("**********************************");
        System.out.println("SMS para "+gerente);
        System.out.println("Gasto excesivo de "+nombre);
        System.out.println("COMPRA___________________________");
        System.out.println("Tipo: "+tipo);
        System.out.println("Descripcion: "+descripcion);
        System.out.println("Gasto: $"+gasto);
        System.out.println("_________________________________");
        System.out.println("**********************************");
    }
    
}
