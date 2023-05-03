
package mvc.controller.engenheiro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import mvc.controller.ControleEntidade;
import mvc.controller.ControleLogin;
import mvc.model.engenheiro.CadastroDaoEngenheiro;
import mvc.model.engenheiro.CadastroEngenheiro;
import mvc.view.engenheiro.TelaCadastroEngenheiro1;
import mvc.view.engenheiro.TelaCadastroEngenheiro2;
import mvc.view.TelaEntidade;


public class ControleCadastroEngenheiro implements ActionListener {
    
    private final TelaCadastroEngenheiro1 telacadastroengenheiro1 = new TelaCadastroEngenheiro1();
    private final TelaCadastroEngenheiro2 telacadastroengenheiro2 = new TelaCadastroEngenheiro2();
    private final CadastroDaoEngenheiro cadastroDAO = new CadastroDaoEngenheiro();
    private final TelaEntidade telaEntidade = new TelaEntidade();
    private CadastroEngenheiro cadastroEngenheiro;

    public ControleCadastroEngenheiro(CadastroEngenheiro cadastroEngenheiro) {
        
         telacadastroengenheiro1.getjButtonAvancar().addActionListener(this);
        telacadastroengenheiro1.getjButtonVoltarCadastro().addActionListener(this);
        telacadastroengenheiro2.getjButtonSalvar().addActionListener(this);
        telacadastroengenheiro2.getjButtonVoltarCadastro1().addActionListener(this);
        
        this.telacadastroengenheiro1.setLocationRelativeTo(null);
        this.telacadastroengenheiro2.setLocationRelativeTo(null);
        
        telacadastroengenheiro1.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(this.telacadastroengenheiro1.getjButtonAvancar())){
           if(validaCampos()){
           
               cadastroEngenheiro = new CadastroEngenheiro();
               
               cadastroEngenheiro.setNome(telacadastroengenheiro1.getjTextFieldNomeEngenheiro().getText());
                    cadastroEngenheiro.setEmail(telacadastroengenheiro1.getjTextFieldEmailEngenheiro().getText());
                    cadastroEngenheiro.setCpf(telacadastroengenheiro1.getjTextFieldCPFEngenheiro().getText());
                    cadastroEngenheiro.setTelefone(telacadastroengenheiro1.getjTextFieldTelefoneEngenheiro().getText());
           
                    telacadastroengenheiro1.setVisible(false);
                    //entra a tela de cadastro etapa2
                    telacadastroengenheiro2.setVisible(true);
           }else{
                //lanca uma mensagem
                JOptionPane.showMessageDialog(telacadastroengenheiro1, "Preencha todos os campos", 
                        "Erro", JOptionPane.ERROR_MESSAGE);
        }
           

        }
        
       else if(e.getSource().equals(this.telacadastroengenheiro1.getjButtonVoltarCadastro())){
            telacadastroengenheiro1.dispose();

            ControleEntidade controleEntidade = new ControleEntidade();
            
        }
         else if(e.getSource().equals(telacadastroengenheiro2.getjButtonSalvar())){
             if(validaaCampos()){
                 if(telacadastroengenheiro2.getjPasswordFieldSenhaEngemheiro().getText().equals(telacadastroengenheiro2.getjPasswordFieldConfirmarSenhaEngenheiro().getText())){
                    
                    //caso sejam iguais ele verifica se os campos estap preenchidos
                    cadastroEngenheiro.setEndereco(telacadastroengenheiro2.getjTextFieldEndereçoEngenheiro().getText());
                    cadastroEngenheiro.setNumeroCau(telacadastroengenheiro2.getjTextFieldNumeroDaCauEngenheiro().getText());
                    cadastroEngenheiro.setSenha(telacadastroengenheiro2.getjPasswordFieldSenhaEngemheiro().getText());
                    
                    cadastroDAO.cadastrarEngenheiro(cadastroEngenheiro);
                JOptionPane.showMessageDialog(telacadastroengenheiro2, "Cadastro Salvo", "Confirmação", JOptionPane.INFORMATION_MESSAGE);
               
                //tela de cadastro cliente desaparece
                telacadastroengenheiro2.setVisible(false); 
                //entra a tela de login
                ControleLogin controleLogin = new ControleLogin();
                    
                }
                 else{
                    JOptionPane.showMessageDialog(telacadastroengenheiro2, "Senhas informadas não são iguais", 
                        "Erro", JOptionPane.ERROR_MESSAGE); 
                }
                 
             }
             else{
                //lanca uma mensagem
                JOptionPane.showMessageDialog(telacadastroengenheiro2, "Preencha todos os campos", 
                        "Erro", JOptionPane.ERROR_MESSAGE);
        }
      
             }
    }
    private boolean validaCampos(){
        if(telacadastroengenheiro1.getjTextFieldNomeEngenheiro().getText().equals(""))return false;
        else if(telacadastroengenheiro1.getjTextFieldEmailEngenheiro().getText().equals(""))return false;
            else if(telacadastroengenheiro1.getjTextFieldCPFEngenheiro().getText().equals(""))return false;
            else if(telacadastroengenheiro1.getjTextFieldTelefoneEngenheiro().getText().equals(""))return false;
            else return true;
        
    }
    private boolean validaaCampos(){
         if(telacadastroengenheiro2.getjTextFieldEndereçoEngenheiro().getText().equals(""))return false;
            else if(telacadastroengenheiro2.getjTextFieldNumeroDaCauEngenheiro().getText().equals(""))return false;
            else if(telacadastroengenheiro2.getjPasswordFieldSenhaEngemheiro().getText().equals(""))return false;
            else if(telacadastroengenheiro2.getjPasswordFieldConfirmarSenhaEngenheiro().getText().equals(""))return false;
            else return true;
    
    }
}
