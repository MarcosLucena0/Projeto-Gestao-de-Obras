
package mvc.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import mvc.view.TelaPrimaria;


public class ControlePrimario implements ActionListener{
    
    //criando objeto da tela primaria
    private final TelaPrimaria telaPrimaria;
    
    //Metodo construtor
    public ControlePrimario() {

        //instanciando o objeto telaPrimaria
       telaPrimaria = new TelaPrimaria();
        
        //adicionando os listenners nos botões para escutar
       telaPrimaria.getjButtonLoginPrimario().addActionListener(this);
       telaPrimaria.getjButtonCadastresePrimario().addActionListener(this);
       
       //comando para tela ficar no centro 
        this.telaPrimaria.setLocationRelativeTo(null);
        
        telaPrimaria.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(this.telaPrimaria.getjButtonLoginPrimario())){
            //comando que faz a tela anterior sumir e liberar memória
            this.telaPrimaria.dispose();
            //instanciando a nova tela
            ControleLogin controleLogin = new ControleLogin();
        }
        
        else if(e.getSource().equals(this.telaPrimaria.getjButtonCadastresePrimario())){
            //comando que faz a tela anterior sumir e liberar memória
            this.telaPrimaria.dispose();
            //instanciando a nova tela
            ControleEntidade controleEntidade = new ControleEntidade();
        }
    }
    
}
