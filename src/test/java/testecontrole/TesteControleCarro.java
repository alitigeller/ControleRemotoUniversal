/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testecontrole;

import br.ifes.poo.controleremotouniversal.AbrirPortao;
import br.ifes.poo.controleremotouniversal.Carro;
import br.ifes.poo.controleremotouniversal.Command;
import br.ifes.poo.controleremotouniversal.ControleRemoto;
import br.ifes.poo.controleremotouniversal.DesligarCarro;
import br.ifes.poo.controleremotouniversal.FecharPortao;
import br.ifes.poo.controleremotouniversal.LigarCarro;
import br.ifes.poo.controleremotouniversal.Portao;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aeller
 */
public class TesteControleCarro {
    
    public TesteControleCarro() {
    }
    
    @Test
    public void testarLigarCarro(){
        Carro carro = new Carro();
        Command ligarCarro = new LigarCarro(carro);
        Command desligarCarro = new DesligarCarro(carro);
        ControleRemoto controleRemoto = new ControleRemoto();
        controleRemoto.setCommands(ligarCarro, desligarCarro);
        
        controleRemoto.fazer();
        Assert.assertEquals(carro.ligado(), true);
        
    }
    
    @Test
    public void testarFecharPortao(){
        Carro carro = new Carro();
        Command ligarCarro = new LigarCarro(carro);
        Command desligarCarro = new DesligarCarro(carro);
        ControleRemoto controleRemoto = new ControleRemoto();
        controleRemoto.setCommands(ligarCarro, desligarCarro);
        
        controleRemoto.desfazer();
        Assert.assertEquals(carro.desligado(), true);
        
    }
    
}
