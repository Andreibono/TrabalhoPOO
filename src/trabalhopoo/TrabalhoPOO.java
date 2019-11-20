package trabalhopoo;

/**
 *
 * @author Andrei e Bruno
 */
public class TrabalhoPOO{

    private static Arena arena;
    
    public TrabalhoPOO(){
        arena = new Arena(10,5);
        
    }

    public static void main(String args[]) {
        TrabalhoPOO game = new TrabalhoPOO();
        arena.desenharTabuleiro();
        

    }

   
}
