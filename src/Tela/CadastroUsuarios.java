
package Tela;

import Conexao.ConexaoBD;
import ModeloBeans.BeansCadUsuario;
import ModeloDao.DaoCadUsuario;
import ModeloDao.PreencherTabela;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

public class CadastroUsuarios extends javax.swing.JDialog {
    BeansCadUsuario mod = new BeansCadUsuario();
    DaoCadUsuario dao =  new DaoCadUsuario();
    ConexaoBD conecta = new ConexaoBD();       
    int flag = 0;

    /**
     * Creates new form CadastroUsuarios
     */
    public CadastroUsuarios(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        preencherTabela("select *from usuarios order by nome_usuario");
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
        jLabelUsuario = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jLabelTipoUsuario = new javax.swing.JLabel();
        jComboBoxTipoUsuario = new javax.swing.JComboBox<>();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jPasswordFieldConfirmarSenha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabelPesquisarUsuario = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableUsuarios = new javax.swing.JTable();
        jButtonPesquisar = new javax.swing.JButton();
        jTextFieldPesquisaUsuario = new javax.swing.JTextField();
        jFormattedTextFieldDataCadastro = new javax.swing.JFormattedTextField();
        jLabelPerguntaSecreta = new javax.swing.JLabel();
        jComboBoxPerguntaSecreta = new javax.swing.JComboBox<>();
        jLabelResposta = new javax.swing.JLabel();
        jTextFieldResposta = new javax.swing.JTextField();

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

        jLabelUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(120, 200, 10));
        jLabelUsuario.setText("Nome do Usuário");

        jTextFieldUsuario.setBackground(new java.awt.Color(239, 239, 239));
        jTextFieldUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldUsuario.setForeground(new java.awt.Color(0, 129, 197));
        jTextFieldUsuario.setEnabled(false);

        jLabelTipoUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelTipoUsuario.setForeground(new java.awt.Color(120, 200, 10));
        jLabelTipoUsuario.setText("Tipo");

        jComboBoxTipoUsuario.setBackground(new java.awt.Color(239, 239, 239));
        jComboBoxTipoUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBoxTipoUsuario.setForeground(new java.awt.Color(0, 129, 197));
        jComboBoxTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Usuario" }));
        jComboBoxTipoUsuario.setEnabled(false);

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
        jLabel1.setText("CADASTRO DE USUÁRIOS");

        jLabelPesquisarUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelPesquisarUsuario.setForeground(new java.awt.Color(120, 200, 10));
        jLabelPesquisarUsuario.setText("Pesquisa Usuário");

