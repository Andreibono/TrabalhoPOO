package Itens;
import Arquivos.ArquivoTeste;

public abstract class Item {

    private String nome;
    private int coeficienteDeDano;
    private int alcance;
    private Integer coordenadaX;
    private Integer coordenadaY;

    ArquivoTeste arquivoteste = new ArquivoTeste();

    public Item() {

    }

    public Item(String nome, int coordenadaX, int coordenadaY) {
        this.nome = nome;
        this.coeficienteDeDano = arquivoteste.lercoeficientedeDano(nome);
        this.alcance = arquivoteste.leralcance(nome);
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }
    
    public Item (String nome){
        this.nome = nome;
        this.coeficienteDeDano = arquivoteste.lercoeficientedeDano(nome);
        this.alcance = arquivoteste.leralcance(nome);
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCoeficienteDeDano() {
        return coeficienteDeDano;
    }

    public int getAlcance() {
        return alcance;
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

}
