
package mvc.model.engenheiro;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import mvc.model.Conexao;
import mvc.model.cliente.CadastroCliente;


public class CadastroDaoEngenheiro {
    
    //Cadastrar Cliente
    public void cadastrarEngenheiro(CadastroEngenheiro cadastro){
        
        try{
            //codigo INSERT que salva no banco
            String sql= "INSERT INTO engenheiro (nome,email,cpf, telefone, endereco, numero_cau, senha) VALUES (?,?,?,?,?,?,md5(?))";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(sql);
            
            pst.setString(1, cadastro.getNome());
            pst.setString(2, cadastro.getEmail());
            pst.setString(3, cadastro.getCpf());
            pst.setString(4, cadastro.getTelefone());
            pst.setString(5, cadastro.getEndereco());
            pst.setString(6, cadastro.getNumeroCau());
            pst.setString(7, cadastro.getSenha());
            
            
            pst.execute();
            pst.close();
        } catch(SQLException ex){
            System.out.println(ex);
        }
        
    }
    
    
}
