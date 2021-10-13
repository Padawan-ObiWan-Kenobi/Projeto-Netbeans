/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexao;

import java.sql.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Jhonny_Queillia
 */
public class ConexaoBD {
    public Statement stm; // Responsavel por efetuar as pesquisas
    public ResultSet rs; // Responsavel por guardar as pesquisas
    private String driver = "org.postgresql.Driver"; // Driver do banco de dados PostgreSQL
    private String caminho = "jdbc:postgresql://localhost:5432/Cyclone_integrado"; // Caminho onde se encontra a base de dados utilizada
    private String usuario = "postgres"; // Usuário do banco de dados PostgreSQL
    private String senha = "cyclone2020"; // Senha do banco de dados PostgreSQL
    public Connection Con; // Responsavel pela conexao ao banco de dados PostgreSQL
    
    public void conexao(){ // Metodo responsavel por efetuar a conexao com o banco de dados PostgreSQL
        
        try {
            System.setProperty("jdbc.Drivers", driver);
            Con=DriverManager.getConnection(caminho, usuario, senha);
            //JOptionPane.showMessageDialog(null, "Conexao efetuada com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar com o banco de dados" +ex.getMessage());
        }
    }
    
    public void desconexao(){ // Metodo responsavel por efetuar a desconexao com o banco de dados PostgreSQL
        try {
            Con.close();
            //JOptionPane.showMessageDialog(null, "Banco de dados desconetado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao desconetar o banco de dados" +ex.getMessage());
        }
    }
    
    public void executaSQL(String SQL) {
        try {
            stm = Con.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(SQL);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao executar SQL" +ex.getMessage());
        }
        
    }
    
}
