/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDao;

import Conexao.ConexaoBD;
import ModeloBeans.BeansCadFuncionarios;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class DaoCadFuncionarios {
    
    ConexaoBD conecta = new ConexaoBD();
    BeansCadFuncionarios mod = new BeansCadFuncionarios();
    
    public void Salvar (BeansCadFuncionarios mod) {
        conecta.conexao();
        try {
            PreparedStatement pst = conecta.Con.prepareStatement("insert into funcionarios(nome_funcionario,datacadastro_funcionario,cpf_funcionario,rg_funcionario,sexo_funcionario,estadocivil_funcionario,datanasc_funcionario,titulo_funcionario,zonaeleitoral_funcionario,secaoeleitoral_funcionario,ctps_funcionario,serie_funcionario,pis_funcionario,endereco_funcionario,numero_funcionario,complemento_funcionario,bairro_funcionario,cep_funcionario,cidade_funcionario,estado_funcionario,email_funcionario,telefone_funcionario,celular_funcionario,cargo_funcionario,obs_funcionario) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, mod.getNome());           
            pst.setString(2, (mod.getDataCadastro()));
            pst.setString(3, mod.getCPF());
            pst.setString(4, mod.getRG());            
            pst.setString(5, mod.getSexo());
            pst.setString(6, mod.getEstadoCivil());
            pst.setString(7, mod.getDataNasc());
            pst.setString(8, mod.getTitulo());  
            pst.setInt(9, mod.getZona());
            pst.setInt(10, mod.getSecao());            
            pst.setInt(11, mod.getCTPS());  
            pst.setString(12, mod.getSerie());  
            pst.setString(13, mod.getPIS());            
            pst.setString(14, mod.getEndereco());
            pst.setInt(15, mod.getNumero());
            pst.setString(16, mod.getComplemento());
            pst.setString(17, mod.getBairro());
            pst.setString(18, mod.getCEP());
            pst.setString(19, mod.getCidade());
            pst.setString(20, mod.getEstado());
            pst.setString(21, mod.getEmail());            
            pst.setString(22, mod.getTelefone());
            pst.setString(23, mod.getCelular());
            pst.setString(24, mod.getCargo());
            pst.setString(25, mod.getObs());            
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar funcionário!"+ex);
        }
        
        conecta.desconexao();
    }
    
    public void Alterar (BeansCadFuncionarios mod) {
        conecta.conexao();
        try {
            PreparedStatement pst = conecta.Con.prepareStatement("update funcionarios set nome_funcionario=?,datacadastro_funcionario=?,cpf_funcionario=?,rg_funcionario=?,sexo_funcionario=?,estadocivil_funcionario=?,datanasc_funcionario=?,titulo_funcionario=?,zonaeleitoral_funcionario=?,secaoeleitoral_funcionario=?,ctps_funcionario=?,serie_funcionario=?,pis_funcionario=?,endereco_funcionario=?,numero_funcionario=?,complemento_funcionario=?,bairro_funcionario=?,cep_funcionario=?,cidade_funcionario=?,estado_funcionario=?,email_funcionario=?,telefone_funcionario=?,celular_funcionario=?,cargo_funcionario=?,obs_funcionario=? where id_funcionario=?");
            pst.setString(1, mod.getNome());           
            pst.setString(2, (mod.getDataCadastro()));
            pst.setString(3, mod.getCPF());
            pst.setString(4, mod.getRG());            
            pst.setString(5, mod.getSexo());
            pst.setString(6, mod.getEstadoCivil());
            pst.setString(7, mod.getDataNasc());
            pst.setString(8, mod.getTitulo());  
            pst.setInt(9, mod.getZona());
            pst.setInt(10, mod.getSecao());            
            pst.setInt(11, mod.getCTPS());  
            pst.setString(12, mod.getSerie());  
            pst.setString(13, mod.getPIS());            
            pst.setString(14, mod.getEndereco());
            pst.setInt(15, mod.getNumero());
            pst.setString(16, mod.getComplemento());
            pst.setString(17, mod.getBairro());
            pst.setString(18, mod.getCEP());
            pst.setString(19, mod.getCidade());
            pst.setString(20, mod.getEstado());
            pst.setString(21, mod.getEmail());            
            pst.setString(22, mod.getTelefone());
            pst.setString(23, mod.getCelular());
            pst.setString(24, mod.getCargo());
            pst.setString(25, mod.getObs());
            pst.setInt(26, mod.getID());
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Funcionário alterado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar funcionário!"+ex);
        }
        
        conecta.desconexao();
    }
    
     public void Excluir(BeansCadFuncionarios mod) {
        conecta.conexao();
        try {
            PreparedStatement pst = conecta.Con.prepareStatement("delete from funcionarios where id_funcionario=?");
            pst.setInt(1, mod.getID());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Funcionário excluido com sucesso!:");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao excluir funcionário!/nErro:"+ex);
        }
                
        conecta.desconexao();
    }
    
    
    
    public BeansCadFuncionarios BuscaFuncionario(BeansCadFuncionarios mod) {
        conecta.conexao();
        conecta.executaSQL("select *from funcionarios where nome_funcionario like '%"+mod.getPesquisar()+"%'");
        try {
            conecta.rs.first();
            mod.setID(conecta.rs.getInt("id_funcionario"));
            mod.setNome(conecta.rs.getString("nome_funcionario"));            
            mod.setDataCadastro(String.valueOf(conecta.rs.getDate("datacadastro_funcionario")));
            mod.setCPF(conecta.rs.getString("cpf_funcionario"));
            mod.setRG(conecta.rs.getString("rg_funcionario"));           
            mod.setSexo(conecta.rs.getString("sexo_funcionario"));
            mod.setEstadoCivil(conecta.rs.getString("estadocivil_funcionario"));
            mod.setDataNasc(conecta.rs.getString("Datanasc_funcionario"));
            mod.setTitulo(conecta.rs.getString("titulo_funcionario"));
            mod.setZona(conecta.rs.getInt("zonaeleitoral_funcionario"));
            mod.setSecao(conecta.rs.getInt("secaoeleitoral_funcionario"));            
            mod.setCTPS(conecta.rs.getInt("ctps_funcionario"));                           
            mod.setSerie(conecta.rs.getString("serie_funcionario"));
            mod.setPIS(conecta.rs.getString("pis_funcionario"));
            mod.setEndereco(conecta.rs.getString("endereco_funcionario"));
            mod.setNumero(conecta.rs.getInt("numero_funcionario"));
            mod.setComplemento(conecta.rs.getString("complemento_funcionario"));
            mod.setBairro(conecta.rs.getString("bairro_funcionario"));
            mod.setCEP(conecta.rs.getString("cep_funcionario"));
            mod.setCidade(conecta.rs.getString("cidade_funcionario"));
            mod.setEstado(conecta.rs.getString("estado_funcionario"));
            mod.setEmail(conecta.rs.getString("email_funcionario"));            
            mod.setTelefone(conecta.rs.getString("telefone_funcionario"));
            mod.setCelular(conecta.rs.getString("celular_funcionario"));
            mod.setCargo(conecta.rs.getString("cargo_funcionario"));
            mod.setObs(conecta.rs.getString("obs_funcionario"));
            
                       
                        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Funcionário não encontrado no banco de dados!"+ex);
        }      
        
        conecta.desconexao();
        return mod;        
    }
    
}
