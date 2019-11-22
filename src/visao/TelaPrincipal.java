package visao;

import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Bruno
 */
public class TelaPrincipal {

public static void main(String args[]){
    JFrame janela = new JFrame("batalha de robos");
    JPanel painel = new JPanel();
    JTextArea areaTexto = new JTextArea();
    janela.add(painel);
    painel.setLayout(null);
    
    painel.add(areaTexto);
    areaTexto.setBounds(0, 0, 500, 300);
    janela.setSize(600, 400);
    janela.setLocationRelativeTo(null);
    janela.setVisible(true);
    janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

}
