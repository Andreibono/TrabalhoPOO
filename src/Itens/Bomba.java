package Itens;

import Arquivos.ArquivoTeste;
import java.util.Random;
import personagens.Robo;

public class Bomba extends Item {

    ArquivoTeste arquivoteste = new ArquivoTeste();

    public Bomba() {
    }

    public Bomba(String nome) {
        super(nome);
    }

   
    public void calcularDano(Robo robo) {
        robo.setVida(robo.getVida() - getCoeficienteDeDano());
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
