
package mvc.controller.prestadordeservico;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import mvc.controller.ControleEntidade;
import mvc.controller.ControleLogin;
import mvc.model.prestadordeservico.CadastroDAOPrestadorDeServicos;
import mvc.model.prestadordeservico.CadastroPrestadorDeServicos;
import mvc.view.prestadordeservico.TelaCadastroPrestadorDeServicos1;
import mvc.view.prestadordeservico.TelaCadastroPrestadorDeServicos2;
import mvc.view.prestadordeservico.TelaCadastroPrestadorDeServicos3;
import mvc.view.prestadordeservico.TelaCadastroPrestadorDeServicos4;
import mvc.view.TelaEntidade;

//classe controleCadastro implementando actionListeners
public class ControleCadastroPrestadorDeServicos implements ActionListener{
    
    //criando objeto da tela cadastro
    private final TelaCadastroPrestadorDeServicos1 telaCadastroPrestadorDeServicos1 = new TelaCadastroPrestadorDeServicos1();
    private final CadastroDAOPrestadorDeServicos cadastroDAO = new CadastroDAOPrestadorDeServicos();
    private final TelaCadastroPrestadorDeServicos2 telaCadastroPrestadorDeServicos2 = new TelaCadastroPrestadorDeServicos2();
    private final TelaCadastroPrestadorDeServicos3 telaCadastroPrestadorDeServicos3 = new TelaCadastroPrestadorDeServicos3();
    private final TelaCadastroPrestadorDeServicos4 telaCadastroPrestadorDeServicos4 = new TelaCadastroPrestadorDeServicos4();
    private final TelaEntidade telaEntidade = new TelaEntidade();
    private CadastroDAOPrestadorDeServicos cadastroDAOPrestadorDeServicos;
    
