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
public interface Observable {
    public void addObserverToList(Observer p);
    public void deleteObserverFromList(Observer p);
    public void notifyObservers(String nombre, String tipo, String descripcion, double gasto, int tiempo);
}
