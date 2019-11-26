package Itens;

import Arquivos.ArquivoTeste;
import personagens.Jogador;

public class Virus extends Item {

    public int nTurnos;

    public Virus() {

    }

    public Virus(int nTurnos, String nome, int coeficienteDeDano, int alcance, int coordenadaX, int coordenadaY) {
        super(nome, coeficienteDeDano, alcance, coordenadaX, coordenadaY);
        this.nTurnos = nTurnos;
    }

    public int getnTurnos() {
        return nTurnos;
    }

    public void setnTurnos(int nTurnos) {
        this.nTurnos = nTurnos;
    }

    public void calcularDano(Jogador jogador, Virus virus) {
        for (int i = 0; i <= virus.getnTurnos(); i++) {
            jogador.setVida(jogador.getVida() - virus.getCoeficienteDeDano());
        }
    }
}
