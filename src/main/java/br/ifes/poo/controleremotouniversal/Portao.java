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
public class Portao {
    private boolean aberta;

    public Portao() {
        this.aberta = false;
    }
    
    public boolean fechada(){
        return !aberta;
    }
    
    public boolean aberta(){
        return aberta;
    }
    
    public void abrirPortao(){
        aberta = true;
    }
    
    public void fecharPortao(){
        aberta = false;
    }
}
