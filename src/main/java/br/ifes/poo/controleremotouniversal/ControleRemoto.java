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
public class ControleRemoto {
    private Command upCommand, downCommand;
    
    public void setCommands(Command upCommand, Command downCommand){
        this.upCommand = upCommand;
        this.downCommand = downCommand;
    }
    
    public void fazer(){
        upCommand.execute();
    }
    
    public void desfazer(){
        downCommand.execute();
    }
    
}
