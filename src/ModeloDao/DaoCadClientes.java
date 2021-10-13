/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDao;

import Conexao.ConexaoBD;
import ModeloBeans.BeansCadClientes;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Jhonny_Queillia
 */
public class DaoCadClientes {
    
    
    
    ConexaoBD conecta = new ConexaoBD();
    BeansCadClientes mod = new BeansCadClientes();
    
    public void Salvar (BeansCadClientes mod) {
        conecta.conexao();
        try {             
            
            PreparedStatement pst = conecta.Con.prepareStatement("insert into clientes(nome_cliente,datacadastro_cliente,cpf_cliente,rg_cliente,sexo_cliente,estadocivil_cliente,datanascimento_cliente,situacao_cliente,observacoes_cliente,endereco_cliente,numero_cliente,complemento_cliente,bairro_cliente,cep_cliente,cidade_cliente,estado_cliente,email_cliente,telefone_cliente,celular_cliente) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getDataCadastro());
            pst.setString(3, mod.getCPF());
            pst.setString(4, mod.getRG());
            pst.setString(5, mod.getSexo());
            pst.setString(6, mod.getEstadoCivil());
            pst.setString(7, mod.getDataNascimento());
            pst.setString(8, mod.getSituacao());
            pst.setString(9, mod.getObservacoes());            
            pst.setString(10, mod.getEndereco());
            pst.setInt(11, mod.getNumero());
            pst.setString(12, mod.getComplemento());
            pst.setString(13, mod.getBairro());
            pst.setString(14, mod.getCEP());
            pst.setString(15, mod.getCidade());
            pst.setString(16, mod.getEstado());
            pst.setString(17, mod.getEmail());            
            pst.setString(18, mod.getTelefone());
            pst.setString(19, mod.getCelular());           
                        
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Dados Gravados com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar os dados!"+ex);
        }
        
        conecta.desconexao();
    }
    
    public void Alterar (BeansCadClientes mod) {
        conecta.conexao();
        try {
            PreparedStatement pst = conecta.Con.prepareStatement("update clientes set nome_cliente=?,datacadastro_cliente=?,cpf_cliente=?,rg_cliente=?,sexo_cliente=?,estadocivil_cliente=?,datanascimento_cliente=?,situacao_cliente=?,observacoes_cliente=?,endereco_cliente=?,numero_cliente=?,complemento_cliente=?,bairro_cliente=?,cep_cliente=?,cidade_cliente=?,estado_cliente=?,email_cliente=?,telefone_cliente=?,celular_cliente=? where id_cliente=?");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getDataCadastro());
            pst.setString(3, mod.getCPF());
            pst.setString(4, mod.getRG());
            pst.setString(5, mod.getSexo());
            pst.setString(6, mod.getEstadoCivil());
            pst.setString(7, mod.getDataNascimento());
            pst.setString(8, mod.getSituacao());
            pst.setString(9, mod.getObservacoes());            
            pst.setString(10, mod.getEndereco());
            pst.setInt(11, mod.getNumero());
            pst.setString(12, mod.getComplemento());
            pst.setString(13, mod.getBairro());
            pst.setString(14, mod.getCEP());
            pst.setString(15, mod.getCidade());
            pst.setString(16, mod.getEstado());
            pst.setString(17, mod.getEmail());            
            pst.setString(18, mod.getTelefone());
            pst.setString(19, mod.getCelular());  
            pst.setInt(20, mod.getID());
            
                        
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Dados Alterados com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Alterar os dados!"+ex);
        }
        
        conecta.desconexao();
    }
    
     public void Excluir(BeansCadClientes mod) {
        conecta.conexao();
        try {
            PreparedStatement pst = conecta.Con.prepareStatement("delete from clientes where id_cliente=?");
            pst.setInt(1, mod.getID());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Cliente excluido com sucesso!:");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao excluir cliente!/nErro:"+ex);
        }
                
        conecta.desconexao();
    }
    
    
    
    public BeansCadClientes BuscaCliente(BeansCadClientes mod) {
        conecta.conexao();
        conecta.executaSQL("select *from clientes where nome_cliente like '%"+mod.getPesquisar()+"%'");
        try {            
            conecta.rs.first();
            mod.setID(conecta.rs.getInt("id_cliente"));
            //mod.setDataCadastro((Date) jDateDataCadastro.getDate());
            mod.setNome(conecta.rs.getString("nome_cliente"));            
            mod.setDataCadastro(conecta.rs.getString("datacadastro_cliente"));
            mod.setCPF(conecta.rs.getString("cpf_cliente"));
            mod.setRG(conecta.rs.getString("rg_cliente"));
            mod.setSexo(conecta.rs.getString("sexo_cliente"));
            mod.setEstadoCivil(conecta.rs.getString("estadocivil_cliente"));
            mod.setDataNascimento(conecta.rs.getString("datanascimento_cliente"));
            mod.setSituacao(conecta.rs.getString("situacao_cliente"));
            mod.setObservacoes(conecta.rs.getString("observacoes_cliente"));            
            mod.setEndereco(conecta.rs.getString("endereco_cliente"));
            mod.setNumero(conecta.rs.getInt("numero_cliente"));
            mod.setComplemento(conecta.rs.getString("complemento_cliente"));
            mod.setBairro(conecta.rs.getString("bairro_cliente"));
            mod.setCEP(conecta.rs.getString("cep_cliente"));
            mod.setCidade(conecta.rs.getString("cidade_cliente"));
            mod.setEstado(conecta.rs.getString("estado_cliente"));
            mod.setEmail(conecta.rs.getString("email_cliente"));            
            mod.setTelefone(conecta.rs.getString("telefone_cliente"));
            mod.setCelular(conecta.rs.getString("celular_cliente"));            
                        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado no banco de dados!"+ex);
        }      
        
        conecta.desconexao();
        return mod;        
    }

    
}
