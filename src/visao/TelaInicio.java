package visao;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Bruno
 */
public class TelaInicio implements KeyListener{
    
    private JFrame menu;
    private JPanel painel;
    private JTextArea informacao;
    private JLabel comecarJogo;
    private JLabel sairJogo;
    
    private static String stringMenu;
    
    public TelaInicio(){
    
        this.menu = new JFrame("THE ULTMATE MEGAZORD FIGHT");
        this.painel = new JPanel();
        this.informacao = new JTextArea();
        this.comecarJogo = new JLabel();
        this.sairJogo = new JLabel();
        
        menu.setResizable(false);
        menu.setLocationRelativeTo(null);
        menu.setVisible(true);
        menu.setLayout(null);
        menu.setSize(400, 400);
        menu.add(informacao);
        informacao.setText(menu());
        informacao.setBounds(0, 100, 400, 200);
        
        
       
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       

  
    }
    
    
    
    public static void main (String args[]){
        
        TelaInicio teste = new TelaInicio();
        System.out.println(menu());
        
        
    
    }

    public static String menu (){
    
    String stringMenu = new String("   THE ULTIMATE MEGAZORD     \n" +
                                   "          FIGHT 1.0 V       \n");
    
    return stringMenu;
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @Override
    public void keyTyped(KeyEvent ke) {
    
    }
    @Override
    public void keyPressed(KeyEvent ke) {
      
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
