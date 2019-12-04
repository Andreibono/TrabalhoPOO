/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import Itens.Bomba;
import Itens.Escopeta;
import Itens.Rifle;
import Itens.Virus;
import java.util.Random;
import java.util.Scanner;
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
    private static int quemTaJogando = 0;
    private static Arena arena;
    private int movimentoplayer1; 
    private int movimentoPlayer2; 
    private int movimento1; 
    private int movimento2; 
    //armas da arena 10
    private Escopeta escopetas1;
    private Escopeta escopetas2;
    private Escopeta escopetas3;
    private Rifle  rifles1;
    private Rifle  rifles2;
    private Rifle  rifles3;
    private Virus  virus1;
    private Virus  virus2;
    private Virus  virus3;
    private Bomba  bombas1;
    private Bomba  bombas2;
    private Bomba  bombas3;
    
    /*Variáveis do loop do jogo*/
    private static boolean estaRodando;
    private static Thread thread;
    private static boolean querJogar;
    private Random gerador;

    /**
     * Creates new form TelaPrincipalGame
     */
    public TelaPrincipalGame(Arena arena) {

        this.arena = arena;
        initComponents();
        
        gerarArmas();
        colocarArmasArena();
        
        player1 = new Player(new Robo(1, "C3PO", 100.00, 0, 0, arma));
        player2 = new Player(new Robo(2, "TERMINATOR", 200.00, 0, 1, arma2));
        this.arena.setArena(player1.getRobo().getCoordenadaX(), player1.getRobo().getCoordenadaY(), 1);
        this.arena.setArena(player2.getRobo().getCoordenadaX(), player2.getRobo().getCoordenadaY(), -1);
        movimentoplayer1= movimento1 = player1.getRobo().getMovimento();
        movimentoPlayer2= movimento2 = player2.getRobo().getMovimento();
        
        this.desenharTela();
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

    public void atualizar() throws Exception {
        this.podeAtacar();
        if (quemTaJogando == 0 && movimento1 != 0) {
            this.jLQuemTaJogando.setText("RODADA: JOGADOR 1");
            Scanner ler = new Scanner(System.in);
            char c = (char) System.in.read();
       
            
            if (c == 'w') {
                if(!((player1.getRobo().getCoordenadaX()- 1) == player2.getRobo().getCoordenadaX() && 
                player1.getRobo().getCoordenadaY() == player2.getRobo().getCoordenadaY())){
                arena.itemArena(player1.getRobo().getCoordenadaX()-1, player1.getRobo().getCoordenadaY(), player1);
                player1.movimentoCima();
                arena.setArena(player1.getRobo().getCoordenadaX() + 1, player1.getRobo().getCoordenadaY(), 0);
                movimento1 = movimento1 -1;                
                }
            }
            if (c == 's') {
                if(!((player1.getRobo().getCoordenadaX() + 1) == player2.getRobo().getCoordenadaX() && 
                player1.getRobo().getCoordenadaY() == player2.getRobo().getCoordenadaY())){
                arena.itemArena(player1.getRobo().getCoordenadaX()+1, player1.getRobo().getCoordenadaY(), player1);
                player1.movimentoBaixo();
                arena.setArena(player1.getRobo().getCoordenadaX() - 1, player1.getRobo().getCoordenadaY(), 0);
                movimento1 = movimento1 -1;
            }
            }
            if (c == 'a') {
            if(!((player1.getRobo().getCoordenadaY() + 1) == player2.getRobo().getCoordenadaY() && 
            player1.getRobo().getCoordenadaX() == player2.getRobo().getCoordenadaX())){
            arena.itemArena(player1.getRobo().getCoordenadaX(), player1.getRobo().getCoordenadaY()- 1, player1);
            player1.movimentoEsquerda();
            arena.setArena(player1.getRobo().getCoordenadaX(), player1.getRobo().getCoordenadaY() + 1, 0);
            movimento1 = movimento1 -1;
            }
            }    
            if (c == 'd') {
                if(!((player1.getRobo().getCoordenadaY() + 1) == player2.getRobo().getCoordenadaY() && 
                (player1.getRobo().getCoordenadaX()) == player2.getRobo().getCoordenadaX() )){
                arena.itemArena(player1.getRobo().getCoordenadaX(), player1.getRobo().getCoordenadaY()+1, player1);
                player1.movimentoDireita();
                arena.setArena(player1.getRobo().getCoordenadaX(), player1.getRobo().getCoordenadaY() - 1, 0);
                movimento1 = movimento1 -1;
                }
            }
            arena.setArena(player1.getRobo().getCoordenadaX(), player1.getRobo().getCoordenadaY(), 1);
           
        } else {
                                 
            if (quemTaJogando == 1 && movimento2 != 0) {
                this.jLQuemTaJogando.setText("RODADA: JOGADOR 2");
                Scanner ler = new Scanner(System.in);
                char c = (char) System.in.read();
                if (c == 'w') {
                     if(!((player2.getRobo().getCoordenadaX() - 1) == player1.getRobo().getCoordenadaX() && 
                    player1.getRobo().getCoordenadaY() == player2.getRobo().getCoordenadaY())){
                    arena.itemArena(player2.getRobo().getCoordenadaX()-1, player2.getRobo().getCoordenadaY(), player2);
                    player2.movimentoCima();
                    arena.setArena(player2.getRobo().getCoordenadaX() + 1, player2.getRobo().getCoordenadaY(), 0); 
                    movimento2 = movimento2 -1;
                     }
                }
                if (c == 's') {
                 if(!((player2.getRobo().getCoordenadaX() + 1) == player1.getRobo().getCoordenadaX() && 
                    player1.getRobo().getCoordenadaY() == player2.getRobo().getCoordenadaY())){
                    player2.movimentoBaixo();
                    arena.itemArena(player2.getRobo().getCoordenadaX()+1, player2.getRobo().getCoordenadaY(), player2);
                    arena.setArena(player2.getRobo().getCoordenadaX() - 1, player2.getRobo().getCoordenadaY(), 0);
                    movimento2 = movimento2 -1;
                 }
                }
                if (c == 'a') {
                     if(!((player1.getRobo().getCoordenadaY() - 1) == player1.getRobo().getCoordenadaY() && 
                    player1.getRobo().getCoordenadaX() == player2.getRobo().getCoordenadaX())){
                    arena.itemArena(player2.getRobo().getCoordenadaX(), player2.getRobo().getCoordenadaY()-1, player2);
                    player2.movimentoEsquerda();
                    movimento2 = movimento2 -1;
                    arena.setArena(player2.getRobo().getCoordenadaX(), player2.getRobo().getCoordenadaY() + 1, 0);
                }
                }
                if (c == 'd') {
                    if(!((player2.getRobo().getCoordenadaY() + 1) == player1.getRobo().getCoordenadaY() && 
                    player1.getRobo().getCoordenadaX() == player2.getRobo().getCoordenadaX())){
                    arena.itemArena(player2.getRobo().getCoordenadaX(), player2.getRobo().getCoordenadaY()+1, player2);
                    player2.movimentoDireita();
                    arena.setArena(player2.getRobo().getCoordenadaX(), player2.getRobo().getCoordenadaY() - 1, 0);
                    movimento2 = movimento2 -1;
                    }
                }
                arena.setArena(player2.getRobo().getCoordenadaX(), player2.getRobo().getCoordenadaY(), -1);
                
            }
        }

    }

    public void desenharTela() {
        tabuleiroArena = arena.desenharArena();
        this.jLArena.setText(tabuleiroArena);
        this.jLPlayer1.setText("<html>PLAYER 1<br>"
                + "NOME: " + player1.getRobo().getNome() + "<br>"
                + "VIDA: " + player1.getRobo().getVida() + "<br>"
                + "MOVIMENTO: " + movimento1 + "<br>"
                + "ARMA: " + player1.getRobo().getItem().getNome() + "<br>"
                + "</html>");
        this.jLPlayer2.setText("<html>PLAYER 2<br>"
                + "NOME: " + player2.getRobo().getNome() + "<br>"
                + "VIDA: " + player2.getRobo().getVida() + "<br>"
                + "MOVIMENTO: " + movimento2 + "<br>"
                + "ARMA: " + player2.getRobo().getItem().getNome() + "<br>"
                + "</html>");
    }

    /*Fazendo o loop do jogo*/
    public void run() {
        while (estaRodando) {
            
            try {
                atualizar();
                desenharTela();
                
                try {
                    Thread.sleep(1000 / 60);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
                }
                if(!(player1.getRobo().getVida() > 0 && player2.getRobo().getVida() > 0)){
                    estaRodando = false;
                    if(player1.getRobo().getVida() > 0){
                        this.jLQuemTaJogando.setText(" VENCEDOR PLAYER 1");
                    }else{
                    
                        this.jLQuemTaJogando.setText(" VENCEDOR PLAYER 2");
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        pararJogo();
    }

    public void podeAtacar() {

        if (player1.getRobo().getCoordenadaX() == player2.getRobo().getCoordenadaX()
                || player1.getRobo().getCoordenadaY() == player2.getRobo().getCoordenadaY()) {

            this.jBAtacar.setEnabled(true);
        } else {
            this.jBAtacar.setEnabled(false);
        }

    }

    public void gerarArmas(){
    
    this.escopetas1 = new Escopeta("Escopeta");
    this.escopetas2 = new Escopeta("Escopeta");
    this.escopetas3 = new Escopeta("Escopeta");
    this.rifles1 = new Rifle("Rifle");
    this.rifles2 = new Rifle("Rifle");
    this.rifles3 = new Rifle("Rifle");
    this.bombas1 = new Bomba("Bomba");
    this.bombas2 = new Bomba("Bomba");
    this.bombas3 = new Bomba("Bomba");
    this.virus1 = new Virus(3,"Virus");
    this.virus2 = new Virus(3,"Virus");
    this.virus3 = new Virus(3,"Virus");
    
    
    this.escopetas1.randomX();
    this.escopetas1.randomY();
    this.escopetas2.randomX();
    this.escopetas2.randomY();
    this.escopetas3.randomX();
    this.escopetas3.randomY();
    
    this.rifles1.randomX();
    this.rifles1.randomY();
    this.rifles2.randomX();
    this.rifles2.randomY();
    this.rifles3.randomX();
    this.rifles3.randomY();
    
    this.bombas1.randomX();
    this.bombas1.randomY();
    this.bombas2.randomX();
    this.bombas2.randomY();
    this.bombas3.randomX();
    this.bombas3.randomY();
    
    this.virus1.randomX();
    this.virus1.randomY();
    this.virus2.randomX();
    this.virus2.randomY();
    this.virus3.randomX();
    this.virus3.randomY();
    
 
    
    }
  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLQuemTaJogando = new javax.swing.JLabel();
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

        jLQuemTaJogando.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLQuemTaJogando.setText("RODADA: JOGADOR 1");
        jPanel4.add(jLQuemTaJogando);
        jLQuemTaJogando.setBounds(0, 0, 219, 40);

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
        jBFimTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFimTurnoActionPerformed(evt);
            }
        });
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
        if(quemTaJogando == 0 ){
        
            player2.getRobo().setVida(player2.getRobo().getVida()-player1.getRobo().getItem().calcularDano());
        }else{
           if(quemTaJogando == 1){
            player1.getRobo().setVida(player1.getRobo().getVida()-player2.getRobo().getItem().calcularDano());
           
           }
        }
    }//GEN-LAST:event_jBAtacarActionPerformed

    private void jLArenaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLArenaKeyPressed

    }//GEN-LAST:event_jLArenaKeyPressed

    private void jBFimTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFimTurnoActionPerformed
        if (quemTaJogando == 0) {
            quemTaJogando = 1;           
        } else {
            quemTaJogando = 0;
        }
        movimento1 = movimentoplayer1;
        movimento2 = movimentoPlayer2;
    }//GEN-LAST:event_jBFimTurnoActionPerformed

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
    private javax.swing.JLabel jLQuemTaJogando;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables

    private void colocarArmasArena() {
        
        arena.setArena(this.rifles1.getCoordenadaX(), this.rifles1.getCoordenadaY(), 3);
        arena.setArena(this.rifles2.getCoordenadaX(), this.rifles2.getCoordenadaY(), 3);
        arena.setArena(this.rifles3.getCoordenadaX(), this.rifles2.getCoordenadaY(), 3);
        arena.setArena(this.escopetas1.getCoordenadaX(), this.escopetas1.getCoordenadaY(), 2);
        arena.setArena(this.escopetas2.getCoordenadaX(), this.escopetas2.getCoordenadaY(), 2);
        arena.setArena(this.escopetas3.getCoordenadaX(), this.escopetas3.getCoordenadaY(), 2);
        
        arena.setArena(this.bombas1.getCoordenadaX(), this.bombas1.getCoordenadaY(), 4);
        arena.setArena(this.virus1.getCoordenadaX(), this.virus1.getCoordenadaY(),5);
        arena.setArena(this.bombas2.getCoordenadaX(), this.bombas2.getCoordenadaY(), 4);
        arena.setArena(this.virus2.getCoordenadaX(), this.virus2.getCoordenadaY(),5);
        arena.setArena(this.bombas3.getCoordenadaX(), this.bombas3.getCoordenadaY(), 4);
        arena.setArena(this.virus3.getCoordenadaX(), this.virus3.getCoordenadaY(),5);

    }
}
