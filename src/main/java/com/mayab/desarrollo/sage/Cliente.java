/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.desarrollo.sage;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Sebastian M.M
 */
public class Cliente implements Observable {
    Scanner scan = new Scanner(System.in);
    public String nombre;
    public ArrayList<Compra> compras = new ArrayList();
    public ArrayList<Observer> gerentes = new ArrayList();
    public double cantidadMaxima=1000;
    
    public Cliente(String nombre){
        this.nombre=nombre;
    }
    
    public void registrarCompra(){
        System.out.println("///////////////////////////");
        System.out.println(this.nombre+" NUEVA COMPRA: ");
        Compra movimiento = new Compra();
        System.out.println("Tipo de Compra:");
        movimiento.setTipo(scan.nextLine());
        System.out.println("Descripcion de Compra:");
        movimiento.setDescripcion(scan.nextLine());
        System.out.println("Gasto de Compra:");
        movimiento.setGasto(scan.nextDouble());
        scan.nextLine();
        if(movimiento.getGasto()>cantidadMaxima){
            notifyObservers(this.nombre,movimiento.getTipo(),movimiento.getDescripcion(),movimiento.getGasto());
        }
        System.out.println("///////////////////////////");
        System.out.println("REGISTRO DE COMPRA NUEVA:");
        System.out.println("Tipo: "+movimiento.getTipo());
        System.out.println("Descripcion: "+movimiento.getDescripcion());
        System.out.println("Gasto: "+movimiento.getGasto());
        compras.add(movimiento);
        System.out.println("///////////////////////////");
        for(int i=0;i<6;i++){
            System.out.println("");
            i++;
        }
    }
    
    @Override
    public void addObserverToList(Observer p) {
    gerentes.add(p);
    }

    @Override
    public void deleteObserverFromList(Observer p) {
    gerentes.remove(p);
    }

    @Override
    public void notifyObservers(String nombre, String tipo, String descripcion, double gasto) {
    for(int i=0;i<gerentes.size();i++){
            gerentes.get(i).update(nombre, tipo, descripcion, gasto);
        }
    }
    
}
