
package mvc.controller.arquiteto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import mvc.model.arquiteto.CadastroArquiteto;
import mvc.model.arquiteto.CadastroDAOArquiteto;
import mvc.model.LoginService;
import mvc.view.arquiteto.TelaEditarArquiteto;
import projetogestaodeobras.Sessao;


public class ControleEditarArquiteto implements ActionListener{
    
    private final TelaEditarArquiteto telaEditarArquiteto = new TelaEditarArquiteto();
    private final CadastroDAOArquiteto cadastroDAO = new CadastroDAOArquiteto();
    private final LoginService loginService = new LoginService();
    private CadastroArquiteto cadastroArquiteto;
    
    public ControleEditarArquiteto(){
        
        telaEditarArquiteto.getjButtonSalvarEditarArquiteto().addActionListener(this);
        telaEditarArquiteto.getjButtonVoltarEditarArquiteto().addActionListener(this);
        
        telaEditarArquiteto.getjTextFieldNomeArquitetoEditar().setText(Sessao.getCadastroArquiteto().getNomeArquiteto());
        telaEditarArquiteto.getjTextFieldEmailArquitetoEditar().setText(Sessao.getCadastroArquiteto().getEmail());
        telaEditarArquiteto.getjTextFieldCPFArquitetoEditar().setText(Sessao.getCadastroArquiteto().getCpf());
        telaEditarArquiteto.getjTextFieldNumeroDoCauEditar().setText(Sessao.getCadastroArquiteto().getCpf());
        telaEditarArquiteto.getjTextFieldTelefoneArquitetoEditar().setText(Sessao.getCadastroArquiteto().getTelefone());
        
        this.telaEditarArquiteto.setLocationRelativeTo(null);
        
        telaEditarArquiteto.setVisible(true);
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource().equals(telaEditarArquiteto.getjButtonSalvarEditarArquiteto())){
            
             //loginService.editarArquiteto(telaEditarArquiteto.getjTextFieldNomeArquitetoEditar().getText(),telaEditarArquiteto.getjTextFieldEmailArquitetoEditar().getText(),telaEditarArquiteto.getjTextFieldNumeroDoCauEditar().getText()
             //,telaEditarArquiteto.getjTextFieldTelefoneArquitetoEditar().getText(),telaEditarArquiteto.getjTextFieldCPFArquitetoEditar().getText());
             //cadastroArquiteto = new CadastroArquiteto();
             editarArquiteto(telaEditarArquiteto.getjTextFieldNomeArquitetoEditar().getText(),telaEditarArquiteto.getjTextFieldEmailArquitetoEditar().getText(),telaEditarArquiteto.getjTextFieldNumeroDoCauEditar().getText()
             ,telaEditarArquiteto.getjTextFieldTelefoneArquitetoEditar().getText(),telaEditarArquiteto.getjTextFieldCPFArquitetoEditar().getText());
             
             JOptionPane.showMessageDialog(telaEditarArquiteto, "Perfil Editado", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
             
             telaEditarArquiteto.dispose();
            ControlePerfilArquiteto controlePerfilArquiteto = new ControlePerfilArquiteto();
        }
        else if(e.getSource().equals(telaEditarArquiteto.getjButtonVoltarEditarArquiteto())){
            telaEditarArquiteto.dispose();
            ControlePerfilArquiteto controlePerfilArquiteto = new ControlePerfilArquiteto();
        }
        
    }

    private void editarArquiteto(String nomeArquiteto, String Email, String cpf, String numeroCau, String telefone) {
        CadastroArquiteto editar = new CadastroArquiteto();
        editar.setNomeArquiteto(nomeArquiteto);
        editar.setEmail(Email);
        editar.setCpf(cpf);
        editar.setNumeroCau(numeroCau);
        editar.setTelefone(telefone);
        editar.setId(Sessao.getCadastroArquiteto().getId());
        cadastroDAO.editarArquiteto(editar);
        
        Sessao.setCadastroArquiteto(editar);
        
        //cadastroDAO.editarArquiteto(editar);
        
    }
    
}
