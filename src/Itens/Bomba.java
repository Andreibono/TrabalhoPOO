package Itens;

import Arquivos.ArquivoTeste;
import personagens.Robo;

public class Bomba extends Item {

    ArquivoTeste arquivoteste = new ArquivoTeste();

    public Bomba() {
    }

    public Bomba(String nome, int coordenadaX, int coordenadaY) {
        super(nome, coordenadaX, coordenadaY);
    }

   
    public void calcularDano(Robo robo) {
        robo.setVida(robo.getVida() - getCoeficienteDeDano());
    }
}
