/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDao;

import Conexao.ConexaoBD;
import ModeloBeans.BeansCadFornecedores;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Jhonny_Queillia
 */
public class DaoCadFornecedores {
    
    ConexaoBD conecta = new ConexaoBD();
    BeansCadFornecedores mod = new BeansCadFornecedores();
    
    public void Salvar (BeansCadFornecedores mod) {
        conecta.conexao();
        try {
            PreparedStatement pst = conecta.Con.prepareStatement("insert into fornecedores(razaosocial_fornecedor,cnpj_fornecedor,datacadastro_fornecedor,nomefantasia_fornecedor,contato_fornecedor,endereco_fornecedor,numero_fornecedor,complemento_fornecedor,bairro_fornecedor,cep_fornecedor,cidade_fornecedor,estado_fornecedor,email_fornecedor,telefone_fornecedor,celular_fornecedor) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, mod.getRazaoSocial());
            pst.setString(2, mod.getCNPJ());
            pst.setString(3, mod.getDataCadastro());            
            pst.setString(4, mod.getNomeFantasia());
            pst.setString(5, mod.getContato());
            pst.setString(6, mod.getEndereco());
            pst.setInt(7, mod.getNumero());            
            pst.setString(8, mod.getComplemento());
            pst.setString(9, mod.getBairro());
            pst.setString(10, mod.getCEP());
            pst.setString(11, mod.getCidade());
            pst.setString(12, mod.getEstado());
            pst.setString(13, mod.getEmail());            
            pst.setString(14, mod.getTelefone());
            pst.setString(15, mod.getCelular());            
            
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Dados Gravados com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao gravar os dados!"+ex);
        }
        
        conecta.desconexao();
    }
    
    public void Alterar (BeansCadFornecedores mod) {
        conecta.conexao();
        try {
            PreparedStatement pst = conecta.Con.prepareStatement("update fornecedores set razaosocial_fornecedor=?,cnpj_fornecedor=?,datacadastro_fornecedor=?,nomefantasia_fornecedor=?,contato_fornecedor=?,endereco_fornecedor=?,numero_fornecedor=?,complemento_fornecedor=?,bairro_fornecedor=?,cep_fornecedor=?,cidade_fornecedor=?,estado_fornecedor=?,email_fornecedor=?,telefone_fornecedor=?,celular_fornecedor=? where id_fornecedor=?");
            pst.setString(1, mod.getRazaoSocial());
            pst.setString(2, mod.getCNPJ());
            pst.setString(3, mod.getDataCadastro());            
            pst.setString(4, mod.getNomeFantasia());
            pst.setString(5, mod.getContato());
            pst.setString(6, mod.getEndereco());
            pst.setInt(7, mod.getNumero());            
            pst.setString(8, mod.getComplemento());
            pst.setString(9, mod.getBairro());
            pst.setString(10, mod.getCEP());
            pst.setString(11, mod.getCidade());
            pst.setString(12, mod.getEstado());
            pst.setString(13, mod.getEmail());            
            pst.setString(14, mod.getTelefone());
            pst.setString(15, mod.getCelular());
            pst.setInt(16, mod.getID());
            //pst.setString(13, mod.getStatusCliente());            
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Dados Alterados com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao gravar os dados!"+ex);
        }
        
        conecta.desconexao();
    }
    
     public void Excluir(BeansCadFornecedores mod) {
        conecta.conexao();
        try {
            PreparedStatement pst = conecta.Con.prepareStatement("delete from fornecedores where id_fornecedor=?");
            pst.setInt(1, mod.getID());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Cliente excluido com sucesso!:");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao excluir cliente!/nErro:"+ex);
        }
                
        conecta.desconexao();
    }
    
    
    
    public BeansCadFornecedores BuscaCliente(BeansCadFornecedores mod) {
        conecta.conexao();
        conecta.executaSQL("select *from fornecedores where razaosocial_fornecedor like '%"+mod.getPesquisar()+"%'");
        try {
            conecta.rs.first();
            mod.setID(conecta.rs.getInt("id_fornecedor"));
            mod.setRazaoSocial(conecta.rs.getString("razaosocial_fornecedor"));
            mod.setCNPJ(conecta.rs.getString("cnpj_fornecedor"));
            mod.setDataCadastro(conecta.rs.getString("datacadastro_fornecedor"));            
            mod.setNomeFantasia(conecta.rs.getString("nomefantasia_fornecedor"));
            mod.setContato(conecta.rs.getString("contato_fornecedor"));
            mod.setEndereco(conecta.rs.getString("endereco_fornecedor"));
            mod.setNumero(conecta.rs.getInt("numero_fornecedor"));
            mod.setComplemento(conecta.rs.getString("complemento_fornecedor"));
            mod.setBairro(conecta.rs.getString("bairro_fornecedor"));
            mod.setCEP(conecta.rs.getString("cep_fornecedor"));
            mod.setCidade(conecta.rs.getString("cidade_fornecedor"));
            mod.setEstado(conecta.rs.getString("estado_fornecedor"));
            mod.setEmail(conecta.rs.getString("email_fornecedor"));            
            mod.setTelefone(conecta.rs.getString("telefone_fornecedor"));
            mod.setCelular(conecta.rs.getString("celular_fornecedor"));            
                        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado no banco de dados!"+ex);
        }      
        
        conecta.desconexao();
        return mod;        
    }

    
}
