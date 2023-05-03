/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mvc.view;

import javax.swing.JButton;
import javax.swing.JPanel;


public class TelaEntidade extends javax.swing.JFrame {

    /** Creates new form TelaEntidade */
    public TelaEntidade() {
        initComponents();
    }

    public JButton getjButtonVoltarEntidade() {
        return jButtonVoltarEntidade;
    }
    
    public JButton getjButtonArquiteto() {
        return jButtonArquiteto;
    }

    public JButton getjButtonCliente() {
        return jButtonCliente;
    }

    public JButton getjButtonEngenheiro() {
        return jButtonEngenheiro;
    }

    public JButton getjButtonPrestServico() {
        return jButtonPrestServico;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButtonVoltarEntidade = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButtonCliente = new javax.swing.JButton();
        jButtonArquiteto = new javax.swing.JButton();
        jButtonEngenheiro = new javax.swing.JButton();
        jButtonPrestServico = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(81, 79, 170));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 620));
        jPanel1.setRequestFocusEnabled(false);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PngProjeto/logo.png"))); // NOI18N

        jButtonVoltarEntidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PngProjeto/back.png"))); // NOI18N
        jButtonVoltarEntidade.setContentAreaFilled(false);

        jPanel2.setPreferredSize(new java.awt.Dimension(620, 620));

        jButtonCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PngProjeto/cliente.png"))); // NOI18N
        jButtonCliente.setBorder(null);
        jButtonCliente.setBorderPainted(false);
        jButtonCliente.setContentAreaFilled(false);
        jButtonCliente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/PngProjeto/clienteHolover.png"))); // NOI18N

        jButtonArquiteto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PngProjeto/arquitetobtn.png"))); // NOI18N
        jButtonArquiteto.setBorder(null);
        jButtonArquiteto.setBorderPainted(false);
        jButtonArquiteto.setContentAreaFilled(false);
        jButtonArquiteto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/PngProjeto/arquitetobtnHolover.png"))); // NOI18N

        jButtonEngenheiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PngProjeto/Engenheiro.png"))); // NOI18N
        jButtonEngenheiro.setBorder(null);
        jButtonEngenheiro.setBorderPainted(false);
        jButtonEngenheiro.setContentAreaFilled(false);
        jButtonEngenheiro.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/PngProjeto/EngenheiroHolover.png"))); // NOI18N

        jButtonPrestServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PngProjeto/Prestador.png"))); // NOI18N
        jButtonPrestServico.setBorder(null);
        jButtonPrestServico.setBorderPainted(false);
        jButtonPrestServico.setContentAreaFilled(false);
        jButtonPrestServico.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/PngProjeto/PrestadorHolover_1.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PngProjeto/Quem é você_.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButtonArquiteto, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                        .addComponent(jButtonEngenheiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonPrestServico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(146, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(244, 244, 244))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(79, 79, 79)
                .addComponent(jButtonCliente)
                .addGap(26, 26, 26)
                .addComponent(jButtonArquiteto)
                .addGap(18, 18, 18)
                .addComponent(jButtonEngenheiro)
                .addGap(18, 18, 18)
                .addComponent(jButtonPrestServico)
                .addContainerGap(189, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonVoltarEntidade)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonVoltarEntidade)
                .addGap(105, 105, 105)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, 609, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TelaEntidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEntidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEntidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEntidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEntidade().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonArquiteto;
    private javax.swing.JButton jButtonCliente;
    private javax.swing.JButton jButtonEngenheiro;
    private javax.swing.JButton jButtonPrestServico;
    private javax.swing.JButton jButtonVoltarEntidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

}
