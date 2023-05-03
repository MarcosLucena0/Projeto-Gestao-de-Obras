
package mvc.model.cliente;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import mvc.model.Conexao;
import projetogestaodeobras.Sessao;

public class CadastroDAOCliente {
    
    //Cadastrar Cliente
    public void cadastrarCliente(CadastroCliente cadastro){
        
        try{
            //codigo INSERT que salva no banco
            String sql= "INSERT INTO cliente (nome_usuario,email,senha, endereco, telefone, cpf) VALUES (?,?,md5(?),?,?,?)";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(sql);
            
            pst.setString(1, cadastro.getNomeUsuario());
            pst.setString(2, cadastro.getEmail());
            pst.setString(3, cadastro.getSenha());
            pst.setString(4, cadastro.getEndereco());
            pst.setString(5, cadastro.getTelefone());
            pst.setString(6, cadastro.getCpf());
            
            
            pst.execute();
            pst.close();
        } catch(SQLException ex){
            System.out.println(ex);
        }
        
    }
    
    public CadastroCliente loginUser(String email, String senha){
        
        String sql = "SELECT * FROM cliente WHERE email = ? AND senha = md5(?)";
        CadastroCliente cadastro = new CadastroCliente();
        
        PreparedStatement pst;
        ResultSet rs;
        
        try{
            pst = Conexao.getConnection().prepareStatement(sql);
            pst.setString(1, email);
            pst.setString(2, senha);
            rs = pst.executeQuery();

            while(rs.next()){
                cadastro.setId(rs.getInt("id"));
                cadastro.setNomeUsuario(rs.getString("nome_usuario"));
                cadastro.setEmail(rs.getString("email"));
                //cadastro.setEmail(rs.getString("senha"));
                cadastro.setEndereco(rs.getString("endereco"));
                cadastro.setTelefone(rs.getString("telefone"));
                cadastro.setCpf(rs.getString("cpf"));
                Sessao.setCadastroCliente(cadastro);
            }

            rs.close();
            pst.close();
        } catch(SQLException e){
            throw new RuntimeException(e);
        }
        
        return cadastro;
  
    }
    
    public CadastroCliente emailRecupera(String email){
        
        String sql = "SELECT * FROM cliente WHERE email = ?";
        CadastroCliente cadastro = new CadastroCliente();
        
        PreparedStatement pst;
        ResultSet rs;
        
        try{
            pst = Conexao.getConnection().prepareStatement(sql);
            pst.setString(1, email);
            
            rs = pst.executeQuery();

            while(rs.next()){
                cadastro.setId(rs.getInt("id"));
                
                cadastro.setSenha(rs.getString("email"));
              
            }

            rs.close();
            pst.close();
        } catch(SQLException e){
            throw new RuntimeException(e);
        }
        
        return cadastro;
  
    }
    
    // pesquisar por nome
    public CadastroCliente findbyNome(String email){
        String sql = "SELECT * FROM cliente WHERE email LIKE ?";
        
        CadastroCliente usuario = new CadastroCliente();
        
        usuario.setEmail("");
        
        PreparedStatement pst;
        ResultSet rs;
        
        try {
            pst = Conexao.getConnection().prepareStatement(sql);
            pst.setString(1, email);
            rs = pst.executeQuery();
            
            while(rs.next()){
                
                usuario.setEmail(rs.getString("email"));
            }
            
            rs.close();
            pst.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
        return usuario;
    }
    
    //altera a senha no banco
    public void alteraSenha(CadastroCliente cadastro){
        
        String sql = "UPDATE cliente SET senha = md5(?) WHERE email LIKE ?";
        
        PreparedStatement pst;
        try {
            pst = Conexao.getConnection().prepareStatement(sql);
            pst.setString(1, cadastro.getSenha());
            pst.setString(2, cadastro.getEmail());
            pst.execute();
            pst.close();              
        } catch (SQLException ex) {
            System.out.println(ex);
        }  
    }
    
    
    //metodo editar cliente
    public void editarCliente(CadastroCliente usuario) {
         
             //codigo UPDATE para editar o cliente cadastrado
                String sql= "UPDATE  cliente SET nome_usuario = ?, email = ?,"
                        + "endereco = ?, telefone = ?, cpf = ? WHERE id = ?";
            PreparedStatement pst;
            try{
            pst = Conexao.getConnection().prepareStatement(sql);
            pst.setString(1, usuario.getNomeUsuario());
            pst.setString(2, usuario.getEmail());
            pst.setString(3, usuario.getEndereco());
            pst.setString(4, usuario.getTelefone());
            pst.setString(5, usuario.getCpf());
            pst.setInt(6, usuario.getId());
            
            pst.execute();
            pst.close();
        } catch(SQLException ex){
            System.out.println(ex);
        }
    }
}
