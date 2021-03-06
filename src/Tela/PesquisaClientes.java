/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tela;

import Conexao.ConexaoBD;
import ModeloDao.PreencherTabela;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Jhonny_Queillia
 */
public class PesquisaClientes extends javax.swing.JFrame {
    ConexaoBD conecta = new ConexaoBD();
    int flag = 1;
    
    
    
    

    /**
     * Creates new form PesquisaClientes
     */
    public PesquisaClientes() {
        initComponents();
      
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelPesquisarCliente = new javax.swing.JLabel();
        jTextFieldPesquisaCliente = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePesquisar = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabelID = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jTextFieldDescricao = new javax.swing.JTextField();
        jLabelDescricao = new javax.swing.JLabel();
        jLabelPreco = new javax.swing.JLabel();
        jTextFieldPreco = new javax.swing.JTextField();
        jTextFieldQtde = new javax.swing.JTextField();
        jLabelQtde = new javax.swing.JLabel();
        jButtonSelecionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelPesquisarCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelPesquisarCliente.setForeground(new java.awt.Color(102, 102, 255));
        jLabelPesquisarCliente.setText("Pesquisar Produto");

        jTextFieldPesquisaCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldPesquisaCliente.setForeground(new java.awt.Color(102, 102, 255));
        jTextFieldPesquisaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPesquisaClienteActionPerformed(evt);
            }
        });

        jButtonPesquisar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonPesquisar.setForeground(new java.awt.Color(102, 102, 255));
        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jTablePesquisar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTablePesquisar.setForeground(new java.awt.Color(102, 102, 255));
        jTablePesquisar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTablePesquisar);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelPesquisarCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonPesquisar))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPesquisarCliente)
                    .addComponent(jTextFieldPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelID.setForeground(new java.awt.Color(102, 102, 255));
        jLabelID.setText("ID");

        jTextFieldID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldID.setForeground(new java.awt.Color(102, 102, 255));

        jTextFieldDescricao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldDescricao.setForeground(new java.awt.Color(102, 102, 255));

        jLabelDescricao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelDescricao.setForeground(new java.awt.Color(102, 102, 255));
        jLabelDescricao.setText("Descri????o");

        jLabelPreco.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelPreco.setForeground(new java.awt.Color(102, 102, 255));
        jLabelPreco.setText("Pre??o");

        jTextFieldPreco.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldPreco.setForeground(new java.awt.Color(102, 102, 255));

        jTextFieldQtde.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldQtde.setForeground(new java.awt.Color(102, 102, 255));

        jLabelQtde.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelQtde.setForeground(new java.awt.Color(102, 102, 255));
        jLabelQtde.setText("Qtde");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelID)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDescricao))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPreco))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldQtde, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelQtde))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelID)
                        .addComponent(jLabelDescricao))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelPreco)
                        .addComponent(jLabelQtde)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldQtde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jButtonSelecionar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonSelecionar.setForeground(new java.awt.Color(102, 102, 255));
        jButtonSelecionar.setText("Selecionar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(508, 508, 508)
                        .addComponent(jButtonSelecionar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonSelecionar)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
       public void preencherTabelaCliente(String Sql) {
        ArrayList dados = new ArrayList();
        String [] colunas = new String [] {"ID","Cliente"};
        conecta.conexao();
        conecta.executaSQL(Sql);
        
        try{
            conecta.rs.first();
            do{
                dados.add(new Object[] {conecta.rs.getInt("id_cliente"),conecta.rs.getString("nome_cliente")});                
            }while(conecta.rs.next());                    
        }catch(SQLException ex) {
            
// Preenchendo a tabela
            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher tabela!");
        }
        PreencherTabela modelo = new PreencherTabela(dados, colunas);
        
        jTablePesquisar.setModel(modelo);        
        jTablePesquisar.getColumnModel().getColumn(0).setPreferredWidth(60);
        jTablePesquisar.getColumnModel().getColumn(0).setResizable(false);
        
        jTablePesquisar.getColumnModel().getColumn(1).setPreferredWidth(310);
        jTablePesquisar.getColumnModel().getColumn(1).setResizable(false);
                                           
        jTablePesquisar.getTableHeader().setReorderingAllowed(false);
        jTablePesquisar.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTablePesquisar.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);      
        
        conecta.desconexao();
    
    }
        
    
    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        flag = 1;
        
        preencherTabelaCliente("select * from clientes where nome_cliente like'%"+jTextFieldPesquisaCliente.getText()+"%'");
        
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jTextFieldPesquisaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesquisaClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPesquisaClienteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PesquisaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesquisaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesquisaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesquisaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesquisaClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSelecionar;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelPesquisarCliente;
    private javax.swing.JLabel jLabelPreco;
    private javax.swing.JLabel jLabelQtde;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablePesquisar;
    private javax.swing.JTextField jTextFieldDescricao;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldPesquisaCliente;
    private javax.swing.JTextField jTextFieldPreco;
    private javax.swing.JTextField jTextFieldQtde;
    // End of variables declaration//GEN-END:variables
}
