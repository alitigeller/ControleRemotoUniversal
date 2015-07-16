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
public class DesligarCarro implements Command{
    private Carro carro;

    public DesligarCarro(Carro carro) {
        this.carro = carro;
    }
    
    @Override
    public void execute() {
        carro.desligarCarro();
    }
    
}
