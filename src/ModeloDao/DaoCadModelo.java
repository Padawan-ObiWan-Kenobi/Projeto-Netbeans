/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDao;

import Conexao.ConexaoBD;
import ModeloBeans.BeansCadUsuario;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class DaoCadModelo {
    
    ConexaoBD conecta = new ConexaoBD();
    BeansCadUsuario mod = new BeansCadUsuario();
    
    public void Salvar (BeansCadUsuario mod) {
        conecta.conexao();
        try {
            PreparedStatement pst = conecta.Con.prepareStatement("insert into usuarios(datacadastro_usuario,nome_usuario,tipo_usuario,senha_usuario) values(?,?,?,?)");
            pst.setString(1, mod.getDataCadastro());
            pst.setString(2, mod.getUsuario());
            pst.setString(3, mod.getTipoUsuario());
            pst.setString(4, mod.getSenha());
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Usuário inserido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir usuário!"+ex);
        }
        
        conecta.desconexao();
    }
    
    public void Alterar (BeansCadUsuario mod) {
        conecta.conexao();
        try {
            PreparedStatement pst = conecta.Con.prepareStatement("update usuarios set datacadastro_usuario=?,nome_usuario=?,tipo_usuario=?,senha_usuario=? where id_usuario=?");
            pst.setString(1, mod.getDataCadastro());           
            pst.setString(2, mod.getUsuario());
            pst.setString(3, mod.getTipoUsuario());
            pst.setString(4, mod.getSenha());            
            pst.setInt(5, mod.getID());
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Usuário alterado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar usuário!"+ex);
        }
        
        conecta.desconexao();
    }
    
     public void Excluir(BeansCadUsuario mod) {
        conecta.conexao();
        try {
            PreparedStatement pst = conecta.Con.prepareStatement("delete from usuarios where id_usuario=?");
            pst.setInt(1, mod.getID());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Usuário excluido com sucesso!:");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao excluir usuário!/nErro:"+ex);
        }
                
        conecta.desconexao();
    }
    
    
    
    public BeansCadUsuario BuscaUsuario(BeansCadUsuario mod) {
        conecta.conexao();
        conecta.executaSQL("select *from usuarios where nome_usuario like '%"+mod.getPesquisar()+"%'");
        try {
            conecta.rs.first();
            mod.setID(conecta.rs.getInt("id_usuario"));
            mod.setDataCadastro(conecta.rs.getString("datacadastro_usuario"));
            mod.setUsuario(conecta.rs.getString("nome_usuario"));
            mod.setTipoUsuario(conecta.rs.getString("tipo_usuario"));
            mod.setSenha(conecta.rs.getString("senha_usuario"));
            
                        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Usuário não encontrado no banco de dados!"+ex);
        }      
        
        conecta.desconexao();
        return mod;        
    }
    
}
