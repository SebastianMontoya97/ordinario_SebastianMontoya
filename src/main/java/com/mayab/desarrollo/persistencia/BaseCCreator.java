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
public class BaseCCreator extends BaseCreator{

    @Override
    public Sentencia createSentencia(String tipo) {
    if(tipo.equals("C")){
        return new SentenciaGeneral();
    }else return null;
    }
    
}
