package trabalhopoo;

/**
 *
 * @author Bruno
 */
public class Arena {

    /*Dimensões da Arena*/
    private final int comprimento;
    private final int largura;

    /*Tabuleiro e Matriz Arena*/
    private int[][] matrizArena;

    public Arena(int comprimento, int largura) {

        this.comprimento = comprimento;
        this.largura = largura;
        this.matrizArena = new int[comprimento][largura];
    }

    public void contruindoArena() {

        for (int x = 0; x < comprimento; x++) {
            for (int y = 0; y < largura; y++) {

                this.matrizArena[x][y] = 0;
            }
        }
    }

    public void setArena(int x, int y, int objeto) {

        this.matrizArena[x][y] = objeto;
    }

    public String desenharArena() {

        String str = new String("<html>");
        
        for (int x = 0; x < comprimento; x++) {
            for (int y = 0; y < largura; y++) {

                if (this.matrizArena[x][y] == 0) {
                    str = str + "";
                }
                
                 if (!(this.matrizArena[x][y] == 0)) {
                    str = str + "®";
                }
            }
            str = str + "<br>";
            
        }
        str = str + "</html>";
        return str;
    }

}
