/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDao;

import Conexao.ConexaoBD;
import ModeloBeans.BeansCidades;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author João & Queillia
 */
public class DaoCidades {
    
    public void ListarCidades(JComboBox box){
        DefaultComboBoxModel value;
        ConexaoBD conecta = new ConexaoBD();
        Statement st = null;
        Connection Con = null;
        ResultSet rs = null;
        
        try{
            //Con = conecta.getConexion();
            st = Con.createStatement();
            rs = st.executeQuery("select * from cidades");
            value = new DefaultComboBoxModel();
            box.setModel(value);
            
            while(rs.next()) {
                value.addElement(new BeansCidades(rs.getInt(1),rs.getString(2)));
            }
        }catch(Exception ex) {
        }finally{
            try{
                conecta.desconexao();
                st.close();
                rs.close();
            }catch(Exception ex) {
        }
    }
    
}

    public int getIdBairros() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
