package Itens;

import Arquivos.ArquivoTeste;
import java.util.Random;
import personagens.Robo;

public class Virus extends Item {

    public int nTurnos;

    public Virus() {

    }

    public Virus(int nTurnos, String nome) {
        super(nome);
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
     public void randomX(){
    
        Random gerador = new Random();
        this.setCoordenadaX(gerador.nextInt(10));
    }
    
    public void randomY(){
    
         Random gerador = new Random();
         this.setCoordenadaY(gerador.nextInt(20));
    }
}
