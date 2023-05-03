/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Conexao {
    
    private static Connection connection;
    
    //metodo para conexao com o banco
    public static Connection getConnection(){
        
        if(connection == null){
            try {
                // passando os dados para conexão do banco
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco_gestao_obras","root","socratesff10");
            } catch (SQLException ex) {
                //Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
                //JOptionPane para alertar que a conexão não foi realizada 
                JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados!",
                        "Erro", JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
                
            }
        }
        return connection;
    }
    
}
