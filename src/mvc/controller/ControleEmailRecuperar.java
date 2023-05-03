
package mvc.controller;


import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import mvc.model.LoginService;
import mvc.view.TelaEmail;
import mvc.view.TelaLogin;
import mvc.view.TelaNovaSenha;


public class ControleEmailRecuperar implements ActionListener{
    
    //criando bjetos e instanciando
    private final TelaLogin telaLogin = new TelaLogin(null, true);
    private final TelaEmail telaEmail = new TelaEmail(null, true);
    private final LoginService loginService = new LoginService();
    private final TelaNovaSenha telaNovaSenha = new TelaNovaSenha(null,true);
    
    //metodo construtor
    public ControleEmailRecuperar() {
        
        //adicionando os listeners
        telaEmail.getjButtonEnviar().addActionListener(this);
        telaEmail.getjButtonVoltarRecuperar().addActionListener(this);
        telaNovaSenha.getjButtonAlterarSenha().addActionListener(this);
        
        this.telaEmail.setLocationRelativeTo(telaEmail);
      
        telaEmail.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        //evento do botao enviar o email
        if(e.getSource().equals(telaEmail.getjButtonEnviar())){
            //verifica se o email digitado esta cadastrado no banco
            if(loginService.checkAccessRecupera(telaEmail.getjTextFieldEmailRecuperar().getText())){
                
                //chama o metod para gerar o codigo
               loginService.enviarCodigo();
               //envia uma mensagem
               JOptionPane.showMessageDialog(telaEmail, "Código de recuperação enviado para o email " + telaEmail.getjTextFieldEmailRecuperar().getText(), "Confirmação", JOptionPane.INFORMATION_MESSAGE);
               //tela email some
               telaEmail.setVisible(false);
               //tela de nova senha aparece
               telaNovaSenha.setVisible(true);
   
            }
            //else caso o email nao esteja registrado enciar uma mensagem informando
            else{
                JOptionPane.showMessageDialog(telaEmail, "Email não registrado", 
                        "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
        else if(e.getSource().equals(telaEmail.getjButtonVoltarRecuperar())){
            this.telaEmail.dispose();
            ControleLogin controleLogin = new ControleLogin();
            
        }
        
        //evento do botão alterar para verificar o codigo de recuperação de alterar senha
        else if(e.getSource().equals(telaNovaSenha.getjButtonAlterarSenha())){
            //verifica e valida se o codigo gerado é o mesmo que o digitado
            if(loginService.verificarCodigoDeRecuperacao(telaNovaSenha.getjTextFieldRecuperacao().getText())){
                //caso o codigo seja o mesmo, ele verifica se as senhas sao as mesmas 
                if(telaNovaSenha.verificarCampoDeSenha()){
                    //caso seja as mesmas ele altera a senha
                    loginService.alterarSenha(telaNovaSenha.getjPasswordFieldNovaSenha().getText(),telaEmail.getjTextFieldEmailRecuperar().getText());
                    JOptionPane.showMessageDialog(telaNovaSenha, "Senha alterada", "Confirmação", JOptionPane.INFORMATION_MESSAGE);
                    this.telaNovaSenha.dispose();
                    
                    ControleLogin controleLogin = new ControleLogin();
                }
                //caso não sejam as mesmas envia uma mensagem informando
                else{
                    
                    JOptionPane.showMessageDialog(telaEmail, "Senhas informadas não são iguais", 
                        "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
            //caso o codigo esteja incorreto aparece uma mensagem informando
            else{
                JOptionPane.showMessageDialog(telaEmail, "Código Invalido", 
                        "Erro", JOptionPane.ERROR_MESSAGE);
            }
            
        }
        else if(e.getSource().equals(telaNovaSenha.getjButtonVoltar())){
            this.telaNovaSenha.dispose();
            ControleEmailRecuperar controleEmailRecuperar = new ControleEmailRecuperar();
        }
          
    }
}
