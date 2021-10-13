
package Tela;

import Conexao.ConexaoBD;
import ModeloBeans.BeansCadClientes;
import ModeloDao.DaoCadClientes;
import ModeloDao.PreencherTabela;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

public class CadastroClientes extends javax.swing.JDialog {
    BeansCadClientes mod = new BeansCadClientes();
    DaoCadClientes dao =  new DaoCadClientes();
    ConexaoBD conecta = new ConexaoBD();       
    int flag = 0;
    int select;
    //private PesquisaClienteCadastro pesquisarClientes;
    
    
    
    public void PreencherCidade() {

        conecta.conexao();

        conecta.executaSQL("select * from cidades order by nome_cidade");

        try{
        conecta.rs.first();
        jComboBoxCidade.removeAllItems();
    
            do{
            jComboBoxCidade.addItem(conecta.rs.getString("nome_cidade"));
    
            }while(conecta.rs.next());
            
        }catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher Cidade"+ex);

        }

        conecta.desconexao();

    }
    
    public void PreencherUF() {

        conecta.conexao();

        conecta.executaSQL("select * from estados order by sigla_estado");

        try{
        conecta.rs.first();
        jComboBoxEstado.removeAllItems();
        
            do{
            jComboBoxEstado.addItem(conecta.rs.getString("sigla_estado"));
            
            }while(conecta.rs.next());
            
        }catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher Sigla"+ex);

        }

        conecta.desconexao();

    }
    
        
    public CadastroClientes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);           
        
        //this.pesquisarClientes = new PesquisaClienteCadastro(this, true);
        initComponents();
        PreencherCidade();
        PreencherUF();
                
        
        preencherTabela("select *from clientes order by nome_cliente");
        //preencherStatus();
    }    

    CadastroClientes() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupStatus = new javax.swing.ButtonGroup();
        jPanelCadastroCliente = new javax.swing.JPanel();
        jTextFieldEndereco = new javax.swing.JTextField();
        jLabelDataCadastro = new javax.swing.JLabel();
        jLabelNumero = new javax.swing.JLabel();
        jTextFieldNumero = new javax.swing.JTextField();
        jLabelCidade = new javax.swing.JLabel();
        jLabelEstado = new javax.swing.JLabel();
        jLabelCEP = new javax.swing.JLabel();
        jLabelTelefone = new javax.swing.JLabel();
        jLabelCelular = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelStatus = new javax.swing.JLabel();
        jLabelID = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelEndereco = new javax.swing.JLabel();
        jLabelBairro = new javax.swing.JLabel();
        jTextFieldBairro = new javax.swing.JTextField();
        jComboBoxSituacao = new javax.swing.JComboBox<>();
        jFormattedTextFieldCEP = new javax.swing.JFormattedTextField();
        jFormattedTextFieldTelefone = new javax.swing.JFormattedTextField();
        jFormattedTextFieldCelular = new javax.swing.JFormattedTextField();
        jFormattedTextFieldDataCadastro = new javax.swing.JFormattedTextField();
        jLabelObservacoes = new javax.swing.JLabel();
        jLabelEndereco1 = new javax.swing.JLabel();
        jComboBoxSexo = new javax.swing.JComboBox<>();
        jLabelEndereco2 = new javax.swing.JLabel();
        jComboBoxEstadoCivil = new javax.swing.JComboBox<>();
        jLabelEndereco3 = new javax.swing.JLabel();
        jFormattedTextFieldRG = new javax.swing.JFormattedTextField();
        jFormattedTextFieldCPF = new javax.swing.JFormattedTextField();
        jLabelCPF = new javax.swing.JLabel();
        jLabelRG = new javax.swing.JLabel();
        jFormattedTextFieldDataNascimento = new javax.swing.JFormattedTextField();
        jLabelEndereco4 = new javax.swing.JLabel();
        jTextFieldComplemento = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();
        jLabelPesquisaClientes = new javax.swing.JLabel();
        jLabelCadastroClientes = new javax.swing.JLabel();
        jComboBoxEstado = new javax.swing.JComboBox<>();
        jComboBoxCidade = new javax.swing.JComboBox<>();
        jTextFieldObservacoes = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jButtonNovo = new javax.swing.JButton();
        jButtonPesquisar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jTextFieldPesquisaCliente = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CADASTRO DE CLIENTES");
        setBackground(new java.awt.Color(90, 188, 44));
        setForeground(new java.awt.Color(0, 129, 197));

        jPanelCadastroCliente.setBackground(new java.awt.Color(239, 239, 239));
        jPanelCadastroCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 125, 101), null));
        jPanelCadastroCliente.setMaximumSize(new java.awt.Dimension(3276, 3276));
        jPanelCadastroCliente.setPreferredSize(new java.awt.Dimension(1000, 674));

        jTextFieldEndereco.setBackground(new java.awt.Color(239, 239, 239));
        jTextFieldEndereco.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldEndereco.setForeground(new java.awt.Color(0, 129, 197));
        jTextFieldEndereco.setEnabled(false);

        jLabelDataCadastro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelDataCadastro.setForeground(new java.awt.Color(120, 200, 10));
        jLabelDataCadastro.setText("Data de Cadastro");

        jLabelNumero.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelNumero.setForeground(new java.awt.Color(120, 200, 10));
        jLabelNumero.setText("Nº");

        jTextFieldNumero.setBackground(new java.awt.Color(239, 239, 239));
        jTextFieldNumero.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldNumero.setForeground(new java.awt.Color(0, 129, 197));
        jTextFieldNumero.setEnabled(false);

        jLabelCidade.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelCidade.setForeground(new java.awt.Color(120, 200, 10));
        jLabelCidade.setText("Cidade");

        jLabelEstado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelEstado.setForeground(new java.awt.Color(120, 200, 10));
        jLabelEstado.setText("Estado");

        jLabelCEP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelCEP.setForeground(new java.awt.Color(120, 200, 10));
        jLabelCEP.setText("CEP");

        jLabelTelefone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelTelefone.setForeground(new java.awt.Color(120, 200, 10));
        jLabelTelefone.setText("Telefone");

        jLabelCelular.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelCelular.setForeground(new java.awt.Color(120, 200, 10));
        jLabelCelular.setText("Celular");

        jLabelEmail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelEmail.setForeground(new java.awt.Color(120, 200, 10));
        jLabelEmail.setText("E-mail");

        jLabelStatus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelStatus.setForeground(new java.awt.Color(120, 200, 10));
        jLabelStatus.setText("Situação");

        jLabelID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelID.setForeground(new java.awt.Color(120, 200, 10));
        jLabelID.setText("ID");

        jTextFieldID.setBackground(new java.awt.Color(239, 239, 239));
        jTextFieldID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldID.setForeground(new java.awt.Color(0, 129, 197));
        jTextFieldID.setEnabled(false);

        jLabelNome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelNome.setForeground(new java.awt.Color(120, 200, 10));
        jLabelNome.setText("Nome");

        jTextFieldNome.setBackground(new java.awt.Color(239, 239, 239));
        jTextFieldNome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldNome.setForeground(new java.awt.Color(0, 129, 197));
        jTextFieldNome.setEnabled(false);
        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });

        jLabelEndereco.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelEndereco.setForeground(new java.awt.Color(120, 200, 10));
        jLabelEndereco.setText("Endereço");

        jLabelBairro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelBairro.setForeground(new java.awt.Color(120, 200, 10));
        jLabelBairro.setText("Bairro");

        jTextFieldBairro.setBackground(new java.awt.Color(239, 239, 239));
        jTextFieldBairro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldBairro.setForeground(new java.awt.Color(0, 129, 197));
        jTextFieldBairro.setEnabled(false);

        jComboBoxSituacao.setBackground(new java.awt.Color(239, 239, 239));
        jComboBoxSituacao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBoxSituacao.setForeground(new java.awt.Color(0, 129, 197));
        jComboBoxSituacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Análise", "Ativo", "Devedor", "Inativo", "Liberado", " " }));
        jComboBoxSituacao.setEnabled(false);

        jFormattedTextFieldCEP.setBackground(new java.awt.Color(239, 239, 239));
        jFormattedTextFieldCEP.setForeground(new java.awt.Color(0, 129, 197));
        try {
            jFormattedTextFieldCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCEP.setEnabled(false);
        jFormattedTextFieldCEP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jFormattedTextFieldTelefone.setBackground(new java.awt.Color(239, 239, 239));
        jFormattedTextFieldTelefone.setForeground(new java.awt.Color(0, 129, 197));
        try {
            jFormattedTextFieldTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldTelefone.setEnabled(false);
        jFormattedTextFieldTelefone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jFormattedTextFieldCelular.setBackground(new java.awt.Color(239, 239, 239));
        jFormattedTextFieldCelular.setForeground(new java.awt.Color(0, 129, 197));
        try {
            jFormattedTextFieldCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCelular.setEnabled(false);
        jFormattedTextFieldCelular.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jFormattedTextFieldDataCadastro.setBackground(new java.awt.Color(239, 239, 239));
        jFormattedTextFieldDataCadastro.setForeground(new java.awt.Color(0, 129, 197));
        try {
            jFormattedTextFieldDataCadastro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldDataCadastro.setEnabled(false);
        jFormattedTextFieldDataCadastro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jFormattedTextFieldDataCadastro.setMinimumSize(new java.awt.Dimension(14, 19));
        jFormattedTextFieldDataCadastro.setName(""); // NOI18N

        jLabelObservacoes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelObservacoes.setForeground(new java.awt.Color(120, 200, 10));
        jLabelObservacoes.setText("Observações");

        jLabelEndereco1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelEndereco1.setForeground(new java.awt.Color(120, 200, 10));
        jLabelEndereco1.setText("Sexo");

        jComboBoxSexo.setBackground(new java.awt.Color(239, 239, 239));
        jComboBoxSexo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBoxSexo.setForeground(new java.awt.Color(0, 129, 197));
        jComboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Feminino", "Masculino" }));
        jComboBoxSexo.setEnabled(false);

        jLabelEndereco2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelEndereco2.setForeground(new java.awt.Color(120, 200, 10));
        jLabelEndereco2.setText("Estado Cívil");

        jComboBoxEstadoCivil.setBackground(new java.awt.Color(239, 239, 239));
        jComboBoxEstadoCivil.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBoxEstadoCivil.setForeground(new java.awt.Color(0, 129, 197));
        jComboBoxEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro", "Casado", "Separado", "Divorciado", "Viúvo", "Outros" }));
        jComboBoxEstadoCivil.setEnabled(false);

        jLabelEndereco3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelEndereco3.setForeground(new java.awt.Color(120, 200, 10));
        jLabelEndereco3.setText("Data Nascimento");

        jFormattedTextFieldRG.setBackground(new java.awt.Color(239, 239, 239));
        jFormattedTextFieldRG.setForeground(new java.awt.Color(0, 129, 197));
        try {
            jFormattedTextFieldRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldRG.setEnabled(false);
        jFormattedTextFieldRG.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jFormattedTextFieldCPF.setBackground(new java.awt.Color(239, 239, 239));
        jFormattedTextFieldCPF.setForeground(new java.awt.Color(0, 129, 197));
        try {
            jFormattedTextFieldCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCPF.setEnabled(false);
        jFormattedTextFieldCPF.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabelCPF.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelCPF.setForeground(new java.awt.Color(120, 200, 10));
        jLabelCPF.setText("CPF");

        jLabelRG.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelRG.setForeground(new java.awt.Color(120, 200, 10));
        jLabelRG.setText("RG");

        jFormattedTextFieldDataNascimento.setBackground(new java.awt.Color(239, 239, 239));
        jFormattedTextFieldDataNascimento.setForeground(new java.awt.Color(0, 129, 197));
        try {
            jFormattedTextFieldDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldDataNascimento.setEnabled(false);
        jFormattedTextFieldDataNascimento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jFormattedTextFieldDataNascimento.setMinimumSize(new java.awt.Dimension(14, 19));
        jFormattedTextFieldDataNascimento.setName(""); // NOI18N

        jLabelEndereco4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelEndereco4.setForeground(new java.awt.Color(120, 200, 10));
        jLabelEndereco4.setText("Complemento");

        jTextFieldComplemento.setBackground(new java.awt.Color(239, 239, 239));
        jTextFieldComplemento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldComplemento.setForeground(new java.awt.Color(0, 129, 197));
        jTextFieldComplemento.setEnabled(false);

        jTableClientes.setBackground(new java.awt.Color(208, 207, 207));
        jTableClientes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTableClientes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTableClientes.setForeground(new java.awt.Color(78, 78, 78));
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
        jLabelPesquisaClientes.setForeground(new java.awt.Color(120, 200, 10));
        jLabelPesquisaClientes.setText("PESQUISA CLIENTES");

        jLabelCadastroClientes.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelCadastroClientes.setForeground(new java.awt.Color(120, 200, 10));
        jLabelCadastroClientes.setText("CADASTRO DE CLIENTES");

        jComboBoxEstado.setBackground(new java.awt.Color(239, 239, 239));
        jComboBoxEstado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBoxEstado.setForeground(new java.awt.Color(0, 129, 197));
        jComboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item1", "Item2", "Item3" }));
        jComboBoxEstado.setEnabled(false);

        jComboBoxCidade.setBackground(new java.awt.Color(239, 239, 239));
        jComboBoxCidade.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBoxCidade.setForeground(new java.awt.Color(0, 129, 197));
        jComboBoxCidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item1", "Item2", "Item3" }));
        jComboBoxCidade.setEnabled(false);

        jTextFieldObservacoes.setBackground(new java.awt.Color(239, 239, 239));
        jTextFieldObservacoes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldObservacoes.setForeground(new java.awt.Color(0, 129, 197));
        jTextFieldObservacoes.setEnabled(false);

        jTextFieldEmail.setBackground(new java.awt.Color(239, 239, 239));
        jTextFieldEmail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldEmail.setForeground(new java.awt.Color(0, 129, 197));
        jTextFieldEmail.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldEmail.setEnabled(false);

        javax.swing.GroupLayout jPanelCadastroClienteLayout = new javax.swing.GroupLayout(jPanelCadastroCliente);
        jPanelCadastroCliente.setLayout(jPanelCadastroClienteLayout);
        jPanelCadastroClienteLayout.setHorizontalGroup(
            jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroClienteLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCadastroClientes)
                    .addGroup(jPanelCadastroClienteLayout.createSequentialGroup()
                        .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelCadastroClienteLayout.createSequentialGroup()
                                .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelID))
                                .addGap(40, 40, 40)
                                .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelNome))
                                .addGap(116, 116, 116))
                            .addGroup(jPanelCadastroClienteLayout.createSequentialGroup()
                                .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCPF)
                                    .addComponent(jFormattedTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFormattedTextFieldRG, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelRG))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelEndereco1)
                                    .addComponent(jComboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelEndereco2)
                                    .addComponent(jComboBoxEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDataCadastro)
                            .addComponent(jFormattedTextFieldDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelEndereco3)
                            .addComponent(jFormattedTextFieldDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabelPesquisaClientes)
                    .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanelCadastroClienteLayout.createSequentialGroup()
                            .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelEndereco)
                                .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(36, 36, 36)
                            .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabelNumero)
                                .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelEndereco4)))
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelCadastroClienteLayout.createSequentialGroup()
                            .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelStatus)
                                .addComponent(jComboBoxSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanelCadastroClienteLayout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addComponent(jLabelObservacoes))
                                .addGroup(jPanelCadastroClienteLayout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextFieldObservacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCadastroClienteLayout.createSequentialGroup()
                            .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanelCadastroClienteLayout.createSequentialGroup()
                                    .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jFormattedTextFieldCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanelCadastroClienteLayout.createSequentialGroup()
                                    .addComponent(jLabelBairro)
                                    .addGap(198, 198, 198)
                                    .addComponent(jLabelCEP)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelCidade)
                                .addComponent(jComboBoxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelEstado)
                                .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanelCadastroClienteLayout.createSequentialGroup()
                            .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelEmail)
                                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(48, 48, 48)
                            .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jFormattedTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanelCadastroClienteLayout.createSequentialGroup()
                                    .addComponent(jLabelTelefone)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelCelular)
                                        .addComponent(jFormattedTextFieldCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanelCadastroClienteLayout.setVerticalGroup(
            jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCadastroClientes)
                .addGap(18, 18, 18)
                .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanelCadastroClienteLayout.createSequentialGroup()
                            .addComponent(jLabelID)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelCadastroClienteLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jFormattedTextFieldDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelDataCadastro)))
                    .addGroup(jPanelCadastroClienteLayout.createSequentialGroup()
                        .addComponent(jLabelNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelCadastroClienteLayout.createSequentialGroup()
                            .addComponent(jLabelEndereco1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelCadastroClienteLayout.createSequentialGroup()
                            .addComponent(jLabelEndereco2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBoxEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelCadastroClienteLayout.createSequentialGroup()
                            .addComponent(jLabelEndereco3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jFormattedTextFieldDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelCadastroClienteLayout.createSequentialGroup()
                        .addComponent(jLabelCPF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelCadastroClienteLayout.createSequentialGroup()
                        .addComponent(jLabelRG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldRG, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelCadastroClienteLayout.createSequentialGroup()
                        .addComponent(jLabelStatus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldObservacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelCadastroClienteLayout.createSequentialGroup()
                        .addComponent(jLabelObservacoes)
                        .addGap(30, 30, 30)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEndereco4)
                    .addComponent(jLabelNumero, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelEndereco, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextFieldComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCadastroClienteLayout.createSequentialGroup()
                        .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabelEstado)
                                .addComponent(jLabelBairro))
                            .addComponent(jLabelCEP, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanelCadastroClienteLayout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelCadastroClienteLayout.createSequentialGroup()
                                .addComponent(jFormattedTextFieldCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1))))
                    .addGroup(jPanelCadastroClienteLayout.createSequentialGroup()
                        .addComponent(jLabelCidade)
                        .addGap(7, 7, 7)
                        .addComponent(jComboBoxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEmail)
                    .addComponent(jLabelCelular, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelTelefone, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelPesquisaClientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        jButtonPesquisar.setBackground(new java.awt.Color(0, 129, 197));
        jButtonPesquisar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPesquisar.setText("Pesquisa");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
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

        jTextFieldPesquisaCliente.setBackground(new java.awt.Color(239, 239, 239));
        jTextFieldPesquisaCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldPesquisaCliente.setForeground(new java.awt.Color(0, 129, 197));
        jTextFieldPesquisaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPesquisaClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldPesquisaCliente)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addComponent(jPanelCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonEditar)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonNovo)
                    .addComponent(jButtonPesquisar)
                    .addComponent(jTextFieldPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelCadastroCliente.getAccessibleContext().setAccessibleName("tab1");

        setSize(new java.awt.Dimension(712, 722));
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
        jTableClientes.getColumnModel().getColumn(0).setPreferredWidth(30);
        jTableClientes.getColumnModel().getColumn(0).setResizable(false);
        
        jTableClientes.getColumnModel().getColumn(1).setPreferredWidth(200);
        jTableClientes.getColumnModel().getColumn(1).setResizable(false);
        
        jTableClientes.getColumnModel().getColumn(2).setPreferredWidth(100);
        jTableClientes.getColumnModel().getColumn(2).setResizable(false);
        
        jTableClientes.getColumnModel().getColumn(3).setPreferredWidth(120);
        jTableClientes.getColumnModel().getColumn(3).setResizable(false);
        
        jTableClientes.getColumnModel().getColumn(4).setPreferredWidth(100);
        jTableClientes.getColumnModel().getColumn(4).setResizable(false);
        
        jTableClientes.getColumnModel().getColumn(5).setPreferredWidth(80);
        jTableClientes.getColumnModel().getColumn(5).setResizable(false);
        
        jTableClientes.getColumnModel().getColumn(6).setPreferredWidth(80);
        jTableClientes.getColumnModel().getColumn(6).setResizable(false);
        
        jTableClientes.getColumnModel().getColumn(7).setPreferredWidth(100);
        jTableClientes.getColumnModel().getColumn(7).setResizable(false);
        
        jTableClientes.getColumnModel().getColumn(8).setPreferredWidth(90);
        jTableClientes.getColumnModel().getColumn(8).setResizable(false);
        
        jTableClientes.getColumnModel().getColumn(9).setPreferredWidth(240);
        jTableClientes.getColumnModel().getColumn(9).setResizable(false);
        
        jTableClientes.getColumnModel().getColumn(10).setPreferredWidth(240);
        jTableClientes.getColumnModel().getColumn(10).setResizable(false);
        
        jTableClientes.getColumnModel().getColumn(11).setPreferredWidth(60);
        jTableClientes.getColumnModel().getColumn(11).setResizable(false);
        
        jTableClientes.getColumnModel().getColumn(12).setPreferredWidth(160);
        jTableClientes.getColumnModel().getColumn(12).setResizable(false);
        
        jTableClientes.getColumnModel().getColumn(13).setPreferredWidth(200);
        jTableClientes.getColumnModel().getColumn(13).setResizable(false);  
        
        jTableClientes.getColumnModel().getColumn(14).setPreferredWidth(90);
        jTableClientes.getColumnModel().getColumn(14).setResizable(false);
        
        jTableClientes.getColumnModel().getColumn(15).setPreferredWidth(160);
        jTableClientes.getColumnModel().getColumn(15).setResizable(false);
        
        jTableClientes.getColumnModel().getColumn(16).setPreferredWidth(140);
        jTableClientes.getColumnModel().getColumn(16).setResizable(false);
        
        jTableClientes.getColumnModel().getColumn(17).setPreferredWidth(240);
        jTableClientes.getColumnModel().getColumn(17).setResizable(false);
        
        jTableClientes.getColumnModel().getColumn(18).setPreferredWidth(120);
        jTableClientes.getColumnModel().getColumn(18).setResizable(false);
        
        jTableClientes.getColumnModel().getColumn(19).setPreferredWidth(120);
        jTableClientes.getColumnModel().getColumn(19).setResizable(false);        
        
        jTableClientes.getTableHeader().setReorderingAllowed(false);
        jTableClientes.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTableClientes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);      
        
        conecta.desconexao();
        
    }                                  
        
    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir o cliente?");
        if(resposta == JOptionPane.YES_OPTION) {
            mod.setID(Integer.parseInt(jTextFieldID.getText()));
            dao.Excluir(mod);
            jTextFieldID.setText("");
            jTextFieldNome.setText("");
            jFormattedTextFieldDataCadastro.setText("");
            jFormattedTextFieldCPF.setText("");
            jFormattedTextFieldRG.setText("");
            jComboBoxSexo.setSelectedItem(null);
            jComboBoxEstadoCivil.setSelectedItem(null);
            jFormattedTextFieldDataNascimento.setText("");
            jComboBoxSituacao.setSelectedItem(null);
            jTextFieldObservacoes.setText("");                
            jTextFieldEndereco.setText("");
            jTextFieldNumero.setText("");
            jTextFieldComplemento.setText("");
            jTextFieldBairro.setText("");
            jFormattedTextFieldCEP.setText("");
            jComboBoxCidade.setSelectedItem(null);
            jComboBoxEstado.setSelectedItem(null);
            jTextFieldEmail.setText("");            
            jFormattedTextFieldTelefone.setText("");
            jFormattedTextFieldCelular.setText("");            
           
            jTextFieldPesquisaCliente.setText("");

            jTableClientes.setVisible(true);

            jButtonNovo.setEnabled(true);
            jButtonSalvar.setEnabled(false);
            jButtonEditar.setEnabled(false);
            jButtonCancelar.setEnabled(false);
            jButtonExcluir.setEnabled(false);
            jButtonPesquisar.setEnabled(true);
            
            preencherTabela("select *from clientes order by nome_cliente");

        }

    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        jTextFieldID.setEnabled(false);
        jTextFieldNome.setEnabled(false);
        jFormattedTextFieldDataCadastro.setEnabled(false);
        jFormattedTextFieldCPF.setEnabled(false);
        jFormattedTextFieldRG.setEnabled(false);
        jComboBoxSexo.setEnabled(false);
        jComboBoxEstadoCivil.setEnabled(false);
        jFormattedTextFieldDataNascimento.setEnabled(false);
        jComboBoxSituacao.setEnabled(false);
        jTextFieldObservacoes.setEnabled(false);        
        jTextFieldEndereco.setEnabled(false);
        jTextFieldNumero.setEnabled(false);
        jTextFieldComplemento.setEnabled(false);
        jTextFieldBairro.setEnabled(false);
        jFormattedTextFieldCEP.setEnabled(false);
        jComboBoxCidade.setEnabled(false);
        jComboBoxEstado.setEnabled(false);
        jTextFieldEmail.setEnabled(false);        
        jFormattedTextFieldTelefone.setEnabled(false);
        jFormattedTextFieldCelular.setEnabled(false);         
        
        jTextFieldPesquisaCliente.requestFocus();
        jTextFieldPesquisaCliente.setEnabled(true);
        jTableClientes.setVisible(true);

        jTextFieldID.setText("");
            jTextFieldNome.setText("");
            jFormattedTextFieldDataCadastro.setText("");
            jFormattedTextFieldCPF.setText("");
            jFormattedTextFieldRG.setText("");
            jComboBoxSexo.setSelectedItem(null);
            jComboBoxEstadoCivil.setSelectedItem(null);
            jFormattedTextFieldDataNascimento.setText("");
            jComboBoxSituacao.setSelectedItem(null);
            jTextFieldObservacoes.setText("");                
            jTextFieldEndereco.setText("");
            jTextFieldNumero.setText("");
            jTextFieldComplemento.setText("");
            jTextFieldBairro.setText("");
            jFormattedTextFieldCEP.setText("");
            jComboBoxCidade.setSelectedItem(null);
            jComboBoxEstado.setSelectedItem(null);
            jTextFieldEmail.setText("");            
            jFormattedTextFieldTelefone.setText("");
            jFormattedTextFieldCelular.setText("");

        jButtonNovo.setEnabled(true);
        jButtonSalvar.setEnabled(false);
        jButtonEditar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jButtonPesquisar.setEnabled(true);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        flag = 2;
        //jTextFieldID.setEnabled(true);        
        jTextFieldNome.setEnabled(true);
        jFormattedTextFieldDataCadastro.setEnabled(true);
        jFormattedTextFieldCPF.setEnabled(true);
        jFormattedTextFieldRG.setEnabled(true);
        jComboBoxSexo.setEnabled(true);
        jComboBoxEstadoCivil.setEnabled(true);
        jFormattedTextFieldDataNascimento.setEnabled(true);
        jComboBoxSituacao.setEnabled(true);
        jTextFieldObservacoes.setEnabled(true);        
        jTextFieldEndereco.setEnabled(true);
        jTextFieldNumero.setEnabled(true);
        jTextFieldComplemento.setEnabled(true);
        jTextFieldBairro.setEnabled(true);
        jFormattedTextFieldCEP.setEnabled(true);
        jComboBoxCidade.setEnabled(true);
        jComboBoxEstado.setEnabled(true);
        jTextFieldEmail.setEnabled(true);        
        jFormattedTextFieldTelefone.setEnabled(true);
        jFormattedTextFieldCelular.setEnabled(true);
        
        jTextFieldPesquisaCliente.setEnabled(false);
        //jTableClientes.setEnabled(false);

        jTextFieldPesquisaCliente.setText("");

        jButtonNovo.setEnabled(false);
        jButtonSalvar.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonCancelar.setEnabled(true);
        jButtonExcluir.setEnabled(false);
        jButtonPesquisar.setEnabled(false);

    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if (jTextFieldNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo NOME para prosseguir");
            jTextFieldNome.requestFocus();        
        }else if (jFormattedTextFieldDataCadastro.getText().trim().length() < 10 || jFormattedTextFieldDataCadastro.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo DATA DE CADASTRO para prosseguir");
            jFormattedTextFieldDataCadastro.requestFocus();
        }else if (jFormattedTextFieldCPF.getText().trim().length() < 14 || jFormattedTextFieldCPF.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo CPF para prosseguir");
            jFormattedTextFieldCPF.requestFocus();
        }else if (jFormattedTextFieldRG.getText().trim().length() < 12 || jFormattedTextFieldRG.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo RG para prosseguir");
            jFormattedTextFieldRG.requestFocus();            
        }else if (jComboBoxSexo.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(null, "Preencha o campo SEXO para prosseguir");
            jComboBoxSexo.requestFocus();
        }else if (jComboBoxEstadoCivil.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Preencha o campo ESTADO CIVIL para prosseguir");
            jComboBoxEstadoCivil.requestFocus();                       
        }else if (jFormattedTextFieldDataNascimento.getText().trim().length() < 10 || jFormattedTextFieldDataCadastro.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo DATA DE NASCIMENTO para prosseguir");
            jFormattedTextFieldDataNascimento.requestFocus();
        }else if (jComboBoxSituacao.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Preencha o campo SITUAÇÃO para prosseguir");
            jComboBoxSituacao.requestFocus();  
        }else if (jTextFieldObservacoes.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo OBSERVAÇÕES para prosseguir");
            jTextFieldObservacoes.requestFocus();              
        }else if (jTextFieldEndereco.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo ENDEREÇO para prosseguir");
            jTextFieldEndereco.requestFocus();
        }else if (jTextFieldNumero.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo NÚMERO para prosseguir");
            jTextFieldNumero.requestFocus();
        }else if (jTextFieldComplemento.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo COMPLEMENTO para prosseguir");
            jTextFieldComplemento.requestFocus();    
        }else if (jTextFieldBairro.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo BAIRRO para prosseguir");
            jTextFieldBairro.requestFocus();    
        }else if (jFormattedTextFieldCEP.getText().trim().length() < 10 || jFormattedTextFieldCEP.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo CEP para prosseguir");
            jFormattedTextFieldCEP.requestFocus();            
        }else if (jComboBoxCidade.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Preencha o campo CIDADE para prosseguir");
            jComboBoxCidade.requestFocus();
        }else if (jComboBoxEstado.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Preencha o campo ESTADO para prosseguir");
            jComboBoxEstado.requestFocus();
        }else if (jTextFieldEmail.getText().isEmpty() || jTextFieldEmail.getText().equals("@")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo E-MAIL para prosseguir");
            jTextFieldEmail.requestFocus();        
        }else if (jFormattedTextFieldTelefone.getText().trim().length() < 13 || jFormattedTextFieldTelefone.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo TELEFONE para prosseguir");
            jFormattedTextFieldTelefone.requestFocus();
        }else if (jFormattedTextFieldCelular.getText().trim().length() < 14 || jFormattedTextFieldCelular.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo CELULAR para prosseguir");
            jFormattedTextFieldCelular.requestFocus();        
        }else

            //== "")
            
            // FUNÇÃO INSERIR DADOS
            
            if(flag==1) {
                
                // mod.setID(Integer.parseInt(jTextFieldID.getText()));
                mod.setNome(jTextFieldNome.getText());
                mod.setDataCadastro(jFormattedTextFieldDataCadastro.getText());
                mod.setCPF(jFormattedTextFieldCPF.getText());
                mod.setRG(jFormattedTextFieldRG.getText());
                mod.setSexo((String)(jComboBoxSexo.getSelectedItem()));
                mod.setEstadoCivil((String)(jComboBoxEstadoCivil.getSelectedItem()));
                mod.setDataNascimento(jFormattedTextFieldDataNascimento.getText());
                mod.setSituacao((String)(jComboBoxSituacao.getSelectedItem()));
                mod.setObservacoes(jTextFieldObservacoes.getText());
                mod.setEndereco(jTextFieldEndereco.getText());
                mod.setNumero(Integer.parseInt(jTextFieldNumero.getText()));
                mod.setComplemento(jTextFieldComplemento.getText());
                mod.setBairro(jTextFieldBairro.getText());
                mod.setCEP(jFormattedTextFieldCEP.getText());
                mod.setCidade((String)(jComboBoxCidade.getSelectedItem()));
                mod.setEstado((String)(jComboBoxEstado.getSelectedItem()));
                mod.setEmail(jTextFieldEmail.getText());
                mod.setTelefone(jFormattedTextFieldTelefone.getText());
                mod.setCelular(jFormattedTextFieldCelular.getText());
                
                dao.Salvar(mod);
                
                jTextFieldID.setText("");
                jTextFieldNome.setText("");
                jFormattedTextFieldDataCadastro.setText("");
                jFormattedTextFieldCPF.setText("");
                jFormattedTextFieldRG.setText("");
                jComboBoxSexo.setSelectedItem(null);
                jComboBoxEstadoCivil.setSelectedItem(null);
                jFormattedTextFieldDataNascimento.setText("");
                jComboBoxSituacao.setSelectedItem(null);
                jTextFieldObservacoes.setText("");
                jTextFieldEndereco.setText("");
                jTextFieldNumero.setText("");
                jTextFieldComplemento.setText("");
                jTextFieldBairro.setText("");
                jFormattedTextFieldCEP.setText("");
                jComboBoxCidade.setSelectedItem(null);
                jComboBoxEstado.setSelectedItem(null);
                jTextFieldEmail.setText("");
                jFormattedTextFieldTelefone.setText("");
                jFormattedTextFieldCelular.setText("");
                
                jTextFieldID.setEnabled(false);
                jTextFieldNome.setEnabled(false);
                jFormattedTextFieldDataCadastro.setEnabled(false);
                jFormattedTextFieldCPF.setEnabled(false);
                jFormattedTextFieldRG.setEnabled(false);
                jComboBoxSexo.setEnabled(false);
                jComboBoxEstadoCivil.setEnabled(false);
                jFormattedTextFieldDataNascimento.setEnabled(false);
                jComboBoxSituacao.setEnabled(false);
                jTextFieldObservacoes.setEnabled(false);
                jTextFieldEndereco.setEnabled(false);
                jTextFieldNumero.setEnabled(false);
                jTextFieldComplemento.setEnabled(false);
                jTextFieldBairro.setEnabled(false);
                jFormattedTextFieldCEP.setEnabled(false);
                jComboBoxCidade.setEnabled(false);
                jComboBoxEstado.setEnabled(false);
                jTextFieldEmail.setEnabled(false);
                jFormattedTextFieldTelefone.setEnabled(false);
                jFormattedTextFieldCelular.setEnabled(false);
                
                jTextFieldPesquisaCliente.setEnabled(true);
                
                jButtonNovo.setEnabled(true);
                jButtonSalvar.setEnabled(false);
                jButtonEditar.setEnabled(false);
                jButtonCancelar.setEnabled(false);
                jButtonExcluir.setEnabled(false);
                jButtonPesquisar.setEnabled(true);
                preencherTabela("select *from clientes order by nome_cliente");
                
                // FUNÇÃO ALTERAR DADOS
                
            }else{
                
                mod.setID(Integer.parseInt(jTextFieldID.getText()));
                mod.setNome(jTextFieldNome.getText());
                mod.setDataCadastro(jFormattedTextFieldDataCadastro.getText());
                mod.setCPF(jFormattedTextFieldCPF.getText());
                mod.setRG(jFormattedTextFieldRG.getText());
                mod.setSexo((String)(jComboBoxSexo.getSelectedItem()));
                mod.setEstadoCivil((String)(jComboBoxEstadoCivil.getSelectedItem()));
                mod.setDataNascimento(jFormattedTextFieldDataNascimento.getText());
                mod.setSituacao((String)(jComboBoxSituacao.getSelectedItem()));
                mod.setObservacoes(jTextFieldObservacoes.getText());
                mod.setEndereco(jTextFieldEndereco.getText());
                mod.setNumero(Integer.parseInt(jTextFieldNumero.getText()));
                mod.setComplemento(jTextFieldComplemento.getText());
                mod.setBairro(jTextFieldBairro.getText());
                mod.setCEP(jFormattedTextFieldCEP.getText());
                mod.setCidade((String)(jComboBoxCidade.getSelectedItem()));
                mod.setEstado((String)(jComboBoxEstado.getSelectedItem()));
                mod.setEmail(jTextFieldEmail.getText());
                mod.setTelefone(jFormattedTextFieldTelefone.getText());
                mod.setCelular(jFormattedTextFieldCelular.getText());
                
                dao.Alterar(mod);
                
                jTextFieldID.setText("");
                jTextFieldNome.setText("");
                jFormattedTextFieldDataCadastro.setText("");
                jFormattedTextFieldCPF.setText("");
                jFormattedTextFieldRG.setText("");
                jComboBoxSexo.setSelectedItem(null);
                jComboBoxEstadoCivil.setSelectedItem(null);
                jFormattedTextFieldDataNascimento.setText("");
                jComboBoxSituacao.setSelectedItem(null);
                jTextFieldObservacoes.setText("");
                jTextFieldEndereco.setText("");
                jTextFieldNumero.setText("");
                jTextFieldComplemento.setText("");
                jTextFieldBairro.setText("");
                jFormattedTextFieldCEP.setText("");
                jComboBoxCidade.setSelectedItem(null);
                jComboBoxEstado.setSelectedItem(null);
                jTextFieldEmail.setText("");
                jFormattedTextFieldTelefone.setText("");
                jFormattedTextFieldCelular.setText("");
                
                jTextFieldPesquisaCliente.setText("");
                
                jTextFieldID.setEnabled(false);
                jTextFieldNome.setEnabled(false);
                jFormattedTextFieldDataCadastro.setEnabled(false);
                jFormattedTextFieldCPF.setEnabled(false);
                jFormattedTextFieldRG.setEnabled(false);
                jComboBoxSexo.setEnabled(false);
                jComboBoxEstadoCivil.setEnabled(false);
                jFormattedTextFieldDataNascimento.setEnabled(false);
                jComboBoxSituacao.setEnabled(false);
                jTextFieldObservacoes.setEnabled(false);
                jTextFieldEndereco.setEnabled(false);
                jTextFieldNumero.setEnabled(false);
                jTextFieldComplemento.setEnabled(false);
                jTextFieldBairro.setEnabled(false);
                jFormattedTextFieldCEP.setEnabled(false);
                jComboBoxCidade.setEnabled(false);
                jComboBoxEstado.setEnabled(false);
                jTextFieldEmail.setEnabled(false);
                jFormattedTextFieldTelefone.setEnabled(false);
                jFormattedTextFieldCelular.setEnabled(false);
                
                jTextFieldPesquisaCliente.setEnabled(true);
                jTableClientes.setVisible(true);
                
                jButtonNovo.setEnabled(true);
                jButtonSalvar.setEnabled(false);
                jButtonEditar.setEnabled(false);
                jButtonCancelar.setEnabled(false);
                jButtonExcluir.setEnabled(false);
                jButtonPesquisar.setEnabled(true);
                
                preencherTabela("select *from clientes order by nome_cliente");
                
            
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed
   
    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        flag = 1;

        jTextFieldNome.setEnabled(true);
        jFormattedTextFieldDataCadastro.setEnabled(true);
        jFormattedTextFieldCPF.setEnabled(true);
        jFormattedTextFieldRG.setEnabled(true);
        jComboBoxSexo.setEnabled(true);
        jComboBoxEstadoCivil.setEnabled(true);
        jFormattedTextFieldDataNascimento.setEnabled(true);
        jComboBoxSituacao.setEnabled(true);
        jTextFieldObservacoes.setEnabled(true);        
        jTextFieldEndereco.setEnabled(true);
        jTextFieldNumero.setEnabled(true);
        jTextFieldComplemento.setEnabled(true);
        jTextFieldBairro.setEnabled(true);
        jFormattedTextFieldCEP.setEnabled(true);        
        jComboBoxCidade.setEnabled(true);
        jComboBoxEstado.setEnabled(true);
        jTextFieldEmail.setEnabled(true);        
        jFormattedTextFieldTelefone.setEnabled(true);
        jFormattedTextFieldCelular.setEnabled(true);
        
        jTextFieldPesquisaCliente.setEnabled(false);

        jTextFieldID.setText("");
            jTextFieldNome.setText("");
            jFormattedTextFieldDataCadastro.setText("");
            jFormattedTextFieldCPF.setText("");
            jFormattedTextFieldRG.setText("");
            jComboBoxSexo.setSelectedItem(null);
            jComboBoxEstadoCivil.setSelectedItem(null);
            jFormattedTextFieldDataNascimento.setText("");
            jComboBoxSituacao.setSelectedItem(null);
            jTextFieldObservacoes.setText("");                
            jTextFieldEndereco.setText("");
            jTextFieldNumero.setText("");
            jTextFieldComplemento.setText("");
            jTextFieldBairro.setText("");
            jFormattedTextFieldCEP.setText("");
            jComboBoxCidade.setSelectedItem(null);
            jComboBoxEstado.setSelectedItem(null);
            jTextFieldEmail.setText("");            
            jFormattedTextFieldTelefone.setText("");
            jFormattedTextFieldCelular.setText("");
            
        jTextFieldPesquisaCliente.setText("");
        
        //jRadioButtonClienteAnalise.setText("");
        //jRadioButtonClienteDevedor.setText("");
        //jRadioButtonClienteLiberdo.setText("");

        jButtonNovo.setEnabled(false);
        jButtonSalvar.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonCancelar.setEnabled(true);
        jButtonExcluir.setEnabled(false);
        jButtonPesquisar.setEnabled(false);

    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jTableClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClientesMouseClicked
        String nome_cliente = "" + jTableClientes.getValueAt(jTableClientes.getSelectedRow(), 1);
        conecta.conexao();
        conecta.executaSQL("select *from clientes where nome_cliente = '"+ nome_cliente + "'");
        try {
        conecta.rs.first();
        jTextFieldID.setText(String.valueOf(conecta.rs.getInt("id_cliente")));
        jTextFieldNome.setText(conecta.rs.getString("nome_cliente"));
        jFormattedTextFieldDataCadastro.setText(conecta.rs.getString("datacadastro_cliente"));
        jFormattedTextFieldCPF.setText(conecta.rs.getString("cpf_cliente"));
        jFormattedTextFieldRG.setText(conecta.rs.getString("rg_cliente"));
        jComboBoxSexo.setSelectedItem(conecta.rs.getString("sexo_cliente"));
        jComboBoxEstadoCivil.setSelectedItem(conecta.rs.getString("estadocivil_cliente"));
        jFormattedTextFieldDataNascimento.setText(conecta.rs.getString("datanascimento_cliente"));
        jComboBoxSituacao.setSelectedItem(conecta.rs.getString("situacao_cliente"));
        jTextFieldObservacoes.setText(conecta.rs.getString("observacoes_cliente"));        
        jTextFieldEndereco.setText(conecta.rs.getString("endereco_cliente"));
        jTextFieldNumero.setText(String.valueOf(conecta.rs.getInt("numero_cliente")));
        jTextFieldComplemento.setText(conecta.rs.getString("complemento_cliente"));
        jTextFieldBairro.setText(conecta.rs.getString("bairro_cliente"));
        jFormattedTextFieldCEP.setText(conecta.rs.getString("cep_cliente"));
        jComboBoxCidade.setSelectedItem(conecta.rs.getString("cidade_cliente"));
        jComboBoxEstado.setSelectedItem(conecta.rs.getString("estado_cliente"));
        jTextFieldEmail.setText(conecta.rs.getString("email_cliente"));
        jFormattedTextFieldTelefone.setText(conecta.rs.getString("telefone_cliente"));
        jFormattedTextFieldCelular.setText(conecta.rs.getString("celular_cliente"));        
        
        }catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao selecionar item!"+ex);
        }
        jButtonNovo.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jButtonEditar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jButtonPesquisar.setEnabled(false);
        
        //jTableClientes.setEnabled(false);
        jTableClientes.setVisible(false);

        jTextFieldPesquisaCliente.setEnabled(false);
        jTextFieldPesquisaCliente.setText("");
        
        //jTabbedPane1.setSelectedComponent(jPanelCadastroCliente);        
        
        conecta.desconexao();
    }//GEN-LAST:event_jTableClientesMouseClicked

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        mod.setPesquisar(jTextFieldPesquisaCliente.getText());
        BeansCadClientes model = dao.BuscaCliente(mod);
        /*jTextFieldID.setText(String.valueOf(model.getID())); 
        jTextFieldNome.setText(model.getNome());
        jFormattedTextFieldDataCadastro.setText(model.getDataCadastro());
        jFormattedTextFieldCPF.setText(model.getCPF());
        jFormattedTextFieldRG.setText(model.getRG());
        jFormattedTextFieldDataCadastro.setText(model.getDataCadastro());
        jComboBoxSexo.setSelectedItem(model.getSexo());
        jComboBoxEstadoCivil.setSelectedItem(model.getEstadoCivil());
        jFormattedTextFieldDataNascimento.setText(model.getDataNascimento());
        jComboBoxSituacao.setSelectedItem(model.getSituacao());
        jTextFieldObservacoes.setText(model.getObservacoes());        
        jTextFieldEndereco.setText(model.getEndereco());
        jTextFieldNumero.setText(String.valueOf(model.getNumero()));
        jTextFieldComplemento.setText(model.getDataCadastro());
        jTextFieldBairro.setText(model.getBairro());
        jFormattedTextFieldCEP.setText(model.getCEP());
        jComboBoxCidade.setSelectedItem(model.getCidade());
        jComboBoxEstado.setSelectedItem(model.getEstado());
        jTextFieldEmail.setText(model.getEmail());        
        jFormattedTextFieldTelefone.setText(model.getTelefone());
        jFormattedTextFieldCelular.setText(model.getCelular());*/
                
        //this.pesquisarClientes.setVisible(true);
        //this.jTextFieldPesquisaCliente.setText((this.pesquisarClientes.getCliente()));
        
        jTextFieldPesquisaCliente.setText("");
        
        jButtonNovo.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jButtonEditar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        //jButtonPesquisar.setEnabled(false);
        
        preencherTabela("select *from clientes where nome_cliente like'%"+mod.getPesquisar()+"%'");
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jTextFieldPesquisaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesquisaClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPesquisaClienteActionPerformed

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {                
                CadastroClientes dialog = new CadastroClientes(new javax.swing.JFrame(), true);
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
    private javax.swing.ButtonGroup buttonGroupStatus;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxCidade;
    private javax.swing.JComboBox<String> jComboBoxEstado;
    private javax.swing.JComboBox<String> jComboBoxEstadoCivil;
    private javax.swing.JComboBox<String> jComboBoxSexo;
    private javax.swing.JComboBox<String> jComboBoxSituacao;
    private javax.swing.JFormattedTextField jFormattedTextFieldCEP;
    private javax.swing.JFormattedTextField jFormattedTextFieldCPF;
    private javax.swing.JFormattedTextField jFormattedTextFieldCelular;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataCadastro;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataNascimento;
    private javax.swing.JFormattedTextField jFormattedTextFieldRG;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefone;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JLabel jLabelCEP;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelCadastroClientes;
    private javax.swing.JLabel jLabelCelular;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelDataCadastro;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelEndereco1;
    private javax.swing.JLabel jLabelEndereco2;
    private javax.swing.JLabel jLabelEndereco3;
    private javax.swing.JLabel jLabelEndereco4;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelObservacoes;
    private javax.swing.JLabel jLabelPesquisaClientes;
    private javax.swing.JLabel jLabelRG;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JPanel jPanelCadastroCliente;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTableClientes;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldComplemento;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JTextField jTextFieldObservacoes;
    private javax.swing.JTextField jTextFieldPesquisaCliente;
    // End of variables declaration//GEN-END:variables
}

