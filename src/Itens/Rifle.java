package Itens;

import java.util.Random;

public class Rifle extends Item {

    public Rifle(String nome){
        super(nome);
    }

    public void randomX(){
    
        Random gerador = new Random();
        this.setCoordenadaX(gerador.nextInt(10));
    }
    
    public void randomY(){
    
         Random gerador = new Random();
         this.setCoordenadaY(gerador.nextInt(20));
    }
    
    
    public float calcularDano(float distancia) {
    
        return 0;
    }
    
}
