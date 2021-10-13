/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDao;

import Conexao.ConexaoBD;
import ModeloBeans.BeansAgenda;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class DaoAgenda {
    
    BeansAgenda mod = new BeansAgenda();
    //DaoCadUsuario dao =  new DaoCadUsuario();
    ConexaoBD conecta = new ConexaoBD(); 
    ConexaoBD conectaPac = new ConexaoBD(); 
    ConexaoBD conectaMed = new ConexaoBD(); 
    
    int CodMed;
    int CodPac;
    
    public void Salvar (BeansAgenda mod) {
        BuscaMedico(mod.getNomeMedico());
        BuscaPaciente(mod.getNomePaciente());
        conecta.conexao();
        try {
            PreparedStatement pst = conecta.Con.prepareStatement("insert into agenda(id_agenda_paciente,id_medico_agenda,motivo_agenda,turno_agenda,data_agenda,status_agenda) values(?,?,?,?,?,?)");
            pst.setInt(1, CodPac);
            pst.setInt(2, CodMed);
            pst.setString(3, mod.getMotivo());
            pst.setString(4, mod.getTurno());
            pst.setDate(5, new java.sql.Date(mod.getData().getTime()));
            pst.setString(6, mod.getStatus());                        
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Agendamento efetuado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar agendamento!"+ex);
        }
        
        conecta.desconexao();
    }
    
    
     
     public void BuscaMedico(String nomeMedico) {
        conectaMed.conexao();
        conectaMed.executaSQL("select *from medicos where nome_medico='"+nomeMedico+"'");
        try {
            conectaMed.rs.first();
            CodMed = conectaMed.rs.getInt("id_medico");
                                    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Medico não encontrado no banco de dados!"+ex);
        }      
        
        conectaMed.desconexao();
         
    }
     
     public void BuscaPaciente(String nomePaciente) {
        conectaPac.conexao();
        conectaPac.executaSQL("select *from pacientes where nome_paciente='"+nomePaciente+"'");
        try {
            conectaPac.rs.first();
            CodPac = conectaPac.rs.getInt("id_paciente");
                                    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Medico não encontrado no banco de dados!"+ex);
        }      
        
        conectaMed.desconexao();
         
    }
    
    
}
