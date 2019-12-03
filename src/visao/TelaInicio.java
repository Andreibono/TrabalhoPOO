package visao;



import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 *
 * @author Bruno
 */
public class TelaInicio extends JFrame implements KeyListener{
    
    private JFrame menu;
    private JPanel painel;
    private JLabel informacao;
    private JLabel comecarJogo;
    private JLabel sairJogo;
    
    private static String stringMenu;
    
    public TelaInicio(){
      
       
        this.menu = new JFrame("THE ULTMATE MEGAZORD FIGHT");
        this.painel = new JPanel();
        this.informacao = new JLabel();
        this.comecarJogo = new JLabel();
        this.sairJogo = new JLabel();
         informacao.addKeyListener(this);
        
        menu.setResizable(false);
        menu.setLocationRelativeTo(null);
        menu.setVisible(true);
        menu.setSize(400, 200);
        menu.add(painel);
        
        painel.setLayout(null);
        painel.setBackground(new Color(64,71,106));
        
        painel.add(informacao);
        informacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Telamenu.png")));
        informacao.setBounds(0, 0, 400,100);
        
        painel.add(comecarJogo);
        comecarJogo.setText(">>NOVO JOGO");
        comecarJogo.setForeground(Color.black);
        comecarJogo.setBounds(142, 75, 100, 50);
       
        painel.add(sairJogo);
        sairJogo.setText("SAIR JOGO");
        sairJogo.setForeground(Color.black);
        sairJogo.setBounds(155, 90, 100, 50);
        
        
       
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       

  
    }
    
    
    
    public static void main (String args[]){
        
       
        TelaInicio teste = new TelaInicio();
       
        
        
    }
  
    
     
    
    @Override
    public void keyTyped(KeyEvent ke) {
    
    }
    @Override
    public void keyPressed(KeyEvent ke) {
        
        if(ke.getKeyCode() == KeyEvent.VK_S || ke.getKeyCode() == KeyEvent.VK_DOWN){
        
            System.out.println("S");
        
        }
    }
      
    

    @Override
    public void keyReleased(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
