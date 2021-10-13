/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDao;

import Conexao.ConexaoBD;
import ModeloBeans.BeansCadCategorias;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class DaoCadCategorias {
    
    ConexaoBD conecta = new ConexaoBD();
    BeansCadCategorias mod = new BeansCadCategorias();
    
    public void Salvar (BeansCadCategorias mod) {
        conecta.conexao();
        try {
            PreparedStatement pst = conecta.Con.prepareStatement("insert into categorias(nome_categoria,nome_subcategoria) values(?,?)");
            pst.setString(1, mod.getCategoria());
            pst.setString(2, mod.getSubcategoria());
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Categoria inserido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir categoria!"+ex);
        }
        
        conecta.desconexao();
    }
    
    public void Alterar (BeansCadCategorias mod) {
        conecta.conexao();
        try {
            PreparedStatement pst = conecta.Con.prepareStatement("update categorias set nome_categoria=?,nome_subcategoria=? where id_categoria=?");
            pst.setString(1, mod.getCategoria());           
            pst.setString(2, mod.getSubcategoria());
            pst.setInt(3, mod.getID());
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Categoria alterada com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar categoria!"+ex);
        }
        
        conecta.desconexao();
    }
    
     public void Excluir(BeansCadCategorias mod) {
        conecta.conexao();
        try {
            PreparedStatement pst = conecta.Con.prepareStatement("delete from categorias where id_categoria=?");
            pst.setInt(1, mod.getID());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Categoria excluida com sucesso!:");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao excluir categoria!/nErro:"+ex);
        }
                
        conecta.desconexao();
    }
    
    
    
    public BeansCadCategorias BuscaCategoria(BeansCadCategorias mod) {
        conecta.conexao();
        conecta.executaSQL("select *from categorias where nome_categoria like '%"+mod.getPesquisar()+"%'");
        try {
            conecta.rs.first();
            mod.setID(conecta.rs.getInt("id_categoria"));
            mod.setCategoria(conecta.rs.getString("nome_categoria"));
            mod.setSubcategoria(conecta.rs.getString("nome_subcategoria"));
                                 
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Categoria não encontrada no banco de dados!"+ex);
        }      
        
        conecta.desconexao();
        return mod;        
    }
    
}
