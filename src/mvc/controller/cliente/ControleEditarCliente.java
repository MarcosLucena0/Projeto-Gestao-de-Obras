
package mvc.controller.cliente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import mvc.model.cliente.CadastroCliente;
import mvc.model.cliente.CadastroDAOCliente;
import mvc.model.LoginService;
import mvc.view.cliente.TelaEditarCliente;
import projetogestaodeobras.Sessao;


public class ControleEditarCliente implements ActionListener{
    
    private final TelaEditarCliente telaEditarCliente = new TelaEditarCliente();
    private final CadastroDAOCliente cadastroDAO = new CadastroDAOCliente();
     private final LoginService loginService = new LoginService();
     private CadastroCliente cadastroCliente;

    public ControleEditarCliente() {
        
        telaEditarCliente.getjButtonSalvarEditar().addActionListener(this);
        telaEditarCliente.getjButtonVoltarEditar().addActionListener(this);
        
        telaEditarCliente.getjTextFieldNomeEditar().setText(Sessao.getCadastroCliente().getNomeUsuario());
        telaEditarCliente.getjTextFieldemailEditar().setText(Sessao.getCadastroCliente().getEmail());
        telaEditarCliente.getjTextFieldEnderecoEditar().setText(Sessao.getCadastroCliente().getEndereco());
        telaEditarCliente.getjTextFieldTelefoneEditar().setText(Sessao.getCadastroCliente().getTelefone());
        telaEditarCliente.getjTextFieldCPFEditar().setText(Sessao.getCadastroCliente().getCpf());
        
        this.telaEditarCliente.setLocationRelativeTo(null);
        
        telaEditarCliente.setVisible(true);
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(telaEditarCliente.getjButtonSalvarEditar())){
            
             //loginService.editarCliente(telaEditarCliente.getjTextFieldNomeEditar().getText(),telaEditarCliente.getjTextFieldemailEditar().getText(),telaEditarCliente.getjTextFieldEnderecoEditar().getText()
             //,telaEditarCliente.getjTextFieldTelefoneEditar().getText(),telaEditarCliente.getjTextFieldCPFEditar().getText());
             //cadastroCliente = new CadastroCliente();
             editarCliente(telaEditarCliente.getjTextFieldNomeEditar().getText(),telaEditarCliente.getjTextFieldemailEditar().getText(),
             telaEditarCliente.getjTextFieldTelefoneEditar().getText(),telaEditarCliente.getjTextFieldEnderecoEditar().getText(),telaEditarCliente.getjTextFieldCPFEditar().getText());
             
             JOptionPane.showMessageDialog(telaEditarCliente, "Perfil Editado", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
             
             telaEditarCliente.dispose();

           
            ControlePerfilCliente controlePerfilCliente = new ControlePerfilCliente();
        }
        else if(e.getSource().equals(telaEditarCliente.getjButtonVoltarEditar())){
            telaEditarCliente.dispose();
            ControlePerfilCliente controlePerfilCliente = new ControlePerfilCliente();
        }
    }
    
    public void editarCliente(String nome, String email,String telefone, String endereco,String cpf) {
        CadastroCliente editar = new CadastroCliente();
        editar.setNomeUsuario(nome);
        editar.setEmail(email);
        editar.setTelefone(telefone);
        editar.setEndereco(endereco);
        editar.setCpf(cpf);
        editar.setId(Sessao.getCadastroCliente().getId());
        cadastroDAO.editarCliente(editar);
        
        Sessao.setCadastroCliente(editar);
    }

}
