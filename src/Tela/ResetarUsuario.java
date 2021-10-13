
package Tela;

import Conexao.ConexaoBD;
import ModeloBeans.BeansCadUsuario;
import ModeloDao.DaoCadUsuario;
import ModeloDao.PreencherTabela;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ResetarUsuario extends javax.swing.JFrame {
    BeansCadUsuario mod = new BeansCadUsuario();
    DaoCadUsuario dao =  new DaoCadUsuario();
    ConexaoBD conecta = new ConexaoBD();       
    int flag = 0;

    /**
     * Creates new form CadastroUsuarios
     */
    public ResetarUsuario() {
        
        initComponents();
        preencherTabela("select *from usuarios order by nome_usuario");
    }

    private ResetarUsuario(JFrame jFrame, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonExcluir = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonNovo = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabelDataCadastro = new javax.swing.JLabel();
        jLabelSenha = new javax.swing.JLabel();
        jLabelConfirmarSenha = new javax.swing.JLabel();
        jLabelID = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jLabelResposta = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jPasswordFieldConfirmarSenha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jFormattedTextFieldDataCadastro = new javax.swing.JFormattedTextField();
        jLabelUsuario1 = new javax.swing.JLabel();
        jTextFieldUsuario1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CADASTRO DE USUÁRIOS");

        jButtonExcluir.setBackground(new java.awt.Color(0, 129, 197));
        jButtonExcluir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonExcluir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonCancelar.setBackground(new java.awt.Color(0, 129, 197));
        jButtonCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonEditar.setBackground(new java.awt.Color(0, 129, 197));
        jButtonEditar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonEditar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEditar.setText("Editar");
        jButtonEditar.setEnabled(false);
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonSalvar.setBackground(new java.awt.Color(0, 129, 197));
        jButtonSalvar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonSalvar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonNovo.setBackground(new java.awt.Color(0, 129, 197));
        jButtonNovo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonNovo.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(239, 239, 239));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelDataCadastro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelDataCadastro.setForeground(new java.awt.Color(120, 200, 10));
        jLabelDataCadastro.setText("Data de Cadastro");

        jLabelSenha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelSenha.setForeground(new java.awt.Color(120, 200, 10));
        jLabelSenha.setText("Senha");

        jLabelConfirmarSenha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelConfirmarSenha.setForeground(new java.awt.Color(120, 200, 10));
        jLabelConfirmarSenha.setText("Confirmar senha");

        jLabelID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelID.setForeground(new java.awt.Color(120, 200, 10));
        jLabelID.setText("ID");

        jTextFieldID.setBackground(new java.awt.Color(239, 239, 239));
        jTextFieldID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldID.setForeground(new java.awt.Color(0, 129, 197));
        jTextFieldID.setEnabled(false);

        jLabelResposta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelResposta.setForeground(new java.awt.Color(120, 200, 10));
        jLabelResposta.setText("Resposta");

        jTextFieldUsuario.setBackground(new java.awt.Color(239, 239, 239));
        jTextFieldUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldUsuario.setForeground(new java.awt.Color(0, 129, 197));
        jTextFieldUsuario.setEnabled(false);

        jPasswordFieldSenha.setBackground(new java.awt.Color(239, 239, 239));
        jPasswordFieldSenha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPasswordFieldSenha.setForeground(new java.awt.Color(0, 129, 197));
        jPasswordFieldSenha.setText("jPasswordField1");
        jPasswordFieldSenha.setEnabled(false);

        jPasswordFieldConfirmarSenha.setBackground(new java.awt.Color(239, 239, 239));
        jPasswordFieldConfirmarSenha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPasswordFieldConfirmarSenha.setForeground(new java.awt.Color(0, 129, 197));
        jPasswordFieldConfirmarSenha.setText("jPasswordField2");
        jPasswordFieldConfirmarSenha.setEnabled(false);
        jPasswordFieldConfirmarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldConfirmarSenhaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(120, 200, 10));
        jLabel1.setText("RESETAR SENHA DE USUÁRIO");

        jFormattedTextFieldDataCadastro.setBackground(new java.awt.Color(239, 239, 239));
        jFormattedTextFieldDataCadastro.setForeground(new java.awt.Color(0, 129, 197));
        try {
            jFormattedTextFieldDataCadastro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldDataCadastro.setEnabled(false);
        jFormattedTextFieldDataCadastro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabelUsuario1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelUsuario1.setForeground(new java.awt.Color(120, 200, 10));
        jLabelUsuario1.setText("E-mail do Usuário");

        jTextFieldUsuario1.setBackground(new java.awt.Color(239, 239, 239));
        jTextFieldUsuario1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldUsuario1.setForeground(new java.awt.Color(0, 129, 197));
        jTextFieldUsuario1.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelResposta)
                                .addGap(137, 137, 137))
                            .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelID))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelUsuario1)
                                    .addComponent(jTextFieldUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(145, 145, 145)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelDataCadastro)
                                    .addComponent(jFormattedTextFieldDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelConfirmarSenha)
                                    .addComponent(jPasswordFieldConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 17, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelSenha))
                                .addGap(154, 154, 154)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(17, 17, 17)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jLabelResposta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelUsuario1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelDataCadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabelID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSenha)
                    .addComponent(jLabelConfirmarSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordFieldConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(137, 137, 137))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonExcluir))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jButtonNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSalvar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonEditar)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonNovo))
                .addGap(313, 313, 313))
        );

        setSize(new java.awt.Dimension(574, 733));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        flag = 1;

        jFormattedTextFieldDataCadastro.setEnabled(true);
        jTextFieldUsuario.setEnabled(true);
        //jComboBoxTipoUsuario.setEnabled(true);
        jPasswordFieldSenha.setEnabled(true);
        jPasswordFieldConfirmarSenha.setEnabled(true);        
        //jTextFieldPesquisaUsuario.setEnabled(false);

        jTextFieldID.setText("");
        jFormattedTextFieldDataCadastro.setText("");
        jTextFieldUsuario.setText("");        
        jPasswordFieldSenha.setText("");
        jPasswordFieldConfirmarSenha.setText("");        
        //jTextFieldPesquisaUsuario.setText("");

        jButtonNovo.setEnabled(false);
        jButtonSalvar.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonCancelar.setEnabled(true);
        jButtonExcluir.setEnabled(false);
        //jButtonPesquisar.setEnabled(false);


    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if(jFormattedTextFieldDataCadastro.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo DATA DE CADASTRO para prosseguir");
            jFormattedTextFieldDataCadastro.requestFocus();
        }else if (jTextFieldUsuario.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo NOME para prosseguir");
            jTextFieldUsuario.requestFocus();
        /*}else if (jComboBoxTipoUsuario.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Preencha o campo ESTADO para prosseguir");
            jComboBoxTipoUsuario.requestFocus();*/
        }else if (jPasswordFieldSenha.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo NÚMERO para prosseguir");
            jPasswordFieldSenha.requestFocus();
        }else if (jPasswordFieldConfirmarSenha.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo CIDADE para prosseguir");
            jPasswordFieldConfirmarSenha.requestFocus();
            
        }else
            
        // FUNÇÃO INSERIR DADOS    
            
        if(jPasswordFieldSenha.getText().equals(jPasswordFieldConfirmarSenha.getText())) {
        
        }else
            
            JOptionPane.showMessageDialog(null, "Os campos SENHA não são iguais, insira senhas iguais nos dois campos");
        
        {
            
        if(flag==1) {
            
        mod.setDataCadastro(jFormattedTextFieldDataCadastro.getText());
        mod.setUsuario(jTextFieldUsuario.getText());
        //mod.setTipoUsuario((String)jComboBoxTipoUsuario.getSelectedItem());
        mod.setSenha(jPasswordFieldSenha.getText());
        dao.Salvar(mod);
            
        jTextFieldID.setText("");
        jFormattedTextFieldDataCadastro.setText("");
        jTextFieldUsuario.setText("");
        jPasswordFieldSenha.setText("");
        jPasswordFieldConfirmarSenha.setText("");
        
        jTextFieldID.setEnabled(false);
        jFormattedTextFieldDataCadastro.setEnabled(false);
        jTextFieldUsuario.setEnabled(false);
        //jComboBoxTipoUsuario.setEnabled(false);
        jPasswordFieldSenha.setEnabled(false);
        jPasswordFieldConfirmarSenha.setEnabled(false);
        
        //jTableUsuarios.setVisible(true);
        
        jButtonNovo.setEnabled(true);
        jButtonSalvar.setEnabled(false);
        jButtonEditar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        //jButtonPesquisar.setEnabled(true);
        preencherTabela("select *from usuarios order by nome_usuario");
        
        // FUNÇÃO ALTERAR DADOS
        
        }else{
            
        mod.setID(Integer.parseInt(jTextFieldID.getText()));
        mod.setDataCadastro(jFormattedTextFieldDataCadastro.getText());
        mod.setUsuario(jTextFieldUsuario.getText());
        //mod.setTipoUsuario((String)jComboBoxTipoUsuario.getSelectedItem());
        mod.setSenha(jPasswordFieldSenha.getText());
        dao.Alterar(mod);
        
        jTextFieldID.setEnabled(false);
        jFormattedTextFieldDataCadastro.setEnabled(false);
        jTextFieldUsuario.setEnabled(false);
        //jComboBoxTipoUsuario.setEnabled(false);
        jPasswordFieldSenha.setEnabled(false);
        jPasswordFieldConfirmarSenha.setEnabled(false);
        
        //jTableUsuarios.setVisible(true);
        
        jButtonNovo.setEnabled(true);
        jButtonSalvar.setEnabled(false);
        jButtonEditar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        //jButtonPesquisar.setEnabled(true);
        preencherTabela("select *from usuarios order by nome_usuario");
        
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed
    }
    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        flag = 2;        
        jFormattedTextFieldDataCadastro.setEnabled(true);
        jTextFieldUsuario.setEnabled(true);
        //jComboBoxTipoUsuario.setEnabled(true);
        jPasswordFieldSenha.setEnabled(true);
        jPasswordFieldConfirmarSenha.setEnabled(true);
        
        //jTextFieldPesquisaUsuario.setText("");

        jButtonNovo.setEnabled(false);
        jButtonSalvar.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonCancelar.setEnabled(true);
        jButtonExcluir.setEnabled(false);
        //jButtonPesquisar.setEnabled(false);
        
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        jTextFieldID.setEnabled(false);
        jFormattedTextFieldDataCadastro.setEnabled(false);
        jTextFieldUsuario.setEnabled(false);
        //jComboBoxTipoUsuario.setEnabled(false);
        jPasswordFieldSenha.setEnabled(false);
        jPasswordFieldConfirmarSenha.setEnabled(false);
        
        //jTableUsuarios.setVisible(true);
        
        jButtonNovo.setEnabled(true);
        jButtonSalvar.setEnabled(false);
        jButtonEditar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        //jButtonPesquisar.setEnabled(true);
        
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir o cliente?");
        if(resposta == JOptionPane.YES_OPTION) {
            mod.setID(Integer.parseInt(jTextFieldID.getText()));
            dao.Excluir(mod);
            jTextFieldID.setText("");
            jFormattedTextFieldDataCadastro.setText("");
            jTextFieldUsuario.setText("");            
            jPasswordFieldSenha.setText("");
            jPasswordFieldConfirmarSenha.setText("");
            
            //jTableUsuarios.setVisible(true);

            jButtonNovo.setEnabled(true);
            jButtonSalvar.setEnabled(false);
            jButtonEditar.setEnabled(false);
            jButtonCancelar.setEnabled(false);
            jButtonExcluir.setEnabled(false);
            //jButtonPesquisar.setEnabled(true);
            preencherTabela("select *from usuarios order by nome_usuario");
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jPasswordFieldConfirmarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldConfirmarSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldConfirmarSenhaActionPerformed

    public void preencherTabela(String Sql) {
        ArrayList dados = new ArrayList();
        String [] colunas = new String [] {"ID","Data Cadastro","Usuário","Tipo","Senha"};
        conecta.conexao();
        conecta.executaSQL(Sql);
        
        try{
            conecta.rs.first();
            do{
                dados.add(new Object[] {conecta.rs.getInt("id_usuario"),conecta.rs.getString("datacadastro_usuario"),conecta.rs.getString("nome_usuario"),conecta.rs.getString("tipo_usuario"),conecta.rs.getString("senha_usuario")});                
            }while(conecta.rs.next());                    
        }catch(SQLException ex) {
            
// Preenchendo a tabela
            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher tabela!");
        }
        PreencherTabela modelo = new PreencherTabela(dados, colunas);
        
        /*jTableUsuarios.setModel(modelo);        
        jTableUsuarios.getColumnModel().getColumn(0).setPreferredWidth(60);
        jTableUsuarios.getColumnModel().getColumn(0).setResizable(false);
        
        jTableUsuarios.getColumnModel().getColumn(1).setPreferredWidth(100);
        jTableUsuarios.getColumnModel().getColumn(1).setResizable(false);
        
        jTableUsuarios.getColumnModel().getColumn(2).setPreferredWidth(140);
        jTableUsuarios.getColumnModel().getColumn(2).setResizable(false);
        
        jTableUsuarios.getColumnModel().getColumn(3).setPreferredWidth(120);
        jTableUsuarios.getColumnModel().getColumn(3).setResizable(false);
        
        jTableUsuarios.getColumnModel().getColumn(4).setPreferredWidth(100);
        jTableUsuarios.getColumnModel().getColumn(4).setResizable(false);
                               
        jTableUsuarios.getTableHeader().setReorderingAllowed(false);
        jTableUsuarios.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTableUsuarios.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);      
        
        conecta.desconexao();*/
    
    }
    
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
            java.util.logging.Logger.getLogger(ResetarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResetarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResetarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResetarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ResetarUsuario dialog = new ResetarUsuario(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataCadastro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelConfirmarSenha;
    private javax.swing.JLabel jLabelDataCadastro;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelResposta;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelUsuario1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldConfirmarSenha;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldUsuario;
    private javax.swing.JTextField jTextFieldUsuario1;
    // End of variables declaration//GEN-END:variables

    
    }

