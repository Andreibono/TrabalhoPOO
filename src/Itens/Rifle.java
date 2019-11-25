package Itens;

/**
 *
 * @author Bruno
 */
public class Rifle extends Item {

    public Rifle(String nome, int coeficienteDeDano, float alcance) {
        super(nome, coeficienteDeDano, alcance);
    }

    
    public float calcularDano(float distancia) {
    
        return 0;
    }
    
}
