
package Tela;

import Conexao.ConexaoBD;
import ModeloBeans.BeansCadFuncionarios;
import ModeloDao.DaoCadFuncionarios;
import ModeloDao.PreencherTabela;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

public class CadastroFuncionarios extends javax.swing.JDialog {
    ConexaoBD conecta = new ConexaoBD();
    BeansCadFuncionarios mod = new BeansCadFuncionarios();
    DaoCadFuncionarios dao =  new DaoCadFuncionarios();
    int flag = 0;
    
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

    /**
     * Creates new form CadastroProdutos
     */
    public CadastroFuncionarios(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        PreencherCidade();
        PreencherUF();
        
        preencherTabela("select *from funcionarios order by nome_funcionario");
        
        
    }

    CadastroFuncionarios() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelCadastroFuncionarios = new javax.swing.JPanel();
        jTextFieldIDFuncionario = new javax.swing.JTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jFormattedTextFieldDataCadastro = new javax.swing.JFormattedTextField();
        jFormattedTextFieldCPF = new javax.swing.JFormattedTextField();
        jFormattedTextFieldRG = new javax.swing.JFormattedTextField();
        jComboBoxSexo = new javax.swing.JComboBox<>();
        jComboBoxEstadoCivil = new javax.swing.JComboBox<>();
        jFormattedTextFieldDataNasc = new javax.swing.JFormattedTextField();
        jFormattedTextFieldTitulo = new javax.swing.JFormattedTextField();
        jFormattedTextFieldZona = new javax.swing.JFormattedTextField();
        jFormattedTextFieldSecao = new javax.swing.JFormattedTextField();
        jFormattedTextFieldCTPS = new javax.swing.JFormattedTextField();
        jFormattedTextFieldSerie = new javax.swing.JFormattedTextField();
        jFormattedTextFieldPIS = new javax.swing.JFormattedTextField();
        jTextFieldEndereco = new javax.swing.JTextField();
        jTextFieldNumero = new javax.swing.JTextField();
        jTextFieldComplemento = new javax.swing.JTextField();
        jTextFieldBairro = new javax.swing.JTextField();
        jFormattedTextFieldCEP = new javax.swing.JFormattedTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jFormattedTextFieldTelefone = new javax.swing.JFormattedTextField();
        jFormattedTextFieldCelular = new javax.swing.JFormattedTextField();
        jComboBoxCargo = new javax.swing.JComboBox<>();
        jTextFieldObservacoes = new javax.swing.JTextField();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelIDFuncionario = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jLabelDataCadastro = new javax.swing.JLabel();
        jLabelCPF = new javax.swing.JLabel();
        jLabelRG = new javax.swing.JLabel();
        jLabelSexo = new javax.swing.JLabel();
        jLabelEstadoCivil = new javax.swing.JLabel();
        jLabelDataNasc = new javax.swing.JLabel();
        jLabelTituloEleitor = new javax.swing.JLabel();
        jLabelZona = new javax.swing.JLabel();
        jLabelSecao = new javax.swing.JLabel();
        jLabelCTPS = new javax.swing.JLabel();
        jLabelSerie = new javax.swing.JLabel();
        jLabelPIS = new javax.swing.JLabel();
        jLabelEndereco = new javax.swing.JLabel();
        jLabelNumero = new javax.swing.JLabel();
        jLabelComplemento = new javax.swing.JLabel();
        jLabelBairro = new javax.swing.JLabel();
        jLabelCEP = new javax.swing.JLabel();
        jLabelCidade = new javax.swing.JLabel();
        jLabelEstado = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelTelefone = new javax.swing.JLabel();
        jLabelCelular = new javax.swing.JLabel();
        jLabelCargo = new javax.swing.JLabel();
        jLabelObservacoes = new javax.swing.JLabel();
        jLabelPesquisarFuncionario = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableFuncionarios = new javax.swing.JTable();
        jComboBoxCidade = new javax.swing.JComboBox<>();
        jComboBoxEstado = new javax.swing.JComboBox<>();
        jButtonCancelar = new javax.swing.JButton();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonPesquisar = new javax.swing.JButton();
        jTextFieldPesquisaFuncionario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CADASTRO DE FUNCIONÁRIOS");

        jPanelCadastroFuncionarios.setBackground(new java.awt.Color(239, 239, 239));
        jPanelCadastroFuncionarios.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextFieldIDFuncionario.setBackground(new java.awt.Color(239, 239, 239));
        jTextFieldIDFuncionario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldIDFuncionario.setForeground(new java.awt.Color(0, 129, 197));
        jTextFieldIDFuncionario.setEnabled(false);

        jTextFieldNome.setBackground(new java.awt.Color(239, 239, 239));
        jTextFieldNome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldNome.setForeground(new java.awt.Color(0, 129, 197));
        jTextFieldNome.setEnabled(false);

        jFormattedTextFieldDataCadastro.setBackground(new java.awt.Color(239, 239, 239));
        jFormattedTextFieldDataCadastro.setForeground(new java.awt.Color(0, 129, 197));
        try {
            jFormattedTextFieldDataCadastro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldDataCadastro.setEnabled(false);
        jFormattedTextFieldDataCadastro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jFormattedTextFieldCPF.setBackground(new java.awt.Color(239, 239, 239));
        jFormattedTextFieldCPF.setForeground(new java.awt.Color(0, 129, 197));
        try {
            jFormattedTextFieldCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCPF.setEnabled(false);
        jFormattedTextFieldCPF.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jFormattedTextFieldRG.setBackground(new java.awt.Color(239, 239, 239));
        jFormattedTextFieldRG.setForeground(new java.awt.Color(0, 129, 197));
        try {
            jFormattedTextFieldRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldRG.setEnabled(false);
        jFormattedTextFieldRG.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jComboBoxSexo.setBackground(new java.awt.Color(239, 239, 239));
        jComboBoxSexo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBoxSexo.setForeground(new java.awt.Color(0, 129, 197));
        jComboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));
        jComboBoxSexo.setEnabled(false);

        jComboBoxEstadoCivil.setBackground(new java.awt.Color(239, 239, 239));
        jComboBoxEstadoCivil.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBoxEstadoCivil.setForeground(new java.awt.Color(0, 129, 197));
        jComboBoxEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro", "Casado", "Separado", "Divorciado", "Viuvo", "Outro" }));
        jComboBoxEstadoCivil.setEnabled(false);

        jFormattedTextFieldDataNasc.setBackground(new java.awt.Color(239, 239, 239));
        jFormattedTextFieldDataNasc.setForeground(new java.awt.Color(0, 129, 197));
        try {
            jFormattedTextFieldDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldDataNasc.setEnabled(false);
        jFormattedTextFieldDataNasc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jFormattedTextFieldTitulo.setBackground(new java.awt.Color(239, 239, 239));
        jFormattedTextFieldTitulo.setForeground(new java.awt.Color(0, 129, 197));
        try {
            jFormattedTextFieldTitulo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####.####.####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldTitulo.setEnabled(false);
        jFormattedTextFieldTitulo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jFormattedTextFieldZona.setBackground(new java.awt.Color(239, 239, 239));
        jFormattedTextFieldZona.setForeground(new java.awt.Color(0, 129, 197));
        jFormattedTextFieldZona.setEnabled(false);
        jFormattedTextFieldZona.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jFormattedTextFieldSecao.setBackground(new java.awt.Color(239, 239, 239));
        jFormattedTextFieldSecao.setForeground(new java.awt.Color(0, 129, 197));
        jFormattedTextFieldSecao.setEnabled(false);
        jFormattedTextFieldSecao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jFormattedTextFieldCTPS.setBackground(new java.awt.Color(239, 239, 239));
        jFormattedTextFieldCTPS.setForeground(new java.awt.Color(0, 129, 197));
        jFormattedTextFieldCTPS.setEnabled(false);
        jFormattedTextFieldCTPS.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jFormattedTextFieldCTPS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldCTPSActionPerformed(evt);
            }
        });

