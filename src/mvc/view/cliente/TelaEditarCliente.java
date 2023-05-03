
package mvc.view.cliente;

import javax.swing.JButton;
import javax.swing.JTextField;


public class TelaEditarCliente extends javax.swing.JFrame {

    public TelaEditarCliente() {
        initComponents();
    }

    public JButton getjButtonSalvarEditar() {
        return jButtonSalvarEditar;
    }

    public void setjButtonSalvarEditar(JButton jButtonSalvarEditar) {
        this.jButtonSalvarEditar = jButtonSalvarEditar;
    }

    public JButton getjButtonVoltarEditar() {
        return jButtonVoltarEditar;
    }

    public void setjButtonVoltarEditar(JButton jButtonVoltarEditar) {
        this.jButtonVoltarEditar = jButtonVoltarEditar;
    }

    public JTextField getjTextFieldCPFEditar() {
        return jTextFieldCPFEditar;
    }

    public void setjTextFieldCPFEditar(JTextField jTextFieldCPFEditar) {
        this.jTextFieldCPFEditar = jTextFieldCPFEditar;
    }

    public JTextField getjTextFieldEnderecoEditar() {
        return jTextFieldEnderecoEditar;
    }

    public void setjTextFieldEnderecoEditar(JTextField jTextFieldEnderecoEditar) {
        this.jTextFieldEnderecoEditar = jTextFieldEnderecoEditar;
    }

    public JTextField getjTextFieldNomeEditar() {
        return jTextFieldNomeEditar;
    }

    public void setjTextFieldNomeEditar(JTextField jTextFieldNomeEditar) {
        this.jTextFieldNomeEditar = jTextFieldNomeEditar;
    }

    public JTextField getjTextFieldTelefoneEditar() {
        return jTextFieldTelefoneEditar;
    }

    public void setjTextFieldTelefoneEditar(JTextField jTextFieldTelefoneEditar) {
        this.jTextFieldTelefoneEditar = jTextFieldTelefoneEditar;
    }

    public JTextField getjTextFieldemailEditar() {
        return jTextFieldemailEditar;
    }

    public void setjTextFieldemailEditar(JTextField jTextFieldemailEditar) {
        this.jTextFieldemailEditar = jTextFieldemailEditar;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButtonVoltarEditar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNomeEditar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldemailEditar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldEnderecoEditar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldTelefoneEditar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldCPFEditar = new javax.swing.JTextField();
        jButtonSalvarEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(81, 79, 170));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 620));
        jPanel1.setRequestFocusEnabled(false);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PngProjeto/logo.png"))); // NOI18N

        jButtonVoltarEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PngProjeto/back.png"))); // NOI18N
        jButtonVoltarEditar.setContentAreaFilled(false);
        jButtonVoltarEditar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/PngProjeto/bakh.png"))); // NOI18N
        jButtonVoltarEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarEditarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(600, 600));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(81, 79, 170));
        jLabel2.setText("Editar Perfil");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(81, 79, 170));
        jLabel3.setText("Nome");

        jTextFieldNomeEditar.setBackground(new java.awt.Color(153, 153, 153));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(81, 79, 170));
        jLabel4.setText("Email");

        jTextFieldemailEditar.setBackground(new java.awt.Color(153, 153, 153));
        jTextFieldemailEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldemailEditarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(81, 79, 170));
        jLabel6.setText("Endereço");

        jTextFieldEnderecoEditar.setBackground(new java.awt.Color(153, 153, 153));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(81, 79, 170));
        jLabel7.setText("Telefone");

        jTextFieldTelefoneEditar.setBackground(new java.awt.Color(153, 153, 153));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(81, 79, 170));
        jLabel8.setText("Cpf");

        jTextFieldCPFEditar.setBackground(new java.awt.Color(153, 153, 153));

        jButtonSalvarEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pngalt/salvar.png"))); // NOI18N
        jButtonSalvarEditar.setBorder(null);
        jButtonSalvarEditar.setBorderPainted(false);
        jButtonSalvarEditar.setContentAreaFilled(false);
        jButtonSalvarEditar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pngalt/salvarHolover.png"))); // NOI18N
        jButtonSalvarEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(146, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addGap(102, 102, 102))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8)
                        .addComponent(jTextFieldNomeEditar)
                        .addComponent(jTextFieldemailEditar)
                        .addComponent(jTextFieldEnderecoEditar)
                        .addComponent(jTextFieldTelefoneEditar)
                        .addComponent(jTextFieldCPFEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jButtonSalvarEditar)))
                .addGap(140, 140, 140))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNomeEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldemailEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldEnderecoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldTelefoneEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCPFEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonSalvarEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonVoltarEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 69, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(87, 87, 87)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButtonVoltarEditar)
                .addGap(148, 148, 148)
                .addComponent(jLabel5)
                .addContainerGap(230, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonVoltarEditarActionPerformed

    private void jTextFieldemailEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldemailEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldemailEditarActionPerformed

    private void jButtonSalvarEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSalvarEditarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaEditarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEditarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEditarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEditarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEditarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSalvarEditar;
    private javax.swing.JButton jButtonVoltarEditar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldCPFEditar;
    private javax.swing.JTextField jTextFieldEnderecoEditar;
    private javax.swing.JTextField jTextFieldNomeEditar;
    private javax.swing.JTextField jTextFieldTelefoneEditar;
    private javax.swing.JTextField jTextFieldemailEditar;
    // End of variables declaration//GEN-END:variables
}
