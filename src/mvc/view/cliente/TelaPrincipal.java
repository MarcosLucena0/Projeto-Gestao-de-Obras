
package mvc.view.cliente;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class TelaPrincipal extends javax.swing.JDialog {

    
    public TelaPrincipal(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public TelaPrincipal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonNotificacoes = new javax.swing.JButton();
        jButtonPerfil = new javax.swing.JButton();
        jButtonProjetos = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButtonProjeto1 = new javax.swing.JButton();
        jButtonProjeto2 = new javax.swing.JButton();
        jButtonCadastrarProjeto = new javax.swing.JButton();
        jButtonSairPerfil = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelNomeUsuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela Principal");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(81, 79, 170));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));
        jPanel1.setRequestFocusEnabled(false);

        jButtonNotificacoes.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNotificacoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PngProjeto/notificação.png"))); // NOI18N
        jButtonNotificacoes.setToolTipText("Notificação");
        jButtonNotificacoes.setBorder(null);
        jButtonNotificacoes.setBorderPainted(false);
        jButtonNotificacoes.setContentAreaFilled(false);
        jButtonNotificacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNotificacoesActionPerformed(evt);
            }
        });

        jButtonPerfil.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PngProjeto/perfil.png"))); // NOI18N
        jButtonPerfil.setToolTipText("Perfil");
        jButtonPerfil.setContentAreaFilled(false);
        jButtonPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPerfilActionPerformed(evt);
            }
        });

        jButtonProjetos.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButtonProjetos.setForeground(new java.awt.Color(255, 255, 255));
        jButtonProjetos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PngProjeto/projeto.png"))); // NOI18N
        jButtonProjetos.setToolTipText("Projetos");
        jButtonProjetos.setBorder(null);
        jButtonProjetos.setBorderPainted(false);
        jButtonProjetos.setContentAreaFilled(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(620, 620));

        jButtonProjeto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PngProjeto/btnProjeto1.png"))); // NOI18N
        jButtonProjeto1.setBorder(null);
        jButtonProjeto1.setBorderPainted(false);
        jButtonProjeto1.setContentAreaFilled(false);
        jButtonProjeto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProjeto1ActionPerformed(evt);
            }
        });

        jButtonProjeto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PngProjeto/btnProjeto2.png"))); // NOI18N
        jButtonProjeto2.setBorder(null);
        jButtonProjeto2.setBorderPainted(false);
        jButtonProjeto2.setContentAreaFilled(false);

        jButtonCadastrarProjeto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PngProjeto/criarProjeto_1.png"))); // NOI18N
        jButtonCadastrarProjeto.setBorder(null);
        jButtonCadastrarProjeto.setBorderPainted(false);
        jButtonCadastrarProjeto.setContentAreaFilled(false);

        jButtonSairPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PngProjeto/sair.png"))); // NOI18N
        jButtonSairPerfil.setBorder(null);
        jButtonSairPerfil.setBorderPainted(false);
        jButtonSairPerfil.setContentAreaFilled(false);
        jButtonSairPerfil.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/PngProjeto/sairHolover.png"))); // NOI18N
        jButtonSairPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairPerfilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSairPerfil))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonProjeto1)
                                    .addComponent(jButtonProjeto2)
                                    .addComponent(jButtonCadastrarProjeto)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(jLabel3)))
                        .addGap(0, 83, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonSairPerfil)
                .addGap(69, 69, 69)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonProjeto1)
                .addGap(53, 53, 53)
                .addComponent(jButtonProjeto2)
                .addGap(50, 50, 50)
                .addComponent(jButtonCadastrarProjeto)
                .addContainerGap(158, Short.MAX_VALUE))
        );

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bem vindo ");

        jLabelNomeUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNomeUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelNomeUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNomeUsuario.setText(" Cliente");

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
                                .addComponent(jButtonNotificacoes)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButtonPerfil)
                                .addGap(32, 32, 32)
                                .addComponent(jButtonProjetos))
                            .addComponent(jLabelNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE))
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
                        .addComponent(jButtonProjetos))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonNotificacoes)
                            .addComponent(jButtonPerfil))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jButtonNotificacoes.getAccessibleContext().setAccessibleName("notificação");
        jPanel2.getAccessibleContext().setAccessibleName("perfil");
        jPanel2.getAccessibleContext().setAccessibleDescription("perfil ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 904, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonProjeto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProjeto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonProjeto1ActionPerformed

    private void jButtonNotificacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNotificacoesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNotificacoesActionPerformed

    private void jButtonPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonPerfilActionPerformed

    private void jButtonSairPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSairPerfilActionPerformed

    public JLabel getjLabelNomeUsuario() {
        return jLabelNomeUsuario;
    }
    
    public JButton getjButtonCadastrarProjeto() {
        return jButtonCadastrarProjeto;
    }

    public JButton getjButtonNotificacoes() {
        return jButtonNotificacoes;
    }

    public JButton getjButtonPerfil() {
        return jButtonPerfil;
    }

    public JButton getjButtonProjeto1() {
        return jButtonProjeto1;
    }

    public JButton getjButtonProjeto2() {
        return jButtonProjeto2;
    }

    public JButton getjButtonProjetos() {
        return jButtonProjetos;
    }


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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            TelaPrincipal dialog = new TelaPrincipal(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrarProjeto;
    private javax.swing.JButton jButtonNotificacoes;
    private javax.swing.JButton jButtonPerfil;
    private javax.swing.JButton jButtonProjeto1;
    private javax.swing.JButton jButtonProjeto2;
    private javax.swing.JButton jButtonProjetos;
    private javax.swing.JButton jButtonSairPerfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelNomeUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

}
