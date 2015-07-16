/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo.controleremotouniversal;

/**
 *
 * @author aeller
 */
public class Carro {
    public boolean ligado;
    
    public Carro() {
        this.ligado = false;
    }
    
    public boolean desligado(){
        return !ligado;
    }
    
    public boolean ligado(){
        return ligado;
    }
    
    public void ligarCarro(){
        ligado = true;
    }
    
    public void desligarCarro(){
        ligado = false;
    }
}
