

package mvc.controller.arquiteto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import mvc.controller.ControleEntidade;
import mvc.controller.ControleLogin;
import mvc.model.arquiteto.CadastroArquiteto;
import mvc.model.arquiteto.CadastroDAOArquiteto;
import mvc.model.cliente.CadastroDAOCliente;
import mvc.view.arquiteto.TelaCadastroArquiteto1;
import mvc.view.arquiteto.TelaCadastroArquiteto2;


public class ControleCadastroArquiteto implements ActionListener{
    
    //criando objeto da tela cadastro
    private final TelaCadastroArquiteto1 telaCadastroArquiteto = new TelaCadastroArquiteto1();
    private final TelaCadastroArquiteto2 telaCadastroArquiteto2 = new TelaCadastroArquiteto2();
    private final CadastroDAOArquiteto cadastroDAO = new CadastroDAOArquiteto();
    private CadastroArquiteto cadastroArquiteto;
   
    
    public ControleCadastroArquiteto(boolean status, CadastroArquiteto cadastro) {

        //adicionando os listenners nos botões para escutar
        telaCadastroArquiteto.getjButtonAvancar().addActionListener(this);
        telaCadastroArquiteto.getjButtonVoltarCadastro().addActionListener(this);
        telaCadastroArquiteto2.getjButtonSalvarArquiteto().addActionListener(this);
        telaCadastroArquiteto2.getjButtonVoltarCadastroArquiteto().addActionListener(this);
        
        
        //comando para tela ficar no centro 
        this.telaCadastroArquiteto.setLocationRelativeTo(null);
        this.telaCadastroArquiteto2.setLocationRelativeTo(null);
   
        telaCadastroArquiteto.setVisible(true);
    }



    @Override
    public void actionPerformed(ActionEvent ae) {
        //evento do botão cadastrar
        if(ae.getSource().equals(this.telaCadastroArquiteto.getjButtonAvancar())){
            if(validaCampos()){
  
                cadastroArquiteto = new CadastroArquiteto();
                cadastroArquiteto.setNomeArquiteto(telaCadastroArquiteto.getjTextFieldNomeArquiteto().getText());
                cadastroArquiteto.setEmail(telaCadastroArquiteto.getjTextFieldEmailArquiteto().getText());
                cadastroArquiteto.setCpf(telaCadastroArquiteto.getjTextFieldCPFArquiteto().getText());
               
                telaCadastroArquiteto.setVisible(false); 
                
                telaCadastroArquiteto2.setVisible(true);
                
            }
        }
            
            else if(ae.getSource().equals(this.telaCadastroArquiteto.getjButtonVoltarCadastro())){
            //comando que faz a tela anterior sumir e liberar memória
            this.telaCadastroArquiteto.dispose();
            //instanciando a nova tela
            ControleEntidade controleEntidade = new ControleEntidade();
        }
        
            else if(ae.getSource().equals(telaCadastroArquiteto2.getjButtonSalvarArquiteto())){
                if(validaaCampos()){
                    //if que verifica se a senha e a confirmação são iguais
                if(telaCadastroArquiteto2.getjPasswordFieldSenhaCadastroArquiteto().getText().equals(telaCadastroArquiteto2.getjPasswordFieldConfirmarSenhaArquiteto().getText())){
                    cadastroArquiteto.setNumeroCau(telaCadastroArquiteto2.getjTextFieldNumeroDoCau().getText());
                    cadastroArquiteto.setTelefone(telaCadastroArquiteto2.getjTextFieldTelefone3().getText());
                    cadastroArquiteto.setEndereco(telaCadastroArquiteto2.getjTextFieldEndereco3().getText());
                    cadastroArquiteto.setSenha(telaCadastroArquiteto2.getjPasswordFieldSenhaCadastroArquiteto().getText());
                    
                 cadastroDAO.cadastrarArquiteto(cadastroArquiteto);
                JOptionPane.showMessageDialog(telaCadastroArquiteto, "Cadastro Salvo", "Confirmação", JOptionPane.INFORMATION_MESSAGE);
               
                //tela de cadastro cliente desaparece
                this.telaCadastroArquiteto2.dispose();
                //entra a tela de login
               // ControleLogin controleLogin = new ControleLogin();
                ControlePrincipalArquiteto controlePrincipalArquiteto = new ControlePrincipalArquiteto();
                }
                
                //caso as senhas não sejam iguais, lança uma mensagem informando que as sehas estao distintas
                else{
                    JOptionPane.showMessageDialog(telaCadastroArquiteto2, "Senhas informadas não são iguais", 
                        "Erro", JOptionPane.ERROR_MESSAGE); 
                }
                }
                //caso as senhas não sejam iguais, lança uma mensagem informando que as sehas estao distintas
                else {
                    JOptionPane.showMessageDialog(telaCadastroArquiteto, "Senhas informadas não são iguais", 
                        "Erro", JOptionPane.ERROR_MESSAGE); 
                }
            }
        
            else if(ae.getSource().equals(telaCadastroArquiteto2.getjButtonVoltarCadastroArquiteto())){
                //comando que faz a tela anterior sumir e liberar memória
            this.telaCadastroArquiteto2.dispose();
            //instanciando a nova tela
            telaCadastroArquiteto.setVisible(true);
            }
    }

    private boolean validaCampos() {
        if(telaCadastroArquiteto.getjTextFieldNomeArquiteto().getText().equals(""))return false;
            else if(telaCadastroArquiteto.getjTextFieldEmailArquiteto().getText().equals(""))return false;
            else if(telaCadastroArquiteto.getjTextFieldCPFArquiteto().getText().equals(""))return false;
            else return true;
    }
    
    private boolean validaaCampos(){
        if(telaCadastroArquiteto2.getjTextFieldNumeroDoCau().getText().equals(""))return false;
        else if(telaCadastroArquiteto2.getjTextFieldTelefone3().getText().equals(""))return false;
        else if(telaCadastroArquiteto2.getjTextFieldEndereco3().getText().equals(this))return false;
        else if(telaCadastroArquiteto2.getjPasswordFieldSenhaCadastroArquiteto().getText().equals(""))return false;
        else if(telaCadastroArquiteto2.getjPasswordFieldConfirmarSenhaArquiteto().getText().equals(""))return false;
        else return true;
    }
    
    
}
