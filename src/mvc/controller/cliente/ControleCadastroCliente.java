
package mvc.controller.cliente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import mvc.controller.ControleEntidade;
import mvc.controller.ControleLogin;
import mvc.model.cliente.CadastroCliente;
import mvc.model.cliente.CadastroDAOCliente;
import mvc.view.cliente.TelaCadastroCliente1;
import mvc.view.cliente.TelaCadastroCliente2;
import mvc.view.TelaEntidade;

//classe controleCadastro implementando actionListeners
public class ControleCadastroCliente implements ActionListener{
    
    //criando objeto da tela cadastro
    private final TelaCadastroCliente1 telaCadastroCliente1 = new TelaCadastroCliente1();
    private final CadastroDAOCliente cadastroDAO = new CadastroDAOCliente();
    private final TelaCadastroCliente2 telaCadastroCliente2 = new TelaCadastroCliente2();
    private final TelaEntidade telaEntidade = new TelaEntidade();
    private CadastroCliente cadastroCliente;

    //construtor
    public ControleCadastroCliente( CadastroCliente cadastro) {
        
        
        //adicionando os listenners nos botões para escutar
        telaCadastroCliente1.getjButtonCadastrar().addActionListener(this);
        telaCadastroCliente1.getjButtonVoltarCadastro().addActionListener(this);
        telaCadastroCliente2.getjButtonSalvar().addActionListener(this);
        telaCadastroCliente2.getjButtonVoltarCadastroCliente().addActionListener(this);
       
        
        //comando para tela ficar no centro  
        this.telaCadastroCliente1.setLocationRelativeTo(null);
        this.telaCadastroCliente2.setLocationRelativeTo(null);
       
        telaCadastroCliente1.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        //evento do botão cadastrar
        if(e.getSource().equals(this.telaCadastroCliente1.getjButtonCadastrar())){
            //metodo que valida se os campos foram preenchidos
            if(validaCampos()){
                //if que verifica se a senha e a confirmação são iguais
                if(telaCadastroCliente1.getjPasswordFieldSenhaCadastro().getText().equals(telaCadastroCliente1.getjPasswordFieldConfirmarSenha().getText())){
                    //Instanciando o objeto para que as informações seja guardadas nela
                    cadastroCliente = new CadastroCliente();
                    //caso sejam iguais ele verifica se os campos estao preenchidos
                    cadastroCliente.setNomeUsuario(telaCadastroCliente1.getjTextFieldNome().getText());
                    cadastroCliente.setEmail(telaCadastroCliente1.getjTextFieldEmail().getText());
                    cadastroCliente.setSenha(telaCadastroCliente1.getjPasswordFieldSenhaCadastro().getText());
                    //cadastro.setSenha(telaCadastro.getjPasswordFieldConfirmarSenha().getText());

                    //remove tela de cadastro da etapa 1
                    telaCadastroCliente1.setVisible(false);
                    //entra a tela de cadastro etapa2
                    telaCadastroCliente2.setVisible(true);
                //caso as senhas não sejam iguais, lança uma mensagem informando que as sehas estao distintas
                } else{
                    JOptionPane.showMessageDialog(telaCadastroCliente1, "Senhas informadas não são iguais", 
                        "Erro", JOptionPane.ERROR_MESSAGE); 
                }
            }
               //verifica se todos os campos estão preenchidos
           else{
                //lanca uma mensagem
                JOptionPane.showMessageDialog(telaCadastroCliente1, "Preencha todos os campos", 
                        "Erro", JOptionPane.ERROR_MESSAGE);
        }
        }
        
        //evento de botao voltar
        else if(e.getSource().equals(this.telaCadastroCliente1.getjButtonVoltarCadastro())){
            telaCadastroCliente1.dispose();
            ControleEntidade controleEntidade = new ControleEntidade();
        }
        
        else if(e.getSource().equals(telaCadastroCliente2.getjButtonSalvar())){
            if(validaaCampos()){
                cadastroCliente.setEndereco(telaCadastroCliente2.getjTextFieldEndereço().getText());
                cadastroCliente.setTelefone(telaCadastroCliente2.getjTextFieldTelefone1().getText());
                cadastroCliente.setCpf(telaCadastroCliente2.getjTextFieldCPF().getText());
                
                cadastroDAO.cadastrarCliente(cadastroCliente);
                JOptionPane.showMessageDialog(telaCadastroCliente2, "Cadastro Salvo", "Confirmação", JOptionPane.INFORMATION_MESSAGE);
               
                //tela de cadastro cliente desaparece
                telaCadastroCliente2.setVisible(false); 
                //entra a tela de login
                ControleLogin controleLogin = new ControleLogin();
            }
            else{
                //lanca uma mensagem
                JOptionPane.showMessageDialog(telaCadastroCliente2, "Preencha todos os campos", 
                        "Erro", JOptionPane.ERROR_MESSAGE);
        }
        }
        //evento do botao voltar
            else if(e.getSource().equals(this.telaCadastroCliente2.getjButtonVoltarCadastroCliente())){
            //comando que faz a tela anterior sumir e liberar memória
            this.telaCadastroCliente2.dispose();
            //instanciando a nova tela
            telaCadastroCliente1.setVisible(true);
        }

    }

    //metodo para saber se todos os campos estão preenchidos corretamente e salvar
     private boolean validaCampos(){
         if(telaCadastroCliente1.getjTextFieldNome().getText().equals(""))return false;
            else if(telaCadastroCliente1.getjTextFieldEmail().getText().equals(""))return false;
            else if(telaCadastroCliente1.getjPasswordFieldSenhaCadastro().getText().equals(""))return false;
            else if(telaCadastroCliente1.getjPasswordFieldConfirmarSenha().getText().equals(""))return false;
            else return true;
     }
     
     //metodo para saber se todos os campos estão preenchidos corretamente e salvar
     private boolean validaaCampos(){
         if(telaCadastroCliente2.getjTextFieldEndereço().getText().equals(""))return false;
            else if(telaCadastroCliente2.getjTextFieldTelefone1().getText().equals(""))return false;
            else if(telaCadastroCliente2.getjTextFieldCPF().getText().equals(""))return false;
            else return true;
     }
}
