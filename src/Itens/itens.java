package Itens;

/**
 *
 * @author Andrei
 */
public abstract class itens {
    
    private String nome;
    private int coeficienteDeDadno;
    private float alcance;
    
    public itens(String nome, int coeficienteDeDano, float alcance){
        
        this.nome = nome;
        this.coeficienteDeDadno = coeficienteDeDano;
        this.alcance = alcance;
        
    }

    public abstract float calcularDano(float distancia);



}
