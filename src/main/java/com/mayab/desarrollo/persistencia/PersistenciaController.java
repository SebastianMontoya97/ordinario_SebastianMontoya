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
        Sentencia sentencia1 = tipoA.createSentencia("A");//CREAMOS UNA SENTENCIA PARA UN BASE DE DATOS TIPO A QUE REQUIERE EL QUERY EN MAYUSCULAS
        sentencia1.crearSentencia("select * from database;");//Introducimos QUERY
        System.out.println(sentencia1.getSentencia());//IMPRIMIMOS QUERY ADAPTADO
        //REPETIMOS
        Sentencia sentencia2= tipoB.createSentencia("B");//CREAMOS UNA SENTENCIA PARA UN BASE DE DATOS TIPO B QUE REQUIERE EL QUERY EN MINUSCULAS
        sentencia2.crearSentencia("SELECT * from DATABASE;");
        System.out.println(sentencia2.getSentencia());
        Sentencia sentencia3= tipoC.createSentencia("C");//CREAMOS UNA SENTENCIA PARA UN BASE DE DATOS TIPO C QUE EL QUERY SE ACEPTA TAL COMO ESTA
        sentencia3.crearSentencia("SELECT * from DATAbase;");
        System.out.println(sentencia3.getSentencia());
    }
    
}
