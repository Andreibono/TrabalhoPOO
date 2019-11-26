package Itens;

public abstract class Item {

    private String nome;
    private int coeficienteDeDano;
    private int alcance;
    private Integer coordenadaX;
    private Integer coordenadaY;

    public Item() {

    }

    public Item(String nome, int coeficienteDeDano, int alcance, int coordenadaX, int coordenadaY) {
        this.nome = nome;
        this.coeficienteDeDano = coeficienteDeDano;
        this.alcance = alcance;
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
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

    public void setCoeficienteDeDano(int coeficienteDeDano) {
        this.coeficienteDeDano = coeficienteDeDano;
    }

    public int getAlcance() {
        return alcance;
    }

    public void setAlcance(int alcance) {
        this.alcance = alcance;
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
