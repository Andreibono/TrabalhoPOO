package personagens;

/**
 *
 * @author Bruno
 */
public class Player {

private Robo   robo;   

    public Player(Robo robo) {
        this.robo = robo;
    }


    public Robo getRobo() {
        return robo;
    }

    public void setRobo(Robo robo) {
        this.robo = robo;
    }
    
    public void movimentoDireita(){
        this.robo.setCoordenadaX(this.robo.getCoordenadaX()+1);        
    }
    public void movimentoEsquerda(){
        this.robo.setCoordenadaX(this.robo.getCoordenadaX()-1);        
    }
    public void movimentoCima(){
        this.robo.setCoordenadaY(this.robo.getCoordenadaY()+1);        
    }
    public void movimentoBaixo(){
        this.robo.setCoordenadaY(this.robo.getCoordenadaY()-1);        
    }
    


}
