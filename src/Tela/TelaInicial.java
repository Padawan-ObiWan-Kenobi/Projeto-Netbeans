
package Tela;

import Conexao.ConexaoBD;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class TelaInicial extends javax.swing.JFrame {
    
    ConexaoBD conecta = new ConexaoBD();   
    
    public TelaInicial(String usuario) {
        initComponents();
        jLabelUsuario.setText(usuario);
        conecta.conexao();
    }

    private TelaInicial() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImagemFundo = new javax.swing.JLabel();
        jLabelNomeUsuario = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelData = new javax.swing.JLabel();
        jLabelHora = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemCadClientes = new javax.swing.JMenuItem();
        jMenuItemCadCategorias = new javax.swing.JMenuItem();
        jMenuItemCadFornecedores = new javax.swing.JMenuItem();
        jMenuItemCadFuncionarios = new javax.swing.JMenuItem();
        jMenuItemCadProdutos = new javax.swing.JMenuItem();
        jMenuItemCadUsuarios = new javax.swing.JMenuItem();
        jMenuCaixa = new javax.swing.JMenu();
        jMenuItemAbrirCaixa = new javax.swing.JMenuItem();
        jMenuItemFecharCaixa = new javax.swing.JMenuItem();
        jMenuItemSangria = new javax.swing.JMenuItem();
        jMenuItemAdicionarDinheiro = new javax.swing.JMenuItem();
        jMenuItemContarCedulas = new javax.swing.JMenuItem();
        jMenuConfiguração = new javax.swing.JMenu();
        jMenuItemDadosEmpresa = new javax.swing.JMenuItem();
        jMenuOS = new javax.swing.JMenu();
        jMenuItemOrdemServico = new javax.swing.JMenuItem();
        jMenuOrcamentos = new javax.swing.JMenu();
        jMenuRelatorio = new javax.swing.JMenu();
        jMenuItemCategorias = new javax.swing.JMenuItem();
        jMenuItemRelClientes = new javax.swing.JMenuItem();
        jMenuItemFornecedores = new javax.swing.JMenuItem();
        jMenuItemRelProdutos = new javax.swing.JMenuItem();
        jMenuItemUsuarios = new javax.swing.JMenuItem();
        jMenuVenda = new javax.swing.JMenu();
        jMenuItemVendaCaixa = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CYCLONE INTEGRADO V. 1.0");
        setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        ImagemFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Fundo11.jpg"))); // NOI18N
        ImagemFundo.setMaximumSize(new java.awt.Dimension(1000, 720));
        ImagemFundo.setPreferredSize(new java.awt.Dimension(700, 720));

        jLabelNomeUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelNomeUsuario.setForeground(new java.awt.Color(102, 102, 255));
        jLabelNomeUsuario.setText("Usuário:");

        jLabelUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(102, 102, 255));

        jLabelData.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelData.setForeground(new java.awt.Color(102, 102, 255));
        jLabelData.setText("Data");

        jLabelHora.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelHora.setForeground(new java.awt.Color(102, 102, 255));
        jLabelHora.setText("Hora");

        jMenuCadastro.setForeground(new java.awt.Color(102, 102, 255));
        jMenuCadastro.setText("Cadastro");
        jMenuCadastro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jMenuItemCadClientes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItemCadClientes.setForeground(new java.awt.Color(102, 102, 255));
        jMenuItemCadClientes.setText("Clientes");
        jMenuItemCadClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadClientesActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadClientes);

        jMenuItemCadCategorias.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItemCadCategorias.setForeground(new java.awt.Color(102, 102, 255));
        jMenuItemCadCategorias.setText("Categorias");
        jMenuItemCadCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadCategoriasActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadCategorias);

        jMenuItemCadFornecedores.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItemCadFornecedores.setForeground(new java.awt.Color(102, 102, 255));
        jMenuItemCadFornecedores.setText("Fornecedores");
        jMenuItemCadFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadFornecedoresActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadFornecedores);

        jMenuItemCadFuncionarios.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItemCadFuncionarios.setForeground(new java.awt.Color(102, 102, 255));
        jMenuItemCadFuncionarios.setText("Funcionários");
        jMenuItemCadFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadFuncionariosActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadFuncionarios);

        jMenuItemCadProdutos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItemCadProdutos.setForeground(new java.awt.Color(102, 102, 255));
        jMenuItemCadProdutos.setText("Produtos");
        jMenuItemCadProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadProdutosActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadProdutos);

        jMenuItemCadUsuarios.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItemCadUsuarios.setForeground(new java.awt.Color(102, 102, 255));
        jMenuItemCadUsuarios.setText("Usuários");
        jMenuItemCadUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadUsuariosActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadUsuarios);

        jMenuBar1.add(jMenuCadastro);

        jMenuCaixa.setForeground(new java.awt.Color(102, 102, 255));
        jMenuCaixa.setText("Caixa");
        jMenuCaixa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jMenuItemAbrirCaixa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItemAbrirCaixa.setForeground(new java.awt.Color(102, 102, 255));
        jMenuItemAbrirCaixa.setText("Abrir Caixa");
        jMenuCaixa.add(jMenuItemAbrirCaixa);

        jMenuItemFecharCaixa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItemFecharCaixa.setForeground(new java.awt.Color(102, 102, 255));
        jMenuItemFecharCaixa.setText("Fechar Caixa");
        jMenuCaixa.add(jMenuItemFecharCaixa);

        jMenuItemSangria.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItemSangria.setForeground(new java.awt.Color(102, 102, 255));
        jMenuItemSangria.setText("Sangria");
        jMenuCaixa.add(jMenuItemSangria);

        jMenuItemAdicionarDinheiro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItemAdicionarDinheiro.setForeground(new java.awt.Color(102, 102, 255));
        jMenuItemAdicionarDinheiro.setText("Adicionar Dinheiro");
        jMenuCaixa.add(jMenuItemAdicionarDinheiro);

        jMenuItemContarCedulas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItemContarCedulas.setForeground(new java.awt.Color(102, 102, 255));
        jMenuItemContarCedulas.setText("Contar Cédulas");
        jMenuCaixa.add(jMenuItemContarCedulas);

        jMenuBar1.add(jMenuCaixa);

        jMenuConfiguração.setForeground(new java.awt.Color(102, 102, 255));
        jMenuConfiguração.setText("Configuração");
        jMenuConfiguração.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jMenuItemDadosEmpresa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItemDadosEmpresa.setForeground(new java.awt.Color(102, 102, 255));
        jMenuItemDadosEmpresa.setText("Dados da Empresa");
        jMenuItemDadosEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDadosEmpresaActionPerformed(evt);
            }
        });
        jMenuConfiguração.add(jMenuItemDadosEmpresa);

        jMenuBar1.add(jMenuConfiguração);

        jMenuOS.setForeground(new java.awt.Color(102, 102, 255));
        jMenuOS.setText("OS");
        jMenuOS.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jMenuItemOrdemServico.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItemOrdemServico.setForeground(new java.awt.Color(102, 102, 255));
        jMenuItemOrdemServico.setText("Ordem de Serviço");
        jMenuOS.add(jMenuItemOrdemServico);

        jMenuBar1.add(jMenuOS);

        jMenuOrcamentos.setForeground(new java.awt.Color(102, 102, 255));
        jMenuOrcamentos.setText("Orçamentos");
        jMenuOrcamentos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuBar1.add(jMenuOrcamentos);

        jMenuRelatorio.setForeground(new java.awt.Color(102, 102, 255));
        jMenuRelatorio.setText("Relatórios");
        jMenuRelatorio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jMenuItemCategorias.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItemCategorias.setForeground(new java.awt.Color(102, 102, 255));
        jMenuItemCategorias.setText("Categorias");
        jMenuRelatorio.add(jMenuItemCategorias);

        jMenuItemRelClientes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItemRelClientes.setForeground(new java.awt.Color(102, 102, 255));
        jMenuItemRelClientes.setText("Clientes");
        jMenuRelatorio.add(jMenuItemRelClientes);

        jMenuItemFornecedores.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItemFornecedores.setForeground(new java.awt.Color(102, 102, 255));
        jMenuItemFornecedores.setText("Fornecedores");
        jMenuRelatorio.add(jMenuItemFornecedores);

        jMenuItemRelProdutos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItemRelProdutos.setForeground(new java.awt.Color(102, 102, 255));
        jMenuItemRelProdutos.setText("Produtos");
        jMenuRelatorio.add(jMenuItemRelProdutos);

        jMenuItemUsuarios.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItemUsuarios.setForeground(new java.awt.Color(102, 102, 255));
        jMenuItemUsuarios.setText("Usuários");
        jMenuRelatorio.add(jMenuItemUsuarios);

        jMenuBar1.add(jMenuRelatorio);

        jMenuVenda.setForeground(new java.awt.Color(102, 102, 255));
        jMenuVenda.setText("Venda");
        jMenuVenda.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jMenuItemVendaCaixa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItemVendaCaixa.setForeground(new java.awt.Color(102, 102, 255));
        jMenuItemVendaCaixa.setText("Caixa");
        jMenuVenda.add(jMenuItemVendaCaixa);

        jMenuBar1.add(jMenuVenda);

        jMenuSair.setForeground(new java.awt.Color(102, 102, 255));
        jMenuSair.setText("Sair");
        jMenuSair.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jMenuItemSair.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItemSair.setForeground(new java.awt.Color(102, 102, 255));
        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuSair.add(jMenuItemSair);

        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ImagemFundo, javax.swing.GroupLayout.DEFAULT_SIZE, 1400, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelNomeUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelHora)
                        .addGap(49, 49, 49))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ImagemFundo, javax.swing.GroupLayout.PREFERRED_SIZE, 649, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelNomeUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1422, 742));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemDadosEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDadosEmpresaActionPerformed
        try {
            conecta.executaSQL("select *from usuarios where nome_usuario='"+jLabelUsuario.getText()+"'");
            conecta.rs.first();
            if(conecta.rs.getString("tipo_usuario").equals("Admin")) {
            (new DadosEmpresa(this,true)).setVisible(true);            
            
            }else{
                JOptionPane.showMessageDialog(rootPane, "Você não tem permissão para utilizar esta funcionalidade!\n Contate o Administrador do sistema!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Você não tem permissão para utilizar esta funcionalidade!\n Contate o Administrador do sistema!");
        }       
        
    }//GEN-LAST:event_jMenuItemDadosEmpresaActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        conecta.desconexao();
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenuItemCadClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadClientesActionPerformed
        try {
            conecta.executaSQL("select *from usuarios where nome_usuario='"+jLabelUsuario.getText()+"'");
            conecta.rs.first();
            if(conecta.rs.getString("tipo_usuario").equals("Admin")) {
            (new CadastroClientes(this,true)).setVisible(true);         
            
            }else{
                JOptionPane.showMessageDialog(rootPane, "Você não tem permissão para utilizar esta funcionalidade!\n Contate o Administrador do sistema!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Você não tem permissão para utilizar esta funcionalidade!\n Contate o Administrador do sistema!");
        }              
              
    }//GEN-LAST:event_jMenuItemCadClientesActionPerformed

    
    private void jMenuItemCadFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadFornecedoresActionPerformed
        try {
            conecta.executaSQL("select *from usuarios where nome_usuario='"+jLabelUsuario.getText()+"'");
            conecta.rs.first();
            if(conecta.rs.getString("tipo_usuario").equals("Admin")) {
            (new CadastroFornecedores(this,true)).setVisible(true);
            
            }else{
                JOptionPane.showMessageDialog(rootPane, "Você não tem permissão para utilizar esta funcionalidade!\n Contate o Administrador do sistema!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Você não tem permissão para utilizar esta funcionalidade!\n Contate o Administrador do sistema!");
        }       
        
//
    }//GEN-LAST:event_jMenuItemCadFornecedoresActionPerformed

    private void jMenuItemCadUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadUsuariosActionPerformed
        try {
            conecta.executaSQL("select *from usuarios where nome_usuario='"+jLabelUsuario.getText()+"'");
            conecta.rs.first();
            if(conecta.rs.getString("tipo_usuario").equals("Admin")) {
            (new CadastroUsuarios(this,true)).setVisible(true);    
               
            }else{
                JOptionPane.showMessageDialog(rootPane, "Você não tem permissão para utilizar esta funcionalidade!\n Contate o Administrador do sistema!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Você não tem permissão para utilizar esta funcionalidade!\n Contate o Administrador do sistema!");
        }

//
    }//GEN-LAST:event_jMenuItemCadUsuariosActionPerformed

    private void jMenuItemCadProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadProdutosActionPerformed
        try {
            conecta.executaSQL("select *from usuarios where nome_usuario='"+jLabelUsuario.getText()+"'");
            conecta.rs.first();
            if(conecta.rs.getString("tipo_usuario").equals("Admin")) {
            (new CadastroProdutos(this,true)).setVisible(true);    
               
            }else{
                JOptionPane.showMessageDialog(rootPane, "Você não tem permissão para utilizar esta funcionalidade!\n Contate o Administrador do sistema!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Você não tem permissão para utilizar esta funcionalidade!\n Contate o Administrador do sistema!");
        }

    }//GEN-LAST:event_jMenuItemCadProdutosActionPerformed

    private void jMenuItemCadCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadCategoriasActionPerformed
        try {
            conecta.executaSQL("select *from usuarios where nome_usuario='"+jLabelUsuario.getText()+"'");
            conecta.rs.first();
            if(conecta.rs.getString("tipo_usuario").equals("Admin")) {
            (new CadastroCategoria(this,true)).setVisible(true);            
               
            }else{
                JOptionPane.showMessageDialog(rootPane, "Você não tem permissão para utilizar esta funcionalidade!\n Contate o Administrador do sistema!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Você não tem permissão para utilizar esta funcionalidade!\n Contate o Administrador do sistema!");
        }
    }//GEN-LAST:event_jMenuItemCadCategoriasActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setExtendedState(MAXIMIZED_BOTH);
        //TelaLogin.cadastro=false;
        
        // Inserindo a Data no sistema
        
        Date dataSistema = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy");
        jLabelData.setText(formato.format(dataSistema));
        
        // Inserindo a Data no sistema
        
        Timer timer = new Timer(1000, new hora());
        timer.start();
        
    }//GEN-LAST:event_formWindowOpened

    private void jMenuItemCadFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadFuncionariosActionPerformed
        try {
            conecta.executaSQL("select *from usuarios where nome_usuario='"+jLabelUsuario.getText()+"'");
            conecta.rs.first();
            if(conecta.rs.getString("tipo_usuario").equals("Admin")) {
            (new CadastroFuncionarios(this,true)).setVisible(true);
               
            }else{
                JOptionPane.showMessageDialog(rootPane, "Você não tem permissão para utilizar esta funcionalidade!\n Contate o Administrador do sistema!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Você não tem permissão para utilizar esta funcionalidade!\n Contate o Administrador do sistema!");
        }
    }//GEN-LAST:event_jMenuItemCadFuncionariosActionPerformed
  
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImagemFundo;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelHora;
    private javax.swing.JLabel jLabelNomeUsuario;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenu jMenuCaixa;
    private javax.swing.JMenu jMenuConfiguração;
    private javax.swing.JMenuItem jMenuItemAbrirCaixa;
    private javax.swing.JMenuItem jMenuItemAdicionarDinheiro;
    private javax.swing.JMenuItem jMenuItemCadCategorias;
    private javax.swing.JMenuItem jMenuItemCadClientes;
    private javax.swing.JMenuItem jMenuItemCadFornecedores;
    private javax.swing.JMenuItem jMenuItemCadFuncionarios;
    private javax.swing.JMenuItem jMenuItemCadProdutos;
    private javax.swing.JMenuItem jMenuItemCadUsuarios;
    private javax.swing.JMenuItem jMenuItemCategorias;
    private javax.swing.JMenuItem jMenuItemContarCedulas;
    private javax.swing.JMenuItem jMenuItemDadosEmpresa;
    private javax.swing.JMenuItem jMenuItemFecharCaixa;
    private javax.swing.JMenuItem jMenuItemFornecedores;
    private javax.swing.JMenuItem jMenuItemOrdemServico;
    private javax.swing.JMenuItem jMenuItemRelClientes;
    private javax.swing.JMenuItem jMenuItemRelProdutos;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemSangria;
    private javax.swing.JMenuItem jMenuItemUsuarios;
    private javax.swing.JMenuItem jMenuItemVendaCaixa;
    private javax.swing.JMenu jMenuOS;
    private javax.swing.JMenu jMenuOrcamentos;
    private javax.swing.JMenu jMenuRelatorio;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JMenu jMenuVenda;
    // End of variables declaration//GEN-END:variables

class hora implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        Calendar now = Calendar.getInstance();
        jLabelHora.setText(String.format("%1$tH:%1$tM:%1$tS", now));
    }
}





}


