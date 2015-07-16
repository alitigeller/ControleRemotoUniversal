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
public class AbrirPortao implements Command{
    private Portao portao;

    public AbrirPortao(Portao portao) {
        this.portao = portao;
    }
    
    @Override
    public void execute() {
        portao.abrirPortao();
    }
    
}
