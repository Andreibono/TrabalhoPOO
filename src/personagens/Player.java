package personagens;

import Itens.Item;
import javax.swing.JOptionPane;

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
        if (this.robo.getCoordenadaY()<20)
        this.robo.setCoordenadaY(this.robo.getCoordenadaY()+1);        
    }
    public void movimentoEsquerda(){
        if (this.robo.getCoordenadaY()>0)
        this.robo.setCoordenadaY(this.robo.getCoordenadaY()-1);        
    }
    public void movimentoCima(){
        if (this.robo.getCoordenadaX()>0)
        this.robo.setCoordenadaX(this.robo.getCoordenadaX()-1);        
    }
    public void movimentoBaixo(){
        if (this.robo.getCoordenadaX()<10)
        this.robo.setCoordenadaX(this.robo.getCoordenadaX()+1);        
    }
    
    public void TrocarArma(Item item){
        int confirma = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja trocar de arma ?", "Atenção", JOptionPane.YES_NO_OPTION);
        if ( confirma == JOptionPane.YES_OPTION){
            this.robo.setItem(item);        
        }
    }
}
