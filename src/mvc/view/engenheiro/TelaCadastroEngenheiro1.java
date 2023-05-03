/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.view.engenheiro;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author DELL
 */
public class TelaCadastroEngenheiro1 extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroEngenheiro1
     */
    public TelaCadastroEngenheiro1() {
        initComponents();
    }

    public JButton getjButtonAvancar() {
        return jButtonAvancar;
    }

    public JButton getjButtonVoltarCadastro() {
        return jButtonVoltarCadastro;
    }

    public JTextField getjTextFieldCPFEngenheiro() {
        return jTextFieldCPFEngenheiro;
    }

    public JTextField getjTextFieldEmailEngenheiro() {
        return jTextFieldEmailEngenheiro;
    }

    public JTextField getjTextFieldNomeEngenheiro() {
        return jTextFieldNomeEngenheiro;
    }

    public JTextField getjTextFieldTelefoneEngenheiro() {
        return jTextFieldTelefoneEngenheiro;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButtonVoltarCadastro = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTextFieldCPFEngenheiro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldEmailEngenheiro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNomeEngenheiro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButtonAvancar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldTelefoneEngenheiro = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(81, 79, 170));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 620));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PngProjeto/logo.png"))); // NOI18N

        jButtonVoltarCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PngProjeto/back.png"))); // NOI18N
        jButtonVoltarCadastro.setBorderPainted(false);
        jButtonVoltarCadastro.setContentAreaFilled(false);
        jButtonVoltarCadastro.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/PngProjeto/bakh.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(620, 620));

        jTextFieldCPFEngenheiro.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldCPFEngenheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCPFEngenheiroActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(81, 79, 170));
        jLabel3.setText("CPF:");

        jTextFieldEmailEngenheiro.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldEmailEngenheiro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldEmailEngenheiroFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldEmailEngenheiroFocusLost(evt);
            }
        });
        jTextFieldEmailEngenheiro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldEmailEngenheiroKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(81, 79, 170));
        jLabel2.setText("Email:");

        jTextFieldNomeEngenheiro.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldNomeEngenheiro.setText("Digite aqui seu nome de usuário...");
        jTextFieldNomeEngenheiro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldNomeEngenheiroFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldNomeEngenheiroFocusLost(evt);
            }
        });
        jTextFieldNomeEngenheiro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldNomeEngenheiroKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(81, 79, 170));
        jLabel4.setText("Nome:");

        jButtonAvancar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pngalt/avançar.png"))); // NOI18N
        jButtonAvancar.setContentAreaFilled(false);
        jButtonAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAvancarActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pngalt/user.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pngalt/nº.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pngalt/mail3.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pngalt/1de2.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(81, 79, 170));
        jLabel10.setText("Telefone:");

        jTextFieldTelefoneEngenheiro.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldTelefoneEngenheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTelefoneEngenheiroActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PngProjeto/Cadastro Arquiteto.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(218, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonAvancar, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(206, 206, 206))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldNomeEngenheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldEmailEngenheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextFieldTelefoneEngenheiro, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldCPFEngenheiro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel1)
                .addGap(98, 98, 98)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldNomeEngenheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldEmailEngenheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldCPFEngenheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldTelefoneEngenheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jButtonAvancar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(57, 57, 57))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonVoltarCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 61, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(75, 75, 75)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButtonVoltarCadastro)
                .addGap(152, 152, 152)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldEmailEngenheiroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldEmailEngenheiroFocusGained
        if(jTextFieldEmailEngenheiro.getText().equals("Digite aqui seu email...")){
            jTextFieldEmailEngenheiro.setCaretPosition(0);
            jTextFieldEmailEngenheiro.setCaretColor(Color.BLACK);
        } else{
            jTextFieldEmailEngenheiro.setSelectionStart(0);
        }
    }//GEN-LAST:event_jTextFieldEmailEngenheiroFocusGained

    private void jTextFieldEmailEngenheiroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldEmailEngenheiroFocusLost
        if(jTextFieldEmailEngenheiro.getText().equals("")){
            jTextFieldEmailEngenheiro.setText("Digite aqui seu email...");
            jTextFieldEmailEngenheiro.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextFieldEmailEngenheiroFocusLost

    private void jTextFieldEmailEngenheiroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldEmailEngenheiroKeyPressed
        if(jTextFieldEmailEngenheiro.getText().equals("Digite aqui seu email...")){
            jTextFieldEmailEngenheiro.setText("");
            jTextFieldEmailEngenheiro.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTextFieldEmailEngenheiroKeyPressed

    private void jTextFieldNomeEngenheiroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldNomeEngenheiroFocusGained
        if(jTextFieldNomeEngenheiro.getText().equals("Digite aqui seu nome...")){
            jTextFieldNomeEngenheiro.setCaretPosition(0);
            jTextFieldNomeEngenheiro.setCaretColor(Color.BLACK);
        } else{
            jTextFieldNomeEngenheiro.setSelectionStart(0);
        }
    }//GEN-LAST:event_jTextFieldNomeEngenheiroFocusGained

    private void jTextFieldNomeEngenheiroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldNomeEngenheiroFocusLost
        if(jTextFieldNomeEngenheiro.getText().equals("")){
            jTextFieldNomeEngenheiro.setText("Digite aqui seu nome...");
            jTextFieldNomeEngenheiro.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextFieldNomeEngenheiroFocusLost

    private void jTextFieldNomeEngenheiroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomeEngenheiroKeyPressed
        if(jTextFieldNomeEngenheiro.getText().equals("Digite aqui seu nome...")){
            jTextFieldNomeEngenheiro.setText("");
            jTextFieldNomeEngenheiro.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTextFieldNomeEngenheiroKeyPressed

    private void jTextFieldTelefoneEngenheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTelefoneEngenheiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTelefoneEngenheiroActionPerformed

    private void jTextFieldCPFEngenheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCPFEngenheiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCPFEngenheiroActionPerformed

    private void jButtonAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAvancarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAvancarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroEngenheiro1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroEngenheiro1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroEngenheiro1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroEngenheiro1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroEngenheiro1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAvancar;
    private javax.swing.JButton jButtonVoltarCadastro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldCPFEngenheiro;
    private javax.swing.JTextField jTextFieldEmailEngenheiro;
    private javax.swing.JTextField jTextFieldNomeEngenheiro;
    private javax.swing.JTextField jTextFieldTelefoneEngenheiro;
    // End of variables declaration//GEN-END:variables
}
