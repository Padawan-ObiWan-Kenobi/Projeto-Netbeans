
package CodigoInutlizado;

import Conexao.ConexaoBD;
import ModeloBeans.BeansCadClientes;
import ModeloDao.DaoCadClientes;
import ModeloDao.PreencherTabela;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

public class CadastroClientes3 extends javax.swing.JDialog {
    BeansCadClientes mod = new BeansCadClientes();
    DaoCadClientes dao =  new DaoCadClientes();
    ConexaoBD conecta = new ConexaoBD();       
    int flag = 0;
    int select;
    
    public CadastroClientes3(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        preencherTabela("select *from clientes order by nome_cliente");
        //preencherStatus();
    }    

    CadastroClientes3() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupStatus = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelDadosCadastrais = new javax.swing.JPanel();
        jTextFieldEndereco = new javax.swing.JTextField();
        jLabelDataCadastro = new javax.swing.JLabel();
        jLabelNumero = new javax.swing.JLabel();
        jTextFieldNumero = new javax.swing.JTextField();
        jLabelCidade = new javax.swing.JLabel();
        jTextFieldCidade = new javax.swing.JTextField();
        jLabelEstado = new javax.swing.JLabel();
        jLabelCEP = new javax.swing.JLabel();
        jLabelTelefone = new javax.swing.JLabel();
        jLabelCelular = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEstado = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelStatus = new javax.swing.JLabel();
        jLabelID = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelEndereco = new javax.swing.JLabel();
        jLabelBairro = new javax.swing.JLabel();
        jTextFieldBairro = new javax.swing.JTextField();
        jComboBoxStatus = new javax.swing.JComboBox<>();
        jFormattedTextFieldCEP = new javax.swing.JFormattedTextField();
        jFormattedTextFieldTelefone = new javax.swing.JFormattedTextField();
        jFormattedTextFieldCelular = new javax.swing.JFormattedTextField();
        jPanelObservacoes = new javax.swing.JPanel();
        jTextPaneObservacoes = new javax.swing.JTextPane();
        jLabelObservacoes = new javax.swing.JLabel();
        jFormattedTextFieldDataCadastro = new javax.swing.JFormattedTextField();
        jPanelPesquisa = new javax.swing.JPanel();
        jLabelPesquisarCliente = new javax.swing.JLabel();
        jTextFieldPesquisaCliente = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CADASTRO DE CLIENTES");

        jTabbedPane1.setForeground(new java.awt.Color(102, 102, 255));
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jPanelDadosCadastrais.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextFieldEndereco.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldEndereco.setForeground(new java.awt.Color(102, 102, 255));
        jTextFieldEndereco.setEnabled(false);

        jLabelDataCadastro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelDataCadastro.setForeground(new java.awt.Color(102, 102, 255));
        jLabelDataCadastro.setText("Data de Cadastro");

        jLabelNumero.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelNumero.setForeground(new java.awt.Color(102, 102, 255));
        jLabelNumero.setText("Nº");

        jTextFieldNumero.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldNumero.setForeground(new java.awt.Color(102, 102, 255));
        jTextFieldNumero.setEnabled(false);

        jLabelCidade.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelCidade.setForeground(new java.awt.Color(102, 102, 255));
        jLabelCidade.setText("Cidade");

        jTextFieldCidade.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldCidade.setForeground(new java.awt.Color(102, 102, 255));
        jTextFieldCidade.setEnabled(false);

        jLabelEstado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelEstado.setForeground(new java.awt.Color(102, 102, 255));
        jLabelEstado.setText("Estado");

        jLabelCEP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelCEP.setForeground(new java.awt.Color(102, 102, 255));
        jLabelCEP.setText("CEP");

        jLabelTelefone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelTelefone.setForeground(new java.awt.Color(102, 102, 255));
        jLabelTelefone.setText("Telefone");

        jLabelCelular.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelCelular.setForeground(new java.awt.Color(102, 102, 255));
        jLabelCelular.setText("Celular");

