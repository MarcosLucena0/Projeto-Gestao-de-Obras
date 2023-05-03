
package mvc.controller.arquiteto;

import mvc.controller.arquiteto.ControlePrincipalArquiteto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import mvc.view.arquiteto.TelaPerfilArquiteto;
import projetogestaodeobras.Sessao;


public class ControlePerfilArquiteto implements ActionListener{
    
private final TelaPerfilArquiteto telaPerfilArquiteto = new TelaPerfilArquiteto();

    public ControlePerfilArquiteto() {
        
        telaPerfilArquiteto.getjButtonEditarPerfilArquiteto().addActionListener(this);
        telaPerfilArquiteto.getjButtonSairPerfilArquiteto().addActionListener(this);
        
        telaPerfilArquiteto.getjTextFieldNomePerfil().setText(Sessao.getCadastroArquiteto().getNomeArquiteto());
        telaPerfilArquiteto.getjTextFieldemailPerfil().setText(Sessao.getCadastroArquiteto().getEmail());
        telaPerfilArquiteto.getjTextFieldCPFPerfil().setText(Sessao.getCadastroArquiteto().getCpf());
        telaPerfilArquiteto.getjTextFieldTelefonePerfil().setText(Sessao.getCadastroArquiteto().getTelefone());
        telaPerfilArquiteto.getjTextFieldEnderecoArq().setText(Sessao.getCadastroArquiteto().getEndereco());
        telaPerfilArquiteto.getjTextFieldNumeroDoCau().setText(Sessao.getCadastroArquiteto().getNumeroCau());
        
        
        this.telaPerfilArquiteto.setLocationRelativeTo(null);
        telaPerfilArquiteto.setVisible(true);

    }
        
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource().equals(telaPerfilArquiteto.getjButtonEditarPerfilArquiteto())){
            telaPerfilArquiteto.dispose();
            ControleEditarArquiteto controleEditarArquiteto = new ControleEditarArquiteto();
        }
        else if(e.getSource().equals(telaPerfilArquiteto.getjButtonSairPerfilArquiteto())){
            telaPerfilArquiteto.dispose();
            ControlePrincipalArquiteto controlePrincipalArquiteto = new ControlePrincipalArquiteto(); 
        }
        
    }
    
}
