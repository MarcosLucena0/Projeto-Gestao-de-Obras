
package mvc.model.cliente;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import mvc.model.Conexao;


public class CadastroDAOProjeto {
    
    public void cadastrarProjeto(CadastroProjeto cadastroProjeto){
        
        try{
            //codigo INSERT que salva no banco
            String sql= "INSERT INTO projetos_cliente (nome, endereco) VALUES (?,?)";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(sql);
            
            pst.setString(1, cadastroProjeto.getNomeProjeto());
            pst.setString(2, cadastroProjeto.getEndereco());
            
            
            pst.execute();
            pst.close();
        } catch(SQLException ex){
            System.out.println(ex);
        }
        
    }
    
}