        jLabelEmail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelEmail.setForeground(new java.awt.Color(102, 102, 255));
        jLabelEmail.setText("E-mail");

        jTextFieldEstado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldEstado.setForeground(new java.awt.Color(102, 102, 255));
        jTextFieldEstado.setEnabled(false);

        jTextFieldEmail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldEmail.setForeground(new java.awt.Color(102, 102, 255));
        jTextFieldEmail.setEnabled(false);

        jLabelStatus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelStatus.setForeground(new java.awt.Color(102, 102, 255));
        jLabelStatus.setText("Status");

        jLabelID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelID.setForeground(new java.awt.Color(102, 102, 255));
        jLabelID.setText("ID");

        jTextFieldID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldID.setForeground(new java.awt.Color(102, 102, 255));
        jTextFieldID.setEnabled(false);

        jLabelNome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelNome.setForeground(new java.awt.Color(102, 102, 255));
        jLabelNome.setText("Nome");

        jTextFieldNome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldNome.setForeground(new java.awt.Color(102, 102, 255));
        jTextFieldNome.setEnabled(false);

        jLabelEndereco.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelEndereco.setForeground(new java.awt.Color(102, 102, 255));
        jLabelEndereco.setText("Endereço");

        jLabelBairro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelBairro.setForeground(new java.awt.Color(102, 102, 255));
        jLabelBairro.setText("Bairro");

        jTextFieldBairro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldBairro.setForeground(new java.awt.Color(102, 102, 255));
        jTextFieldBairro.setEnabled(false);

        jComboBoxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma opção", "Devedor", "Em Análise", "Liberado", " " }));
        jComboBoxStatus.setEnabled(false);

