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
        if(x < 10 && x >= 0 ){
            if(y < 20 && y >=0){
                if(this.matrizArena[x][y] == 0){
                    this.matrizArena[x][y] = objeto;
    
        }
    
            }
        }}
    public String desenharArena() {

        String str = new String("<html>");
        
        for (int x = 0; x < comprimento; x++) {
            for (int y = 0; y < largura; y++) {

                if (this.matrizArena[x][y] == 0) {
                    str = str + "\u0081";
                }else{
                
                     if (!(this.matrizArena[x][y] == 1)) {
                            str = str + "©";
                       }else{
                            if (!(this.matrizArena[x][y] == -1)) {
                            str = str + "®";
                            }
                     } 
                }
            }
            str = str + "<br>";
            
        }
        str = str + "</html>";
        return str;
    }

}
