
package mvc.model.arquiteto;


public class CadastroArquiteto {
    //atributos da classe arquiteto
    private int id;
    private String login;
    private String nomeArquiteto;
    private String Email;
    private String Senha;
    private String telefone;
    private String endereco;
    private String cpf;
    private String numeroCau;
    
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeArquiteto() {
        return nomeArquiteto;
    }

    public void setNomeArquiteto(String nomeArquiteto) {
        this.nomeArquiteto = nomeArquiteto;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getNumeroCau() {
        return numeroCau;
    }

    public void setNumeroCau(String numeroCau) {
        this.numeroCau = numeroCau;
    }
    
    

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }
    
    
}
