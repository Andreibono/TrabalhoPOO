package visao;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Bruno
 */
public class TelaPrincipal {
    
private JFrame tela;
private JPanel painel;
private JTextArea arena;
private String string;

public TelaPrincipal(){

    tela = new JFrame("Tela");
    painel = new JPanel();
    arena = new JTextArea();
    tela.add(painel);
    painel.setBackground(Color.yellow);
    painel.setBounds(50, 50, 50, 50);
    painel.add(arena);
    arena.setBounds(0, 0, 50, 50);
    arena.setText(ToString());
    tela.setLayout(null);
    tela.setSize(400, 400);
    tela.setResizable(false);
    tela.setLocationRelativeTo(null);
    tela.setVisible(true);
    tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}

public static void main (String args[]){
 TelaPrincipal teste = new TelaPrincipal();
    
}

public String ToString(){

    this.string = new String("00000000000\n0000000000000\n0000000000000\n");
    
    return this.string;
}
}
