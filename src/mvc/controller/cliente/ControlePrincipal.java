
package mvc.controller.cliente;


import mvc.controller.cliente.ControlePerfilCliente;
import mvc.controller.cliente.ControleCriarProjeto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import mvc.view.cliente.TelaPrincipal;
import projetogestaodeobras.Sessao;

public class ControlePrincipal implements ActionListener{
    
   //criando e instanciando objeto
    private final TelaPrincipal telaPrincipal = new TelaPrincipal(null, true);
    

    public ControlePrincipal() {
        //instanciando a tela
        addListeners();
        this.telaPrincipal.setLocationRelativeTo(null);
        telaPrincipal.getjLabelNomeUsuario().setText(Sessao.getCadastroCliente().getNomeUsuario());
        telaPrincipal.setVisible(true);
    }

    private void addListeners() {
        
        // adiciona os listeners nos componentes cujos eventos serão gerenciados    
        telaPrincipal.getjButtonCadastrarProjeto().addActionListener(this);
        telaPrincipal.getjButtonProjetos().addActionListener(this);
        telaPrincipal.getjButtonProjeto2().addActionListener(this);
        telaPrincipal.getjButtonProjeto1().addActionListener(this);
        telaPrincipal.getjButtonPerfil().addActionListener(this);
        telaPrincipal.getjButtonNotificacoes().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //evento do botao cadastrar projeto
         if(e.getSource().equals(telaPrincipal.getjButtonCadastrarProjeto())){
             
             telaPrincipal.setVisible(false);
            //aparece a tela de cadastro projeto
            ControleCriarProjeto controleCriarProjeto = new ControleCriarProjeto();
            
        } else if(e.getSource().equals(telaPrincipal.getjButtonProjetos())){
           
        } else if(e.getSource().equals(telaPrincipal.getjButtonProjeto2())){
            
        }else if(e.getSource().equals(telaPrincipal.getjButtonProjeto1())){
            
        } else if(e.getSource().equals(telaPrincipal.getjButtonPerfil())){
            telaPrincipal.dispose();
            ControlePerfilCliente controlePerfilCliente = new ControlePerfilCliente();
           
        } else if(e.getSource().equals(telaPrincipal.getjButtonNotificacoes())){
              
        } 
    }

}
