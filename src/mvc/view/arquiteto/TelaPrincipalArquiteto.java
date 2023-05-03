/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.view.arquiteto;

import javax.swing.JButton;

/**
 *
 * @author DELL
 */
public class TelaPrincipalArquiteto extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipalArquiteto1
     */
    public TelaPrincipalArquiteto() {
        initComponents();
    }

    public JButton getjButtonAceitarProjetos() {
        return jButtonAceitarProjetos;
    }

    public JButton getjButtonCadastrarProjetoArquiteto() {
        return jButtonCadastrarProjetoArquiteto;
    }

    public JButton getjButtonNotificacoesArquiteto() {
        return jButtonNotificacoesArquiteto;
    }

    public JButton getjButtonPerfilArquiteto() {
        return jButtonPerfilArquiteto;
    }

    public JButton getjButtonProjeto1Arquiteto() {
        return jButtonProjeto1Arquiteto;
    }

    public JButton getjButtonProjeto2Arquiteto() {
        return jButtonProjeto2Arquiteto;
    }

    public JButton getjButtonProjetosArquiteto() {
        return jButtonProjetosArquiteto;
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonNotificacoesArquiteto = new javax.swing.JButton();
        jButtonPerfilArquiteto = new javax.swing.JButton();
        jButtonProjetosArquiteto = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButtonProjeto1Arquiteto = new javax.swing.JButton();
        jButtonProjeto2Arquiteto = new javax.swing.JButton();
        jButtonCadastrarProjetoArquiteto = new javax.swing.JButton();
        jLabelNomeArquiteto = new javax.swing.JLabel();
        jLabelNomeArquiteto1 = new javax.swing.JLabel();
        jButtonAceitarProjetos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelNomeUsuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(81, 79, 170));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));
        jPanel1.setRequestFocusEnabled(false);

        jButtonNotificacoesArquiteto.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNotificacoesArquiteto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PngProjeto/notificação.png"))); // NOI18N
        jButtonNotificacoesArquiteto.setToolTipText("Notificação");
        jButtonNotificacoesArquiteto.setBorder(null);
        jButtonNotificacoesArquiteto.setBorderPainted(false);
        jButtonNotificacoesArquiteto.setContentAreaFilled(false);
        jButtonNotificacoesArquiteto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNotificacoesArquitetoActionPerformed(evt);
            }
        });

        jButtonPerfilArquiteto.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPerfilArquiteto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PngProjeto/perfil.png"))); // NOI18N
        jButtonPerfilArquiteto.setToolTipText("Perfil");
        jButtonPerfilArquiteto.setContentAreaFilled(false);
        jButtonPerfilArquiteto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPerfilArquitetoActionPerformed(evt);
            }
        });

        jButtonProjetosArquiteto.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButtonProjetosArquiteto.setForeground(new java.awt.Color(255, 255, 255));
        jButtonProjetosArquiteto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PngProjeto/projeto.png"))); // NOI18N
        jButtonProjetosArquiteto.setToolTipText("Projetos");
        jButtonProjetosArquiteto.setBorder(null);
        jButtonProjetosArquiteto.setBorderPainted(false);
        jButtonProjetosArquiteto.setContentAreaFilled(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(620, 620));

        jButtonProjeto1Arquiteto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PngProjeto/btnProjeto1.png"))); // NOI18N
        jButtonProjeto1Arquiteto.setBorder(null);
        jButtonProjeto1Arquiteto.setBorderPainted(false);
        jButtonProjeto1Arquiteto.setContentAreaFilled(false);
        jButtonProjeto1Arquiteto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProjeto1ArquitetoActionPerformed(evt);
            }
        });

        jButtonProjeto2Arquiteto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PngProjeto/btnProjeto2.png"))); // NOI18N
        jButtonProjeto2Arquiteto.setBorder(null);
        jButtonProjeto2Arquiteto.setBorderPainted(false);
        jButtonProjeto2Arquiteto.setContentAreaFilled(false);

        jButtonCadastrarProjetoArquiteto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PngProjeto/criarProjeto_1.png"))); // NOI18N
        jButtonCadastrarProjetoArquiteto.setBorder(null);
        jButtonCadastrarProjetoArquiteto.setBorderPainted(false);
        jButtonCadastrarProjetoArquiteto.setContentAreaFilled(false);

        jLabelNomeArquiteto.setText("Arq");

        jLabelNomeArquiteto1.setText("ARQUITETO");

        jButtonAceitarProjetos.setText("Aceitar Projeto");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonProjeto1Arquiteto)
                            .addComponent(jButtonProjeto2Arquiteto)
                            .addComponent(jButtonCadastrarProjetoArquiteto)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jLabelNomeArquiteto1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(jButtonAceitarProjetos)))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(215, 215, 215)
                    .addComponent(jLabelNomeArquiteto, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(216, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabelNomeArquiteto1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jButtonProjeto1Arquiteto)
                .addGap(55, 55, 55)
                .addComponent(jButtonProjeto2Arquiteto)
                .addGap(48, 48, 48)
                .addComponent(jButtonCadastrarProjetoArquiteto)
                .addGap(36, 36, 36)
                .addComponent(jButtonAceitarProjetos)
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(285, 285, 285)
                    .addComponent(jLabelNomeArquiteto, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(286, Short.MAX_VALUE)))
        );

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bem vindo ");

        jLabelNomeUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNomeUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelNomeUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNomeUsuario.setText("Arquiteto");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PngProjeto/logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jButtonNotificacoesArquiteto)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonPerfilArquiteto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                                .addComponent(jButtonProjetosArquiteto))
                            .addComponent(jLabelNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabelNomeUsuario))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jButtonProjetosArquiteto))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonNotificacoesArquiteto)
                            .addComponent(jButtonPerfilArquiteto))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 878, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNotificacoesArquitetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNotificacoesArquitetoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNotificacoesArquitetoActionPerformed

    private void jButtonPerfilArquitetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPerfilArquitetoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonPerfilArquitetoActionPerformed

    private void jButtonProjeto1ArquitetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProjeto1ArquitetoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonProjeto1ArquitetoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.jButtonProjeto1Arquitetorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalArquiteto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalArquiteto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalArquiteto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalArquiteto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipalArquiteto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceitarProjetos;
    private javax.swing.JButton jButtonCadastrarProjetoArquiteto;
    private javax.swing.JButton jButtonNotificacoesArquiteto;
    private javax.swing.JButton jButtonPerfilArquiteto;
    private javax.swing.JButton jButtonProjeto1Arquiteto;
    private javax.swing.JButton jButtonProjeto2Arquiteto;
    private javax.swing.JButton jButtonProjetosArquiteto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelNomeArquiteto;
    private javax.swing.JLabel jLabelNomeArquiteto1;
    private javax.swing.JLabel jLabelNomeUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
