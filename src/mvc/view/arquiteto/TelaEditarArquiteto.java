
package mvc.view.arquiteto;

import javax.swing.JButton;
import javax.swing.JTextField;


public class TelaEditarArquiteto extends javax.swing.JFrame {

    
    public TelaEditarArquiteto() {
        initComponents();
    }

    public JButton getjButtonSalvarEditarArquiteto() {
        return jButtonSalvarEditarArquiteto;
    }

    public void setjButtonSalvarEditarArquiteto(JButton jButtonSalvarEditarArquiteto) {
        this.jButtonSalvarEditarArquiteto = jButtonSalvarEditarArquiteto;
    }

    public JButton getjButtonVoltarEditarArquiteto() {
        return jButtonVoltarEditarArquiteto;
    }

    public void setjButtonVoltarEditarArquiteto(JButton jButtonVoltarEditarArquiteto) {
        this.jButtonVoltarEditarArquiteto = jButtonVoltarEditarArquiteto;
    }

    public JTextField getjTextFieldCPFArquitetoEditar() {
        return jTextFieldCPFArquitetoEditar;
    }

    public void setjTextFieldCPFArquitetoEditar(JTextField jTextFieldCPFArquitetoEditar) {
        this.jTextFieldCPFArquitetoEditar = jTextFieldCPFArquitetoEditar;
    }

    public JTextField getjTextFieldEmailArquitetoEditar() {
        return jTextFieldEmailArquitetoEditar;
    }

    public void setjTextFieldEmailArquitetoEditar(JTextField jTextFieldEmailArquitetoEditar) {
        this.jTextFieldEmailArquitetoEditar = jTextFieldEmailArquitetoEditar;
    }

    public JTextField getjTextFieldNomeArquitetoEditar() {
        return jTextFieldNomeArquitetoEditar;
    }

    public void setjTextFieldNomeArquitetoEditar(JTextField jTextFieldNomeArquitetoEditar) {
        this.jTextFieldNomeArquitetoEditar = jTextFieldNomeArquitetoEditar;
    }

    public JTextField getjTextFieldNumeroDoCauEditar() {
        return jTextFieldNumeroDoCauEditar;
    }

    public void setjTextFieldNumeroDoCauEditar(JTextField jTextFieldNumeroDoCauEditar) {
        this.jTextFieldNumeroDoCauEditar = jTextFieldNumeroDoCauEditar;
    }

    public JTextField getjTextFieldSenhaArquitetoEditar() {
        return jTextFieldSenhaArquitetoEditar;
    }

    public void setjTextFieldSenhaArquitetoEditar(JTextField jTextFieldSenhaArquitetoEditar) {
        this.jTextFieldSenhaArquitetoEditar = jTextFieldSenhaArquitetoEditar;
    }

    public JTextField getjTextFieldTelefoneArquitetoEditar() {
        return jTextFieldTelefoneArquitetoEditar;
    }

    public void setjTextFieldTelefoneArquitetoEditar(JTextField jTextFieldTelefoneArquitetoEditar) {
        this.jTextFieldTelefoneArquitetoEditar = jTextFieldTelefoneArquitetoEditar;
    }
    
    

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButtonVoltarEditarArquiteto = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNomeArquitetoEditar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldEmailArquitetoEditar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldTelefoneArquitetoEditar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldCPFArquitetoEditar = new javax.swing.JTextField();
        jButtonSalvarEditarArquiteto = new javax.swing.JButton();
        jTextFieldSenhaArquitetoEditar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldNumeroDoCauEditar = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(81, 79, 170));
        jPanel1.setRequestFocusEnabled(false);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PngProjeto/logo.png"))); // NOI18N

        jButtonVoltarEditarArquiteto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PngProjeto/back.png"))); // NOI18N
        jButtonVoltarEditarArquiteto.setContentAreaFilled(false);
        jButtonVoltarEditarArquiteto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/PngProjeto/bakh.png"))); // NOI18N
        jButtonVoltarEditarArquiteto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarEditarArquitetoActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(600, 600));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(81, 79, 170));
        jLabel2.setText("Editar Perfil");

        jLabel3.setText("Nome");

        jLabel4.setText("email");

        jTextFieldEmailArquitetoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailArquitetoEditarActionPerformed(evt);
            }
        });

        jLabel7.setText("telefone");

        jLabel8.setText("cpf");

        jButtonSalvarEditarArquiteto.setText("Salvar");
        jButtonSalvarEditarArquiteto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarEditarArquitetoActionPerformed(evt);
            }
        });

        jLabel6.setText("Senha");

        jTextFieldNumeroDoCauEditar.setEditable(false);

        jLabel9.setText("Número do CAU");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7)
                                    .addComponent(jTextFieldTelefoneArquitetoEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                    .addComponent(jLabel8)
                                    .addComponent(jTextFieldCPFArquitetoEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                    .addComponent(jLabel6)
                                    .addComponent(jTextFieldSenhaArquitetoEditar))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldEmailArquitetoEditar, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldNomeArquitetoEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextFieldNumeroDoCauEditar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(jButtonSalvarEditarArquiteto))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jLabel2)))
                .addContainerGap(298, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNomeArquitetoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldEmailArquitetoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCPFArquitetoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldSenhaArquitetoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNumeroDoCauEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldTelefoneArquitetoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButtonSalvarEditarArquiteto)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonVoltarEditarArquiteto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 95, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(87, 87, 87)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButtonVoltarEditarArquiteto)
                .addGap(148, 148, 148)
                .addComponent(jLabel5)
                .addContainerGap(70, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarEditarArquitetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarEditarArquitetoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonVoltarEditarArquitetoActionPerformed

    private void jTextFieldEmailArquitetoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailArquitetoEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailArquitetoEditarActionPerformed

    private void jButtonSalvarEditarArquitetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarEditarArquitetoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSalvarEditarArquitetoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaEditarArquiteto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEditarArquiteto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEditarArquiteto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEditarArquiteto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEditarArquiteto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSalvarEditarArquiteto;
    private javax.swing.JButton jButtonVoltarEditarArquiteto;
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
    private javax.swing.JTextField jTextFieldCPFArquitetoEditar;
    private javax.swing.JTextField jTextFieldEmailArquitetoEditar;
    private javax.swing.JTextField jTextFieldNomeArquitetoEditar;
    private javax.swing.JTextField jTextFieldNumeroDoCauEditar;
    private javax.swing.JTextField jTextFieldSenhaArquitetoEditar;
    private javax.swing.JTextField jTextFieldTelefoneArquitetoEditar;
    // End of variables declaration//GEN-END:variables
}
