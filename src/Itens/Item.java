package Itens;

/**
 *
 * @author Andrei
 */
public abstract class Item {
    
    private String nome;
    private int coeficienteDeDadno;
    private float alcance;
    
    public Item(String nome, int coeficienteDeDano, float alcance){
        
        this.nome = nome;
        this.coeficienteDeDadno = coeficienteDeDano;
        this.alcance = alcance;
        
    }

    public abstract float calcularDano(float distancia);



}
