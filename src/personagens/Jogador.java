
package personagens;

import Itens.Item;

public class Jogador extends Robo{
    private int coordenadaX;
    private int coordenadaY;
    private Item item;
    private int movimento;
    
    public void Jogador(){
        
    }
    public Jogador(int coordenadaX, int coordenadaY, Item item, int movimento) {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.item = item;
        this.movimento = movimento;
    }

    public int getCoordenadaX() {
        return coordenadaX;
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    public Item getItem() {
        return item;
    }

    public int getMovimento() {
        return movimento;
    }

    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public void setMovimento(int movimento) {
        this.movimento = movimento;
    }
    
    
    
    
}
