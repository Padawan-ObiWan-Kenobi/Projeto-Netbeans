/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDao;

import Conexao.ConexaoBD;
import ModeloBeans.BeansCadProdutos;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Jhonny_Queillia
 */
public class DaoCadProdutos {
    
    ConexaoBD conecta = new ConexaoBD();
    BeansCadProdutos mod = new BeansCadProdutos();    
    int IDFornecedor;            
    
    public void buscaIDFornecedor(String nome) {
        conecta.conexao();
        conecta.executaSQL("select *from fornecedores where razaosocial_fornecedor ='"+nome+"'");
        try {
            conecta.rs.first();
            IDFornecedor=conecta.rs.getInt("id_fornecedor");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar fornecedor!"+ex);
        }
        
        conecta.desconexao();
    }
    
    
    public void Salvar (BeansCadProdutos mod) {        
        conecta.conexao();
        try {
            PreparedStatement pst = conecta.Con.prepareStatement("insert into produtos(datacadastro_produto,descricao_produto,unidade_produto,fabricante_produto,categoria_produto,precocusto_produto,precovenda_produto,qtdeatual_produto,qtdeminima_produto,id_fornecedor_produto,fornecedor_produto) values(?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, mod.getDataCadastro());
            pst.setString(2, mod.getDescricao());
            pst.setString(3, mod.getUnidade());
            pst.setString(4, mod.getFabricante());
            pst.setString(5, mod.getCategoria());
            pst.setFloat(6, mod.getPrecoCusto());            
            pst.setFloat(7, mod.getPrecoVenda());
            pst.setInt(8, mod.getQtdeAtual());
            pst.setInt(9, mod.getQtdeMinima());
            pst.setInt(10, mod.getIDFornecedor());
            pst.setString(11, mod.getFornecedor());                      
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Dados Gravados com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao gravar os dados!"+ex);
        }
        
        conecta.desconexao();
    }
    
    public void Alterar (BeansCadProdutos mod) {
        conecta.conexao();
        try {
            PreparedStatement pst = conecta.Con.prepareStatement("update produtos set datacadastro_produto=?,descricao_produto=?,unidade_produto=?,fabricante_produto=?,categoria_produto=?,precocusto_produto=?,precovenda_produto=?,qtdeatual_produto=?,qtdeminima_produto=?,id_fornecedor_produto=?,fornecedor_produto=? where id_produto=?");
            pst.setString(1, mod.getDataCadastro());           
            pst.setString(2, mod.getDescricao());
            pst.setString(3, mod.getUnidade());
            pst.setString(4, mod.getFabricante());
            pst.setString(5, mod.getCategoria());
            pst.setFloat(6, mod.getPrecoCusto());            
            pst.setFloat(7, mod.getPrecoVenda());
            pst.setInt(8, mod.getQtdeAtual());
            pst.setInt(9, mod.getQtdeMinima());
            pst.setInt(10, mod.getIDFornecedor());
            pst.setString(11, mod.getFornecedor());
            pst.setInt(12, mod.getIDProduto());            
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Dados Alterados com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao gravar os dados!"+ex);
        }
        
        conecta.desconexao();
    }
    
     public void Excluir(BeansCadProdutos mod) {
        conecta.conexao();
        try {
            PreparedStatement pst = conecta.Con.prepareStatement("delete from produtos where id_produto=?");
            pst.setInt(1, mod.getIDProduto());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Produto excluido com sucesso!:");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao excluir produto!/nErro:"+ex);
        }
                
        conecta.desconexao();
    }
    
    
    
    public BeansCadProdutos Buscaproduto(BeansCadProdutos mod) {
        conecta.conexao();
        conecta.executaSQL("select *from produtos where descricao_produto like '%"+mod.getPesquisar()+"%'");
        try {
            conecta.rs.first();
            mod.setIDProduto(conecta.rs.getInt("id_produto"));
            mod.setDataCadastro(conecta.rs.getString("datacadastro_produto"));
            mod.setDescricao(conecta.rs.getString("descricao_produto"));
            mod.setUnidade(conecta.rs.getString("unidade_produto"));
            mod.setFabricante(conecta.rs.getString("fabricante_produto"));
            mod.setCategoria(conecta.rs.getString("categoria_produto"));
            mod.setPrecoCusto(conecta.rs.getFloat("precocusto_produto"));
            mod.setPrecoVenda(conecta.rs.getFloat("precovenda_produto"));
            mod.setQtdeAtual(conecta.rs.getInt("qtdeatual_produto"));
            mod.setQtdeMinima(conecta.rs.getInt("qtdeminima_produto"));
            //mod.setCelular(conecta.rs.getString("celular_cliente"));
            //mod.setEmail(conecta.rs.getString("email_cliente"));
            
                        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Produto não encontrado no banco de dados!"+ex);
        }      
        
        conecta.desconexao();
        return mod;        
    }

    
}
