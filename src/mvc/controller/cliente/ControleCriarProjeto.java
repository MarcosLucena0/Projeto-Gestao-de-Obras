
package mvc.controller.cliente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import mvc.model.cliente.CadastroCliente;
import mvc.model.cliente.CadastroDAOProjeto;
import mvc.model.cliente.CadastroProjeto;
import mvc.view.cliente.TelaCriarProjeto;

public class ControleCriarProjeto implements ActionListener{
    
    private final TelaCriarProjeto telaCriarProjeto = new TelaCriarProjeto(null, true);
    private final CadastroDAOProjeto cadastroDAOProjeto = new CadastroDAOProjeto();
    private CadastroProjeto cadastroProjeto ;

    public ControleCriarProjeto() {
        
        //adicionando os listenners nos botões para escutar
        telaCriarProjeto.getjButtonCadastrarProjeto().addActionListener(this);
        telaCriarProjeto.getjButtonVoltarTelaCliente().addActionListener(this);
        
        //comando para tela ficar no centro 
        this.telaCriarProjeto.setLocationRelativeTo(null);

        telaCriarProjeto.setVisible(true);
    }

    //@Override;
    public void actionPerformed(ActionEvent e) {
        //evento do botao de criar projeto
        if(e.getSource().equals(this.telaCriarProjeto.getjButtonCadastrarProjeto())){
            //verifica se os campos estao preenchidos
            if(validaCampos()){
                CadastroProjeto cadastroProjeto = new CadastroProjeto();
                cadastroProjeto.setEndereco(telaCriarProjeto.getjTextFieldEndereço().getText());
                cadastroProjeto.setNomeProjeto(telaCriarProjeto.getjTextFieldNomeProjeto().getText());
               
                cadastroDAOProjeto.cadastrarProjeto(cadastroProjeto);
                //mensagem
                JOptionPane.showMessageDialog(telaCriarProjeto, "Projeto Cadastrado", "Confirmação", JOptionPane.INFORMATION_MESSAGE);
               
                telaCriarProjeto.setVisible(false); 
                ControlePrincipal controlePrincipal = new ControlePrincipal();
            }
        }
        //evento do botal voltar
        else if(e.getSource().equals(this.telaCriarProjeto.getjButtonVoltarTelaCliente())){
            //comando que faz a tela anterior sumir e liberar memória
            this.telaCriarProjeto.dispose();
            //instanciando a nova tela
            ControlePrincipal controlePrincipal= new ControlePrincipal();
        }
        
    }
    
    //metodo para saber se todos os campos estão preenchidos corretamente e salvar
     private boolean validaCampos(){
         if(telaCriarProjeto.getjTextFieldEndereço().getText().equals(""))return false;
            else if(telaCriarProjeto.getjTextFieldNomeProjeto().getText().equals(""))return false;
            else return true;
     }
    
}
