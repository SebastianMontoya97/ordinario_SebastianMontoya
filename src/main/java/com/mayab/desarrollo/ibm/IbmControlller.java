/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.desarrollo.ibm;
import java.util.*;
import javafx.util.Pair;

/**
 *
 * @author Sebastian M.M
 */
public class IbmControlller {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hacienda nuevo = new Hacienda();
        Ibm viejo = new Ibm();//Introducimos todos los datos en el sistema de IBM
        viejo.agregarCliente("Alan Paredes");
        viejo.agregarCliente("Luis Oliva");
        viejo.agregarCliente("Juan Estevez");
        SistemaNuevo adaptado = new SistemaAdapter(viejo);//Los pasamos y adaptamos al sistema
        //nuevo que cumple con los estatutos de Hacienda y el framework de facturacion
        //este nos regresa los datos ya listos para incorporar al nuevo sistema
        nuevo.setListaClientes(adaptado.getListaClientes());
        //Introducimos datos a nuevo sistema
        nuevo.imprimirListaClientes();//Nos los despliega desglosado en nombre y apellido
    }
}
