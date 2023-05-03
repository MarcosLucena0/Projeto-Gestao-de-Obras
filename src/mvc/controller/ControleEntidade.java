
package mvc.controller;

import mvc.controller.arquiteto.ControleCadastroArquiteto;
import mvc.controller.cliente.ControleCadastroCliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import mvc.controller.engenheiro.ControleCadastroEngenheiro;
import mvc.controller.prestadordeservico.ControleCadastroPrestadorDeServicos;
import mvc.view.TelaEntidade;


public class ControleEntidade implements ActionListener{
    
    //criando e instanciando o objeto
    private final TelaEntidade telaEntidade = new TelaEntidade();
    
    public ControleEntidade() {
        
        //adicionando os listenners nos botões para escutar
        telaEntidade.getjButtonCliente().addActionListener(this);
        telaEntidade.getjButtonArquiteto().addActionListener(this);
        telaEntidade.getjButtonEngenheiro().addActionListener(this);
        telaEntidade.getjButtonPrestServico().addActionListener(this);
        telaEntidade.getjButtonVoltarEntidade().addActionListener(this);
        
        //comando para tela ficar no centro 
        this.telaEntidade.setLocationRelativeTo(null);
        
        telaEntidade.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(this.telaEntidade.getjButtonCliente())){
            //comando que faz a tela anterior sumir e liberar memória
            telaEntidade.setVisible(false);
            //instanciando a nova tela
            ControleCadastroCliente controleCadastro = new ControleCadastroCliente( null);
        }
        else if(e.getSource().equals(this.telaEntidade.getjButtonArquiteto())){
            //comando que faz a tela anterior sumir e liberar memória
            telaEntidade.setVisible(false);
            //instanciando a nova tela
            ControleCadastroArquiteto cadastroArquiteto1 = new ControleCadastroArquiteto(false, null);
        }
        else if(e.getSource().equals(this.telaEntidade.getjButtonEngenheiro())){
            //comando que faz a tela anterior sumir e liberar memória
            telaEntidade.setVisible(false);
            //instanciando a nova tela
            ControleCadastroEngenheiro cadastroEngenheiro = new ControleCadastroEngenheiro(null);
        }
        else if(e.getSource().equals(this.telaEntidade.getjButtonPrestServico())){
            //comando que faz a tela anterior sumir e liberar memória
            telaEntidade.setVisible(false);
            //instanciando a nova tela
            ControleCadastroPrestadorDeServicos cadastroPrestadorDeServicos = new ControleCadastroPrestadorDeServicos(null);
        }
        else if(e.getSource().equals(this.telaEntidade.getjButtonVoltarEntidade())){
            //comando que faz a tela anterior sumir e liberar memória
            this.telaEntidade.dispose();
            //instanciando a nova tela
            ControlePrimario controlePrimario= new ControlePrimario();
        }
        
    }
    
}
