package Itens;

import Arquivos.ArquivoTeste;

public class Escopeta extends Item {

   public Escopeta (){
        
    }

    public Escopeta(String nome, int coeficienteDeDano, int alcance, int coordenadaX, int coordenadaY) {
        super(nome, coeficienteDeDano, alcance, coordenadaX, coordenadaY);
    }
    
    

    public float calcularDano(float distancia) {

        return 0;

    }

}
