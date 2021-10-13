
package Tela;

import Conexao.ConexaoBD;
import ModeloBeans.BeansCadCategorias;
import ModeloDao.DaoCadCategorias;
import ModeloDao.PreencherTabela;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

public class CadastroCategoria extends javax.swing.JDialog {
    ConexaoBD conecta = new ConexaoBD();
    BeansCadCategorias mod = new BeansCadCategorias();
    DaoCadCategorias dao =  new DaoCadCategorias();
    int flag = 0;
   
    public CadastroCategoria(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        preencherTabela("select *from categorias order by nome_categoria");
        
    }

    CadastroCategoria() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jPanelCadastroCategorias = new javax.swing.JPanel();
        jTextFieldSubcategoria = new javax.swing.JTextField();
        jLabelID = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jLabelCategoria = new javax.swing.JLabel();
        jTextFieldCategoria = new javax.swing.JTextField();
        jLabelSubcategoria = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanelPesquisaCategorias = new javax.swing.JPanel();
        jLabelPesquisarCategoria = new javax.swing.JLabel();
        jTextFieldPesquisaCategoria = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCategorias = new javax.swing.JTable();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CADASTRO DE CATEGORIAS");
        setAlwaysOnTop(true);

        jPanelCadastroCategorias.setBackground(new java.awt.Color(239, 239, 239));
        jPanelCadastroCategorias.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextFieldSubcategoria.setBackground(new java.awt.Color(239, 239, 239));
        jTextFieldSubcategoria.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldSubcategoria.setForeground(new java.awt.Color(0, 129, 197));
        jTextFieldSubcategoria.setEnabled(false);

        jLabelID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelID.setForeground(new java.awt.Color(120, 200, 10));
        jLabelID.setText("ID");

        jTextFieldID.setBackground(new java.awt.Color(239, 239, 239));
        jTextFieldID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldID.setForeground(new java.awt.Color(0, 129, 197));
        jTextFieldID.setEnabled(false);

        jLabelCategoria.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelCategoria.setForeground(new java.awt.Color(120, 200, 10));
        jLabelCategoria.setText("Categoria");

        jTextFieldCategoria.setBackground(new java.awt.Color(239, 239, 239));
        jTextFieldCategoria.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldCategoria.setForeground(new java.awt.Color(0, 129, 197));
        jTextFieldCategoria.setEnabled(false);

