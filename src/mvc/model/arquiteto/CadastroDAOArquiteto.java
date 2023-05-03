
package mvc.model.arquiteto;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import mvc.model.Conexao;

public class CadastroDAOArquiteto {
    
    public void cadastrarArquiteto(CadastroArquiteto cadastro){
        
        try{
            //codigo INSERT que salva no banco
            String sql= "INSERT INTO arquiteto (nome,email,cpf, telefone, endereco,numero_cau, senha) VALUES (?,?,?,?,?,?,md5(?))";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(sql);
            
            pst.setString(1, cadastro.getNomeArquiteto());
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

    public void editarArquiteto(CadastroArquiteto editar) {
        //codigo UPDATE para editar o arquiteto cadastrado
                String sql= "UPDATE  arquiteto SET nome_arquiteto = ?, email = ?,"
                        + "cpf = ?, numero_cau = ?, telefone = ? WHERE id = ?";
            PreparedStatement pst;
            try{
            pst = Conexao.getConnection().prepareStatement(sql);
            pst.setString(1, editar.getNomeArquiteto());
            pst.setString(2, editar.getEmail());
            pst.setString(3, editar.getCpf());
            pst.setString(4, editar.getNumeroCau());
            pst.setString(5, editar.getTelefone());
            pst.setInt(6, editar.getId());
            
            pst.execute();
            pst.close();
    }catch(SQLException ex){
            System.out.println(ex);
    } 
}
}