        jTableUsuarios.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTableUsuarios.setForeground(new java.awt.Color(102, 102, 255));
        jTableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableUsuariosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableUsuarios);

        jButtonPesquisar.setBackground(new java.awt.Color(0, 129, 197));
        jButtonPesquisar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jTextFieldPesquisaUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldPesquisaUsuario.setForeground(new java.awt.Color(102, 102, 255));
        jTextFieldPesquisaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPesquisaUsuarioActionPerformed(evt);
            }
        });

        jFormattedTextFieldDataCadastro.setBackground(new java.awt.Color(239, 239, 239));
        jFormattedTextFieldDataCadastro.setForeground(new java.awt.Color(0, 129, 197));
        try {
            jFormattedTextFieldDataCadastro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldDataCadastro.setEnabled(false);
        jFormattedTextFieldDataCadastro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabelPerguntaSecreta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelPerguntaSecreta.setForeground(new java.awt.Color(120, 200, 10));
        jLabelPerguntaSecreta.setText("Pergunta Secreta");

        jComboBoxPerguntaSecreta.setBackground(new java.awt.Color(239, 239, 239));
        jComboBoxPerguntaSecreta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBoxPerguntaSecreta.setForeground(new java.awt.Color(0, 129, 197));
        jComboBoxPerguntaSecreta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Qual o nome do seu animal de estimação", "Qual a sua comida preferida", "Qual a cidade que sua mãe nasceu" }));
        jComboBoxPerguntaSecreta.setEnabled(false);

        jLabelResposta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelResposta.setForeground(new java.awt.Color(120, 200, 10));
        jLabelResposta.setText("Resposta");

        jTextFieldResposta.setBackground(new java.awt.Color(239, 239, 239));
        jTextFieldResposta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldResposta.setForeground(new java.awt.Color(0, 129, 197));
        jTextFieldResposta.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabelPesquisarUsuario)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jTextFieldPesquisaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonPesquisar))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelID))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelUsuario))
                                .addGap(55, 55, 55)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelDataCadastro)
                                    .addComponent(jFormattedTextFieldDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelTipoUsuario))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelSenha))
                                .addGap(137, 137, 137))
                            .addComponent(jLabelPerguntaSecreta, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(385, 385, 385)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelConfirmarSenha)
                                    .addComponent(jPasswordFieldConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jComboBoxPerguntaSecreta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelResposta, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldResposta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelID)
                    .addComponent(jLabelUsuario)
                    .addComponent(jLabelDataCadastro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTipoUsuario)
                    .addComponent(jLabelSenha)
                    .addComponent(jLabelConfirmarSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordFieldConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabelPerguntaSecreta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxPerguntaSecreta, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelResposta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelPesquisarUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPesquisar)
                    .addComponent(jTextFieldPesquisaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExcluir)))
                .addContainerGap())
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
                .addGap(137, 137, 137))
        );

        setSize(new java.awt.Dimension(574, 656));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        flag = 1;

        jFormattedTextFieldDataCadastro.setEnabled(true);
        jTextFieldUsuario.setEnabled(true);
        jComboBoxTipoUsuario.setEnabled(true);
        jPasswordFieldSenha.setEnabled(true);
        jPasswordFieldConfirmarSenha.setEnabled(true);        
        jTextFieldPesquisaUsuario.setEnabled(false);

        jTextFieldID.setText("");
        jFormattedTextFieldDataCadastro.setText("");
        jTextFieldUsuario.setText("");        
        jPasswordFieldSenha.setText("");
        jPasswordFieldConfirmarSenha.setText("");        
        jTextFieldPesquisaUsuario.setText("");

        jButtonNovo.setEnabled(false);
        jButtonSalvar.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonCancelar.setEnabled(true);
        jButtonExcluir.setEnabled(false);
        jButtonPesquisar.setEnabled(false);


    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if(jFormattedTextFieldDataCadastro.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo DATA DE CADASTRO para prosseguir");
            jFormattedTextFieldDataCadastro.requestFocus();
        }else if (jTextFieldUsuario.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo NOME para prosseguir");
            jTextFieldUsuario.requestFocus();
        }else if (jComboBoxTipoUsuario.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Preencha o campo ESTADO para prosseguir");
            jComboBoxTipoUsuario.requestFocus();
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
        mod.setTipoUsuario((String)jComboBoxTipoUsuario.getSelectedItem());
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
        jComboBoxTipoUsuario.setEnabled(false);
        jPasswordFieldSenha.setEnabled(false);
        jPasswordFieldConfirmarSenha.setEnabled(false);
        
        jTableUsuarios.setVisible(true);
        
        jButtonNovo.setEnabled(true);
        jButtonSalvar.setEnabled(false);
        jButtonEditar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jButtonPesquisar.setEnabled(true);
        preencherTabela("select *from usuarios order by nome_usuario");
        
        // FUNÇÃO ALTERAR DADOS
        
        }else{
            
        mod.setID(Integer.parseInt(jTextFieldID.getText()));
        mod.setDataCadastro(jFormattedTextFieldDataCadastro.getText());
        mod.setUsuario(jTextFieldUsuario.getText());
        mod.setTipoUsuario((String)jComboBoxTipoUsuario.getSelectedItem());
        mod.setSenha(jPasswordFieldSenha.getText());
        dao.Alterar(mod);
        
        jTextFieldID.setEnabled(false);
        jFormattedTextFieldDataCadastro.setEnabled(false);
        jTextFieldUsuario.setEnabled(false);
        jComboBoxTipoUsuario.setEnabled(false);
        jPasswordFieldSenha.setEnabled(false);
        jPasswordFieldConfirmarSenha.setEnabled(false);
        
        jTableUsuarios.setVisible(true);
        
        jButtonNovo.setEnabled(true);
        jButtonSalvar.setEnabled(false);
        jButtonEditar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jButtonPesquisar.setEnabled(true);
        preencherTabela("select *from usuarios order by nome_usuario");
        
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed
    }
    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        flag = 2;        
        jFormattedTextFieldDataCadastro.setEnabled(true);
        jTextFieldUsuario.setEnabled(true);
        jComboBoxTipoUsuario.setEnabled(true);
        jPasswordFieldSenha.setEnabled(true);
        jPasswordFieldConfirmarSenha.setEnabled(true);
        
        jTextFieldPesquisaUsuario.setText("");

        jButtonNovo.setEnabled(false);
        jButtonSalvar.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonCancelar.setEnabled(true);
        jButtonExcluir.setEnabled(false);
        jButtonPesquisar.setEnabled(false);
        
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        jTextFieldID.setEnabled(false);
        jFormattedTextFieldDataCadastro.setEnabled(false);
        jTextFieldUsuario.setEnabled(false);
        jComboBoxTipoUsuario.setEnabled(false);
        jPasswordFieldSenha.setEnabled(false);
        jPasswordFieldConfirmarSenha.setEnabled(false);
        
        jTableUsuarios.setVisible(true);
        
        jButtonNovo.setEnabled(true);
        jButtonSalvar.setEnabled(false);
        jButtonEditar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jButtonPesquisar.setEnabled(true);
        
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
            
            jTableUsuarios.setVisible(true);

            jButtonNovo.setEnabled(true);
            jButtonSalvar.setEnabled(false);
            jButtonEditar.setEnabled(false);
            jButtonCancelar.setEnabled(false);
            jButtonExcluir.setEnabled(false);
            jButtonPesquisar.setEnabled(true);
            preencherTabela("select *from usuarios order by nome_usuario");
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        mod.setPesquisar(jTextFieldPesquisaUsuario.getText());
        BeansCadUsuario model = dao.BuscaUsuario(mod);
        
        /*jTextFieldID.setText(String.valueOf(model.getID()));
        jFormattedTextFieldDataCadastro.setText(model.getDataCadastro());
        jTextFieldUsuario.setText(model.getUsuario());
        jComboBoxTipoUsuario.setSelectedItem(model.getTipoUsuario());
        jPasswordFieldSenha.setText(model.getSenha());
        jPasswordFieldConfirmarSenha.setText(model.getSenha());*/
        
        jTextFieldPesquisaUsuario.setText("");

        jButtonNovo.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jButtonEditar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        
        preencherTabela("select *from usuarios where nome_usuario like'%"+mod.getPesquisar()+"%'");
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jTableUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableUsuariosMouseClicked
        String nome_usuario = "" + jTableUsuarios.getValueAt(jTableUsuarios.getSelectedRow(), 2);
        conecta.conexao();
        conecta.executaSQL("select *from usuarios where nome_usuario = '"+ nome_usuario + "'");
        try {
            conecta.rs.first();
            jTextFieldID.setText(String.valueOf(conecta.rs.getInt("id_usuario")));
            jFormattedTextFieldDataCadastro.setText(conecta.rs.getString("datacadastro_usuario"));
            jTextFieldUsuario.setText(conecta.rs.getString("nome_usuario"));
            jComboBoxTipoUsuario.setSelectedItem(conecta.rs.getString("tipo_usuario"));
            jPasswordFieldSenha.setText(conecta.rs.getString("senha_usuario"));
            jPasswordFieldConfirmarSenha.setText(conecta.rs.getString("senha_usuario"));
          

        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar item!"+ex);
        }
        jButtonNovo.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jButtonEditar.setEnabled(true);
        jButtonCancelar.setEnabled(false);
        jButtonExcluir.setEnabled(true);
        jButtonPesquisar.setEnabled(false);
        //jTableClientes.setEnabled(false);
        jTableUsuarios.setVisible(false);

        jTextFieldPesquisaUsuario.setText("");

        conecta.desconexao();
    }//GEN-LAST:event_jTableUsuariosMouseClicked

    private void jPasswordFieldConfirmarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldConfirmarSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldConfirmarSenhaActionPerformed

    private void jTextFieldPesquisaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesquisaUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPesquisaUsuarioActionPerformed

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
        
        jTableUsuarios.setModel(modelo);        
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
        
        conecta.desconexao();
    
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
            java.util.logging.Logger.getLogger(CadastroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CadastroUsuarios dialog = new CadastroUsuarios(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxPerguntaSecreta;
    private javax.swing.JComboBox<String> jComboBoxTipoUsuario;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataCadastro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelConfirmarSenha;
    private javax.swing.JLabel jLabelDataCadastro;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelPerguntaSecreta;
    private javax.swing.JLabel jLabelPesquisarUsuario;
    private javax.swing.JLabel jLabelResposta;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelTipoUsuario;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldConfirmarSenha;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableUsuarios;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldPesquisaUsuario;
    private javax.swing.JTextField jTextFieldResposta;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
