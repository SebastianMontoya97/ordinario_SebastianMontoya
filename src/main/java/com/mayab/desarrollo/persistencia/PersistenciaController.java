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
public class PersistenciaController {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BaseCreator tipoA = new BaseACreator();
        BaseCreator tipoB = new BaseBCreator();
        BaseCreator tipoC = new BaseCCreator();
        Sentencia sentencia1 = tipoA.createSentencia("A");
        sentencia1.crearSentencia("select * from database;");
        System.out.println(sentencia1.getSentencia());
        Sentencia sentencia2= tipoB.createSentencia("B");
        sentencia2.crearSentencia("SELECT * from DATABASE;");
        System.out.println(sentencia2.getSentencia());
    }
    
}