        jLabelSubcategoria.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelSubcategoria.setForeground(new java.awt.Color(120, 200, 10));
        jLabelSubcategoria.setText("Sub-Categoria");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(120, 200, 10));
        jLabel1.setText("CADASTRO DE CATEGORIAS");

        javax.swing.GroupLayout jPanelCadastroCategoriasLayout = new javax.swing.GroupLayout(jPanelCadastroCategorias);
        jPanelCadastroCategorias.setLayout(jPanelCadastroCategoriasLayout);
        jPanelCadastroCategoriasLayout.setHorizontalGroup(
            jPanelCadastroCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroCategoriasLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanelCadastroCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanelCadastroCategoriasLayout.createSequentialGroup()
                        .addGroup(jPanelCadastroCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelID)
                            .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelCadastroCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCategoria)
                            .addComponent(jTextFieldCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelCadastroCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelSubcategoria)
                            .addComponent(jTextFieldSubcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelCadastroCategoriasLayout.setVerticalGroup(
            jPanelCadastroCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroCategoriasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCadastroCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelCadastroCategoriasLayout.createSequentialGroup()
                        .addComponent(jLabelSubcategoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldSubcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelCadastroCategoriasLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelCadastroCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelCadastroCategoriasLayout.createSequentialGroup()
                                .addComponent(jLabelID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelCadastroCategoriasLayout.createSequentialGroup()
                                .addComponent(jLabelCategoria)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanelPesquisaCategorias.setBackground(new java.awt.Color(239, 239, 239));
        jPanelPesquisaCategorias.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelPesquisarCategoria.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelPesquisarCategoria.setForeground(new java.awt.Color(120, 200, 10));
        jLabelPesquisarCategoria.setText("PESQUISA CATEGORIAS");

        jTextFieldPesquisaCategoria.setBackground(new java.awt.Color(239, 239, 239));
        jTextFieldPesquisaCategoria.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldPesquisaCategoria.setForeground(new java.awt.Color(0, 129, 197));

        jButtonPesquisar.setBackground(new java.awt.Color(0, 129, 197));
        jButtonPesquisar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jTableCategorias.setBackground(new java.awt.Color(208, 207, 207));
        jTableCategorias.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTableCategorias.setForeground(new java.awt.Color(78, 78, 78));
        jTableCategorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableCategorias.setSelectionBackground(new java.awt.Color(92, 188, 44));
        jTableCategorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCategoriasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableCategorias);

        javax.swing.GroupLayout jPanelPesquisaCategoriasLayout = new javax.swing.GroupLayout(jPanelPesquisaCategorias);
        jPanelPesquisaCategorias.setLayout(jPanelPesquisaCategoriasLayout);
        jPanelPesquisaCategoriasLayout.setHorizontalGroup(
            jPanelPesquisaCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesquisaCategoriasLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanelPesquisaCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelPesquisaCategoriasLayout.createSequentialGroup()
                        .addComponent(jLabelPesquisarCategoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldPesquisaCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonPesquisar)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanelPesquisaCategoriasLayout.setVerticalGroup(
            jPanelPesquisaCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesquisaCategoriasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPesquisaCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPesquisar)
                    .addComponent(jTextFieldPesquisaCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPesquisarCategoria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jButtonNovo.setBackground(new java.awt.Color(0, 129, 197));
        jButtonNovo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonNovo.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
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

        jButtonExcluir.setBackground(new java.awt.Color(0, 129, 197));
        jButtonExcluir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonExcluir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonExcluir.setText("Exckuir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addComponent(jButtonExcluir))
                    .addComponent(jPanelCadastroCategorias, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelPesquisaCategorias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelCadastroCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelPesquisaCategorias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovo)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonEditar)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonExcluir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        mod.setPesquisar(jTextFieldPesquisaCategoria.getText());
        BeansCadCategorias model = dao.BuscaCategoria(mod);
        /*jTextFieldID.setText(String.valueOf(model.getID()));
        jTextFieldCategoria.setText(model.getCategoria());
        jTextFieldSubcategoria.setText(model.getSubcategoria());*/
        
        jTextFieldPesquisaCategoria.setText("");

        jButtonNovo.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jButtonEditar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        //jButtonPesquisar.setEnabled(false);
        
        preencherTabela("select *from categorias where nome_categoria like'%"+mod.getPesquisar()+"%'");
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        flag = 1;

        jTextFieldCategoria.setEnabled(true);
        jTextFieldSubcategoria.setEnabled(true);
      
        jTextFieldID.setText("");
        jTextFieldCategoria.setText("");
        jTextFieldSubcategoria.setText("");        
        
        jButtonNovo.setEnabled(false);
        jButtonSalvar.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonCancelar.setEnabled(true);
        jButtonExcluir.setEnabled(false);
        jButtonPesquisar.setEnabled(false);
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if(jTextFieldCategoria.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo CATEGORIA para prosseguir");
            jTextFieldCategoria.requestFocus();
        }else if (jTextFieldSubcategoria.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo SUB-CATEGORIA para prosseguir");
            jTextFieldSubcategoria.requestFocus();
            
        }else    
                       
        if(flag==1) {
            
        mod.setCategoria(jTextFieldCategoria.getText());
        mod.setSubcategoria(jTextFieldSubcategoria.getText());
        dao.Salvar(mod);
            
        jTextFieldID.setText("");
        jTextFieldCategoria.setText("");
        jTextFieldSubcategoria.setText("");
                
        jTextFieldID.setEnabled(false);
        jTextFieldCategoria.setEnabled(false);
        jTextFieldSubcategoria.setEnabled(false);
                
        jTableCategorias.setVisible(true);
        
        jButtonNovo.setEnabled(true);
        jButtonSalvar.setEnabled(false);
        jButtonEditar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jButtonPesquisar.setEnabled(true);
        preencherTabela("select *from categorias order by nome_categoria");
        
        // FUNÇÃO ALTERAR DADOS
        
        }else{
            
        mod.setID(Integer.parseInt(jTextFieldID.getText()));
        mod.setCategoria(jTextFieldCategoria.getText());
        mod.setSubcategoria(jTextFieldSubcategoria.getText());
        dao.Alterar(mod);
        
        jTextFieldID.setText("");
        jTextFieldCategoria.setText("");
        jTextFieldSubcategoria.setText("");
        
        jTextFieldID.setEnabled(false);
        jTextFieldCategoria.setEnabled(false);
        jTextFieldSubcategoria.setEnabled(false);
                
        jTableCategorias.setVisible(true);
        
        jButtonNovo.setEnabled(true);
        jButtonSalvar.setEnabled(false);
        jButtonEditar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jButtonPesquisar.setEnabled(true);
        preencherTabela("select *from categorias order by nome_categoria");
        
        }
     
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        flag = 2;        
        jTextFieldCategoria.setEnabled(true);
        jTextFieldSubcategoria.setEnabled(true);
                
        jTextFieldPesquisaCategoria.setEnabled(true);
        jTextFieldPesquisaCategoria.setText("");

        jButtonNovo.setEnabled(false);
        jButtonSalvar.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonCancelar.setEnabled(true);
        jButtonExcluir.setEnabled(false);
        jButtonPesquisar.setEnabled(false);
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        jTextFieldID.setEnabled(false);
        jTextFieldCategoria.setEnabled(false);
        jTextFieldSubcategoria.setEnabled(false);
        
        jTextFieldID.setText("");
        jTextFieldCategoria.setText("");
        jTextFieldSubcategoria.setText("");
        
        jTextFieldPesquisaCategoria.setEnabled(true);
        jTextFieldPesquisaCategoria.requestFocus();
        jTableCategorias.setVisible(true);
        
        jButtonNovo.setEnabled(true);
        jButtonSalvar.setEnabled(false);
        jButtonEditar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jButtonPesquisar.setEnabled(true);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir a categoria?");
        if(resposta == JOptionPane.YES_OPTION) {
            mod.setID(Integer.parseInt(jTextFieldID.getText()));
            dao.Excluir(mod);
            jTextFieldID.setText("");
            jTextFieldCategoria.setText("");
            jTextFieldSubcategoria.setText("");            
                        
            jTableCategorias.setVisible(true);

            jButtonNovo.setEnabled(true);
            jButtonSalvar.setEnabled(false);
            jButtonEditar.setEnabled(false);
            jButtonCancelar.setEnabled(false);
            jButtonExcluir.setEnabled(false);
            jButtonPesquisar.setEnabled(true);
            
            preencherTabela("select *from categorias order by nome_categoria");
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jTableCategoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCategoriasMouseClicked
        String nome_categoria = "" + jTableCategorias.getValueAt(jTableCategorias.getSelectedRow(), 1);
        conecta.conexao();
        conecta.executaSQL("select *from categorias where nome_categoria = '"+ nome_categoria + "'");
        try {
            conecta.rs.first();
            jTextFieldID.setText(String.valueOf(conecta.rs.getInt("id_categoria")));
            jTextFieldCategoria.setText(conecta.rs.getString("nome_categoria"));
            jTextFieldSubcategoria.setText(conecta.rs.getString("nome_subcategoria"));            

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
        jTableCategorias.setVisible(false);

        jTextFieldPesquisaCategoria.setEnabled(false);
        jTextFieldPesquisaCategoria.setText("");
        
        jButtonCancelar.setEnabled(true);

        conecta.desconexao();
    }//GEN-LAST:event_jTableCategoriasMouseClicked

    public void preencherTabela(String Sql) {
        ArrayList dados = new ArrayList();
        String [] colunas = new String [] {"ID","Categoria","Sub-Categoria",};
        conecta.conexao();
        conecta.executaSQL(Sql);
        
        try{
            conecta.rs.first();
            do{
                dados.add(new Object[] {conecta.rs.getInt("id_categoria"),conecta.rs.getString("nome_categoria"),conecta.rs.getString("nome_subcategoria")});                
            }while(conecta.rs.next());                    
        }catch(SQLException ex) {
            
    // Preenchendo a tabela 
    
            JOptionPane.showMessageDialog(rootPane, "Faça uma nova busca, pois os dados pesquisados não existem!");
        }
        PreencherTabela modelo = new PreencherTabela(dados, colunas);
        
        jTableCategorias.setModel(modelo);        
        jTableCategorias.getColumnModel().getColumn(0).setPreferredWidth(60);
        jTableCategorias.getColumnModel().getColumn(0).setResizable(false);
        
        jTableCategorias.getColumnModel().getColumn(1).setPreferredWidth(120);
        jTableCategorias.getColumnModel().getColumn(1).setResizable(false);
        
        jTableCategorias.getColumnModel().getColumn(2).setPreferredWidth(240);
        jTableCategorias.getColumnModel().getColumn(2).setResizable(false);
        
        jTableCategorias.getTableHeader().setReorderingAllowed(false);
        jTableCategorias.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTableCategorias.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);      
        
        conecta.desconexao();
        
    }    

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CadastroCategoria dialog = new CadastroCategoria(new javax.swing.JFrame(), true);
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
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCategoria;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelPesquisarCategoria;
    private javax.swing.JLabel jLabelSubcategoria;
    private javax.swing.JPanel jPanelCadastroCategorias;
    private javax.swing.JPanel jPanelPesquisaCategorias;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCategorias;
    private javax.swing.JTextField jTextFieldCategoria;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldPesquisaCategoria;
    private javax.swing.JTextField jTextFieldSubcategoria;
    // End of variables declaration//GEN-END:variables
}
