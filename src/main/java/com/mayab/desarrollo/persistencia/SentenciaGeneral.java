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
public class SentenciaGeneral extends Sentencia{
    @Override
    public void crearSentencia(String sentencia) {
    this.sentencia=sentencia;
    }
    public String getSentencia(){
        return this.sentencia;
    }
}
