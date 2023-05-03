
package mvc.controller.arquiteto;

import mvc.controller.arquiteto.ControleCriarProjetoArquiteto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import mvc.view.arquiteto.TelaPrincipalArquiteto;
import projetogestaodeobras.Sessao;


public class ControlePrincipalArquiteto implements ActionListener{
    
    //criando e instanciando objeto
    private final TelaPrincipalArquiteto telaPrincipalArquiteto = new TelaPrincipalArquiteto();
    
    public ControlePrincipalArquiteto() {
        
        telaPrincipalArquiteto.getjButtonCadastrarProjetoArquiteto().addActionListener(this);
        telaPrincipalArquiteto.getjButtonProjetosArquiteto().addActionListener(this);
        telaPrincipalArquiteto.getjButtonProjeto2Arquiteto().addActionListener(this);
        telaPrincipalArquiteto.getjButtonProjeto1Arquiteto().addActionListener(this);
        telaPrincipalArquiteto.getjButtonPerfilArquiteto().addActionListener(this);
        telaPrincipalArquiteto.getjButtonNotificacoesArquiteto().addActionListener(this);
        
        //instanciando a tela
        this.telaPrincipalArquiteto.setLocationRelativeTo(null);
        //telaPrincipalArquiteto.getjLabelNomeArquiteto().setText(Sessao.getCadastroArquiteto().getNomeArquiteto());
        telaPrincipalArquiteto.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        //evento do botao cadastrar projeto
         if(e.getSource().equals(telaPrincipalArquiteto.getjButtonCadastrarProjetoArquiteto())){
             
             telaPrincipalArquiteto.setVisible(false);
            //aparece a tela de cadastro projeto
            ControleCriarProjetoArquiteto controleCriarProjetoArquiteto = new ControleCriarProjetoArquiteto();
            
        } else if(e.getSource().equals(telaPrincipalArquiteto.getjButtonProjetosArquiteto())){
           
        } else if(e.getSource().equals(telaPrincipalArquiteto.getjButtonProjeto2Arquiteto())){
            
        }else if(e.getSource().equals(telaPrincipalArquiteto.getjButtonProjeto1Arquiteto())){
            
        } else if(e.getSource().equals(telaPrincipalArquiteto.getjButtonPerfilArquiteto())){
            telaPrincipalArquiteto.dispose();
            ControlePerfilArquiteto controlePerfilArquiteto = new ControlePerfilArquiteto();
            
        } else if(e.getSource().equals(telaPrincipalArquiteto.getjButtonNotificacoesArquiteto())){
              
        }
        
    }
    
}
