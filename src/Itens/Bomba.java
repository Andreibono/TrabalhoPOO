package Itens;

import Arquivos.ArquivoTeste;
import personagens.Jogador;

public class Bomba extends Item {

    ArquivoTeste arquivoteste = new ArquivoTeste();

    public Bomba() {

    }

    public void calcularDano(Jogador jogador) {
        jogador.setVida(jogador.getVida() - getCoeficienteDeDano());
    }
}
