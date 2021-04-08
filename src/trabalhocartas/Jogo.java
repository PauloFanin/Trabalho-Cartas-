
package trabalhocartas;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Jogo extends javax.swing.JFrame {
Baralho  jogador[]  = Baralho.criabaralho();
Baralho  mesa []   =  Baralho.criabaralho();
int somajogador = 0; 
int somamesa = 0;
String vencedor ;
int vitoriajogador;
int vitoriamesa;        
   
    public Jogo() {
        initComponents();
    }
    public void imagenscartas(){
        ImageIcon imacarta = new ImageIcon (getClass().getResource("..\\imagenscartas\\"+ mesa[0].getNaipes().getCodigonaipe()+mesa[0].getCartas().getNumcarta()+".png"));
        carta1.setIcon(imacarta);
    }
    public void imagenscartas1(){
        ImageIcon imacarta1 = new ImageIcon (getClass().getResource("..\\imagenscartas\\"+ mesa[1].getNaipes().getCodigonaipe()+mesa[1].getCartas().getNumcarta()+".png"));
        carta2.setIcon(imacarta1);
    }
    public void imagenscartas2(){    
        ImageIcon imacarta2 = new ImageIcon (getClass().getResource("..\\imagenscartas\\"+ mesa[2].getNaipes().getCodigonaipe()+mesa[2].getCartas().getNumcarta()+".png"));
        carta3.setIcon(imacarta2);
    }
    public void imagenscartas3(){
        ImageIcon imacarta3 = new ImageIcon (getClass().getResource("..\\imagenscartas\\"+ mesa[3].getNaipes().getCodigonaipe()+mesa[3].getCartas().getNumcarta()+".png"));
        carta4.setIcon(imacarta3);
    }
    public void imagenscartas4(){        
        ImageIcon imacarta4 = new ImageIcon (getClass().getResource("..\\imagenscartas\\"+ mesa[4].getNaipes().getCodigonaipe()+mesa[4].getCartas().getNumcarta()+".png"));
        carta5.setIcon(imacarta4);
    }
    public void imagenscartas5(){
        ImageIcon imacarta5 = new ImageIcon (getClass().getResource("..\\imagenscartas\\"+ jogador[0].getNaipes().getCodigonaipe()+jogador[0].getCartas().getNumcarta()+".png"));
        carta6.setIcon(imacarta5);
    }
    public void imagenscartas6(){
        ImageIcon imacarta6 = new ImageIcon (getClass().getResource("..\\imagenscartas\\"+ jogador[1].getNaipes().getCodigonaipe()+jogador[1].getCartas().getNumcarta()+".png"));
        carta7.setIcon(imacarta6);
    }
    public void imagenscartas7(){
        ImageIcon imacarta7 = new ImageIcon (getClass().getResource("..\\imagenscartas\\"+ jogador[2].getNaipes().getCodigonaipe()+jogador[2].getCartas().getNumcarta()+".png"));
        carta8.setIcon(imacarta7);
    }
    public void imagenscartas8(){
        ImageIcon imacarta8 = new ImageIcon (getClass().getResource("..\\imagenscartas\\"+ jogador[3].getNaipes().getCodigonaipe()+jogador[3].getCartas().getNumcarta()+".png"));
        carta9.setIcon(imacarta8);
    }
    public void imagenscartas9(){
        ImageIcon imacarta9 = new ImageIcon (getClass().getResource("..\\imagenscartas\\"+ jogador[4].getNaipes().getCodigonaipe()+jogador[4].getCartas().getNumcarta()+".png"));
        carta10.setIcon(imacarta9);
    }    
        
    public void vencedor(){
        if (somamesa > somajogador){
            vencedor = "casa vencendora!";
            vitoriamesa++;
            vitoriamesaa.setText(Integer.toString(vitoriamesa));
        }
        else if (somamesa < somajogador){
            vencedor ="Jogador venceu!";
            vitoriajogador++;
            vitoriajogadorr.setText(Integer.toString(vitoriajogador));
        }
        else{
            vencedor = "EMPATEEEE!!!!!";
        }
        JOptionPane.showMessageDialog(null,vencedor);
        
    }  
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        pontuaçãomesa = new javax.swing.JLabel();
        pontuaçãojogador = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        carta1 = new javax.swing.JLabel();
        carta2 = new javax.swing.JLabel();
        carta3 = new javax.swing.JLabel();
        carta4 = new javax.swing.JLabel();
        carta5 = new javax.swing.JLabel();
        carta10 = new javax.swing.JLabel();
        carta9 = new javax.swing.JLabel();
        carta8 = new javax.swing.JLabel();
        carta7 = new javax.swing.JLabel();
        carta6 = new javax.swing.JLabel();
        vitoriamesaa = new javax.swing.JLabel();
        vitoriajogadorr = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Carta 1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Carta 1");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Carta 2");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Carta 3");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Carta 4");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Carta 5");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Carta 2");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Carta 3");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Carta 4");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Carta 5");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        pontuaçãomesa.setText("pontuação 1");

        pontuaçãojogador.setText("pontuação 2");

        jButton11.setText("jButton11");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jLabel6.setText("casa");

        jLabel7.setText("jogador");

        vitoriamesaa.setText(" 0");

        vitoriajogadorr.setText("0");

        jLabel1.setText("Vitórias:");

        jLabel2.setText("Vitórias:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(carta6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carta1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(carta7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(carta2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(carta3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(carta4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(carta8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(carta9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carta5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 502, Short.MAX_VALUE)
                                .addComponent(jButton11)
                                .addGap(255, 255, 255))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pontuaçãojogador, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pontuaçãomesa, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel1)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(vitoriajogadorr)
                                    .addComponent(vitoriamesaa)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(carta10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6)
                            .addComponent(pontuaçãomesa, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(vitoriamesaa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(carta2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carta1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carta3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carta4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carta5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton2)
                                .addComponent(jButton7)
                                .addComponent(jButton8)
                                .addComponent(jButton9)
                                .addComponent(jButton10))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(pontuaçãojogador)
                                .addComponent(jLabel2)
                                .addComponent(vitoriajogadorr)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(carta10, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(carta6, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(carta7, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(carta8, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(carta9, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jButton11)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       System.out.print(mesa[0].getNaipes().getCodigonaipe()+mesa[0].getCartas().getNumcarta());
        imagenscartas();
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       imagenscartas1(); // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        imagenscartas2();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        imagenscartas3();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        imagenscartas4();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        imagenscartas5(); 
        if (jogador[0].getCartas().getCartaponto() > mesa[0].getCartas().getCartaponto()){
            somajogador = somajogador + jogador[0].getCartas().getCartaponto() + mesa[0].getCartas().getCartaponto();
            pontuaçãojogador.setText(Integer.toString(somajogador));
        }
        else if (jogador[0].getCartas().getCartaponto() < mesa[0].getCartas().getCartaponto()){
            somamesa = somajogador + jogador[0].getCartas().getCartaponto() + mesa[0].getCartas().getCartaponto();
            pontuaçãomesa.setText(Integer.toString(somamesa));   
        }
        
            
        
      
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        imagenscartas6(); 
        if (jogador[1].getCartas().getCartaponto() > mesa[1].getCartas().getCartaponto()){
            somajogador = somajogador + jogador[1].getCartas().getCartaponto() + mesa[1].getCartas().getCartaponto();
            pontuaçãojogador.setText(Integer.toString(somajogador));
        }
        else if(jogador[1].getCartas().getCartaponto() < mesa[1].getCartas().getCartaponto()){
            somamesa = somamesa + jogador[1].getCartas().getCartaponto() + mesa[1].getCartas().getCartaponto();
             pontuaçãomesa.setText(Integer.toString(somamesa));   
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        imagenscartas7();        
        if (jogador[2].getCartas().getCartaponto() > mesa[2].getCartas().getCartaponto()){
            somajogador = somajogador + jogador[2].getCartas().getCartaponto() + mesa[2].getCartas().getCartaponto();
            pontuaçãojogador.setText(Integer.toString(somajogador));
        }
        else if(jogador[2].getCartas().getCartaponto() < mesa[2].getCartas().getCartaponto()){
            somamesa = somamesa + jogador[2].getCartas().getCartaponto() + mesa[2].getCartas().getCartaponto();
             pontuaçãomesa.setText(Integer.toString(somamesa));   
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        imagenscartas8();        
        if (jogador[3].getCartas().getCartaponto() > mesa[3].getCartas().getCartaponto()){
            somajogador = somajogador + jogador[3].getCartas().getCartaponto() + mesa[3].getCartas().getCartaponto();
            pontuaçãojogador.setText(Integer.toString(somajogador));
        }
        else if(jogador[3].getCartas().getCartaponto() < mesa[3].getCartas().getCartaponto()){
            somamesa = somamesa + jogador[3].getCartas().getCartaponto() + mesa[3].getCartas().getCartaponto();
             pontuaçãomesa.setText(Integer.toString(somamesa));   
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        imagenscartas9();       
        if (jogador[4].getCartas().getCartaponto() > mesa[4].getCartas().getCartaponto()){
            somajogador = somajogador + jogador[4].getCartas().getCartaponto() + mesa[4].getCartas().getCartaponto();
            pontuaçãojogador.setText(Integer.toString(somajogador));
        }
        else if (jogador[4].getCartas().getCartaponto() < mesa[4].getCartas().getCartaponto()){
            somamesa = somamesa + jogador[4].getCartas().getCartaponto() + mesa[4].getCartas().getCartaponto();
             pontuaçãomesa.setText(Integer.toString(somamesa));   
        }
        vencedor();
    }//GEN-LAST:event_jButton10ActionPerformed

  
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
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel carta1;
    private javax.swing.JLabel carta10;
    private javax.swing.JLabel carta2;
    private javax.swing.JLabel carta3;
    private javax.swing.JLabel carta4;
    private javax.swing.JLabel carta5;
    private javax.swing.JLabel carta6;
    private javax.swing.JLabel carta7;
    private javax.swing.JLabel carta8;
    private javax.swing.JLabel carta9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel pontuaçãojogador;
    private javax.swing.JLabel pontuaçãomesa;
    private javax.swing.JLabel vitoriajogadorr;
    private javax.swing.JLabel vitoriamesaa;
    // End of variables declaration//GEN-END:variables
}
