package trabalhopoo;

import Arquivos.ArquivoTeste;
import Itens.*;
import Itens.Item;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bruno
 */
public class Game implements Runnable, KeyListener{

    /*Variáveis do loop do jogo*/
    private static boolean estaRodando;
    private static Thread thread;
    private static boolean querJogar;
    
    /*Arena*/
    private static Arena arena; 
   
    
    public Game() {
        
        arena = new Arena(10,20);
        
    }

    public static void main(String args[]) {
        
        Game game = new Game();
        arena.contruindoArena();
        arena.setArena(0, 0, 1);
        arena.setArena(9, 19, 1);
       

        //arena.desenharArena();
        //game.comecarJogo();
        
        ArquivoTeste arquivoteste = new ArquivoTeste();
        
        Escopeta escopeta = new Escopeta("Escopeta", arquivoteste.lercoeficientedeDano("Escopeta"), arquivoteste.leralcance("Escopeta"), 0, 0);
        System.out.println("alcance: "+escopeta.getAlcance()+"\n"+"Dano: "+escopeta.getCoeficienteDeDano());
        
    }

    
    public void comecarJogo() {

        estaRodando = true;
        thread = new Thread(this);
        thread.start();

    }

    public void pararJogo() {

        estaRodando = false;
        try {
            thread.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void atualizar() {
        System.out.println("atualiza");
    }

    public void desenharTela() {
        System.out.println("desenhaNatela");
    }

    /*Fazendo o loop do jogo*/
    public void run() {
        while (estaRodando) {

            atualizar();
            desenharTela();
            try {
                Thread.sleep(1000 / 60);
            } catch (InterruptedException ex) {
                Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        pararJogo();
    }
    

    @Override
    public void keyTyped(KeyEvent ke) {
       
    }

    @Override
    public void keyPressed(KeyEvent ke) {
          if(ke.getKeyCode() == KeyEvent.VK_S){
         
          }
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
