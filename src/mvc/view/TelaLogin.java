
package mvc.view;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TelaLogin extends javax.swing.JDialog {

    public TelaLogin(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public JButton getjButtonEntrar() {
        return jButtonEntrar;
    }

    public JButton getjButtonEsqueceuSenha() {
        return jButtonEsqueceuSenha;
    }

    public JButton getjButtonLimpar() {
        return jButtonLimpar;
    }

   

    public JPasswordField getjPasswordFieldSenha2() {
        return jPasswordFieldSenha2;
    }

    public JTextField getjTextFieldNomeUsuario() {
        return jTextFieldNomeUsuario;
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButtonEsqueceuSenha = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNomeUsuario = new javax.swing.JTextField();
        jButtonEntrar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jPasswordFieldSenha2 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("TelaLogin");
        setPreferredSize(new java.awt.Dimension(900, 600));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(81, 79, 170));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 620));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PngProjeto/logo.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pngalt/Bem-vindo De Volta!.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(620, 620));
        jPanel2.setRequestFocusEnabled(false);
        jPanel2.setVerifyInputWhenFocusTarget(false);

        jButtonEsqueceuSenha.setBackground(new java.awt.Color(153, 0, 153));
        jButtonEsqueceuSenha.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButtonEsqueceuSenha.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEsqueceuSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PngProjeto/Esqueci a senha.png"))); // NOI18N
        jButtonEsqueceuSenha.setBorderPainted(false);
        jButtonEsqueceuSenha.setContentAreaFilled(false);
        jButtonEsqueceuSenha.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pngalt/EsqueciHolover.png"))); // NOI18N
        jButtonEsqueceuSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEsqueceuSenhaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(81, 79, 170));
        jLabel1.setText("Email:");

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(81, 79, 170));
        jLabel2.setText("Senha:");

        jTextFieldNomeUsuario.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldNomeUsuario.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldNomeUsuario.setText("Digite aqui seu email...");
        jTextFieldNomeUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldNomeUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldNomeUsuarioFocusLost(evt);
            }
        });
        jTextFieldNomeUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldNomeUsuarioKeyPressed(evt);
            }
        });

        jButtonEntrar.setBackground(new java.awt.Color(153, 0, 153));
        jButtonEntrar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButtonEntrar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PngProjeto/entrar1.png"))); // NOI18N
        jButtonEntrar.setBorderPainted(false);
        jButtonEntrar.setContentAreaFilled(false);
        jButtonEntrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pngalt/entrar.png"))); // NOI18N

        jButtonLimpar.setBackground(new java.awt.Color(153, 0, 153));
        jButtonLimpar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButtonLimpar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PngProjeto/Property 1=Default.png"))); // NOI18N
        jButtonLimpar.setBorderPainted(false);
        jButtonLimpar.setContentAreaFilled(false);
        jButtonLimpar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pngalt/limparHolover.png"))); // NOI18N
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jPasswordFieldSenha2.setBackground(new java.awt.Color(204, 204, 204));
        jPasswordFieldSenha2.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordFieldSenha2.setText("Digite aqui sua senha...");
        jPasswordFieldSenha2.setEchoChar((char) 0);
        jPasswordFieldSenha2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordFieldSenha2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordFieldSenha2FocusLost(evt);
            }
        });
        jPasswordFieldSenha2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldSenha2ActionPerformed(evt);
            }
        });
        jPasswordFieldSenha2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordFieldSenha2KeyPressed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pngalt/user.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pngalt/senhaIcon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(130, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jButtonEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonEsqueceuSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPasswordFieldSenha2)
                            .addComponent(jTextFieldNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(104, 104, 104))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPasswordFieldSenha2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEsqueceuSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonEntrar)
                .addGap(131, 131, 131))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel6)
                .addGap(173, 173, 173)
                .addComponent(jLabel3)
                .addContainerGap(206, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordFieldSenha2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldSenha2FocusGained
        if(jPasswordFieldSenha2.getText().equals("Digite aqui sua senha...")){
            jPasswordFieldSenha2.setCaretPosition(0);
            jPasswordFieldSenha2.setCaretColor(Color.BLACK);
        } else{
            jPasswordFieldSenha2.setSelectionStart(0);
        }// TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldSenha2FocusGained

    private void jPasswordFieldSenha2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldSenha2FocusLost
        if(jPasswordFieldSenha2.getText().equals("")){
            jPasswordFieldSenha2.setEchoChar((char) 0);
            jPasswordFieldSenha2.setText("Digite aqui sua senha...");
            jPasswordFieldSenha2.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_jPasswordFieldSenha2FocusLost

    private void jPasswordFieldSenha2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldSenha2KeyPressed
        if(jPasswordFieldSenha2.getText().equals("Digite aqui sua senha...")){
            jPasswordFieldSenha2.setText("");
            jPasswordFieldSenha2.setForeground(Color.BLACK);
            jPasswordFieldSenha2.setEchoChar('\u25cf');
        }
    }//GEN-LAST:event_jPasswordFieldSenha2KeyPressed

    private void jTextFieldNomeUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldNomeUsuarioFocusGained
        if(jTextFieldNomeUsuario.getText().equals("Digite aqui seu email...")){
            jTextFieldNomeUsuario.setCaretPosition(0);
            jTextFieldNomeUsuario.setCaretColor(Color.BLACK);
        } else{
            jTextFieldNomeUsuario.setSelectionStart(0);
        }
    }//GEN-LAST:event_jTextFieldNomeUsuarioFocusGained

    private void jTextFieldNomeUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldNomeUsuarioFocusLost
        if(jTextFieldNomeUsuario.getText().equals("")){
            jTextFieldNomeUsuario.setText("Digite aqui seu email...");
            jTextFieldNomeUsuario.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextFieldNomeUsuarioFocusLost

    private void jTextFieldNomeUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomeUsuarioKeyPressed
        if(jTextFieldNomeUsuario.getText().equals("Digite aqui seu email...")){
            jTextFieldNomeUsuario.setText("");
            jTextFieldNomeUsuario.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTextFieldNomeUsuarioKeyPressed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        jTextFieldNomeUsuario.setText("Digite aqui seu email...");
        jTextFieldNomeUsuario.setForeground(new Color(153, 153, 153));
        jPasswordFieldSenha2.setEchoChar((char) 0);
        jPasswordFieldSenha2.setText("Digite aqui sua senha...");
        jPasswordFieldSenha2.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonEsqueceuSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEsqueceuSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEsqueceuSenhaActionPerformed

    private void jPasswordFieldSenha2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldSenha2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldSenha2ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaLogin dialog = new TelaLogin(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JButton jButtonEsqueceuSenha;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordFieldSenha2;
    private javax.swing.JTextField jTextFieldNomeUsuario;
    // End of variables declaration//GEN-END:variables

    public void openAlert(String titulo, String mensagem, int tipo) {
        JOptionPane.showMessageDialog(this, mensagem, titulo, tipo); 
    }
    
    public String openDialog(){
        return JOptionPane.showInputDialog(this, "Informe seu Email:", 
                                            "Solicitação de Código de Recuperação",0);        
    }
    
    //metodo que faz os testos que estao nos campos limpar
    public void cleanFields(){
        jTextFieldNomeUsuario.setText("");
        jPasswordFieldSenha2.setText("");
    }
}
