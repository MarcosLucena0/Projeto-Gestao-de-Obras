
package mvc.controller.cliente;

import mvc.controller.cliente.ControleEditarCliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import mvc.view.cliente.TelaPerfilCliente;
import projetogestaodeobras.Sessao;

public class ControlePerfilCliente implements ActionListener{
    
    private final TelaPerfilCliente telaPerfilCliente = new TelaPerfilCliente();
    

    public ControlePerfilCliente() {
        
        telaPerfilCliente.getjButtonEditarPerfil().addActionListener(this);
        telaPerfilCliente.getjButtonSairPerfil().addActionListener(this);
        
        telaPerfilCliente.getjTextFieldNomePerfil().setText(Sessao.getCadastroCliente().getNomeUsuario());
        telaPerfilCliente.getjTextFieldemailPerfil().setText(Sessao.getCadastroCliente().getEmail());
        telaPerfilCliente.getjTextFieldEnderecoPerfil().setText(Sessao.getCadastroCliente().getEndereco());
        telaPerfilCliente.getjTextFieldTelefonePerfil().setText(Sessao.getCadastroCliente().getTelefone());
        telaPerfilCliente.getjTextFieldCPFPerfil().setText(Sessao.getCadastroCliente().getCpf());
        
        this.telaPerfilCliente.setLocationRelativeTo(null);
        telaPerfilCliente.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(telaPerfilCliente.getjButtonEditarPerfil())){
            telaPerfilCliente.dispose();
            ControleEditarCliente controleEditarCliente = new ControleEditarCliente();
        }
        else if(e.getSource().equals(telaPerfilCliente.getjButtonSairPerfil())){
            telaPerfilCliente.dispose();
            ControlePrincipal controlePrincipal = new ControlePrincipal(); 
        }
        
        
    }
    
}