        jFormattedTextFieldCEP.setForeground(new java.awt.Color(102, 102, 255));
        try {
            jFormattedTextFieldCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCEP.setEnabled(false);
        jFormattedTextFieldCEP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jFormattedTextFieldTelefone.setForeground(new java.awt.Color(102, 102, 255));
        try {
            jFormattedTextFieldTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldTelefone.setEnabled(false);
        jFormattedTextFieldTelefone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jFormattedTextFieldCelular.setForeground(new java.awt.Color(102, 102, 255));
        try {
            jFormattedTextFieldCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCelular.setEnabled(false);
        jFormattedTextFieldCelular.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jPanelObservacoes.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextPaneObservacoes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextPaneObservacoes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextPaneObservacoes.setForeground(new java.awt.Color(102, 102, 255));
        jTextPaneObservacoes.setEnabled(false);

        jLabelObservacoes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelObservacoes.setForeground(new java.awt.Color(102, 102, 255));
        jLabelObservacoes.setText("Observações");

        javax.swing.GroupLayout jPanelObservacoesLayout = new javax.swing.GroupLayout(jPanelObservacoes);
        jPanelObservacoes.setLayout(jPanelObservacoesLayout);
        jPanelObservacoesLayout.setHorizontalGroup(
            jPanelObservacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelObservacoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelObservacoes)
                .addGap(462, 462, 462))
            .addGroup(jPanelObservacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextPaneObservacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelObservacoesLayout.setVerticalGroup(
            jPanelObservacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelObservacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelObservacoes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextPaneObservacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jFormattedTextFieldDataCadastro.setForeground(new java.awt.Color(102, 102, 255));
        try {
            jFormattedTextFieldDataCadastro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldDataCadastro.setEnabled(false);
        jFormattedTextFieldDataCadastro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanelDadosCadastraisLayout = new javax.swing.GroupLayout(jPanelDadosCadastrais);
        jPanelDadosCadastrais.setLayout(jPanelDadosCadastraisLayout);
        jPanelDadosCadastraisLayout.setHorizontalGroup(
            jPanelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosCadastraisLayout.createSequentialGroup()
                .addGroup(jPanelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDadosCadastraisLayout.createSequentialGroup()
                        .addGroup(jPanelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelDadosCadastraisLayout.createSequentialGroup()
                                .addComponent(jLabelTelefone)
                                .addGap(18, 18, 18)
                                .addComponent(jFormattedTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelCelular)
                                .addGap(18, 18, 18)
                                .addComponent(jFormattedTextFieldCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelDadosCadastraisLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(jPanelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelEmail)
                                    .addComponent(jLabelStatus))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelDadosCadastraisLayout.createSequentialGroup()
                                        .addComponent(jComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 123, Short.MAX_VALUE))
                                    .addComponent(jTextFieldEmail))))
                        .addGap(149, 149, 149))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDadosCadastraisLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelCidade)
                            .addComponent(jLabelEndereco)
                            .addComponent(jLabelNome)
                            .addComponent(jLabelID)
                            .addComponent(jLabelBairro))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDadosCadastraisLayout.createSequentialGroup()
                                .addGroup(jPanelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelDadosCadastraisLayout.createSequentialGroup()
                                        .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabelDataCadastro))
                                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addComponent(jFormattedTextFieldDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelDadosCadastraisLayout.createSequentialGroup()
                                .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelEstado)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelCEP)
                                    .addComponent(jLabelNumero)))
                            .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jFormattedTextFieldCEP)
                            .addGroup(jPanelDadosCadastraisLayout.createSequentialGroup()
                                .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)))))
                .addGap(18, 18, 18))
            .addGroup(jPanelDadosCadastraisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelObservacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelDadosCadastraisLayout.setVerticalGroup(
            jPanelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosCadastraisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelID)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDataCadastro)
                    .addComponent(jFormattedTextFieldDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEndereco)
                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNumero)
                    .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCidade)
                    .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEstado)
                    .addComponent(jLabelCEP)
                    .addComponent(jTextFieldEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBairro))
                .addGap(18, 18, 18)
                .addGroup(jPanelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelefone)
                    .addComponent(jLabelCelular)
                    .addComponent(jFormattedTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEmail))
                .addGap(18, 18, 18)
                .addGroup(jPanelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelStatus))
                .addGap(18, 18, 18)
                .addComponent(jPanelObservacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(136, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CADASTRO CLIENTES", jPanelDadosCadastrais);
        jPanelDadosCadastrais.getAccessibleContext().setAccessibleName("tab1");

        jPanelPesquisa.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelPesquisarCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelPesquisarCliente.setForeground(new java.awt.Color(102, 102, 255));
        jLabelPesquisarCliente.setText("Pesquisar Cliente");

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

        jTableClientes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTableClientes.setForeground(new java.awt.Color(102, 102, 255));
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
        jTableClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClientesMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTableClientes);

        javax.swing.GroupLayout jPanelPesquisaLayout = new javax.swing.GroupLayout(jPanelPesquisa);
        jPanelPesquisa.setLayout(jPanelPesquisaLayout);
        jPanelPesquisaLayout.setHorizontalGroup(
            jPanelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesquisaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelPesquisaLayout.createSequentialGroup()
                        .addComponent(jLabelPesquisarCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonPesquisar)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanelPesquisaLayout.setVerticalGroup(
            jPanelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesquisaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPesquisar)
                    .addComponent(jLabelPesquisarCliente)
                    .addComponent(jTextFieldPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("PESQUISA CLIENTES", jPanelPesquisa);
        jPanelPesquisa.getAccessibleContext().setAccessibleName("tab2");

        jButtonNovo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonNovo.setForeground(new java.awt.Color(102, 102, 255));
        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonSalvar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonSalvar.setForeground(new java.awt.Color(102, 102, 255));
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonEditar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonEditar.setForeground(new java.awt.Color(102, 102, 255));
        jButtonEditar.setText("Editar");
        jButtonEditar.setEnabled(false);
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(102, 102, 255));
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonExcluir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonExcluir.setForeground(new java.awt.Color(102, 102, 255));
        jButtonExcluir.setText("Excluir");
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
                        .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonExcluir))
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovo)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonEditar)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonExcluir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("CADASTRO CLIENTES");
        jTabbedPane1.getAccessibleContext().setAccessibleDescription("");

        setSize(new java.awt.Dimension(619, 603));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void preencherTabela(String Sql) {
        ArrayList dados = new ArrayList();
        String [] colunas = new String [] {"ID","Data Cadastro","Nome","Endereço","Numero","Cidade","Estado","CEP","Bairro","Telefone","Celular","E-mail","Status Cliente","Observações"};
        conecta.conexao();
        conecta.executaSQL(Sql);
        
        try{
            conecta.rs.first();
            do{
                dados.add(new Object[] {conecta.rs.getInt("id_cliente"),conecta.rs.getString("datacadastro_cliente"),conecta.rs.getString("nome_cliente"),conecta.rs.getString("endereco_cliente"),conecta.rs.getInt("numero_cliente"),conecta.rs.getString("cidade_cliente"),conecta.rs.getString("estado_cliente"),conecta.rs.getString("cep_cliente"),conecta.rs.getString("bairro_cliente"),conecta.rs.getString("telefone_cliente"),conecta.rs.getString("celular_cliente"),conecta.rs.getString("email_cliente"),conecta.rs.getString("status_cliente"),conecta.rs.getString("observacoes_cliente")});                
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
            jFormattedTextFieldDataCadastro.setText("");
            jTextFieldNome.setText("");
            jTextFieldEndereco.setText("");
            jTextFieldNumero.setText("");
            jTextFieldCidade.setText("");
            jTextFieldEstado.setText("");
            jFormattedTextFieldCEP.setText("");
            jTextFieldBairro.setText("");
            jFormattedTextFieldTelefone.setText("");
            jFormattedTextFieldCelular.setText("");
            jTextFieldEmail.setText("");
            jComboBoxStatus.setSelectedItem(null);
            jTextPaneObservacoes.setText("");
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
        jFormattedTextFieldDataCadastro.setEnabled(false);
        jTextFieldNome.setEnabled(false);
        jTextFieldEndereco.setEnabled(false);
        jTextFieldNumero.setEnabled(false);
        jTextFieldCidade.setEnabled(false);
        jTextFieldEstado.setEnabled(false);
        jFormattedTextFieldCEP.setEnabled(false);
        jTextFieldBairro.setEnabled(false);
        jFormattedTextFieldTelefone.setEnabled(false);
        jFormattedTextFieldCelular.setEnabled(false);
        jTextFieldEmail.setEnabled(false);
        jComboBoxStatus.setEnabled(false);
        jTextPaneObservacoes.setEnabled(false);
        jTextFieldPesquisaCliente.setEnabled(true);
        jTableClientes.setVisible(true);

        jTextFieldID.setText("");
        jFormattedTextFieldDataCadastro.setText("");
        jTextFieldNome.setText("");
        jTextFieldEndereco.setText("");
        jTextFieldNumero.setText("");
        jTextFieldCidade.setText("");
        jTextFieldEstado.setText("");
        jFormattedTextFieldCEP.setText("");
        jTextFieldBairro.setText("");
        jFormattedTextFieldTelefone.setText("");
        jFormattedTextFieldCelular.setText("");
        jTextFieldEmail.setText("");
        jComboBoxStatus.setSelectedItem(null);
        jTextPaneObservacoes.setText("");

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
        jFormattedTextFieldDataCadastro.setEnabled(true);
        jTextFieldNome.setEnabled(true);
        jTextFieldEndereco.setEnabled(true);
        jTextFieldNumero.setEnabled(true);
        jTextFieldCidade.setEnabled(true);
        jTextFieldEstado.setEnabled(true);
        jFormattedTextFieldCEP.setEnabled(true);
        jTextFieldBairro.setEnabled(true);
        jFormattedTextFieldTelefone.setEnabled(true);
        jFormattedTextFieldCelular.setEnabled(true);
        jTextFieldEmail.setEnabled(true);
        jComboBoxStatus.setEnabled(true);
        jTextPaneObservacoes.setEnabled(true);
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
        if (jFormattedTextFieldDataCadastro.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo DATA DE CADASTRO para prosseguir");
            jFormattedTextFieldDataCadastro.requestFocus();        
        }else if (jTextFieldNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo NOME para prosseguir");
            jTextFieldNome.requestFocus();
        }else if (jTextFieldEndereco.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo ENDEREÇO para prosseguir");
            jTextFieldEndereco.requestFocus();
        }else if (jTextFieldNumero.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo NÚMERO para prosseguir");
            jTextFieldNumero.requestFocus();
        }else if (jTextFieldCidade.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo CIDADE para prosseguir");
            jTextFieldCidade.requestFocus();
        }else if (jTextFieldEstado.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo ESTADO para prosseguir");
            jTextFieldEstado.requestFocus();
        }else if (jFormattedTextFieldCEP.getText().trim().length() < 10 || jFormattedTextFieldCEP.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo CEP para prosseguir");
            jFormattedTextFieldCEP.requestFocus();
        }else if (jTextFieldBairro.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo BAIRRO para prosseguir");
            jTextFieldBairro.requestFocus();
        }else if (jFormattedTextFieldTelefone.getText().trim().length() < 13 || jFormattedTextFieldTelefone.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo TELEFONE para prosseguir");
            jFormattedTextFieldTelefone.requestFocus();
        }else if (jFormattedTextFieldCelular.getText().trim().length() < 14 || jFormattedTextFieldCelular.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo CELULAR para prosseguir");
            jFormattedTextFieldCelular.requestFocus();
        }else if (jTextFieldEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo E-MAIL para prosseguir");
            jTextFieldEmail.requestFocus();            

        }else if (jTextPaneObservacoes.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo OBSERVAÇÕES para prosseguir");
            jTextPaneObservacoes.requestFocus();

        }else

        // FUNÇÃO INSERIR DADOS

        if(flag==1) {

            // mod.setID(Integer.parseInt(jTextFieldID.getText()));
            mod.setDataCadastro(jFormattedTextFieldDataCadastro.getText());
            mod.setNome(jTextFieldNome.getText());
            mod.setEndereco(jTextFieldEndereco.getText());
            mod.setNumero(Integer.parseInt(jTextFieldNumero.getText()));
            mod.setCidade(jTextFieldCidade.getText());
            mod.setEstado(jTextFieldEstado.getText());
            mod.setCEP(jFormattedTextFieldCEP.getText());
            mod.setBairro(jTextFieldBairro.getText());
            mod.setTelefone(jFormattedTextFieldTelefone.getText());
            mod.setCelular(jFormattedTextFieldCelular.getText());
            mod.setEmail(jTextFieldEmail.getText());
            mod.setObservacoes(jTextPaneObservacoes.getText());
            mod.setSituacao((String)(jComboBoxStatus.getSelectedItem()));
            dao.Salvar(mod);

            jTextFieldID.setText("");
            jFormattedTextFieldDataCadastro.setText("");
            jTextFieldNome.setText("");
            jTextFieldEndereco.setText("");
            jTextFieldNumero.setText("");
            jTextFieldCidade.setText("");
            jTextFieldEstado.setText("");
            jFormattedTextFieldCEP.setText("");
            jTextFieldBairro.setText("");
            jFormattedTextFieldTelefone.setText("");
            jFormattedTextFieldCelular.setText("");
            jTextFieldEmail.setText("");
            jComboBoxStatus.setSelectedItem(null);
            jTextPaneObservacoes.setText("");

            jTextFieldID.setEnabled(false);
            jFormattedTextFieldDataCadastro.setEnabled(false);
            jTextFieldNome.setEnabled(false);
            jTextFieldEndereco.setEnabled(false);
            jTextFieldNumero.setEnabled(false);
            jTextFieldCidade.setEnabled(false);
            jTextFieldEstado.setEnabled(false);
            jFormattedTextFieldCEP.setEnabled(false);
            jTextFieldBairro.setEnabled(false);
            jFormattedTextFieldTelefone.setEnabled(false);
            jFormattedTextFieldCelular.setEnabled(false);
            jTextFieldEmail.setEnabled(false);
            jComboBoxStatus.setEnabled(false);
            jTextPaneObservacoes.setEnabled(false);
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
            mod.setDataCadastro(jFormattedTextFieldDataCadastro.getText());            
            mod.setNome(jTextFieldNome.getText());
            mod.setEndereco(jTextFieldEndereco.getText());
            mod.setNumero(Integer.parseInt(jTextFieldNumero.getText()));
            mod.setCidade(jTextFieldCidade.getText());
            mod.setEstado(jTextFieldEstado.getText());
            mod.setCEP(jFormattedTextFieldCEP.getText());
            mod.setBairro(jTextFieldBairro.getText());
            mod.setTelefone(jFormattedTextFieldTelefone.getText());
            mod.setCelular(jFormattedTextFieldCelular.getText());
            mod.setEmail(jTextFieldEmail.getText());
            mod.setObservacoes(jTextPaneObservacoes.getText());
            mod.setSituacao((String)(jComboBoxStatus.getSelectedItem()));
            dao.Alterar(mod);

            jTextFieldID.setText("");
            jFormattedTextFieldDataCadastro.setText("");
            jTextFieldNome.setText("");
            jTextFieldEndereco.setText("");
            jTextFieldNumero.setText("");
            jTextFieldCidade.setText("");
            jTextFieldEstado.setText("");
            jFormattedTextFieldCEP.setText("");
            jTextFieldBairro.setText("");
            jFormattedTextFieldTelefone.setText("");
            jFormattedTextFieldCelular.setText("");
            jTextFieldEmail.setText("");
            //jComboBoxStatus.setSelectedItem(null);
            jTextPaneObservacoes.setText("");
            jTextFieldPesquisaCliente.setText("");

            jTextFieldID.setEnabled(false);
            jFormattedTextFieldDataCadastro.setEnabled(false);
            jTextFieldNome.setEnabled(false);
            jTextFieldEndereco.setEnabled(false);
            jTextFieldNumero.setEnabled(false);
            jTextFieldCidade.setEnabled(false);
            jTextFieldEstado.setEnabled(false);
            jFormattedTextFieldCEP.setEnabled(false);
            jTextFieldBairro.setEnabled(false);
            jFormattedTextFieldTelefone.setEnabled(false);
            jFormattedTextFieldCelular.setEnabled(false);
            jTextFieldEmail.setEnabled(false);
            jComboBoxStatus.setEnabled(false);
            jTextPaneObservacoes.setEnabled(false);
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

        jFormattedTextFieldDataCadastro.setEnabled(true);
        jTextFieldNome.setEnabled(true);
        jTextFieldEndereco.setEnabled(true);
        jTextFieldNumero.setEnabled(true);
        jTextFieldCidade.setEnabled(true);
        jTextFieldEstado.setEnabled(true);
        jFormattedTextFieldCEP.setEnabled(true);
        jTextFieldBairro.setEnabled(true);
        jFormattedTextFieldTelefone.setEnabled(true);
        jFormattedTextFieldCelular.setEnabled(true);
        jTextFieldEmail.setEnabled(true);
        jComboBoxStatus.setEnabled(true);
        jTextPaneObservacoes.setEnabled(true);
        jTextFieldPesquisaCliente.setEnabled(false);

        jTextFieldID.setText("");
        jFormattedTextFieldDataCadastro.setText("");
        jTextFieldNome.setText("");
        jTextFieldEndereco.setText("");
        jTextFieldNumero.setText("");
        jTextFieldCidade.setText("");
        jTextFieldEstado.setText("");
        jFormattedTextFieldCEP.setText("");
        jTextFieldBairro.setText("");
        jFormattedTextFieldTelefone.setText("");
        jFormattedTextFieldCelular.setText("");
        jTextFieldEmail.setText("");
        //jComboBoxStatus.setSelectedItem(null);
        jTextPaneObservacoes.setText("");
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
        String nome_cliente = "" + jTableClientes.getValueAt(jTableClientes.getSelectedRow(), 2);
        conecta.conexao();
        conecta.executaSQL("select *from clientes where nome_cliente = '"+ nome_cliente + "'");
        try {
        conecta.rs.first();
        jTextFieldID.setText(String.valueOf(conecta.rs.getInt("id_cliente")));
        jFormattedTextFieldDataCadastro.setText(conecta.rs.getString("datacadastro_cliente"));
        jTextFieldNome.setText(conecta.rs.getString("nome_cliente"));
        jTextFieldEndereco.setText(conecta.rs.getString("endereco_cliente"));
        jTextFieldNumero.setText(String.valueOf(conecta.rs.getInt("numero_cliente")));
        jTextFieldCidade.setText(conecta.rs.getString("cidade_cliente"));
        jTextFieldEstado.setText(conecta.rs.getString("estado_cliente"));
        jFormattedTextFieldCEP.setText(conecta.rs.getString("cep_cliente"));
        jTextFieldBairro.setText(conecta.rs.getString("bairro_cliente"));
        jFormattedTextFieldTelefone.setText(conecta.rs.getString("telefone_cliente"));
        jFormattedTextFieldCelular.setText(conecta.rs.getString("celular_cliente")); 
        jTextFieldEmail.setText(conecta.rs.getString("email_cliente")); 
        jTextPaneObservacoes.setText(conecta.rs.getString("observacoes_cliente")); 
        
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

        
        jTextFieldPesquisaCliente.setText("");
        
        jTabbedPane1.setSelectedComponent(jPanelDadosCadastrais);        
        
        conecta.desconexao();
    }//GEN-LAST:event_jTableClientesMouseClicked

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        mod.setPesquisar(jTextFieldPesquisaCliente.getText());
        BeansCadClientes model = dao.BuscaCliente(mod);
        jTextFieldID.setText(String.valueOf(model.getID()));        
        jFormattedTextFieldDataCadastro.setText(model.getDataCadastro());
        jTextFieldNome.setText(model.getNome());
        jTextFieldEndereco.setText(model.getEndereco());
        jTextFieldNumero.setText(String.valueOf(model.getNumero()));
        jTextFieldCidade.setText(model.getCidade());
        jTextFieldEstado.setText(model.getEstado());
        jFormattedTextFieldCEP.setText(model.getCEP());
        jTextFieldBairro.setText(model.getBairro());
        jFormattedTextFieldTelefone.setText(model.getTelefone());
        jFormattedTextFieldCelular.setText(model.getCelular());
        jTextFieldEmail.setText(model.getEmail());
        jComboBoxStatus.setSelectedItem(model.getSituacao());
        jTextPaneObservacoes.setText(model.getObservacoes());
        
        jTextFieldPesquisaCliente.setText("");
        
        jButtonNovo.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jButtonEditar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        //jButtonPesquisar.setEnabled(false);
        
        preencherTabela("select *from clientes where nome_cliente like'%"+mod.getPesquisar()+"%'");
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {                
                CadastroClientes3 dialog = new CadastroClientes3(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> jComboBoxStatus;
    private javax.swing.JFormattedTextField jFormattedTextFieldCEP;
    private javax.swing.JFormattedTextField jFormattedTextFieldCelular;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataCadastro;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefone;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JLabel jLabelCEP;
    private javax.swing.JLabel jLabelCelular;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelDataCadastro;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelObservacoes;
    private javax.swing.JLabel jLabelPesquisarCliente;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JPanel jPanelDadosCadastrais;
    private javax.swing.JPanel jPanelObservacoes;
    private javax.swing.JPanel jPanelPesquisa;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableClientes;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldEstado;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JTextField jTextFieldPesquisaCliente;
    private javax.swing.JTextPane jTextPaneObservacoes;
    // End of variables declaration//GEN-END:variables
}