        jFormattedTextFieldSerie.setBackground(new java.awt.Color(239, 239, 239));
        jFormattedTextFieldSerie.setForeground(new java.awt.Color(0, 129, 197));
        jFormattedTextFieldSerie.setEnabled(false);
        jFormattedTextFieldSerie.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jFormattedTextFieldSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldSerieActionPerformed(evt);
            }
        });

        jFormattedTextFieldPIS.setBackground(new java.awt.Color(239, 239, 239));
        jFormattedTextFieldPIS.setForeground(new java.awt.Color(0, 129, 197));
        try {
            jFormattedTextFieldPIS.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.#####.##-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldPIS.setEnabled(false);
        jFormattedTextFieldPIS.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jTextFieldEndereco.setBackground(new java.awt.Color(239, 239, 239));
        jTextFieldEndereco.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldEndereco.setForeground(new java.awt.Color(0, 129, 197));
        jTextFieldEndereco.setEnabled(false);

        jTextFieldNumero.setBackground(new java.awt.Color(239, 239, 239));
        jTextFieldNumero.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldNumero.setForeground(new java.awt.Color(0, 129, 197));
        jTextFieldNumero.setEnabled(false);

        jTextFieldComplemento.setBackground(new java.awt.Color(239, 239, 239));
        jTextFieldComplemento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldComplemento.setForeground(new java.awt.Color(0, 129, 197));
        jTextFieldComplemento.setEnabled(false);

        jTextFieldBairro.setBackground(new java.awt.Color(239, 239, 239));
        jTextFieldBairro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldBairro.setForeground(new java.awt.Color(0, 129, 197));
        jTextFieldBairro.setEnabled(false);

        jFormattedTextFieldCEP.setBackground(new java.awt.Color(239, 239, 239));
        jFormattedTextFieldCEP.setForeground(new java.awt.Color(0, 129, 197));
        try {
            jFormattedTextFieldCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCEP.setEnabled(false);
        jFormattedTextFieldCEP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jTextFieldEmail.setBackground(new java.awt.Color(239, 239, 239));
        jTextFieldEmail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldEmail.setForeground(new java.awt.Color(0, 129, 197));
        jTextFieldEmail.setEnabled(false);

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

        jComboBoxCargo.setBackground(new java.awt.Color(239, 239, 239));
        jComboBoxCargo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBoxCargo.setForeground(new java.awt.Color(0, 129, 197));
        jComboBoxCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vendedor", "Gerente" }));
        jComboBoxCargo.setEnabled(false);

        jTextFieldObservacoes.setBackground(new java.awt.Color(239, 239, 239));
        jTextFieldObservacoes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldObservacoes.setForeground(new java.awt.Color(0, 129, 197));
        jTextFieldObservacoes.setEnabled(false);

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(120, 200, 10));
        jLabelTitulo.setText("CADASTRO DE FUNCIONÁRIOS");

        jLabelIDFuncionario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelIDFuncionario.setForeground(new java.awt.Color(120, 200, 10));
        jLabelIDFuncionario.setText("ID");

        jLabelNome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelNome.setForeground(new java.awt.Color(120, 200, 10));
        jLabelNome.setText("Nome");

        jLabelDataCadastro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelDataCadastro.setForeground(new java.awt.Color(120, 200, 10));
        jLabelDataCadastro.setText("Data de Cadastro");

        jLabelCPF.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelCPF.setForeground(new java.awt.Color(120, 200, 10));
        jLabelCPF.setText("CPF");

        jLabelRG.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelRG.setForeground(new java.awt.Color(120, 200, 10));
        jLabelRG.setText("RG");

        jLabelSexo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelSexo.setForeground(new java.awt.Color(120, 200, 10));
        jLabelSexo.setText("Sexo");

        jLabelEstadoCivil.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelEstadoCivil.setForeground(new java.awt.Color(120, 200, 10));
        jLabelEstadoCivil.setText("Estado civil");

        jLabelDataNasc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelDataNasc.setForeground(new java.awt.Color(120, 200, 10));
        jLabelDataNasc.setText("Data Nascimento");

        jLabelTituloEleitor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelTituloEleitor.setForeground(new java.awt.Color(120, 200, 10));
        jLabelTituloEleitor.setText("Título");

        jLabelZona.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelZona.setForeground(new java.awt.Color(120, 200, 10));
        jLabelZona.setText("Zona");

        jLabelSecao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelSecao.setForeground(new java.awt.Color(120, 200, 10));
        jLabelSecao.setText("Seção");

        jLabelCTPS.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelCTPS.setForeground(new java.awt.Color(120, 200, 10));
        jLabelCTPS.setText("CTPS");

        jLabelSerie.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelSerie.setForeground(new java.awt.Color(120, 200, 10));
        jLabelSerie.setText("Série");

        jLabelPIS.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelPIS.setForeground(new java.awt.Color(120, 200, 10));
        jLabelPIS.setText("PIS");

        jLabelEndereco.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelEndereco.setForeground(new java.awt.Color(120, 200, 10));
        jLabelEndereco.setText("Endereço");

        jLabelNumero.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelNumero.setForeground(new java.awt.Color(120, 200, 10));
        jLabelNumero.setText("N.");

        jLabelComplemento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelComplemento.setForeground(new java.awt.Color(120, 200, 10));
        jLabelComplemento.setText("Complemento");

        jLabelBairro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelBairro.setForeground(new java.awt.Color(120, 200, 10));
        jLabelBairro.setText("Bairro");

        jLabelCEP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelCEP.setForeground(new java.awt.Color(120, 200, 10));
        jLabelCEP.setText("CEP");

        jLabelCidade.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelCidade.setForeground(new java.awt.Color(120, 200, 10));
        jLabelCidade.setText("Cidade");

        jLabelEstado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelEstado.setForeground(new java.awt.Color(120, 200, 10));
        jLabelEstado.setText("Estado");

        jLabelEmail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelEmail.setForeground(new java.awt.Color(120, 200, 10));
        jLabelEmail.setText("E-mail");

        jLabelTelefone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelTelefone.setForeground(new java.awt.Color(120, 200, 10));
        jLabelTelefone.setText("Telefone");

        jLabelCelular.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelCelular.setForeground(new java.awt.Color(120, 200, 10));
        jLabelCelular.setText("Celular");

        jLabelCargo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelCargo.setForeground(new java.awt.Color(120, 200, 10));
        jLabelCargo.setText("Cargo");

        jLabelObservacoes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelObservacoes.setForeground(new java.awt.Color(120, 200, 10));
        jLabelObservacoes.setText("Observações");

        jLabelPesquisarFuncionario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelPesquisarFuncionario.setForeground(new java.awt.Color(120, 200, 10));
        jLabelPesquisarFuncionario.setText("PESQUISA FUNCIONÁRIO");

        jTableFuncionarios.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTableFuncionarios.setForeground(new java.awt.Color(102, 102, 255));
        jTableFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableFuncionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableFuncionariosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableFuncionarios);

        jComboBoxCidade.setBackground(new java.awt.Color(239, 239, 239));
        jComboBoxCidade.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBoxCidade.setForeground(new java.awt.Color(0, 129, 197));
        jComboBoxCidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item1", "Item2", "Item3" }));
        jComboBoxCidade.setEnabled(false);

        jComboBoxEstado.setBackground(new java.awt.Color(239, 239, 239));
        jComboBoxEstado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBoxEstado.setForeground(new java.awt.Color(0, 129, 197));
        jComboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item1", "Item2", "Item3" }));
        jComboBoxEstado.setEnabled(false);

        javax.swing.GroupLayout jPanelCadastroFuncionariosLayout = new javax.swing.GroupLayout(jPanelCadastroFuncionarios);
        jPanelCadastroFuncionarios.setLayout(jPanelCadastroFuncionariosLayout);
        jPanelCadastroFuncionariosLayout.setHorizontalGroup(
            jPanelCadastroFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCadastroFuncionariosLayout.createSequentialGroup()
                .addGap(22, 23, Short.MAX_VALUE)
                .addGroup(jPanelCadastroFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCadastroFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanelCadastroFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelCadastroFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanelCadastroFuncionariosLayout.createSequentialGroup()
                                    .addGroup(jPanelCadastroFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jComboBoxCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelCargo))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanelCadastroFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelObservacoes)
                                        .addComponent(jTextFieldObservacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanelCadastroFuncionariosLayout.createSequentialGroup()
                                    .addGroup(jPanelCadastroFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanelCadastroFuncionariosLayout.createSequentialGroup()
                                            .addGap(348, 348, 348)
                                            .addComponent(jComboBoxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanelCadastroFuncionariosLayout.createSequentialGroup()
                                            .addGroup(jPanelCadastroFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanelCadastroFuncionariosLayout.createSequentialGroup()
                                                    .addGroup(jPanelCadastroFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabelBairro, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jTextFieldBairro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGap(18, 18, 18)
                                                    .addGroup(jPanelCadastroFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jFormattedTextFieldCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabelCEP)))
                                                .addComponent(jLabelEmail)
                                                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanelCadastroFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jFormattedTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabelTelefone)
                                                .addComponent(jLabelCidade))))
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabelEstado))
                                .addGroup(jPanelCadastroFuncionariosLayout.createSequentialGroup()
                                    .addGroup(jPanelCadastroFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanelCadastroFuncionariosLayout.createSequentialGroup()
                                            .addGroup(jPanelCadastroFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelCadastroFuncionariosLayout.createSequentialGroup()
                                                    .addComponent(jLabelCPF)
                                                    .addGap(0, 0, Short.MAX_VALUE))
                                                .addComponent(jFormattedTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanelCadastroFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jFormattedTextFieldRG, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabelRG))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanelCadastroFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jComboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabelSexo))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanelCadastroFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jComboBoxEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabelEstadoCivil)))
                                        .addGroup(jPanelCadastroFuncionariosLayout.createSequentialGroup()
                                            .addGroup(jPanelCadastroFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jTextFieldIDFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabelIDFuncionario))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanelCadastroFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabelNome)))
                                        .addGroup(jPanelCadastroFuncionariosLayout.createSequentialGroup()
                                            .addGroup(jPanelCadastroFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jFormattedTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabelTituloEleitor))
                                            .addGap(26, 26, 26)
                                            .addGroup(jPanelCadastroFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabelZona)
                                                .addComponent(jFormattedTextFieldZona, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(26, 26, 26)
                                            .addGroup(jPanelCadastroFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jFormattedTextFieldSecao, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabelSecao))
                                            .addGap(79, 79, 79)
                                            .addGroup(jPanelCadastroFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanelCadastroFuncionariosLayout.createSequentialGroup()
                                                    .addComponent(jLabelCTPS)
                                                    .addGap(67, 67, 67)
                                                    .addComponent(jLabelSerie))
                                                .addGroup(jPanelCadastroFuncionariosLayout.createSequentialGroup()
                                                    .addComponent(jFormattedTextFieldCTPS, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(30, 30, 30)
                                                    .addComponent(jFormattedTextFieldSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanelCadastroFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelPIS)
                                        .addComponent(jFormattedTextFieldPIS, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanelCadastroFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabelDataNasc, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jFormattedTextFieldDataNasc)
                                            .addComponent(jFormattedTextFieldDataCadastro)
                                            .addComponent(jLabelDataCadastro, javax.swing.GroupLayout.Alignment.LEADING))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCadastroFuncionariosLayout.createSequentialGroup()
                                    .addGroup(jPanelCadastroFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanelCadastroFuncionariosLayout.createSequentialGroup()
                                            .addComponent(jLabelEndereco)
                                            .addGap(267, 267, 267)
                                            .addGroup(jPanelCadastroFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabelNumero)))
                                        .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanelCadastroFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelComplemento))))
                            .addGroup(jPanelCadastroFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelCelular)
                                .addComponent(jFormattedTextFieldCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTitulo)
                    .addComponent(jLabelPesquisarFuncionario))
                .addGap(23, 23, 23))
        );
        jPanelCadastroFuncionariosLayout.setVerticalGroup(
            jPanelCadastroFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroFuncionariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo)
                .addGap(12, 12, 12)
                .addGroup(jPanelCadastroFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIDFuncionario)
                    .addComponent(jLabelNome)
                    .addComponent(jLabelDataCadastro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCadastroFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldIDFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCadastroFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCPF)
                    .addComponent(jLabelRG)
                    .addComponent(jLabelSexo)
                    .addComponent(jLabelEstadoCivil)
                    .addComponent(jLabelDataNasc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCadastroFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldRG, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCadastroFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTituloEleitor)
                    .addComponent(jLabelZona)
                    .addComponent(jLabelSecao)
                    .addComponent(jLabelSerie)
                    .addComponent(jLabelPIS)
                    .addComponent(jLabelCTPS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCadastroFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldZona, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldSecao, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldPIS, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldCTPS, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCadastroFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCadastroFuncionariosLayout.createSequentialGroup()
                        .addComponent(jLabelEndereco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelCadastroFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelBairro)
                            .addComponent(jLabelCEP)
                            .addComponent(jLabelCidade)
                            .addComponent(jLabelEstado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelCadastroFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTextFieldCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelCadastroFuncionariosLayout.createSequentialGroup()
                        .addGroup(jPanelCadastroFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNumero)
                            .addComponent(jLabelComplemento))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelCadastroFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanelCadastroFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCadastroFuncionariosLayout.createSequentialGroup()
                        .addGroup(jPanelCadastroFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelEmail)
                            .addComponent(jLabelTelefone))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelCadastroFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelCadastroFuncionariosLayout.createSequentialGroup()
                        .addComponent(jLabelCelular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCadastroFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCargo)
                    .addComponent(jLabelObservacoes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCadastroFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldObservacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelPesquisarFuncionario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonPesquisar.setBackground(new java.awt.Color(0, 129, 197));
        jButtonPesquisar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jTextFieldPesquisaFuncionario.setBackground(new java.awt.Color(239, 239, 239));
        jTextFieldPesquisaFuncionario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldPesquisaFuncionario.setForeground(new java.awt.Color(0, 129, 197));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelCadastroFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldPesquisaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelCadastroFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonEditar)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonNovo)
                    .addComponent(jButtonPesquisar)
                    .addComponent(jTextFieldPesquisaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        mod.setPesquisar(jTextFieldPesquisaFuncionario.getText());
        BeansCadFuncionarios model = dao.BuscaFuncionario(mod);
        
        /*jTextFieldIDFuncionario.setText(String.valueOf(model.getID()));
        jTextFieldNome.setText(model.getNome());
        jFormattedTextFieldDataCadastro.setText(model.getDataCadastro());
        jFormattedTextFieldCPF.setText(model.getCPF());
        jFormattedTextFieldRG.setText(model.getRG());       
        jComboBoxSexo.setSelectedItem(model.getSexo());
        jComboBoxEstadoCivil.setSelectedItem(model.getEstadoCivil());
        jFormattedTextFieldDataNasc.setText(model.getDataNasc());
        jFormattedTextFieldTitulo.setText(model.getTitulo());
        jFormattedTextFieldZona.setText(String.valueOf(model.getZona()));
        jFormattedTextFieldSecao.setText(String.valueOf(model.getSecao()));        
        jFormattedTextFieldCTPS.setText(String.valueOf(model.getCTPS()));
        jFormattedTextFieldSerie.setText(model.getSerie());
        jFormattedTextFieldPIS.setText(model.getPIS());        
        jTextFieldEndereco.setText(model.getEndereco());
        jTextFieldNumero.setText(String.valueOf(model.getNumero()));
        jTextFieldComplemento.setText(model.getComplemento());
        jTextFieldBairro.setText(model.getBairro());
        jFormattedTextFieldCEP.setText(model.getCEP());        
        jComboBoxCidade.setSelectedItem(model.getCidade());
        jComboBoxEstado.setSelectedItem(model.getEstado());
        jTextFieldEmail.setText((model.getEmail()));        
        jFormattedTextFieldTelefone.setText(model.getTelefone());
        jFormattedTextFieldCelular.setText(model.getCelular());
        jComboBoxCargo.setSelectedItem(model.getCargo());
        jTextFieldObservacoes.setText(model.getObs());*/

        jTextFieldPesquisaFuncionario.setText("");

        jButtonNovo.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jButtonEditar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        //jButtonPesquisar.setEnabled(false);
        preencherTabela("select *from funcionarios where nome_funcionario like'%"+mod.getPesquisar()+"%'");
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jTableFuncionariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableFuncionariosMouseClicked
        String nome_funcionario = "" + jTableFuncionarios.getValueAt(jTableFuncionarios.getSelectedRow(), 1);
        conecta.conexao();
        conecta.executaSQL("select *from funcionarios where nome_funcionario = '"+ nome_funcionario + "'");
        try {
            conecta.rs.first();
            jTextFieldIDFuncionario.setText(String.valueOf(conecta.rs.getInt("id_funcionario")));
            jTextFieldNome.setText(conecta.rs.getString("nome_funcionario"));
            jFormattedTextFieldDataCadastro.setText(conecta.rs.getString("datacadastro_funcionario"));
            jFormattedTextFieldCPF.setText(conecta.rs.getString("cpf_funcionario"));
            jFormattedTextFieldRG.setText(conecta.rs.getString("rg_funcionario"));            
            jComboBoxSexo.setSelectedItem(conecta.rs.getString("sexo_funcionario"));
            jComboBoxEstadoCivil.setSelectedItem(conecta.rs.getString("estadocivil_funcionario"));
            jFormattedTextFieldDataNasc.setText(conecta.rs.getString("datanasc_funcionario"));
            jFormattedTextFieldTitulo.setText(conecta.rs.getString("titulo_funcionario"));
            jFormattedTextFieldZona.setText(String.valueOf(conecta.rs.getInt("zonaeleitoral_funcionario")));
            jFormattedTextFieldSecao.setText(String.valueOf(conecta.rs.getInt("secaoeleitoral_funcionario")));            
            jFormattedTextFieldCTPS.setText(String.valueOf(conecta.rs.getInt("ctps_funcionario")));
            jFormattedTextFieldSerie.setText(conecta.rs.getString("serie_funcionario"));
            jFormattedTextFieldPIS.setText(conecta.rs.getString("pis_funcionario"));            
            jTextFieldEndereco.setText(conecta.rs.getString("endereco_funcionario"));
            jTextFieldNumero.setText(String.valueOf(conecta.rs.getInt("numero_funcionario")));
            jTextFieldComplemento.setText(conecta.rs.getString("complemento_funcionario"));
            jTextFieldBairro.setText(conecta.rs.getString("bairro_funcionario"));
            jFormattedTextFieldCEP.setText(conecta.rs.getString("cep_funcionario"));
            jComboBoxCidade.setSelectedItem(conecta.rs.getString("cidade_funcionario"));
            jComboBoxEstado.setSelectedItem(conecta.rs.getString("estado_funcionario"));
            jTextFieldEmail.setText(conecta.rs.getString("email_funcionario"));            
            jFormattedTextFieldTelefone.setText(conecta.rs.getString("telefone_funcionario"));
            jFormattedTextFieldCelular.setText(conecta.rs.getString("celular_funcionario"));
            jComboBoxCargo.setSelectedItem(conecta.rs.getString("cargo_funcionario"));
            jTextFieldObservacoes.setText(conecta.rs.getString("obs_funcionario"));

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
        jTableFuncionarios.setVisible(false);
        
        //Seleciona um componente de outro Painel
        
        //jTabbedPaneDadosCadastrais.setSelectedComponent(jPanelDadosCadastrais);

        jTextFieldPesquisaFuncionario.setText("");

        conecta.desconexao();

    }//GEN-LAST:event_jTableFuncionariosMouseClicked

    public void preencherTabela(String Sql) {
        ArrayList dados = new ArrayList();
        String [] colunas = new String [] {"ID","Nome Funcionário","Data de Cadastro","CPF","RG","Sexo","Estado Civil","Data de Nasc","Titulo de eleitor","Zona eleitoral","Seção eleitoral","CTPS","Série","PIS","Endereço","Número","Complemento","Bairro","CEP","Cidade","Estado","Email","Telefone","Celular","Cargo","Observações"};
        conecta.conexao();
        conecta.executaSQL(Sql);
        
        try{
            conecta.rs.first();
            do{
                dados.add(new Object[] {conecta.rs.getInt("id_funcionario"),conecta.rs.getString("nome_funcionario"),conecta.rs.getString("datacadastro_funcionario"),conecta.rs.getString("cpf_funcionario"),conecta.rs.getString("rg_funcionario"),conecta.rs.getString("sexo_funcionario"),conecta.rs.getString("estadocivil_funcionario"),conecta.rs.getString("datanasc_funcionario"),conecta.rs.getString("titulo_funcionario"),conecta.rs.getInt("zonaeleitoral_funcionario"),conecta.rs.getInt("secaoeleitoral_funcionario"),conecta.rs.getInt("ctps_funcionario"),conecta.rs.getString("serie_funcionario"),conecta.rs.getString("pis_funcionario"),conecta.rs.getString("endereco_funcionario"),conecta.rs.getInt("numero_funcionario"),conecta.rs.getString("complemento_funcionario"),conecta.rs.getString("bairro_funcionario"),conecta.rs.getString("cep_funcionario"),conecta.rs.getString("cidade_funcionario"),conecta.rs.getString("estado_funcionario"),conecta.rs.getString("email_funcionario"),conecta.rs.getString("telefone_funcionario"),conecta.rs.getString("celular_funcionario"),conecta.rs.getString("cargo_funcionario"),conecta.rs.getString("obs_funcionario")});                
            }while(conecta.rs.next());                    
        }catch(SQLException ex) {
            
// Preenchendo a tabela
            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher a tabela!"+ex);
        }
        PreencherTabela modelo = new PreencherTabela(dados, colunas);
        
        jTableFuncionarios.setModel(modelo);        
        jTableFuncionarios.getColumnModel().getColumn(0).setPreferredWidth(60);
        jTableFuncionarios.getColumnModel().getColumn(0).setResizable(false);
        
        jTableFuncionarios.getColumnModel().getColumn(1).setPreferredWidth(120);
        jTableFuncionarios.getColumnModel().getColumn(1).setResizable(false);
        
        jTableFuncionarios.getColumnModel().getColumn(2).setPreferredWidth(240);
        jTableFuncionarios.getColumnModel().getColumn(2).setResizable(false);
        
        jTableFuncionarios.getColumnModel().getColumn(3).setPreferredWidth(60);
        jTableFuncionarios.getColumnModel().getColumn(3).setResizable(false);
        
        jTableFuncionarios.getColumnModel().getColumn(4).setPreferredWidth(160);
        jTableFuncionarios.getColumnModel().getColumn(4).setResizable(false);
        
        jTableFuncionarios.getColumnModel().getColumn(5).setPreferredWidth(160);
        jTableFuncionarios.getColumnModel().getColumn(5).setResizable(false);
        
        jTableFuncionarios.getColumnModel().getColumn(6).setPreferredWidth(100);
        jTableFuncionarios.getColumnModel().getColumn(6).setResizable(false);
        
        jTableFuncionarios.getColumnModel().getColumn(7).setPreferredWidth(100);
        jTableFuncionarios.getColumnModel().getColumn(7).setResizable(false);
        
        jTableFuncionarios.getColumnModel().getColumn(8).setPreferredWidth(80);
        jTableFuncionarios.getColumnModel().getColumn(8).setResizable(false);
        
        jTableFuncionarios.getColumnModel().getColumn(9).setPreferredWidth(80);
        jTableFuncionarios.getColumnModel().getColumn(9).setResizable(false);
        
        jTableFuncionarios.getColumnModel().getColumn(10).setPreferredWidth(40);
        jTableFuncionarios.getColumnModel().getColumn(10).setResizable(false);
        
        jTableFuncionarios.getColumnModel().getColumn(11).setPreferredWidth(280);
        jTableFuncionarios.getColumnModel().getColumn(11).setResizable(false);
        
        jTableFuncionarios.getColumnModel().getColumn(12).setPreferredWidth(60);
        jTableFuncionarios.getColumnModel().getColumn(12).setResizable(false);
        
        jTableFuncionarios.getColumnModel().getColumn(13).setPreferredWidth(120);
        jTableFuncionarios.getColumnModel().getColumn(13).setResizable(false);
        
        jTableFuncionarios.getColumnModel().getColumn(14).setPreferredWidth(240);
        jTableFuncionarios.getColumnModel().getColumn(14).setResizable(false);
        
        jTableFuncionarios.getColumnModel().getColumn(15).setPreferredWidth(60);
        jTableFuncionarios.getColumnModel().getColumn(15).setResizable(false);
        
        jTableFuncionarios.getColumnModel().getColumn(16).setPreferredWidth(160);
        jTableFuncionarios.getColumnModel().getColumn(16).setResizable(false);
        
        jTableFuncionarios.getColumnModel().getColumn(17).setPreferredWidth(160);
        jTableFuncionarios.getColumnModel().getColumn(17).setResizable(false);
        
        jTableFuncionarios.getColumnModel().getColumn(18).setPreferredWidth(100);
        jTableFuncionarios.getColumnModel().getColumn(18).setResizable(false);
        
        jTableFuncionarios.getColumnModel().getColumn(19).setPreferredWidth(100);
        jTableFuncionarios.getColumnModel().getColumn(19).setResizable(false);
        
        jTableFuncionarios.getColumnModel().getColumn(20).setPreferredWidth(80);
        jTableFuncionarios.getColumnModel().getColumn(20).setResizable(false);
        
        jTableFuncionarios.getColumnModel().getColumn(21).setPreferredWidth(80);
        jTableFuncionarios.getColumnModel().getColumn(21).setResizable(false);
        
        jTableFuncionarios.getColumnModel().getColumn(22).setPreferredWidth(40);
        jTableFuncionarios.getColumnModel().getColumn(22).setResizable(false);
        
        jTableFuncionarios.getColumnModel().getColumn(23).setPreferredWidth(280);
        jTableFuncionarios.getColumnModel().getColumn(23).setResizable(false);
        
        jTableFuncionarios.getColumnModel().getColumn(24).setPreferredWidth(280);
        jTableFuncionarios.getColumnModel().getColumn(24).setResizable(false);
        
        jTableFuncionarios.getColumnModel().getColumn(25).setPreferredWidth(280);
        jTableFuncionarios.getColumnModel().getColumn(25).setResizable(false);
                                
        jTableFuncionarios.getTableHeader().setReorderingAllowed(false);
        jTableFuncionarios.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTableFuncionarios.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);      
        
        conecta.desconexao();
        
    }                    
    
    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir o funcionário?");
        if(resposta == JOptionPane.YES_OPTION) {
            mod.setID(Integer.parseInt(jTextFieldIDFuncionario.getText()));
            dao.Excluir(mod);

        jTextFieldIDFuncionario.setText("");
        jTextFieldNome.setText("");
        jFormattedTextFieldDataCadastro.setText("");
        jFormattedTextFieldCPF.setText("");
        jFormattedTextFieldRG.setText("");            
        jComboBoxSexo.setSelectedItem(null);
        jComboBoxEstadoCivil.setSelectedItem(null);
        jFormattedTextFieldDataNasc.setText("");
        jFormattedTextFieldTitulo.setText("");
        jFormattedTextFieldZona.setText("");
        jFormattedTextFieldSecao.setText("");            
        jFormattedTextFieldCTPS.setText("");
        jFormattedTextFieldSerie.setText("");
        jFormattedTextFieldPIS.setText("");            
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
        jComboBoxCargo.setSelectedItem(null);
        jTextFieldObservacoes.setText("");
            
        jTextFieldIDFuncionario.setEnabled(false);
        jTextFieldNome.setEnabled(false);
        jFormattedTextFieldDataCadastro.setEnabled(false);
        jFormattedTextFieldCPF.setEnabled(false);
        jFormattedTextFieldRG.setEnabled(false);            
        jComboBoxSexo.setEnabled(false);
        jComboBoxEstadoCivil.setEnabled(false);
        jFormattedTextFieldDataNasc.setEnabled(false);
        jFormattedTextFieldTitulo.setEnabled(false);
        jFormattedTextFieldZona.setEnabled(false);
        jFormattedTextFieldSecao.setEnabled(false);            
        jFormattedTextFieldCTPS.setEnabled(false);
        jFormattedTextFieldSerie.setEnabled(false);
        jFormattedTextFieldPIS.setEnabled(false);            
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
        jComboBoxCargo.setEnabled(false);            
        jTextFieldObservacoes.setEnabled(false);

        jTextFieldPesquisaFuncionario.setText("");
           
        jTableFuncionarios.setVisible(true);

        jButtonNovo.setEnabled(true);
        jButtonSalvar.setEnabled(false);
        jButtonEditar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jButtonPesquisar.setEnabled(true);
        preencherTabela("select *from funcionarios order by nome_funcionario");

        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        jTextFieldIDFuncionario.setText("");
        jTextFieldNome.setText("");
        jFormattedTextFieldDataCadastro.setText("");
        jFormattedTextFieldCPF.setText("");
        jFormattedTextFieldRG.setText("");            
        jComboBoxSexo.setSelectedItem(null);
        jComboBoxEstadoCivil.setSelectedItem(null);
        jFormattedTextFieldDataNasc.setText("");
        jFormattedTextFieldTitulo.setText("");
        jFormattedTextFieldZona.setText("");
        jFormattedTextFieldSecao.setText("");            
        jFormattedTextFieldCTPS.setText("");
        jFormattedTextFieldSerie.setText("");
        jFormattedTextFieldPIS.setText("");            
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
        jComboBoxCargo.setSelectedItem(null);
        jTextFieldObservacoes.setText("");       
        
        jTextFieldIDFuncionario.setEnabled(false);
        jTextFieldNome.setEnabled(false);
        jFormattedTextFieldDataCadastro.setEnabled(false);
        jFormattedTextFieldCPF.setEnabled(false);
        jFormattedTextFieldRG.setEnabled(false);        
        jComboBoxSexo.setEnabled(false);
        jComboBoxEstadoCivil.setEnabled(false);
        jFormattedTextFieldDataNasc.setEnabled(false);
        jFormattedTextFieldTitulo.setEnabled(false);
        jFormattedTextFieldZona.setEnabled(false);
        jFormattedTextFieldSecao.setEnabled(false);        
        jFormattedTextFieldCTPS.setEnabled(false);
        jFormattedTextFieldSerie.setEnabled(false);
        jFormattedTextFieldPIS.setEnabled(false);        
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
        jComboBoxCargo.setEnabled(false);            
        jTextFieldObservacoes.setEnabled(false);

        jTextFieldPesquisaFuncionario.setEnabled(true);

        jTableFuncionarios.setVisible(true);

        jButtonNovo.setEnabled(true);
        jButtonSalvar.setEnabled(false);
        jButtonEditar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jButtonPesquisar.setEnabled(true);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        flag = 2;

        jTextFieldNome.setEnabled(true);
        jFormattedTextFieldDataCadastro.setEnabled(true);
        jFormattedTextFieldCPF.setEnabled(true);
        jFormattedTextFieldRG.setEnabled(true);        
        jComboBoxSexo.setEnabled(true);
        jComboBoxEstadoCivil.setEnabled(true);
        jFormattedTextFieldDataNasc.setEnabled(true);
        jFormattedTextFieldTitulo.setEnabled(true);
        jFormattedTextFieldZona.setEnabled(true);
        jFormattedTextFieldSecao.setEnabled(true);        
        jFormattedTextFieldCTPS.setEnabled(true);
        jFormattedTextFieldSerie.setEnabled(true);
        jFormattedTextFieldPIS.setEnabled(true);        
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
        jComboBoxCargo.setEnabled(true);            
        jTextFieldObservacoes.setEnabled(true);

        jTextFieldPesquisaFuncionario.setEnabled(false);

        jTextFieldPesquisaFuncionario.setText("");

        jButtonNovo.setEnabled(false);
        jButtonSalvar.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonCancelar.setEnabled(true);
        jButtonExcluir.setEnabled(false);
        jButtonPesquisar.setEnabled(false);
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        flag = 1;
                
        jFormattedTextFieldDataCadastro.requestFocus();
        jTextFieldNome.setEnabled(true);
        jFormattedTextFieldDataCadastro.setEnabled(true);
        jFormattedTextFieldCPF.setEnabled(true);
        jFormattedTextFieldRG.setEnabled(true);        
        jComboBoxSexo.setEnabled(true);
        jComboBoxEstadoCivil.setEnabled(true);
        jFormattedTextFieldDataNasc.setEnabled(true);
        jFormattedTextFieldTitulo.setEnabled(true);
        jFormattedTextFieldZona.setEnabled(true);
        jFormattedTextFieldSecao.setEnabled(true);        
        jFormattedTextFieldCTPS.setEnabled(true);
        jFormattedTextFieldSerie.setEnabled(true);
        jFormattedTextFieldPIS.setEnabled(true);        
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
        jComboBoxCargo.setEnabled(true);
        jTextFieldObservacoes.setEnabled(true);
        
        jTextFieldPesquisaFuncionario.setEnabled(false);

        jTextFieldIDFuncionario.setText("");
        jTextFieldNome.setText("");
        jFormattedTextFieldDataCadastro.setText("");
        jFormattedTextFieldCPF.setText("");
        jFormattedTextFieldRG.setText("");        
        jComboBoxSexo.setSelectedItem(null);
        jComboBoxEstadoCivil.setSelectedItem(null);
        jFormattedTextFieldDataNasc.setText("");
        jFormattedTextFieldTitulo.setText("");
        jFormattedTextFieldZona.setText("");
        jFormattedTextFieldSecao.setText("");        
        jFormattedTextFieldCTPS.setText("");
        jFormattedTextFieldSerie.setText("");
        jFormattedTextFieldPIS.setText("");        
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
        jComboBoxCargo.setSelectedItem(null);
        jTextFieldObservacoes.setText("");
        
        jTextFieldPesquisaFuncionario.setText("");

        jButtonNovo.setEnabled(false);
        jButtonSalvar.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonCancelar.setEnabled(true);
        jButtonExcluir.setEnabled(false);
        jButtonPesquisar.setEnabled(false);
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if (jTextFieldNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo NOME para prosseguir");
            jTextFieldNome.requestFocus();        
        }else if(jFormattedTextFieldDataCadastro.getText().trim().length() < 10 || jFormattedTextFieldDataCadastro.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo DATA DE CADASTRO para prosseguir");
            jFormattedTextFieldDataCadastro.requestFocus();
        }else if (jFormattedTextFieldCPF.getText().trim().length() < 14 || jFormattedTextFieldCPF.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo CPF para prosseguir");
            jFormattedTextFieldCPF.requestFocus();    
        }else if (jFormattedTextFieldRG.getText().trim().length() < 12 || jFormattedTextFieldRG.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo RG para prosseguir");
            jFormattedTextFieldRG.requestFocus();    
        }else if (jComboBoxSexo.getSelectedItem() == null && !jComboBoxSexo.getSelectedItem().toString().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo SEXO para prosseguir");
            jComboBoxSexo.requestFocus();
        }else if (jComboBoxEstadoCivil.getSelectedItem() == null && !jComboBoxEstadoCivil.getSelectedItem().toString().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo ESTADO CIVIL para prosseguir");
            jComboBoxEstadoCivil.requestFocus();    
        }else if (jFormattedTextFieldDataNasc.getText().trim().length() < 10 || jFormattedTextFieldDataNasc.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo DATA DE NASCIMENTO para prosseguir");
            jFormattedTextFieldDataNasc.requestFocus();
        }else if (jFormattedTextFieldTitulo.getText().trim().length() < 14 || jFormattedTextFieldTitulo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo TÍTULO DE ELEITOR para prosseguir");
            jFormattedTextFieldTitulo.requestFocus();
        }else if (jFormattedTextFieldZona.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo ZONA para prosseguir");
            jFormattedTextFieldZona.requestFocus();
        }else if (jFormattedTextFieldSecao.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo SEÇÃO para prosseguir");
            jFormattedTextFieldSecao.requestFocus();       
        }else if (jFormattedTextFieldCTPS.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo CTPS para prosseguir");
            jFormattedTextFieldCTPS.requestFocus();
        }else if (jFormattedTextFieldSerie.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo SÉRIE para prosseguir");
            jFormattedTextFieldSerie.requestFocus();
        }else if (jFormattedTextFieldPIS.getText().trim().length() < 14 || jFormattedTextFieldPIS.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo PIS para prosseguir");
            jFormattedTextFieldPIS.requestFocus();        
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
        }else if (jComboBoxCidade.getSelectedItem() == null && !jComboBoxCidade.getSelectedItem().toString().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo CIDADE para prosseguir");
            jComboBoxCidade.requestFocus();
        }else if (jComboBoxEstado.getSelectedItem() == null && !jComboBoxEstado.getSelectedItem().toString().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo ESTADO para prosseguir");
            jComboBoxEstado.requestFocus();
        }else if (jTextFieldEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo E-MAIL para prosseguir");
            jTextFieldEmail.requestFocus();        
        }else if (jFormattedTextFieldTelefone.getText().trim().length() < 13 || jFormattedTextFieldTelefone.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo TELEFONE para prosseguir");
            jFormattedTextFieldTelefone.requestFocus();
        }else if (jFormattedTextFieldCelular.getText().trim().length() < 14 || jFormattedTextFieldCelular.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo CELULAR para prosseguir");
            jFormattedTextFieldCelular.requestFocus();
        }else if (jComboBoxCargo.getSelectedItem() == null && !jComboBoxCargo.getSelectedItem().toString().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo CARGO para prosseguir");
            jComboBoxCargo.requestFocus();           
        }else if (jTextFieldObservacoes.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo OBSERVAÇÕES para prosseguir");
            jTextFieldObservacoes.requestFocus();               

        }else

        // FUNÇÃO INSERIR DADOS

        if(flag==1) {

            mod.setNome(jTextFieldNome.getText());
            mod.setDataCadastro(jFormattedTextFieldDataCadastro.getText());
            mod.setCPF(jFormattedTextFieldCPF.getText());
            mod.setRG(jFormattedTextFieldRG.getText());            
            mod.setSexo((String)(jComboBoxSexo.getSelectedItem()));
            mod.setEstadoCivil((String)(jComboBoxEstadoCivil.getSelectedItem()));
            mod.setDataNasc(jFormattedTextFieldDataNasc.getText());
            mod.setTitulo(jFormattedTextFieldTitulo.getText());
            mod.setZona(Integer.parseInt(jFormattedTextFieldZona.getText()));
            mod.setSecao(Integer.parseInt(jFormattedTextFieldSecao.getText()));            
            mod.setCTPS(Integer.parseInt(jFormattedTextFieldCTPS.getText()));
            mod.setSerie(jFormattedTextFieldSerie.getText());
            mod.setPIS(jFormattedTextFieldPIS.getText());            
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
            mod.setCargo((String)(jComboBoxCargo.getSelectedItem()));
            mod.setObs(jTextFieldObservacoes.getText());
            
            dao.Salvar(mod);

            jTextFieldIDFuncionario.setText("");
            jTextFieldNome.setText("");
            jFormattedTextFieldDataCadastro.setText("");
            jFormattedTextFieldCPF.setText("");
            jFormattedTextFieldRG.setText("");            
            jComboBoxSexo.setSelectedItem(null);
            jComboBoxEstadoCivil.setSelectedItem(null);
            jFormattedTextFieldDataNasc.setText("");
            jFormattedTextFieldTitulo.setText("");
            jFormattedTextFieldZona.setText("");
            jFormattedTextFieldSecao.setText("");            
            jFormattedTextFieldCTPS.setText("");
            jFormattedTextFieldSerie.setText("");
            jFormattedTextFieldPIS.setText("");            
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
            jComboBoxCargo.setSelectedItem(null);
            jTextFieldObservacoes.setText("");
            
            jTextFieldNome.setEnabled(false);
            jFormattedTextFieldDataCadastro.setEnabled(false);
            jFormattedTextFieldCPF.setEnabled(false);
            jFormattedTextFieldRG.setEnabled(false);            
            jComboBoxSexo.setEnabled(false);
            jComboBoxEstadoCivil.setEnabled(false);
            jFormattedTextFieldDataNasc.setEnabled(false);
            jFormattedTextFieldTitulo.setEnabled(false);
            jFormattedTextFieldZona.setEnabled(false);
            jFormattedTextFieldSecao.setEnabled(false);            
            jFormattedTextFieldCTPS.setEnabled(false);
            jFormattedTextFieldSerie.setEnabled(false);
            jFormattedTextFieldPIS.setEnabled(false);            
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
            jComboBoxCargo.setEnabled(false);
            jTextFieldObservacoes.setEnabled(false);

            jTextFieldPesquisaFuncionario.setEnabled(true);

            jButtonNovo.setEnabled(true);
            jButtonSalvar.setEnabled(false);
            jButtonEditar.setEnabled(false);
            jButtonCancelar.setEnabled(false);
            jButtonExcluir.setEnabled(false);
            jButtonPesquisar.setEnabled(true);
            preencherTabela("select *from funcionarios order by nome_funcionario");

            // FUNÇÃO ALTERAR DADOS

        }else{

            mod.setID(Integer.parseInt(jTextFieldIDFuncionario.getText()));
            mod.setNome(jTextFieldNome.getText());
            mod.setDataCadastro(jFormattedTextFieldDataCadastro.getText());
            mod.setCPF(jFormattedTextFieldCPF.getText());
            mod.setRG(jFormattedTextFieldRG.getText());           
            mod.setSexo((String)(jComboBoxSexo.getSelectedItem()));
            mod.setEstadoCivil((String)(jComboBoxEstadoCivil.getSelectedItem()));
            mod.setDataNasc(jFormattedTextFieldDataNasc.getText());
            mod.setTitulo(jFormattedTextFieldTitulo.getText());
            mod.setZona(Integer.parseInt(jFormattedTextFieldZona.getText()));
            mod.setSecao(Integer.parseInt(jFormattedTextFieldSecao.getText()));            
            mod.setCTPS(Integer.parseInt(jFormattedTextFieldCTPS.getText()));
            mod.setSerie(jFormattedTextFieldSerie.getText());
            mod.setPIS(jFormattedTextFieldPIS.getText());            
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
            mod.setCargo((String)(jComboBoxCargo.getSelectedItem()));
            mod.setObs(jTextFieldObservacoes.getText());
            
            dao.Alterar(mod);
            
            jTextFieldIDFuncionario.setText("");
            jTextFieldNome.setText("");
            jFormattedTextFieldDataCadastro.setText("");
            jFormattedTextFieldCPF.setText("");
            jFormattedTextFieldRG.setText("");            
            jComboBoxSexo.setSelectedItem(null);
            jComboBoxEstadoCivil.setSelectedItem(null);
            jFormattedTextFieldDataNasc.setText("");
            jFormattedTextFieldTitulo.setText("");
            jFormattedTextFieldZona.setText("");
            jFormattedTextFieldSecao.setText("");            
            jFormattedTextFieldCTPS.setText("");
            jFormattedTextFieldSerie.setText("");
            jFormattedTextFieldPIS.setText("");            
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
            jComboBoxCargo.setSelectedItem(null);
            jTextFieldObservacoes.setText("");

            jTextFieldIDFuncionario.setEnabled(false);
            jTextFieldNome.setEnabled(false);
            jFormattedTextFieldDataCadastro.setEnabled(false);
            jFormattedTextFieldCPF.setEnabled(false);
            jFormattedTextFieldRG.setEnabled(false);            
            jComboBoxSexo.setEnabled(false);
            jComboBoxEstadoCivil.setEnabled(false);
            jFormattedTextFieldDataNasc.setEnabled(false);
            jFormattedTextFieldTitulo.setEnabled(false);
            jFormattedTextFieldZona.setEnabled(false);
            jFormattedTextFieldSecao.setEnabled(false);            
            jFormattedTextFieldCTPS.setEnabled(false);
            jFormattedTextFieldSerie.setEnabled(false);
            jFormattedTextFieldPIS.setEnabled(false);            
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
            jComboBoxCargo.setEnabled(false);
            jTextFieldObservacoes.setEnabled(false);
            
            jTextFieldPesquisaFuncionario.setEnabled(true);

            jTableFuncionarios.setVisible(true);

            jButtonNovo.setEnabled(true);
            jButtonSalvar.setEnabled(false);
            jButtonEditar.setEnabled(false);
            jButtonCancelar.setEnabled(false);
            jButtonExcluir.setEnabled(false);
            jButtonPesquisar.setEnabled(true);
            preencherTabela("select *from funcionarios order by nome_funcionario");

        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jFormattedTextFieldSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldSerieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldSerieActionPerformed

    private void jFormattedTextFieldCTPSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCTPSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldCTPSActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CadastroFuncionarios dialog = new CadastroFuncionarios(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> jComboBoxCargo;
    private javax.swing.JComboBox<String> jComboBoxCidade;
    private javax.swing.JComboBox<String> jComboBoxEstado;
    private javax.swing.JComboBox<String> jComboBoxEstadoCivil;
    private javax.swing.JComboBox<String> jComboBoxSexo;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JFormattedTextField jFormattedTextFieldCEP;
    private javax.swing.JFormattedTextField jFormattedTextFieldCPF;
    private javax.swing.JFormattedTextField jFormattedTextFieldCTPS;
    private javax.swing.JFormattedTextField jFormattedTextFieldCelular;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataCadastro;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataNasc;
    private javax.swing.JFormattedTextField jFormattedTextFieldPIS;
    private javax.swing.JFormattedTextField jFormattedTextFieldRG;
    private javax.swing.JFormattedTextField jFormattedTextFieldSecao;
    private javax.swing.JFormattedTextField jFormattedTextFieldSerie;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefone;
    private javax.swing.JFormattedTextField jFormattedTextFieldTitulo;
    private javax.swing.JFormattedTextField jFormattedTextFieldZona;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JLabel jLabelCEP;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelCTPS;
    private javax.swing.JLabel jLabelCargo;
    private javax.swing.JLabel jLabelCelular;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelComplemento;
    private javax.swing.JLabel jLabelDataCadastro;
    private javax.swing.JLabel jLabelDataNasc;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelEstadoCivil;
    private javax.swing.JLabel jLabelIDFuncionario;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelObservacoes;
    private javax.swing.JLabel jLabelPIS;
    private javax.swing.JLabel jLabelPesquisarFuncionario;
    private javax.swing.JLabel jLabelRG;
    private javax.swing.JLabel jLabelSecao;
    private javax.swing.JLabel jLabelSerie;
    private javax.swing.JLabel jLabelSexo;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelTituloEleitor;
    private javax.swing.JLabel jLabelZona;
    private javax.swing.JPanel jPanelCadastroFuncionarios;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableFuncionarios;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldComplemento;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldIDFuncionario;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JTextField jTextFieldObservacoes;
    private javax.swing.JTextField jTextFieldPesquisaFuncionario;
    // End of variables declaration//GEN-END:variables
}
