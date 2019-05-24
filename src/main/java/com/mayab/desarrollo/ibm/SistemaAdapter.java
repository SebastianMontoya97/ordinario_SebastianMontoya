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
public class SistemaAdapter implements SistemaNuevo{
SistemaAntiguo sistemaAntiguo;
    public SistemaAdapter(SistemaAntiguo sistemaAntiguo){
        this.sistemaAntiguo=sistemaAntiguo;
    }
    @Override
    public void agregarCliente(String nombre, String apellido) {
     String input = String.join(" ",nombre,apellido);
     sistemaAntiguo.agregarCliente(input);
    }

    @Override
    public void eliminarCliente(String nombre, String apellido) {
        String input = String.join(" ",nombre,apellido);
        sistemaAntiguo.eliminarCliente(input);
   }

    @Override
    public List<Pair> getListaClientes() {
    List<Pair> temp = new ArrayList<Pair>();
    ArrayList temp2 = sistemaAntiguo.getListaClientes();
    String temporal;
    for(int i=0;i<temp2.size();i++){
        temporal=temp2.get(i).toString();
        String[] separado = temporal.split("\\s+");
        temp.add(new Pair <String,String> (separado[0],separado[1]));
        }
    return temp;
    }

    @Override
    public void imprimirListaClientes() {
    System.out.println("LISTA:");
    ArrayList<String> temp = sistemaAntiguo.getListaClientes();
    String n1, n2;
    for(int i=0;i<temp.size();i++){
    String[] separado = temp.get(i).split("\\s+");
        System.out.println("Nombre:"+separado[0]+"  Apellido:"+separado[1]);
        }
    }
    
    @Override
    public void setListaClientes(List<Pair> lista) {
        ArrayList <String> temp = new ArrayList();
        String n1, n2, temporal;
        for(int i=0;i<lista.size();i++){
            n1=lista.get(i).getKey().toString();
            n2=lista.get(i).getValue().toString();
            temporal = String.join(" ",n1,n2);
            temp.add(temporal);
        }
        this.sistemaAntiguo.setListaClientes(temp);
    }
    
}
