
package projetogestaodeobras;

import mvc.model.arquiteto.CadastroArquiteto;
import mvc.model.cliente.CadastroCliente;


public class Sessao {
    
    public static CadastroCliente cadastroCliente;
    public static CadastroArquiteto cadastroArquiteto;
    
    
    public static CadastroArquiteto getCadastroArquiteto() {
        return cadastroArquiteto;
    }
    
    public static void setCadastroArquiteto(CadastroArquiteto cadastroArquiteto) {
        Sessao.cadastroArquiteto = cadastroArquiteto;
    }
    
    public static CadastroCliente getCadastroCliente() {
        return cadastroCliente;
    }

    public static void setCadastroCliente(CadastroCliente cadastroCliente) {
        Sessao.cadastroCliente = cadastroCliente;
    }
   
    
}
