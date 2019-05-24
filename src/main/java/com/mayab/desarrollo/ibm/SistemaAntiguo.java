/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.desarrollo.ibm;

import com.mayab.desarrollo.sage.Compra;
import java.util.ArrayList;
/**
 *
 * @author Sebastian M.M
 */
public interface SistemaAntiguo {
     public void agregarCliente(String nombreCompleto);
     public void eliminarCliente(String nombreCompleto);
     public ArrayList getListaClientes();
     public void imprimirListaClientes();
     public void setListaClientes(ArrayList lista);
}
