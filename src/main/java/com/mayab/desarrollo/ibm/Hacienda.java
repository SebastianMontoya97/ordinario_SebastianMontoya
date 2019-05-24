/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.desarrollo.ibm;

import java.util.ArrayList;
import java.util.List;
import javafx.util.Pair;

/**
 *
 * @author Sebastian M.M
 */
public class Hacienda implements SistemaNuevo{
public List<Pair> listaClientes = new ArrayList<Pair>();
    @Override
    public void agregarCliente(String nombre, String apellido) {
    listaClientes.add(new Pair <String,String> (nombre,apellido));    
    }

    @Override
    public void eliminarCliente(String nombre, String apellido) {
    listaClientes.remove(new Pair <String,String> (nombre,apellido));
    }

    @Override
    public List<Pair> getListaClientes() {
        return this.listaClientes;
    }

    @Override
    public void imprimirListaClientes() {
    System.out.println("LISTA:");
       for(int i=0;i<listaClientes.size();i++){
            System.out.print("Nombre:"+listaClientes.get(i).getKey());
            System.out.println("  Apellido:"+listaClientes.get(i).getValue());
       }
    }

    @Override
    public void setListaClientes(List<Pair> lista) {
        this.listaClientes = lista;
    }
    
}
