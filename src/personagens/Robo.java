package personagens;

import Arquivos.ArquivoTeste;
import Itens.Item;

public class Robo {

    private int id;
    private String nome;
    private Double vida;
    private int armadura;
    private int coordenadaX;
    private int coordenadaY;
    private Item item;
    private int movimento;

    ArquivoTeste arquivoteste = new ArquivoTeste();

    public Robo() {

    }
    public Robo(int id, String nome, Double vida, int coordenadaX, int coordenadaY, Item item) {
        this.id = id;
        this.nome = nome;
        this.vida = arquivoteste.lerVida(nome);
        this.armadura = arquivoteste.lerArmadura(nome);
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.item = item;
        this.movimento = arquivoteste.lerMovimento(nome);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getVida() {
        return vida;
    }

    public void setVida(Double vida) {
        this.vida = vida;
    }

    public int getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getArmadura() {
        return armadura;
    }

    public int getMovimento() {
        return movimento;
    }
}
