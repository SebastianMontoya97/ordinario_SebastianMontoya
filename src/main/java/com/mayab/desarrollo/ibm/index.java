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
public class index {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hacienda nuevo = new Hacienda();
        Ibm viejo = new Ibm();
        viejo.agregarCliente("Alan Paredes");
        viejo.agregarCliente("Luis Oliva");
        viejo.agregarCliente("Juan Estevez");
        SistemaNuevo adaptado = new SistemaAdapter(viejo);
        nuevo.setListaClientes(adaptado.getListaClientes());
        nuevo.imprimirListaClientes();
    }
}
