
package mvc.controller;

import mvc.controller.cliente.ControlePrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;
import mvc.model.LoginService;
import mvc.view.TelaLogin;
import mvc.view.TelaNovaSenha;
import projetogestaodeobras.Sessao;



public class ControleLogin implements ActionListener, KeyListener{
    
    
    private final LoginService loginService = new LoginService();
    private final TelaLogin telaLogin = new TelaLogin(null, true);
    private final TelaNovaSenha telaNovaSenha = new TelaNovaSenha(null, true);
    

    public ControleLogin() {
        
        //instanciando a tela
        addListeners();
        this.telaLogin.setLocationRelativeTo(null);
        telaLogin.setVisible(true);
        
    }
    
    // adiciona os listeners nos componentes cujos eventos serão gerenciados    
    private void addListeners() {
        telaLogin.getjButtonEntrar().addActionListener(this);
        telaLogin.getjButtonLimpar().addActionListener(this);
        telaLogin.getjButtonEsqueceuSenha().addActionListener(this);
        
        telaLogin.getjTextFieldNomeUsuario().addKeyListener(this);
        telaLogin.getjPasswordFieldSenha2().addKeyListener(this);
        
        telaNovaSenha.getjButtonAlterarSenha().addActionListener(this);
        telaNovaSenha.getjButtonVoltar().addActionListener(this);
    }
    
    

    @Override
    public void actionPerformed(ActionEvent ae) {
        //evento do botao entrar
        if(ae.getSource().equals(telaLogin.getjButtonEntrar())){
            //chama o metodo de entrar
            handleButtonEntrar();   
        }  
        //evento do botaolimpar campos
        else if(ae.getSource().equals(telaLogin.getjButtonLimpar())){
            //chama o metodo de limpar
            handleButtonLimpar();
        } 
        //evento do botao esqueceu senha
        else if(ae.getSource().equals(telaLogin.getjButtonEsqueceuSenha())){
            //tela login sai e aparece a de escrever o email
            telaLogin.setVisible(false);
            ControleEmailRecuperar emailRecuperar = new ControleEmailRecuperar();
        } 
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getSource().equals(telaLogin.getjTextFieldNomeUsuario()) || 
                e.getSource().equals(telaLogin.getjPasswordFieldSenha2())){
            
            if(e.getKeyCode() == KeyEvent.VK_ENTER){
                handleButtonEntrar();
            }
            
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
       
    }
    
    public void handleButtonEntrar(){
        
        //if que verifica se os campos de email e senha estao no banco de dados para entrar
        if(loginService.checkAccess(telaLogin.getjTextFieldNomeUsuario().getText(), telaLogin.getjPasswordFieldSenha2().getText())){
            telaLogin.dispose();
        //aparece a tela principal
        ControlePrincipal controlePrincipal = new ControlePrincipal();
        } 
        //caso não tenha no banco, aparece uma mensagem
        else{
            JOptionPane.showMessageDialog(telaLogin, "Nome de Usuário e/ou Senha incorreto(s)!", "Acesso Negado",0);            
        }
        
    }
    
    //metodo que fecha o programa
    public void handleButtonSair(){
        System.exit(0);
    }
    
    //metodo que limpa os campos
    public void handleButtonLimpar(){
        telaLogin.cleanFields();
    }

    
}
