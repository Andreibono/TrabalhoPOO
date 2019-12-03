package Itens;

import Arquivos.ArquivoTeste;

public class Escopeta extends Item {

    
    
   public Escopeta (String nome){
        super(nome);
    }

    public Escopeta(String nome, int coordenadaX, int coordenadaY) {
        super(nome, coordenadaX, coordenadaY);
    }
    
    
    

    public float calcularDano(float distancia) {

        return 0;

    }

}
