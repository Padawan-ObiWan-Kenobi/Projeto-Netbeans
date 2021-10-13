/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDao;

import Conexao.ConexaoBD;
import ModeloBeans.BeansVendaCaixa;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class DaoVendaCaixa {
    
    ConexaoBD conecta = new ConexaoBD();
    BeansVendaCaixa mod = new BeansVendaCaixa();
    int IDProduto;
    int IDCliente;
    int IDvenda;
    
    
    public void LocalizaCliente(String nome) {
        conecta.conexao();
        try {
            conecta.executaSQL("select *from clientes where nome_cliente='"+nome+"'");
            conecta.rs.first();
            IDCliente = conecta.rs.getInt("id_cliente");
            
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao localizar cliente!"+ex);
        }
        
        conecta.desconexao();
    }
    
    public void LocalizarIDProduto (String nome) {
        conecta.conexao();
        conecta.executaSQL("select * from produtos where descricao_produto='"+nome+"'");
        try {
            conecta.rs.first();
            IDProduto = conecta.rs.getInt("id_produto");
            conecta.desconexao();
        } catch (SQLException ex) {
            conecta.desconexao();
            JOptionPane.showMessageDialog(null, "Erro:"+ex);
        }
        
        
    }
    
    public void AdicionaItem (BeansVendaCaixa mod) {
        //LocalizarIDProduto(mod.getProduto());
        conecta.conexao();
        try {            
            PreparedStatement pst = conecta.Con.prepareStatement("insert into itens_venda(id_venda,id_produto,qtde_produto)values(?,?,?)");
            pst.setInt(1, mod.getIdVenda());
            //pst.setInt(2, IDProduto);
            pst.setInt(2, mod.getIdProduto());
            pst.setInt(3, mod.getQtdeProduto());
            //pst.setInt(4, mod.getQtdeItens());
            pst.execute();    
            
            //Atualizar quantidade de itens
            
            /*int QtdItens = 0;
            int soma = 0; 
            conecta.executaSQL("select *from itens_venda where qtde_itens='"+mod.getQtdeItens()+"'");
            conecta.rs.first();
            QtdItens = conecta.rs.getInt("qtde_itens");
            soma = QtdItens + mod.getQtdeItens();
            pst = conecta.Con.prepareStatement("update itens_venda set qtde_itens=? where id_produto=?");
            pst.setInt(1, soma);
            pst.setInt(2, mod.getIdProduto());
            pst.execute();         */
            
            //Baixa de Estoque
            
            int quant = 0;
            int resul = 0;
            conecta.executaSQL("select *from produtos where descricao_produto='"+mod.getProduto()+"'");
            conecta.rs.first();
            quant = conecta.rs.getInt("qtdeatual_produto");
            resul = quant - mod.getQtdeProduto();
            pst = conecta.Con.prepareStatement("update produtos set qtdeatual_produto=? where descricao_produto=?");
            pst.setInt(1, resul);
            pst.setString(2, mod.getProduto());
            pst.execute();         
            
            JOptionPane.showMessageDialog(null, "Produto adicionado com sucesso!");
            
            conecta.desconexao();
            
        } catch (SQLException ex) {
            conecta.desconexao();
            JOptionPane.showMessageDialog(null, "Erro ao realizar a venda:"+ex);
        }
                
    }
    
    public void QtdeItens (BeansVendaCaixa mod) {        
        conecta.conexao();
        try {
            PreparedStatement pst = conecta.Con.prepareStatement("update itens_venda set qtde_itens=? where id_venda=?");
            pst.setInt(1, mod.getQtdeItens());           
            pst.setInt(2, mod.getIdVenda());
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Venda finalizada com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao finalizar a venda!"+ex);
        }
    }    
    
    public void FinalizarVenda (BeansVendaCaixa mod) {
        LocalizaCliente(mod.getCliente());
        conecta.conexao();
        try {
            PreparedStatement pst = conecta.Con.prepareStatement("update vendas set data_venda=?,valor_venda=?,id_cliente=?,tipo_pagamento=? where id_venda=?");
            pst.setString(1, mod.getDataVenda());
            pst.setFloat(2, mod.getValorVenda());
            pst.setInt(3, IDCliente);
            pst.setString(4, mod.getFormaPagto());
            pst.setInt(5, mod.getIdVenda());
            
            pst.execute();
            
            //JOptionPane.showMessageDialog(null, "Venda finalizada com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao finalizar a venda!"+ex);
        }
        
        conecta.desconexao();
    }   
    
    public void CancelarVenda() {
        conecta.conexao();
        PreparedStatement pst;
        conecta.executaSQL("select * from vendas inner join itens_venda on vendas.id_venda = itens_venda.id_venda inner join produtos on itens_venda.id_produto = produtos.id_produto where valor_venda = 0");
               
        try {
            conecta.rs.first();
            do{
                int QtdProduto = conecta.rs.getInt("qtdeatual_produto");
                int QtdVendida = conecta.rs.getInt("qtde_produto");
                int soma = QtdProduto+QtdVendida;
                pst = conecta.Con.prepareStatement("update produtos set qtdeatual_produto=? where id_produto=?");
                pst.setInt(1, soma);
                pst.setInt(2, conecta.rs.getInt("id_produto"));
                pst.execute();
                
                pst = conecta.Con.prepareStatement("delete from itens_venda where id_venda=?");
                pst.setInt(1, conecta.rs.getInt("id_venda"));
                pst.execute();
                
            }while(conecta.rs.next());
                    
            pst = conecta.Con.prepareStatement("delete from vendas where valor_venda=?");
            pst.setInt(1, 0);
            pst.execute();
            //JOptionPane.showMessageDialog(null,"Usuário excluido com sucesso!:");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao cancelar a venda!/nErro:"+ex);
        }
                
        conecta.desconexao();
    }
    
    public void ExcluirItem(BeansVendaCaixa mod) {
        conecta.conexao();
        conecta.executaSQL("select * from itens_venda inner join produtos on itens_venda.id_produto = produtos.id_produto");
        try {
            PreparedStatement pst = conecta.Con.prepareStatement("delete from itens_venda where id_produto=?");
            pst.setInt(1, mod.getItemDeletado());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Item excluido com sucesso!:");
                                   
            conecta.rs.first();
            do{
                int QtdProduto = conecta.rs.getInt("qtdeatual_produto");
                int QtdVendida = conecta.rs.getInt("qtde_produto");
                int soma = QtdProduto+QtdVendida;
                pst = conecta.Con.prepareStatement("update produtos set qtdeatual_produto=? where id_produto=?");
                pst.setInt(1, soma);
                pst.setInt(2, conecta.rs.getInt("id_produto"));
                pst.execute();
                                              
            }while(conecta.rs.next());
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao excluir item!/nErro:"+ex);
        }
                
        conecta.desconexao();
        
}
    }
    
    /*public void DeletarItemVenda(BeansVendaCaixa mod) {    
        //LocalizarIDProduto(mod.getProduto());
        conecta.conexao();
        PreparedStatement pst;
        conecta.executaSQL("select * from itens_venda inner join produtos on itens_venda.id_produto = produtos.id_produto where itens_venda.id_produto = ?");
               
        try {
            //IDvenda = conecta.rs.getInt("id_venda");
            
            conecta.rs.first();
            do{           
                int QtdProduto = conecta.rs.getInt("qtdeatual_produto");
                int QtdVendida = conecta.rs.getInt("qtde_produto");
                int soma = QtdProduto+QtdVendida;
                pst = conecta.Con.prepareStatement("update produtos set qtdeatual_produto=? where id_produto=?");
                pst.setInt(1, soma);
                pst.setInt(2, conecta.rs.getInt("id_produto"));
                pst.execute();
                
                pst = conecta.Con.prepareStatement("delete from itens_venda where id_venda=?");
                //pst.setInt(1, mod.getIdVenda());
                pst.setInt(1, conecta.rs.getInt("id_venda"));                
                pst.execute();
            }while(conecta.rs.next());    
                        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao cancelar a venda!/nErro:"+ex);
        }
                       
        conecta.desconexao();
    
    }
    
    public void ExcluirItem(BeansVendaCaixa mod) {
        LocalizarIDProduto(mod.getProduto());
        conecta.conexao();
        //PreparedStatement pst;
        //conecta.executaSQL("select * from itens_venda inner join produtos on itens_venda.id_produto = produtos.id_produto where id_venda ="+IDvenda);
        //JOptionPane.showMessageDialog(null,"Testando!:");
        try {
            PreparedStatement pst = conecta.Con.prepareStatement("delete from itens_venda where id_produto=?");
            pst.setInt(1, mod.getQtdeItens());
            pst.execute();
           
            int QtdProduto = conecta.rs.getInt("qtdeatual_produto");
            int QtdVendida = conecta.rs.getInt("qtde_produto");
            int soma = QtdProduto+QtdVendida;
            pst = conecta.Con.prepareStatement("update produtos set qtdeatual_produto=? where id_produto=?");
            pst.setInt(1, soma);
            pst.setInt(2, conecta.rs.getInt("id_produto"));
            pst.execute();
            /*JOptionPane.showMessageDialog(null,"Testando 2!:");
            pst = conecta.Con.prepareStatement("delete from itens_venda where id_produto=?");
            //pst.setInt(1, mod.getIdVenda());
            pst.setInt(1, mod.getIdProduto());
            pst.execute();*/
           
        
    
    /*public void DeletarItem(BeansVendaCaixa mod) {               
        LocalizarIDProduto(mod.getProduto());
        conecta.conexao();
        try {
            PreparedStatement pst = conecta.Con.prepareStatement("delete * from itens_venda(id_venda,id_produto,qtde_produto)values(?,?,?)");
            pst.setInt(1, mod.getIdVenda());
            pst.setInt(2, IDProduto);
            pst.setInt(3, mod.getQtdeProduto());
            pst.execute();     
            
            //Retornar ao Estoque
            
            int quant = 0;
            int resul = 0;
            conecta.executaSQL("select * from produtos where descricao_produto='"+mod.getProduto()+"'");
            conecta.rs.first();
            quant = conecta.rs.getInt("qtdeatual_produto");
            resul = quant + mod.getQtdeProduto();
            pst = conecta.Con.prepareStatement("update produtos set qtdeatual_produto=? where descricao_produto=?");
            pst.setInt(1, resul);
            pst.setString(2, mod.getProduto());
            pst.execute();         
            
            JOptionPane.showMessageDialog(null, "Produto estornado ao estoque com sucesso!");
            
            conecta.desconexao();
            
        } catch (SQLException ex) {
            conecta.desconexao();
            JOptionPane.showMessageDialog(null, "Erro ao estornar o produto ao estoque:"+ex);
        }
        
        
        
    }
    
    
    
    
    
    public void Alterar (BeansVendaCaixa mod) {
        conecta.conexao();
        try {
            PreparedStatement pst = conecta.Con.prepareStatement("update usuarios set datacadastro_usuario=?,nome_usuario=?,tipo_usuario=?,senha_usuario=? where id_usuario=?");
            //pst.setString(1, mod.getDataCadastro());           
            //pst.setString(2, mod.getUsuario());
            //pst.setString(3, mod.getTipoUsuario());
            //pst.setString(4, mod.getSenha());            
            //pst.setInt(5, mod.getID());
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Usuário alterado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar usuário!"+ex);
        }
        
        conecta.desconexao();
    }
    
     
    
    
    
    public BeansVendaCaixa BuscaPrecoProduto(BeansVendaCaixa mod) {
        conecta.conexao();
        conecta.executaSQL("select *from produtos where precovenda_produto like '%"+mod.getPesquisar()+"%'");
        try {
            conecta.rs.first();
            mod.setPrecoProduto(conecta.rs.getFloat("precovenda_produto"));
            //mod.setDataCadastro(conecta.rs.getString("datacadastro_usuario"));
            //mod.setUsuario(conecta.rs.getString("nome_usuario"));
            //mod.setTipoUsuario(conecta.rs.getString("tipo_usuario"));
            //mod.setSenha(conecta.rs.getString("senha_usuario"));
            
                        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Produto não encontrado no banco de dados!"+ex);
        }      
        
        conecta.desconexao();
        return mod;        
    }*/
    

