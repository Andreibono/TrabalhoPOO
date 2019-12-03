/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import Itens.Escopeta;
import Itens.Rifle;
import java.util.logging.Level;
import java.util.logging.Logger;
import personagens.Player;
import personagens.Robo;
import trabalhopoo.Arena;
import trabalhopoo.Game;

/**
 *
 * @author Bruno
 */
public class TelaPrincipalGame extends javax.swing.JFrame implements Runnable {

    private static String tabuleiroArena;
    private static Player player1;
    private Escopeta arma = new Escopeta("Escopeta");
    private static Player player2;
    private Rifle arma2 = new Rifle("Rifle");
    private static Arena arena;
        /*Variáveis do loop do jogo*/
    private static boolean estaRodando;
    private static Thread thread;
    private static boolean querJogar;
    
    
    /**
     * Creates new form TelaPrincipalGame
     */
    public TelaPrincipalGame(Arena arena) {
        
        this.arena = arena;
        initComponents();
        player1 = new Player( new Robo(1,"C3PO",100.00,0,0,arma));
        player2 = new Player( new Robo(2,"TERMINATOR",200.00,9,19,arma2));
        this.arena.setArena(player1.getRobo().getCoordenadaX(), player1.getRobo().getCoordenadaY(), 1);
        this.arena.setArena(player2.getRobo().getCoordenadaX(), player2.getRobo().getCoordenadaY(), -1);
        
        
        this.comecarJogo();

        
  
    
    
    }
    
     public TelaPrincipalGame() {
        
         initComponents();
        
    }
   public void comecarJogo() {

        estaRodando = true;
        thread = new Thread(this);
        thread.start();

    }

    public void pararJogo() {

        estaRodando = false;
        try {
            thread.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void atualizar() {
        arena.setArena(player1.getRobo().getCoordenadaX(), player1.getRobo().getCoordenadaY(), 1);
        arena.setArena(player2.getRobo().getCoordenadaX(), player2.getRobo().getCoordenadaY(), -1);
        this.podeAtacar();
        
        
    }

    public void desenharTela() {
        tabuleiroArena = arena.desenharArena();
        this.jLArena.setText(tabuleiroArena);
        this.jLPlayer1.setText("<html>PLAYER 1<br>"
                + "NOME: "+player1.getRobo().getNome()+"<br>"
                + "VIDA: "+player1.getRobo().getVida()+"<br>"
                + "MOVIMENTO: "+player1.getRobo().getMovimento()+"<br>"
                + "ARMA: "+player1.getRobo().getItem().getNome()+ "<br>"
                + "</html>");
        this.jLPlayer2.setText("<html>PLAYER 2<br>"
                + "NOME: "+player2.getRobo().getNome()+"<br>"
                + "VIDA: "+player2.getRobo().getVida()+"<br>"
                + "MOVIMENTO: "+player2.getRobo().getMovimento()+"<br>"
                + "ARMA: "+player2.getRobo().getItem().getNome()+"<br>"
                + "</html>");
    }

    /*Fazendo o loop do jogo*/
    public void run() {
        while (estaRodando) {

            atualizar();
            desenharTela();
            try {
                Thread.sleep(1000 / 60);
            } catch (InterruptedException ex) {
                Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        pararJogo();
    }
     public void podeAtacar(){
     
     if(player1.getRobo().getCoordenadaX() == player2.getRobo().getCoordenadaX() || 
             player1.getRobo().getCoordenadaY() == player2.getRobo().getCoordenadaY()){
     
         this.jBAtacar.setEnabled(true);
     }else{
         this.jBAtacar.setEnabled(false);
     }
     
     
     
     }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLPlayer1 = new javax.swing.JLabel();
        jBAtacar = new javax.swing.JButton();
        jBFimTurno = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLArena = new javax.swing.JLabel();
        jLPlayer2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("THE ULTIMATE MEGAZORD FIGHT");
        setBackground(new java.awt.Color(0, 51, 51));
        getContentPane().setLayout(null);

        jPanel4.setBackground(new java.awt.Color(0, 51, 51));
        jPanel4.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("RODADA: JOGADOR 1");
        jPanel4.add(jLabel1);
        jLabel1.setBounds(0, 0, 219, 40);

        jLPlayer1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel4.add(jLPlayer1);
        jLPlayer1.setBounds(310, 0, 160, 130);

        jBAtacar.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jBAtacar.setText("ATACAR");
        jBAtacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAtacarActionPerformed(evt);
            }
        });
        jPanel4.add(jBAtacar);
        jBAtacar.setBounds(280, 270, 90, 23);

        jBFimTurno.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jBFimTurno.setText("FIM TURNO");
        jPanel4.add(jBFimTurno);
        jBFimTurno.setBounds(368, 270, 100, 23);

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setLayout(null);

        jLArena.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLArena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLArenaKeyPressed(evt);
            }
        });
        jPanel5.add(jLArena);
        jLArena.setBounds(0, -20, 280, 300);

        jPanel4.add(jPanel5);
        jPanel5.setBounds(0, 30, 280, 270);

        jLPlayer2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel4.add(jLPlayer2);
        jLPlayer2.setBounds(310, 130, 160, 130);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 0, 500, 380);

        setSize(new java.awt.Dimension(484, 332));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBAtacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAtacarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBAtacarActionPerformed

    private void jLArenaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLArenaKeyPressed

    }//GEN-LAST:event_jLArenaKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipalGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAtacar;
    private javax.swing.JButton jBFimTurno;
    private javax.swing.JLabel jLArena;
    private javax.swing.JLabel jLPlayer1;
    private javax.swing.JLabel jLPlayer2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
