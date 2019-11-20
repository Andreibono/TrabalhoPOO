package trabalhopoo;

/**
 *
 * @author Bruno
 */
public class Arena {

    private final int comprimento;
    private final int altura;
    private  char tabuleiro[][];

    public Arena(int comprimento, int altura) {

        this.comprimento = comprimento;
        this.altura = altura;
        this.criarArena();
    }

    public void criarArena() {

        this.tabuleiro = new char[comprimento][altura];
        for(int y = 0; this.altura > y; y++){
            for(int x = 0; this.comprimento > x; x++){
            
                this.tabuleiro[x][y] = '';

            
            }
        }
    }

    public boolean modificarArena(int x, int y, char novo){
    
        if(this.comprimento >= x || this.altura >= y)
        {
            this.tabuleiro[x][y] = novo;
            return true;
        }
        return false;
    }

    public void desenharTabuleiro(){
        
   
        for(int y = 0; this.altura > y; y++){
            for(int x = 0; this.comprimento > x; x++){
            
                System.out.print(tabuleiro[x][y]);

            
            }
            System.out.print("\n");
        }
    }

}
