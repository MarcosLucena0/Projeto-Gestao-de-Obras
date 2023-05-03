/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.view.prestadordeservico;

import javax.swing.JButton;
import javax.swing.JCheckBox;

/**
 *
 * @author gil
 */
public class TelaCadastroPrestadorDeServicos1 extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroPrestadorDeServicos1
     */
    public TelaCadastroPrestadorDeServicos1() {
        initComponents();
    }

    public JButton getjButtonVoltarEntidade() {
        return jButtonVoltarEntidade;
    }
    
    public JButton getJButtonAvancar() {
        return jButtonAvancar;
    }

    public JCheckBox getjCheckBoxPedreiro() {
        return jCheckBoxPedreiro;
    }
    
    public JCheckBox getjCheckBoxServente() {
        return jCheckBoxServente;
    }
    
    public JCheckBox getjCheckBoxPintor() {
        return jCheckBoxPintor;
    }
    
    public JCheckBox getjCheckBoxEletricista() {
        return jCheckBoxEletricista;
    }
    
    public JCheckBox getjCheckBoxGesseiro() {
        return jCheckBoxGesseiro;
    }
    
    public JCheckBox getjCheckBoxEncanador() {
        return jCheckBoxEncanador;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButtonVoltarEntidade = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonAvancar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jCheckBoxPedreiro = new javax.swing.JCheckBox();
        jCheckBoxServente = new javax.swing.JCheckBox();
        jCheckBoxPintor = new javax.swing.JCheckBox();
        jCheckBoxEletricista = new javax.swing.JCheckBox();
        jCheckBoxGesseiro = new javax.swing.JCheckBox();
        jCheckBoxEncanador = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(81, 79, 170));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));
        jPanel1.setRequestFocusEnabled(false);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PngProjeto/logo.png"))); // NOI18N

        jButtonVoltarEntidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PngProjeto/back.png"))); // NOI18N
        jButtonVoltarEntidade.setContentAreaFilled(false);
        jButtonVoltarEntidade.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/PngProjeto/bakh.png"))); // NOI18N
        jButtonVoltarEntidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarEntidadeActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(620, 620));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(81, 79, 170));
        jLabel1.setText("Crie sua conta");

        jButtonAvancar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pngalt/avançar.png"))); // NOI18N
        jButtonAvancar.setBorder(null);
        jButtonAvancar.setBorderPainted(false);
        jButtonAvancar.setContentAreaFilled(false);
        jButtonAvancar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pngalt/avançarholover.png"))); // NOI18N
        jButtonAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAvancarActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jCheckBoxPedreiro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBoxPedreiro.setForeground(new java.awt.Color(81, 79, 170));
        jCheckBoxPedreiro.setText("Pedreiro");
        jCheckBoxPedreiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxPedreiroActionPerformed(evt);
            }
        });

        jCheckBoxServente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBoxServente.setForeground(new java.awt.Color(81, 79, 170));
        jCheckBoxServente.setText("Servente de pedreiro");

        jCheckBoxPintor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBoxPintor.setForeground(new java.awt.Color(81, 79, 170));
        jCheckBoxPintor.setText("Pintor");

        jCheckBoxEletricista.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBoxEletricista.setForeground(new java.awt.Color(81, 79, 170));
        jCheckBoxEletricista.setText("Eletricista");

        jCheckBoxGesseiro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBoxGesseiro.setForeground(new java.awt.Color(81, 79, 170));
        jCheckBoxGesseiro.setText("Gesseiro");

        jCheckBoxEncanador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBoxEncanador.setForeground(new java.awt.Color(81, 79, 170));
        jCheckBoxEncanador.setText("Encanador");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(81, 79, 170));
        jLabel2.setText("Qual dessas funções você atua?");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBoxPedreiro)
                            .addComponent(jCheckBoxServente)
                            .addComponent(jCheckBoxPintor)
                            .addComponent(jCheckBoxEletricista)
                            .addComponent(jCheckBoxGesseiro)
                            .addComponent(jCheckBoxEncanador)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel2)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(21, 21, 21)
                .addComponent(jCheckBoxPedreiro)
                .addGap(18, 18, 18)
                .addComponent(jCheckBoxServente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jCheckBoxPintor)
                .addGap(18, 18, 18)
                .addComponent(jCheckBoxEletricista)
                .addGap(18, 18, 18)
                .addComponent(jCheckBoxGesseiro)
                .addGap(18, 18, 18)
                .addComponent(jCheckBoxEncanador)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(81, 79, 170));
        jLabel3.setText("Pode marcar mais de uma opção.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonAvancar)
                .addGap(206, 206, 206))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(249, 249, 249))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(55, 55, 55)
                .addComponent(jButtonAvancar)
                .addGap(100, 100, 100))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonVoltarEntidade)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButtonVoltarEntidade)
                .addGap(145, 145, 145)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarEntidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarEntidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonVoltarEntidadeActionPerformed

    private void jButtonAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAvancarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAvancarActionPerformed

    private void jCheckBoxPedreiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxPedreiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxPedreiroActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroPrestadorDeServicos1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroPrestadorDeServicos1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroPrestadorDeServicos1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroPrestadorDeServicos1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroPrestadorDeServicos1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAvancar;
    private javax.swing.JButton jButtonVoltarEntidade;
    private javax.swing.JCheckBox jCheckBoxEletricista;
    private javax.swing.JCheckBox jCheckBoxEncanador;
    private javax.swing.JCheckBox jCheckBoxGesseiro;
    private javax.swing.JCheckBox jCheckBoxPedreiro;
    private javax.swing.JCheckBox jCheckBoxPintor;
    private javax.swing.JCheckBox jCheckBoxServente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
