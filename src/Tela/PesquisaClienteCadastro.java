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
public class PesquisaClienteCadastro extends javax.swing.JDialog {    
    ConexaoBD conecta = new ConexaoBD();
    //VendaCaixa enviatexto;
    int flag = 1;
    
    private String Cliente;
    
    /*private String ID;
    private String Nome;
    private String DataCadastro;
    private String CPF;
    private String RG;
    private String Sexo;
    private String EstadoCivil;
    private String DataNascimento;
    private String Situacao;
    private String Observacoes;    
    private String Endereco;
    private String Numero;
    private String Complemento;
    private String Bairro;
    private String CEP;
    private String Cidade;
    private String Estado;
    private String Email;    
    private String Telefone;
    private String Celular;*/  
    
    public PesquisaClienteCadastro(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldPesquisaCliente = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jButtonSelecionar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();
        jLabelPesquisaClientes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTextFieldPesquisaCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldPesquisaCliente.setForeground(new java.awt.Color(102, 102, 255));

        jButtonPesquisar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonPesquisar.setForeground(new java.awt.Color(102, 102, 255));
        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jButtonSelecionar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonSelecionar.setForeground(new java.awt.Color(102, 102, 255));
        jButtonSelecionar.setText("Selecionar");
        jButtonSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelecionarActionPerformed(evt);
            }
        });

        jTableClientes.setBackground(new java.awt.Color(0, 103, 78));
        jTableClientes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTableClientes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTableClientes.setForeground(new java.awt.Color(255, 255, 255));
        jTableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableClientes.setSelectionBackground(new java.awt.Color(92, 188, 44));
        jTableClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClientesMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTableClientes);

        jLabelPesquisaClientes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelPesquisaClientes.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPesquisaClientes.setText("PESQUISA CLIENTES");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonSelecionar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonPesquisar))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelPesquisaClientes)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabelPesquisaClientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSelecionar)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(697, 431));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void preencherTabela(String Sql) {
        ArrayList dados = new ArrayList();
        String [] colunas = new String [] {"ID","Nome","Data Cadastro","CPF","RG","Sexo","Estado Cívil","Data Nascimento","Situação","Observações","Endereço","Numero","Complemento","Bairro","CEP","Cidade","Estado","E-mail","Telefone","Celular"};
        conecta.conexao();
        conecta.executaSQL(Sql);
        
        try{
            conecta.rs.first();
            do{
                dados.add(new Object[] {conecta.rs.getInt("id_cliente"),conecta.rs.getString("nome_cliente"),conecta.rs.getString("datacadastro_cliente"),conecta.rs.getString("cpf_cliente"),conecta.rs.getString("rg_cliente"),conecta.rs.getString("sexo_cliente"),conecta.rs.getString("estadocivil_cliente"),conecta.rs.getString("datanascimento_cliente"),conecta.rs.getString("situacao_cliente"),conecta.rs.getString("observacoes_cliente"),conecta.rs.getString("endereco_cliente"),conecta.rs.getInt("numero_cliente"),conecta.rs.getString("complemento_cliente"),conecta.rs.getString("bairro_cliente"),conecta.rs.getString("cep_cliente"),conecta.rs.getString("cidade_cliente"),conecta.rs.getString("estado_cliente"),conecta.rs.getString("email_cliente"),conecta.rs.getString("telefone_cliente"),conecta.rs.getString("celular_cliente")});                
            }while(conecta.rs.next());                    
        }catch(SQLException ex) {
            
// Preenchendo a tabela
            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher tabela!");
        }
        PreencherTabela modelo = new PreencherTabela(dados, colunas);
        
        jTableClientes.setModel(modelo);        
        jTableClientes.getColumnModel().getColumn(0).setPreferredWidth(60);
        jTableClientes.getColumnModel().getColumn(0).setResizable(false);
        
        jTableClientes.getColumnModel().getColumn(1).setPreferredWidth(100);
        jTableClientes.getColumnModel().getColumn(1).setResizable(false);
        
        jTableClientes.getColumnModel().getColumn(2).setPreferredWidth(260);
        jTableClientes.getColumnModel().getColumn(2).setResizable(false);
        
        jTableClientes.getColumnModel().getColumn(3).setPreferredWidth(260);
        jTableClientes.getColumnModel().getColumn(3).setResizable(false);
        
        jTableClientes.getColumnModel().getColumn(4).setPreferredWidth(60);
        jTableClientes.getColumnModel().getColumn(4).setResizable(false);
        
        jTableClientes.getColumnModel().getColumn(5).setPreferredWidth(180);
        jTableClientes.getColumnModel().getColumn(5).setResizable(false);
        
        jTableClientes.getColumnModel().getColumn(6).setPreferredWidth(140);
        jTableClientes.getColumnModel().getColumn(6).setResizable(false);
        
        jTableClientes.getColumnModel().getColumn(7).setPreferredWidth(100);
        jTableClientes.getColumnModel().getColumn(7).setResizable(false);
        
        jTableClientes.getColumnModel().getColumn(8).setPreferredWidth(160);
        jTableClientes.getColumnModel().getColumn(8).setResizable(false);
        
        jTableClientes.getColumnModel().getColumn(9).setPreferredWidth(120);
        jTableClientes.getColumnModel().getColumn(9).setResizable(false);
        
        jTableClientes.getColumnModel().getColumn(10).setPreferredWidth(120);
        jTableClientes.getColumnModel().getColumn(10).setResizable(false);
        
        jTableClientes.getColumnModel().getColumn(11).setPreferredWidth(240);
        jTableClientes.getColumnModel().getColumn(11).setResizable(false);
        
        jTableClientes.getColumnModel().getColumn(12).setPreferredWidth(100);
        jTableClientes.getColumnModel().getColumn(12).setResizable(false);
        
        jTableClientes.getColumnModel().getColumn(13).setPreferredWidth(240);
        jTableClientes.getColumnModel().getColumn(13).setResizable(false); 
        
        jTableClientes.getColumnModel().getColumn(14).setPreferredWidth(160);
        jTableClientes.getColumnModel().getColumn(14).setResizable(false);
        
        jTableClientes.getColumnModel().getColumn(15).setPreferredWidth(120);
        jTableClientes.getColumnModel().getColumn(15).setResizable(false);
        
        jTableClientes.getColumnModel().getColumn(16).setPreferredWidth(120);
        jTableClientes.getColumnModel().getColumn(16).setResizable(false);
        
        jTableClientes.getColumnModel().getColumn(17).setPreferredWidth(240);
        jTableClientes.getColumnModel().getColumn(17).setResizable(false);
        
        jTableClientes.getColumnModel().getColumn(18).setPreferredWidth(100);
        jTableClientes.getColumnModel().getColumn(18).setResizable(false);
        
        jTableClientes.getColumnModel().getColumn(19).setPreferredWidth(240);
        jTableClientes.getColumnModel().getColumn(19).setResizable(false);
        
        jTableClientes.getTableHeader().setReorderingAllowed(false);
        jTableClientes.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTableClientes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);      
        
        conecta.desconexao();
    
    }
    
    
    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        flag = 1;

        preencherTabela("select * from clientes where nome_cliente like'%"+jTextFieldPesquisaCliente.getText()+"%'");

    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jButtonSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelecionarActionPerformed
        /*if(enviatexto == null) {
            enviatexto = new VendaCaixa(new javax.swing.JDialog(),true);
            //enviatexto.setVisible(true);
            enviatexto.recebendo(jTextFieldPesquisaCliente.getText());           
        }else{
            
            enviatexto.setVisible(true);            
            enviatexto.recebendo(jTextFieldPesquisaCliente.getText());
                   
        }*/
        
        this.setCliente(this.jTextFieldPesquisaCliente.getText());        
        
        this.dispose();
        
    }//GEN-LAST:event_jButtonSelecionarActionPerformed

    private void jTableClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClientesMouseClicked
        if (flag==1){
        String nome_cliente = "" + jTableClientes.getValueAt(jTableClientes.getSelectedRow(), 2);
        jTextFieldPesquisaCliente.setText(nome_cliente);
    }//GEN-LAST:event_jTableClientesMouseClicked
    }
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PesquisaClienteCadastro dialog = new PesquisaClienteCadastro(new javax.swing.JDialog(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSelecionar;
    private javax.swing.JLabel jLabelPesquisaClientes;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTableClientes;
    private javax.swing.JTextField jTextFieldPesquisaCliente;
    // End of variables declaration//GEN-END:variables

    public String getCliente() {
        return Cliente;
    }

  
    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }
    
    
    
    
    /*
    public String getID() {
        return ID;
    }

  
    public void setID(String ID) {
        this.ID = ID;
    }
    
    public String getNome() {
        return Nome;
    }

  
    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    
    public String getDataCadastro() {
        return DataCadastro;
    }

  
    public void setDataCadastro(String DataCadastro) {
        this.DataCadastro = DataCadastro;
    }
    
    public String getCPF() {
        return CPF;
    }

  
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
    public String getRG() {
        return RG;
    }

  
    public void setRG(String RG) {
        this.RG = RG;
    }
    
    public String getSexo() {
        return Sexo;
    }

  
    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }
    
    public String getEstadoCivil() {
        return EstadoCivil;
    }

  
    public void setEstadoCivil(String EstadoCivil) {
        this.EstadoCivil = EstadoCivil;
    }
    
    public String getDataNascimento() {
        return DataNascimento;
    }

  
    public void setDataNascimento(String DataNascimento) {
        this.DataNascimento = DataNascimento;
    }
    
    public String getSituacao() {
        return Situacao;
    }

  
    public void setSituacao(String Situacao) {
        this.Situacao = Situacao;
    }
    
    public String getObservacoes() {
        return Observacoes;
    }

  
    public void setObservacoes(String Observacoes) {
        this.Observacoes = Observacoes;
    }
    
    public String getEndereco() {
        return Endereco;
    }
  
    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }
        
    public String getNumero() {
        return Numero;
    }

  
    public void setNumero(String Numero) {
        this.Numero = Numero;
    }
    
    public String getComplemento() {
        return Complemento;
    }

  
    public void setComplemento(String Complemento) {
        this.Complemento = Complemento;
    }
    
    public String getBairro() {
        return Bairro;
    }

  
    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }
    
    public String getCEP() {
        return CEP;
    }

  
    public void setCEP(String CEP) {
        this.CEP = CEP;
    }
    
    public String getCidade() {
        return Cidade;
    }

  
    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }
    
    public String getEstado() {
        return Estado;
    }

  
    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
    public String getEmail() {
        return Email;
    }

  
    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    public String getTelefone() {
        return Telefone;
    }

  
    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }
    
    public String getCelular() {
        return Celular;
    }

  
    public void setCelular(String Celular) {
        this.Celular = Celular;
    }      */ 
        
}
