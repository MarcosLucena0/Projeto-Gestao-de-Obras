
package mvc.model.prestadordeservico;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import mvc.model.Conexao;

public class CadastroDAOPrestadorDeServicos {
     public void cadastrarPrestadorDeServicos(CadastroPrestadorDeServicos cadastro){
        
        try{
            //codigo INSERT que salva no banco
            String sql= "INSERT INTO prestador_servico (nome,email,cpf, telefone, endereco, senha) VALUES (?,?,?,?,?,md5(?))";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(sql);
            
            pst.setString(1, cadastro.getNomePrestadorDeServicos());
            pst.setString(2, cadastro.getEmail());
            pst.setString(3, cadastro.getCpf());
            pst.setString(4, cadastro.getTelefone());
            pst.setString(5, cadastro.getEndereco());
            pst.setString(6, cadastro.getSenha());
            
            
            pst.execute();
            pst.close();
        } catch(SQLException ex){
            System.out.println(ex);
        }
        
    }
    
}
