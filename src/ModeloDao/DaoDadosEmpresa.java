/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDao;

import Conexao.ConexaoBD;
import ModeloBeans.BeansDadosEmpresa;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Jhonny_Queillia
 */
public class DaoDadosEmpresa {
    
    ConexaoBD conecta = new ConexaoBD();
    BeansDadosEmpresa mod = new BeansDadosEmpresa();
    
    public void Salvar (ModeloBeans.BeansDadosEmpresa mod) {
        conecta.conexao();
        try {
            PreparedStatement pst = conecta.Con.prepareStatement("insert into dados_empresa(nome_empresa,cnpj_empresa,endereco_empresa,bairro_empresa,cep_empresa,cidade_empresa,estado_empresa,telefone_empresa) values(?,?,?,?,?,?,?,?)");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getCNPJ());
            pst.setString(3, mod.getEndereco());
            pst.setString(4, mod.getBairro());
            pst.setString(5, mod.getCEP());
            pst.setString(6, mod.getCidade());
            pst.setString(7, mod.getEstado());
            pst.setString(8, mod.getTelefone());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados Gravados com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao gravar os dados!"+ex);
        }
        
        conecta.desconexao();
    }
    
}
