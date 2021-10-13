
package ModeloDao;

import Conexao.ConexaoBD;
import ModeloBeans.BeansRecuperaSenha;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class DaoRecuperaSenha {
    
    ConexaoBD conecta = new ConexaoBD();
    BeansRecuperaSenha mod = new BeansRecuperaSenha();
    
    public String RetornaPergunta(String nomeusuario) {
        conecta.conexao();
        String pergunta;
        conecta.executaSQL("Select * from usuarios where nome_usuario = '"+nomeusuario+"'");
        
        try {
            pergunta = conecta.rs.getString("pergunta");
            return pergunta;
                    } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar o usuário!\nErro: " +ex);
            
        }
        return null;
    }
    
}
