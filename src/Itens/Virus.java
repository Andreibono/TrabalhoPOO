package Itens;

import Arquivos.ArquivoTeste;
import personagens.Robo;

public class Virus extends Item {

    public int nTurnos;

    public Virus() {

    }

    public Virus(int nTurnos, String nome, int coordenadaX, int coordenadaY) {
        super(nome, coordenadaX, coordenadaY);
        this.nTurnos = nTurnos;
    }

    public int getnTurnos() {
        return nTurnos;
    }

    public void setnTurnos(int nTurnos) {
        this.nTurnos = nTurnos;
    }

    public void calcularDano(Robo robo, Virus virus) {
        for (int i = 0; i <= virus.getnTurnos(); i++) {
            robo.setVida(robo.getVida() - virus.getCoeficienteDeDano());
        }
    }
}
