/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testecontrole;

import br.ifes.poo.controleremotouniversal.AbrirPortao;
import br.ifes.poo.controleremotouniversal.Command;
import br.ifes.poo.controleremotouniversal.ControleRemoto;
import br.ifes.poo.controleremotouniversal.FecharPortao;
import br.ifes.poo.controleremotouniversal.Portao;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author aeller
 */
public class TesteControlePortao {
    
    public TesteControlePortao() {
    }
    
    @Test
    public void testarAbrirPortao(){
        Portao portao = new Portao();
        Command abrirPortao = new AbrirPortao(portao);
        Command fecharPortao = new FecharPortao(portao);
        ControleRemoto controleRemoto = new ControleRemoto();
        controleRemoto.setCommands(abrirPortao, fecharPortao);
        
        controleRemoto.fazer();
        Assert.assertEquals(portao.aberta(), true);
        
    }
    
    @Test
    public void testarFecharPortao(){
        Portao portao = new Portao();
        Command abrirPortao = new AbrirPortao(portao);
        Command fecharPortao = new FecharPortao(portao);
        ControleRemoto controleRemoto = new ControleRemoto();
        controleRemoto.setCommands(abrirPortao, fecharPortao);
        
        controleRemoto.desfazer();
        Assert.assertEquals(portao.fechada(), true);
        
    }
}
