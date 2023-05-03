
package mvc.model;

import mvc.model.cliente.CadastroCliente;
import mvc.model.cliente.CadastroDAOCliente;

public class LoginService {
    
    private final CadastroDAOCliente cadastroDAO = new CadastroDAOCliente();
    private int recoveryCode = 0;
    private String emailUsuario = "";
    private String useremail;

    public boolean checkAccess(String email, String senha){
        return(cadastroDAO.loginUser(email, senha).getId()>0);            
    }
    
    //metodo que verifica se o email esta salvo no banco
    public boolean checkAccessRecupera(String email){
        return(cadastroDAO.emailRecupera(email).getId()>0);            
    }
    
    public boolean checkUserbyName(String emailUsuario){
        useremail = emailUsuario;
        CadastroCliente cadastro = cadastroDAO.findbyNome(emailUsuario);
        return cadastro.getEmail().equals(emailUsuario);
    }
    
    //metoodo que envia o codigo randomico na barra de erros
    public void enviarCodigo() {
        recoveryCode = generateRecoveryCode();
        System.out.println(recoveryCode);        
    }
    
    //calculo do codigo
    private int generateRecoveryCode(){
        return (int) (Math.random() * 1000000);
    }
    
    //metodo que adiciona o codigo gerado a um atrubuto
    public boolean verificarCodigoDeRecuperacao(String textCode) {
        
        if(textCode.equals("")){
            
            return false;
            
        } else {
            
            int codigo = Integer.parseInt(textCode);
            
            return (codigo==recoveryCode);
        }
        
    }
    
    //metodo que vai alterar a senha no banco
    public void alterarSenha(String novaSenha, String email) {
        CadastroCliente cadastro = new CadastroCliente();
        cadastro.setEmail(email);
        cadastro.setSenha(novaSenha);
        cadastroDAO.alteraSenha(cadastro);
    }
    
    /*public void editarCliente(String nome, String email,String telefone, String endereco,String cpf) {
        CadastroCliente editar = new CadastroCliente();
        editar.setNomeUsuario(nome);
        editar.setEmail(email);
        editar.setTelefone(telefone);
        editar.setEndereco(endereco);
        editar.setCpf(cpf);
        cadastroDAO.editarCliente(editar);
    }*/
   
    
}
