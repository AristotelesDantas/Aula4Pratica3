/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ejb;

import javax.ejb.Stateless;

/**
 *
 * @author Ari
 */
@Stateless
public class EjbCalculadora implements bri.Calculadora{

    @Override
    public int somar(int a, int b) {
        return a + b;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
