/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.desarrollo.ibm;
import java.util.*;
import javafx.util.Pair;
import java.util.ArrayList;

/**
 *
 * @author Sebastian M.M
 */
public interface SistemaNuevo {
    
    public void agregarCliente(String nombre, String apellido);
    public void eliminarCliente(String nombre, String apellido);
    public List<Pair> getListaClientes();
    public void imprimirListaClientes();
    public void setListaClientes(List<Pair> listaClientes);
}
