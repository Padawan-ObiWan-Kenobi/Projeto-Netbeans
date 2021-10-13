/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDao;

import Conexao.ConexaoBD;
import ModeloBeans.BeansBairros;
import ModeloBeans.BeansEstados;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author João & Queillia
 */
public class DaoEstados {
    public void ListarEstados(JComboBox box, int id){
        DefaultComboBoxModel value;
        ConexaoBD conecta = new ConexaoBD();
        PreparedStatement ps = null;
        Connection Con = null;
        ResultSet rs = null;
        
        try{
            //Con = conecta.getConexion();
            ps = Con.prepareStatement("select * from estados where idBairros = ? ");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            value = new DefaultComboBoxModel();
            box.setModel(value);
            
            while(rs.next()) {
                value.addElement(new BeansEstados(rs.getInt(1),rs.getString(2)));
            }
        }catch(Exception ex) {
        }finally{
            try{
                conecta.desconexao();
                ps.close();
                rs.close();
            }catch(Exception ex) {
        }
    }
    
}
    
}