    //construtor
    public ControleCadastroPrestadorDeServicos(CadastroPrestadorDeServicos cadastro) {
        
        //adicionando os listenners nos botões para escutar
        telaCadastroPrestadorDeServicos1.getJButtonAvancar().addActionListener(this);
        telaCadastroPrestadorDeServicos1.getjButtonVoltarEntidade().addActionListener(this);
        telaCadastroPrestadorDeServicos2.getjButtonAvancar1().addActionListener(this);
        telaCadastroPrestadorDeServicos2.getjButtonVoltarCadastro1().addActionListener(this);
        telaCadastroPrestadorDeServicos3.getjButtonAvancar3().addActionListener(this);
        telaCadastroPrestadorDeServicos3.getjButtonVoltarCadastro2().addActionListener(this);
        telaCadastroPrestadorDeServicos4.getjButtonSalvar().addActionListener(this);
        telaCadastroPrestadorDeServicos4.getjButtonVoltarCadastro3().addActionListener(this);
        
        //comando para tela ficar no centro  
        this.telaCadastroPrestadorDeServicos1.setLocationRelativeTo(null);
        this.telaCadastroPrestadorDeServicos2.setLocationRelativeTo(null);
        this.telaCadastroPrestadorDeServicos3.setLocationRelativeTo(null);
        this.telaCadastroPrestadorDeServicos4.setLocationRelativeTo(null);

       
        telaCadastroPrestadorDeServicos1.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    
    //evento do botão avançar
    if(e.getSource().equals(this.telaCadastroPrestadorDeServicos1.getJButtonAvancar())){
            //método que valida se os campos foram preenchidos
            if(validaCampos()){
                //Instanciando o objeto para que as informações seja guardadas nela
                CadastroPrestadorDeServicos cadastroPrestadorDeServicos = new CadastroPrestadorDeServicos();
            
            //remove tela de cadastro da etapa 1
            telaCadastroPrestadorDeServicos1.setVisible(false);
            //entra a tela de cadastro etapa2
            telaCadastroPrestadorDeServicos2.setVisible(true);
        }
            //verifica se todos os campos estão preenchidos
            else{
                //lança uma mensagem
                JOptionPane.showMessageDialog(telaCadastroPrestadorDeServicos1, "Preencha todos os campos",
                        "Erro", JOptionPane.ERROR_MESSAGE);
            }
      }
    //evento de botao VoltarEntidade
    else if(e.getSource().equals(this.telaCadastroPrestadorDeServicos1.getjButtonVoltarEntidade())){
            telaCadastroPrestadorDeServicos1.dispose();
            ControleEntidade controleEntidade = new ControleEntidade();
        }
        //evento de botao Avançar1
        else if(e.getSource().equals(telaCadastroPrestadorDeServicos2.getjButtonAvancar1())){
            if(validaCampos2()){
                CadastroPrestadorDeServicos cadastroPrestadorDeServicos = new CadastroPrestadorDeServicos();
                cadastroPrestadorDeServicos.setNomePrestadorDeServicos(telaCadastroPrestadorDeServicos2.getjTextFieldNome().getText());
                cadastroPrestadorDeServicos.setCpf(telaCadastroPrestadorDeServicos2.getjTextFieldCPF().getText());
                cadastroPrestadorDeServicos.setEmail(telaCadastroPrestadorDeServicos2.getjTextFieldEmail().getText());
                cadastroPrestadorDeServicos.setTelefone(telaCadastroPrestadorDeServicos2.getjTextFieldTelefone().getText());
                
                telaCadastroPrestadorDeServicos2.setVisible(false);
                telaCadastroPrestadorDeServicos3.setVisible(true);
            }
        }
        else if(e.getSource().equals(telaCadastroPrestadorDeServicos2.getjButtonVoltarCadastro1())){
            this.telaCadastroPrestadorDeServicos2.dispose();
            telaCadastroPrestadorDeServicos1.setVisible(true);
        }
        else if(e.getSource().equals(telaCadastroPrestadorDeServicos3.getjButtonAvancar3())){
            if(validaCampos3()){
                if(telaCadastroPrestadorDeServicos3.getjPasswordFieldSenha().getText().equals(telaCadastroPrestadorDeServicos3.getjPasswordFieldConfirmarSenha().getText())){
                    CadastroPrestadorDeServicos cadastroPrestadorDeServicos = new CadastroPrestadorDeServicos();
                    cadastroPrestadorDeServicos.setEndereco(telaCadastroPrestadorDeServicos3.getjTextFieldEndereco().getText());
                    cadastroPrestadorDeServicos.setSenha(telaCadastroPrestadorDeServicos3.getjPasswordFieldSenha().getText());
                    
                    telaCadastroPrestadorDeServicos3.setVisible(false);
                    telaCadastroPrestadorDeServicos4.setVisible(true);
                } else{
                    JOptionPane.showMessageDialog(telaCadastroPrestadorDeServicos3, "Senhas informadas não são iguais", 
                            "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        else if(e.getSource().equals(telaCadastroPrestadorDeServicos3.getjButtonVoltarCadastro2())){
            this.telaCadastroPrestadorDeServicos3.dispose();
            telaCadastroPrestadorDeServicos2.setVisible(true);
        }
        else if(e.getSource().equals(telaCadastroPrestadorDeServicos4.getjButtonSalvar())){
            if(validaCampos4()){
                CadastroPrestadorDeServicos cadastroPrestadorDeServicos = new CadastroPrestadorDeServicos();
                cadastroPrestadorDeServicos.setAnosExperiencia(telaCadastroPrestadorDeServicos4.getjTextFieldAnosExperiencia().getText());
                cadastroPrestadorDeServicos.setTrabalhosRealizados(telaCadastroPrestadorDeServicos4.getjTextFieldTrabalhosRealizados().getText());
                cadastroPrestadorDeServicos.setValorDiaria(telaCadastroPrestadorDeServicos4.getjTextFieldValorDiaria().getText());
                cadastroPrestadorDeServicos.setAgendaDisponibilidade(telaCadastroPrestadorDeServicos4.getjTextFieldAgendaDisponibilidade().getText());
                
                cadastroDAOPrestadorDeServicos.cadastrarPrestadorDeServicos(cadastroPrestadorDeServicos);
                JOptionPane.showMessageDialog(telaCadastroPrestadorDeServicos4, "Cadastro Salvo", "Confirmação", JOptionPane.INFORMATION_MESSAGE);
                
                telaCadastroPrestadorDeServicos4.setVisible(false);
                ControleLogin controleLogin = new ControleLogin();
            }
           
        }
 
    }
    
    //metodo para saber se todos os campos estão preenchidos corretamente e salvar
    private boolean validaCampos(){
        if(telaCadastroPrestadorDeServicos1.getjCheckBoxPedreiro().getText().equals(""))return false;
        else if(telaCadastroPrestadorDeServicos1.getjCheckBoxServente().getText().equals(""))return false;
        else if(telaCadastroPrestadorDeServicos1.getjCheckBoxPintor().getText().equals(""))return false;
        else if(telaCadastroPrestadorDeServicos1.getjCheckBoxEletricista().getText().equals(""))return false;
        else if(telaCadastroPrestadorDeServicos1.getjCheckBoxGesseiro().getText().equals(""))return false;
        else if(telaCadastroPrestadorDeServicos1.getjCheckBoxEncanador().getText().equals(""))return false;
        else return true;
     }

    //metodo para saber se todos os campos estão preenchidos corretamente e salvar
    private boolean validaCampos2(){
        if(telaCadastroPrestadorDeServicos2.getjTextFieldNome().getText().equals(""))return false;
        else if(telaCadastroPrestadorDeServicos2.getjTextFieldEmail().getText().equals(""))return false;
        else if(telaCadastroPrestadorDeServicos2.getjTextFieldCPF().getText().equals(""))return false;
        else if(telaCadastroPrestadorDeServicos2.getjTextFieldTelefone().getText().equals(""))return false;
        else return true;
    }

    //metodo para saber se todos os campos estão preenchidos corretamente e salvar
    private boolean validaCampos3(){
         if(telaCadastroPrestadorDeServicos3.getjTextFieldEndereco().getText().equals(""))return false;
            else if(telaCadastroPrestadorDeServicos3.getjPasswordFieldSenha().getText().equals(""))return false;
            else if(telaCadastroPrestadorDeServicos3.getjPasswordFieldConfirmarSenha().getText().equals(""))return false;
            else return true;
     }

    //metodo para saber se todos os campos estão preenchidos corretamente e salvar
    private boolean validaCampos4(){
        if(telaCadastroPrestadorDeServicos4.getjTextFieldAnosExperiencia().getText().equals(""))return false;
        else if(telaCadastroPrestadorDeServicos4.getjTextFieldTrabalhosRealizados().getText().equals(""))return false;
        else if(telaCadastroPrestadorDeServicos4.getjTextFieldValorDiaria().getText().equals(""))return false;
        else if(telaCadastroPrestadorDeServicos4.getjTextFieldAgendaDisponibilidade().getText().equals(""))return false;
        else return true;
    }
    
}
