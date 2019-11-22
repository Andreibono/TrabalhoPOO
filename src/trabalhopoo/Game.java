package trabalhopoo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bruno
 */
public class Game implements Runnable {

    /*Variáveis do loop do jogo*/
    private static Boolean estaRodando;
    private static Thread thread;
    
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
        arena.desenharArena();
        //game.comecarJogo();
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

}
