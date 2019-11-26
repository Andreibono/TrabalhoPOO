package visao;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import personagens.Jogador;
import trabalhopoo.Arena;

/**
 *
 * @author Bruno
 */
public class TelaPrincipal  extends JFrame{
    
private JPanel painel;
private JLabel arena;
private String string;
private JPanel painelArena;

public TelaPrincipal(Arena arenat,int numero /*Jogador play*/ ){

    super("THE ULTMATE MEGAZORD FIGHT");
    setSize(430, 300);
    setResizable(false);
    setLocationRelativeTo(null);
    setVisible(true);
    
    painel = new JPanel();
    this.add(painel);
    painel.setBackground(new Color(64,71,106));
    painel.setLayout(null);
    
   JButton atacar = new JButton("Atacar");
   painel.add(atacar);
   atacar.setBounds(255, 250, 80, 20);
    
   JButton encerrarTurno = new JButton ("Fim turno");
   painel.add(encerrarTurno);
   encerrarTurno.setBounds(335, 250, 90, 20);
    
    if(numero == 1){
    
    JLabel jogador = new JLabel();
    painel.add(jogador);
    jogador.setFont(new Font ("TimesRoman", Font.BOLD, 20));
    jogador.setText("TURNO JOGADOR 1");
    jogador.setBounds(0, 0, 200, 50);
    jogador.setForeground(new Color(0,0,0));
        
        
    }else{
    
    JLabel jogador = new JLabel();
    painel.add(jogador);
    jogador.setFont(new Font ("TimesRoman", Font.BOLD, 20));
    jogador.setText("TURNO JOGADOR 2");
    jogador.setBounds(0, 0, 200, 50);
    jogador.setForeground(new Color(0,0,0));
    
    }
    
    
    
    painelArena = new JPanel();
    painelArena.setLayout(null);
    painel.add(painelArena);
  
    painelArena.setBackground(new Color(122,122,122));
    painelArena.setBounds(0, 50, 250, 230);
    
    
    
    arena = new JLabel();
    painelArena.add(arena);
    arena.setBounds(5, 2, 250, 220);
    arena.setText(arenat.desenharArena());
    arena.setFont(new Font("TimesRoman", Font.BOLD, 16));
    arena.setForeground(Color.black);
    
   JPanel jogador1 = new JPanel();
   JPanel jogador2 = new JPanel();
   
   this.painel.add(jogador1);
   jogador1.setBackground(new Color(64,71,106));
   jogador1.setBounds(255, 10, 200, 120);
   jogador1.setLayout(null);
   
   JLabel lJogador1 = new JLabel();
   jogador1.add(lJogador1);
   lJogador1.setText("Jogador 1");
   lJogador1.setBounds(0, 0, 200, 15);
   lJogador1.setForeground(new Color(0,0,0));
   
   JLabel jogador1Nome = new JLabel();
   jogador1.add(jogador1Nome);
   jogador1Nome.setText("Nome: ");
   jogador1Nome.setBounds(0, 15, 200, 15);
   jogador1Nome.setForeground(new Color(0,0,0));
   
   
   JLabel jogador1Vida = new JLabel();
   jogador1.add(jogador1Vida);
   jogador1Vida.setText("Vida: ");
   jogador1Vida.setBounds(0, 30, 200, 15);
   jogador1Vida.setForeground(new Color(0,0,0));
   
   JLabel jogador1Movimento = new JLabel();
   jogador1.add(jogador1Movimento);
   jogador1Movimento.setText("Movimento: ");
   jogador1Movimento.setBounds(0, 45, 200, 15);
   jogador1Movimento.setForeground(new Color(0,0,0));
   
   JLabel jogador1Arma = new JLabel();
   jogador1.add(jogador1Arma);
   jogador1Arma.setText("Arma: ");
   jogador1Arma.setBounds(0, 60, 200, 15);
   jogador1Arma.setForeground(new Color(0,0,0));
   
   this.painel.add(jogador2);
   jogador2.setBackground(new Color(64,71,106));
   jogador2.setBounds(255, 130, 200, 120);
   jogador2.setLayout(null);
   jogador2.setForeground(new Color(0,0,0));
   
   JLabel lJogador2 = new JLabel();
   jogador2.add(lJogador2);
   lJogador2.setText("Jogador 2");
   lJogador2.setBounds(0, 0, 200, 15);
   lJogador2.setForeground(new Color(0,0,0));
   
   JLabel jogador2Nome = new JLabel();
   jogador2.add(jogador2Nome);
   jogador2Nome.setText("Nome: ");
   jogador2Nome.setBounds(0, 15, 200, 15);
   jogador2Nome.setForeground(new Color(0,0,0));
   
   
   JLabel jogador2Vida = new JLabel();
   jogador2.add(jogador2Vida);
   jogador2Vida.setText("Vida: ");
   jogador2Vida.setBounds(0, 30, 200, 15);
   jogador2Vida.setForeground(new Color(0,0,0));
   
   JLabel jogador2Movimento = new JLabel();
   jogador2.add(jogador2Movimento);
   jogador2Movimento.setText("Movimento: ");
   jogador2Movimento.setBounds(0, 45, 200, 15);
   jogador2Movimento.setForeground(new Color(0,0,0));
   
   JLabel jogador2Arma = new JLabel();
   jogador2.add(jogador2Arma);
   jogador2Arma.setText("Arma: ");
   jogador2Arma.setBounds(0, 60, 200, 15);
   jogador2Arma.setForeground(new Color(0,0,0));
   
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}

/*public static void main (String args[]){
 TelaPrincipal teste = new TelaPrincipal();
    
}*/

public void atributos(Jogador play1, Jogador play ){

   
}




}
