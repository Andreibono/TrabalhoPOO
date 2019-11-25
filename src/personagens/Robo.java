
package personagens ;

public abstract class Robo {
    private String nome;
    private Double vida;
    private Double armadura;
    
  public Robo (){
      
  }  

    public Robo(String nome, Double vida, Double armadura) {
        this.nome = nome;
        this.vida = vida;
        this.armadura = armadura;
    }

    public String getNome() {
        return nome;
    }

    public Double getVida() {
        return vida;
    }

    public Double getArmadura() {
        return armadura;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVida(Double vida) {
        this.vida = vida;
    }

    public void setArmadura(Double armadura) {
        this.armadura = armadura;
    }
 
}
