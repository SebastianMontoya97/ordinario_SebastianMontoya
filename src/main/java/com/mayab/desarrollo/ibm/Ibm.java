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
public class Ibm implements SistemaAntiguo{

    public ArrayList<String> clientes = new ArrayList();
    @Override
    public void agregarCliente(String nombreCompleto) {
        clientes.add(nombreCompleto);
    }

    @Override
    public void eliminarCliente(String nombreCompleto) {
        clientes.remove(nombreCompleto);
    }

    @Override
    public ArrayList getListaClientes() {
        return this.clientes;
    }

    @Override
    public void imprimirListaClientes() {
    System.out.println("LISTA:");
    for(int i=0;i<clientes.size();i++){
        System.out.println("Nombre completo:"+clientes.get(i));
    }
    }
    
    @Override
    public void setListaClientes(ArrayList lista) {
        this.clientes = lista;
    }
}
