/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.desarrollo.persistencia;

/**
 *
 * @author Sebastian M.M
 */
public abstract class Sentencia {
    public String sentencia;
    public abstract void crearSentencia(String sentencia);
    public abstract String getSentencia();
}
