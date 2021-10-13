
package Tela;

import Conexao.ConexaoBD;
import ModeloBeans.BeansCadFornecedores;
import ModeloDao.DaoCadFornecedores;
import ModeloDao.PreencherTabela;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

public class CadastroFornecedores extends javax.swing.JDialog {
    BeansCadFornecedores mod = new BeansCadFornecedores();
    DaoCadFornecedores dao =  new DaoCadFornecedores();
    ConexaoBD conecta = new ConexaoBD();       
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
    
    
    
    public CadastroFornecedores(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        PreencherCidade();
        PreencherUF();
        preencherTabela("select *from fornecedores order by razaosocial_fornecedor");        
           
    }

    CadastroFornecedores() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelDadosCadastrais = new javax.swing.JPanel();
        jLabelDataCadastro = new javax.swing.JLabel();
        jTextFieldRazaoSocial = new javax.swing.JTextField();
        jTextFieldEndereco = new javax.swing.JTextField();
        jLabelNumero = new javax.swing.JLabel();
        jTextFieldNumero = new javax.swing.JTextField();
        jLabelCidade = new javax.swing.JLabel();
        jLabelEstado = new javax.swing.JLabel();
        jLabelCEP = new javax.swing.JLabel();
        jLabelTelefone = new javax.swing.JLabel();
        jLabelCelular = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelRazaoSocial = new javax.swing.JLabel();
        jLabelID = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jLabelNomeFantasia = new javax.swing.JLabel();
        jTextFieldNomeFantasia = new javax.swing.JTextField();
        jLabelEndereco = new javax.swing.JLabel();
        jLabelBairro = new javax.swing.JLabel();
        jTextFieldBairro = new javax.swing.JTextField();
        jLabelCnpj = new javax.swing.JLabel();
        jLabelContato = new javax.swing.JLabel();
        jTextFieldContato = new javax.swing.JTextField();
        jFormattedTextFieldDataCadastro = new javax.swing.JFormattedTextField();
        jFormattedTextFieldCNPJ = new javax.swing.JFormattedTextField();
        jFormattedTextFieldCEP = new javax.swing.JFormattedTextField();
        jFormattedTextFieldTelefone = new javax.swing.JFormattedTextField();
        jFormattedTextFieldCelular = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabelEndereco1 = new javax.swing.JLabel();
        jTextFieldComplemento = new javax.swing.JTextField();
        jComboBoxCidade = new javax.swing.JComboBox<>();
        jComboBoxEstado = new javax.swing.JComboBox<>();
        jPanelPesquisa = new javax.swing.JPanel();
        jLabelPesquisarCliente = new javax.swing.JLabel();
        jTextFieldPesquisaFornecedor = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableFornecedores = new javax.swing.JTable();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CADASTRO DE FORNECEDORES");

        jPanelDadosCadastrais.setBackground(new java.awt.Color(239, 239, 239));
        jPanelDadosCadastrais.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelDataCadastro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelDataCadastro.setForeground(new java.awt.Color(120, 200, 10));
        jLabelDataCadastro.setText("Data de Cadastro");

        jTextFieldRazaoSocial.setBackground(new java.awt.Color(239, 239, 239));
        jTextFieldRazaoSocial.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldRazaoSocial.setForeground(new java.awt.Color(0, 129, 197));
        jTextFieldRazaoSocial.setEnabled(false);

        jTextFieldEndereco.setBackground(new java.awt.Color(239, 239, 239));
        jTextFieldEndereco.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldEndereco.setForeground(new java.awt.Color(0, 129, 197));
        jTextFieldEndereco.setEnabled(false);

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

        jTextFieldEmail.setBackground(new java.awt.Color(239, 239, 239));
        jTextFieldEmail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldEmail.setForeground(new java.awt.Color(0, 129, 197));
        jTextFieldEmail.setEnabled(false);
        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });

        jLabelRazaoSocial.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelRazaoSocial.setForeground(new java.awt.Color(120, 200, 10));
        jLabelRazaoSocial.setText("Razão Social");

        jLabelID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelID.setForeground(new java.awt.Color(120, 200, 10));
        jLabelID.setText("ID");

        jTextFieldID.setBackground(new java.awt.Color(239, 239, 239));
        jTextFieldID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldID.setForeground(new java.awt.Color(0, 129, 197));
        jTextFieldID.setEnabled(false);

        jLabelNomeFantasia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelNomeFantasia.setForeground(new java.awt.Color(120, 200, 10));
        jLabelNomeFantasia.setText("Nome Fantasia");

        jTextFieldNomeFantasia.setBackground(new java.awt.Color(239, 239, 239));
        jTextFieldNomeFantasia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldNomeFantasia.setForeground(new java.awt.Color(0, 129, 197));
        jTextFieldNomeFantasia.setEnabled(false);

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

        jLabelCnpj.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelCnpj.setForeground(new java.awt.Color(120, 200, 10));
        jLabelCnpj.setText("CNPJ");

        jLabelContato.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelContato.setForeground(new java.awt.Color(120, 200, 10));
        jLabelContato.setText("Contato");

        jTextFieldContato.setBackground(new java.awt.Color(239, 239, 239));
        jTextFieldContato.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldContato.setForeground(new java.awt.Color(0, 129, 197));
        jTextFieldContato.setEnabled(false);

        jFormattedTextFieldDataCadastro.setBackground(new java.awt.Color(239, 239, 239));
        jFormattedTextFieldDataCadastro.setForeground(new java.awt.Color(0, 129, 197));
        try {
            jFormattedTextFieldDataCadastro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldDataCadastro.setEnabled(false);
        jFormattedTextFieldDataCadastro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jFormattedTextFieldCNPJ.setBackground(new java.awt.Color(239, 239, 239));
        jFormattedTextFieldCNPJ.setForeground(new java.awt.Color(0, 129, 197));
        try {
            jFormattedTextFieldCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCNPJ.setEnabled(false);
        jFormattedTextFieldCNPJ.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(120, 200, 10));
        jLabel1.setText("CADASTRO DE FORNECEDORES");

        jLabelEndereco1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelEndereco1.setForeground(new java.awt.Color(120, 200, 10));
        jLabelEndereco1.setText("Complemento");

        jTextFieldComplemento.setBackground(new java.awt.Color(239, 239, 239));
        jTextFieldComplemento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldComplemento.setForeground(new java.awt.Color(0, 129, 197));
        jTextFieldComplemento.setEnabled(false);

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

        javax.swing.GroupLayout jPanelDadosCadastraisLayout = new javax.swing.GroupLayout(jPanelDadosCadastrais);
        jPanelDadosCadastrais.setLayout(jPanelDadosCadastraisLayout);
        jPanelDadosCadastraisLayout.setHorizontalGroup(
            jPanelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosCadastraisLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelDadosCadastraisLayout.createSequentialGroup()
                        .addGroup(jPanelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelEmail)
                            .addComponent(jLabelBairro)
                            .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFormattedTextFieldCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCEP))
                        .addGap(31, 31, 31)
                        .addGroup(jPanelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCidade)
                            .addComponent(jComboBoxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jTextFieldNomeFantasia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanelDadosCadastraisLayout.createSequentialGroup()
                            .addGroup(jPanelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelEndereco)
                                .addComponent(jLabelNomeFantasia))
                            .addGap(30, 30, 30)
                            .addGroup(jPanelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelContato)
                                .addComponent(jTextFieldContato, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanelDadosCadastraisLayout.createSequentialGroup()
                                        .addGroup(jPanelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelNumero))
                                        .addGap(34, 34, 34)
                                        .addGroup(jPanelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelEndereco1)
                                            .addComponent(jTextFieldComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelEstado)
                                        .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelDadosCadastraisLayout.createSequentialGroup()
                            .addGroup(jPanelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelID))
                            .addGap(18, 18, 18)
                            .addGroup(jPanelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelRazaoSocial))
                            .addGap(18, 18, 18)
                            .addGroup(jPanelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jFormattedTextFieldCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelCnpj))
                            .addGap(18, 18, 18)
                            .addGroup(jPanelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelDataCadastro)
                                .addComponent(jFormattedTextFieldDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelDadosCadastraisLayout.createSequentialGroup()
                            .addGap(351, 351, 351)
                            .addGroup(jPanelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jFormattedTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelTelefone))
                            .addGap(34, 34, 34)
                            .addGroup(jPanelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelCelular)
                                .addComponent(jFormattedTextFieldCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanelDadosCadastraisLayout.setVerticalGroup(
            jPanelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosCadastraisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelID)
                        .addComponent(jLabelRazaoSocial))
                    .addGroup(jPanelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelCnpj)
                        .addComponent(jLabelDataCadastro)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomeFantasia)
                    .addComponent(jLabelContato))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelDadosCadastraisLayout.createSequentialGroup()
                        .addGroup(jPanelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldContato, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelEndereco)
                            .addComponent(jLabelNumero)))
                    .addComponent(jLabelEndereco1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextFieldNumero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextFieldComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDadosCadastraisLayout.createSequentialGroup()
                        .addGroup(jPanelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCEP, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelBairro)
                                .addComponent(jLabelCidade)
                                .addComponent(jLabelEstado)))
                        .addGroup(jPanelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDadosCadastraisLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelDadosCadastraisLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(jPanelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBoxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jFormattedTextFieldCEP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmail)
                    .addComponent(jLabelTelefone)
                    .addComponent(jLabelCelular))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDadosCadastraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanelPesquisa.setBackground(new java.awt.Color(239, 239, 239));
        jPanelPesquisa.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelPesquisarCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelPesquisarCliente.setForeground(new java.awt.Color(120, 200, 10));
        jLabelPesquisarCliente.setText("Pesquisa Fornecedor");

        jTextFieldPesquisaFornecedor.setBackground(new java.awt.Color(239, 239, 239));
        jTextFieldPesquisaFornecedor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldPesquisaFornecedor.setForeground(new java.awt.Color(0, 129, 197));

        jButtonPesquisar.setBackground(new java.awt.Color(0, 129, 197));
        jButtonPesquisar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jTableFornecedores.setBackground(new java.awt.Color(208, 207, 207));
        jTableFornecedores.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTableFornecedores.setForeground(new java.awt.Color(78, 78, 78));
        jTableFornecedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableFornecedores.setSelectionBackground(new java.awt.Color(92, 188, 44));
        jTableFornecedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableFornecedoresMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableFornecedores);

        javax.swing.GroupLayout jPanelPesquisaLayout = new javax.swing.GroupLayout(jPanelPesquisa);
        jPanelPesquisa.setLayout(jPanelPesquisaLayout);
        jPanelPesquisaLayout.setHorizontalGroup(
            jPanelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesquisaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelPesquisaLayout.createSequentialGroup()
                        .addComponent(jLabelPesquisarCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldPesquisaFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonPesquisar))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelPesquisaLayout.setVerticalGroup(
            jPanelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesquisaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPesquisar)
                    .addComponent(jLabelPesquisarCliente)
                    .addComponent(jTextFieldPesquisaFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                .addContainerGap())
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExcluir))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanelPesquisa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelDadosCadastrais, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelDadosCadastrais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        mod.setPesquisar(jTextFieldPesquisaFornecedor.getText());
        BeansCadFornecedores model = dao.BuscaCliente(mod);
        
        //Insere as informações nos devidos campos, caso nao queira basta deixar sem essa rotina
        
        /*jTextFieldID.setText(String.valueOf(model.getID()));
        jTextFieldRazaoSocial.setText(model.getRazaoSocial());
        jFormattedTextFieldCNPJ.setText(model.getCNPJ());
        jFormattedTextFieldDataCadastro.setText(model.getDataCadastro());
        jTextFieldNomeFantasia.setText(model.getNomeFantasia());
        jTextFieldContato.setText(model.getContato());        
        jTextFieldEndereco.setText(model.getEndereco());
        jTextFieldNumero.setText(String.valueOf(model.getNumero()));
        jTextFieldComplemento.setText(model.getComplemento());
        jTextFieldBairro.setText(model.getBairro());
        jFormattedTextFieldCEP.setText(model.getCEP());
        jComboBoxCidade.setSelectedItem(model.getCidade());
        jComboBoxEstado.setSelectedItem(model.getEstado());
        jTextFieldEmail.setText(model.getEmail());        
        jFormattedTextFieldTelefone.setText(model.getTelefone());
        jFormattedTextFieldCelular.setText(model.getCelular());*/        

        jTextFieldPesquisaFornecedor.setText("");

        jButtonNovo.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jButtonEditar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        //jButtonPesquisar.setEnabled(false);
        
        //jTableFornecedores.setVisible(false);
        
        preencherTabela("select *from fornecedores where razaosocial_fornecedor like'%"+mod.getPesquisar()+"%'");
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    public void preencherTabela(String Sql) {
        ArrayList dados = new ArrayList();
        String [] colunas = new String [] {"ID","Razão Social","CNPJ","Data Cadastro","Nome Fantasia","Contato","Endereço","Numero","Complemento","Bairro","CEP","Cidade","Estado","E-mail","Telefone","Celular"};
        conecta.conexao();
        conecta.executaSQL(Sql);
        
        try{
            conecta.rs.first();
            do{
                dados.add(new Object[] {conecta.rs.getInt("id_fornecedor"),conecta.rs.getString("razaosocial_fornecedor"),conecta.rs.getString("cnpj_fornecedor"),conecta.rs.getString("datacadastro_fornecedor"),conecta.rs.getString("nomefantasia_fornecedor"),conecta.rs.getString("contato_fornecedor"),conecta.rs.getString("endereco_fornecedor"),conecta.rs.getInt("numero_fornecedor"),conecta.rs.getString("complemento_fornecedor"),conecta.rs.getString("bairro_fornecedor"),conecta.rs.getString("cep_fornecedor"),conecta.rs.getString("cidade_fornecedor"),conecta.rs.getString("estado_fornecedor"),conecta.rs.getString("email_fornecedor"),conecta.rs.getString("telefone_fornecedor"),conecta.rs.getString("celular_fornecedor")});                
            }while(conecta.rs.next());                    
        }catch(SQLException ex) {
            
        // Preenchendo a tabela
        
            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher tabela!");
        }
        PreencherTabela modelo = new PreencherTabela(dados, colunas);
        
        jTableFornecedores.setModel(modelo);        
        jTableFornecedores.getColumnModel().getColumn(0).setPreferredWidth(40);
        jTableFornecedores.getColumnModel().getColumn(0).setResizable(false);
        
        jTableFornecedores.getColumnModel().getColumn(1).setPreferredWidth(260);
        jTableFornecedores.getColumnModel().getColumn(1).setResizable(false);
        
        jTableFornecedores.getColumnModel().getColumn(2).setPreferredWidth(160);
        jTableFornecedores.getColumnModel().getColumn(2).setResizable(false);
        
        jTableFornecedores.getColumnModel().getColumn(3).setPreferredWidth(100);
        jTableFornecedores.getColumnModel().getColumn(3).setResizable(false);
        
        jTableFornecedores.getColumnModel().getColumn(4).setPreferredWidth(260);
        jTableFornecedores.getColumnModel().getColumn(4).setResizable(false);
        
        jTableFornecedores.getColumnModel().getColumn(5).setPreferredWidth(180);
        jTableFornecedores.getColumnModel().getColumn(5).setResizable(false);
        
        jTableFornecedores.getColumnModel().getColumn(6).setPreferredWidth(260);
        jTableFornecedores.getColumnModel().getColumn(6).setResizable(false);
        
        jTableFornecedores.getColumnModel().getColumn(7).setPreferredWidth(60);
        jTableFornecedores.getColumnModel().getColumn(7).setResizable(false);
        
        jTableFornecedores.getColumnModel().getColumn(8).setPreferredWidth(180);
        jTableFornecedores.getColumnModel().getColumn(8).setResizable(false);
        
        jTableFornecedores.getColumnModel().getColumn(9).setPreferredWidth(180);
        jTableFornecedores.getColumnModel().getColumn(9).setResizable(false);
        
        jTableFornecedores.getColumnModel().getColumn(10).setPreferredWidth(80);
        jTableFornecedores.getColumnModel().getColumn(10).setResizable(false);
        
        jTableFornecedores.getColumnModel().getColumn(11).setPreferredWidth(200);
        jTableFornecedores.getColumnModel().getColumn(11).setResizable(false);
        
        jTableFornecedores.getColumnModel().getColumn(12).setPreferredWidth(60);
        jTableFornecedores.getColumnModel().getColumn(12).setResizable(false);
        
        jTableFornecedores.getColumnModel().getColumn(13).setPreferredWidth(240);
        jTableFornecedores.getColumnModel().getColumn(13).setResizable(false);
        
        jTableFornecedores.getColumnModel().getColumn(14).setPreferredWidth(110);
        jTableFornecedores.getColumnModel().getColumn(14).setResizable(false);
        
        jTableFornecedores.getColumnModel().getColumn(15).setPreferredWidth(120);
        jTableFornecedores.getColumnModel().getColumn(15).setResizable(false); 
        
        jTableFornecedores.getTableHeader().setReorderingAllowed(false);
        jTableFornecedores.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTableFornecedores.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);      
        
        conecta.desconexao();
        
    }
    
    private void jTableFornecedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableFornecedoresMouseClicked
        String razaosocial_fornecedor = "" + jTableFornecedores.getValueAt(jTableFornecedores.getSelectedRow(), 1);
        conecta.conexao();
        conecta.executaSQL("select *from fornecedores where razaosocial_fornecedor = '"+ razaosocial_fornecedor + "'");
        try {
            conecta.rs.first();
            jTextFieldID.setText(String.valueOf(conecta.rs.getInt("id_fornecedor")));
            jTextFieldRazaoSocial.setText(conecta.rs.getString("razaosocial_fornecedor"));
            jFormattedTextFieldCNPJ.setText(conecta.rs.getString("cnpj_fornecedor"));
            jFormattedTextFieldDataCadastro.setText(conecta.rs.getString("datacadastro_fornecedor"));
            jTextFieldNomeFantasia.setText(conecta.rs.getString("nomefantasia_fornecedor"));
            jTextFieldContato.setText(conecta.rs.getString("contato_fornecedor"));            
            jTextFieldEndereco.setText(conecta.rs.getString("endereco_fornecedor"));
            jTextFieldNumero.setText(String.valueOf(conecta.rs.getInt("numero_fornecedor")));
            jTextFieldComplemento.setText(conecta.rs.getString("complemento_fornecedor"));            
            jTextFieldBairro.setText(conecta.rs.getString("bairro_fornecedor"));
            jFormattedTextFieldCEP.setText(conecta.rs.getString("cep_fornecedor"));
            jComboBoxCidade.setSelectedItem(conecta.rs.getString("cidade_fornecedor"));
            jComboBoxEstado.setSelectedItem(conecta.rs.getString("estado_fornecedor"));
            jTextFieldEmail.setText(conecta.rs.getString("email_fornecedor"));            
            jFormattedTextFieldTelefone.setText(conecta.rs.getString("telefone_fornecedor"));
            jFormattedTextFieldCelular.setText(conecta.rs.getString("celular_fornecedor"));
            
            

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
        jTableFornecedores.setVisible(false);

        jTextFieldPesquisaFornecedor.setEnabled(false);
        jTextFieldPesquisaFornecedor.setText("");

        conecta.desconexao();

    }//GEN-LAST:event_jTableFornecedoresMouseClicked

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        flag = 1;

        jTextFieldRazaoSocial.setEnabled(true);
        jFormattedTextFieldCNPJ.setEnabled(true);
        jFormattedTextFieldDataCadastro.setEnabled(true);        
        jTextFieldNomeFantasia.setEnabled(true);
        jTextFieldContato.setEnabled(true);
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
        
        jTextFieldPesquisaFornecedor.setEnabled(false);

        jTextFieldID.setText("");
        jTextFieldRazaoSocial.setText("");
        jFormattedTextFieldCNPJ.setText("");
        jFormattedTextFieldDataCadastro.setText("");
        jTextFieldNomeFantasia.setText("");
        jTextFieldContato.setText("");        
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
        
        jTextFieldPesquisaFornecedor.setText("");

        jButtonNovo.setEnabled(false);
        jButtonSalvar.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonCancelar.setEnabled(true);
        jButtonExcluir.setEnabled(false);
        jButtonPesquisar.setEnabled(false);

    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if (jTextFieldRazaoSocial.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo RAZÃO SOCIAL para prosseguir");
            jTextFieldRazaoSocial.requestFocus();
        }else if (jFormattedTextFieldCNPJ.getText().trim().length() < 18 || jFormattedTextFieldCNPJ.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo CNPJ para prosseguir");
            jFormattedTextFieldCNPJ.requestFocus();         
        }else if(jFormattedTextFieldDataCadastro.getText().trim().length() < 10 || jFormattedTextFieldDataCadastro.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo DATA DE CADASTRO para prosseguir");
            jFormattedTextFieldDataCadastro.requestFocus();                     
        }else if (jTextFieldNomeFantasia.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo NOME FANTASIA para prosseguir");
            jTextFieldNomeFantasia.requestFocus();
        }else if (jTextFieldContato.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo CONTATO para prosseguir");
            jTextFieldContato.requestFocus();           
        }else if (jTextFieldEndereco.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo ENDEREÇO para prosseguir");
            jTextFieldEndereco.requestFocus();
        }else if (jTextFieldNumero.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo NÚMERO para prosseguir");
            jTextFieldNumero.requestFocus();
        }else if (jTextFieldBairro.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo BAIRRO para prosseguir");
            jTextFieldBairro.requestFocus();        
        }else if (jFormattedTextFieldCEP.getText().trim().length() < 10 || jFormattedTextFieldCEP.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo CEP para prosseguir");
            jFormattedTextFieldCEP.requestFocus();              
        }else if (jComboBoxCidade.getSelectedItem() == null && !jComboBoxCidade.getSelectedItem().toString().equals(" ")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo NÚMERO para prosseguir");
            jComboBoxCidade.requestFocus();    
        }else if (jComboBoxEstado.getSelectedItem() == null && !jComboBoxEstado.getSelectedItem().toString().equals(" ")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo NÚMERO para prosseguir");
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

        }else

        // FUNÇÃO INSERIR DADOS

        if(flag==1) {

            mod.setRazaoSocial(jTextFieldRazaoSocial.getText());
            mod.setCNPJ(jFormattedTextFieldCNPJ.getText());
            mod.setDataCadastro(jFormattedTextFieldDataCadastro.getText());            
            mod.setNomeFantasia(jTextFieldNomeFantasia.getText());
            mod.setContato(jTextFieldContato.getText());
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
            jTextFieldRazaoSocial.setText("");
            jFormattedTextFieldCNPJ.setText("");
            jFormattedTextFieldDataCadastro.setText("");
            jTextFieldNomeFantasia.setText("");
            jTextFieldContato.setText("");            
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
            jTextFieldRazaoSocial.setEnabled(false);
            jFormattedTextFieldCNPJ.setEnabled(false);
            jFormattedTextFieldDataCadastro.setEnabled(false);
            jTextFieldNomeFantasia.setEnabled(false);
            jTextFieldContato.setEnabled(false);            
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
            
            jTextFieldPesquisaFornecedor.setEnabled(true);

            jButtonNovo.setEnabled(true);
            jButtonSalvar.setEnabled(false);
            jButtonEditar.setEnabled(false);
            jButtonCancelar.setEnabled(false);
            jButtonExcluir.setEnabled(false);
            jButtonPesquisar.setEnabled(true);
            
            preencherTabela("select *from fornecedores order by razaosocial_fornecedor");

                // FUNÇÃO ALTERAR DADOS

            }else{

                mod.setID(Integer.parseInt(jTextFieldID.getText()));
                mod.setRazaoSocial(jTextFieldRazaoSocial.getText());
                mod.setCNPJ(jFormattedTextFieldCNPJ.getText());
                mod.setDataCadastro(jFormattedTextFieldDataCadastro.getText());
                mod.setNomeFantasia(jTextFieldNomeFantasia.getText());
                mod.setContato(jTextFieldContato.getText());                
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
                
                //mod.setStatusCliente(String(jRadioButtonClienteAnalise.getSelectedObjects());
                dao.Alterar(mod);

                jTextFieldID.setText("");
                jTextFieldRazaoSocial.setText("");
                jFormattedTextFieldCNPJ.setText("");
                jFormattedTextFieldDataCadastro.setText("");
                jTextFieldNomeFantasia.setText("");
                jTextFieldContato.setText("");                
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
                    jTextFieldRazaoSocial.setEnabled(false);
                    jFormattedTextFieldCNPJ.setEnabled(false);
                    jFormattedTextFieldDataCadastro.setEnabled(false);
                    jTextFieldNomeFantasia.setEnabled(false);
                    jTextFieldContato.setEnabled(false);                    
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
                    
                    jTextFieldPesquisaFornecedor.setEnabled(true);
                    jTableFornecedores.setVisible(true);

                    jButtonNovo.setEnabled(true);
                    jButtonSalvar.setEnabled(false);
                    jButtonEditar.setEnabled(false);
                    jButtonCancelar.setEnabled(false);
                    jButtonExcluir.setEnabled(false);
                    jButtonPesquisar.setEnabled(true);
                    preencherTabela("select *from fornecedores order by razaosocial_fornecedor");

                }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        flag = 2;
        //jTextFieldID.setEnabled(true);
        jTextFieldRazaoSocial.setEnabled(true);
        jFormattedTextFieldCNPJ.setEnabled(true);
        jFormattedTextFieldDataCadastro.setEnabled(true);
        jTextFieldNomeFantasia.setEnabled(true);
        jTextFieldContato.setEnabled(true);        
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
        
        jTextFieldPesquisaFornecedor.setEnabled(false);
        //jTableClientes.setEnabled(false);

        jTextFieldPesquisaFornecedor.setText("");

        jButtonNovo.setEnabled(false);
        jButtonSalvar.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonCancelar.setEnabled(true);
        jButtonExcluir.setEnabled(false);
        jButtonPesquisar.setEnabled(false);

    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        jTextFieldID.setEnabled(false);
        jTextFieldRazaoSocial.setEnabled(false);
        jFormattedTextFieldCNPJ.setEnabled(false);
        jFormattedTextFieldDataCadastro.setEnabled(false);
        jTextFieldNomeFantasia.setEnabled(false);
        jTextFieldContato.setEnabled(false);        
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
        
        jTextFieldPesquisaFornecedor.requestFocus();
        jTextFieldPesquisaFornecedor.setEnabled(true);
        jTableFornecedores.setVisible(true);
        
        jTextFieldID.setText("");
        jTextFieldRazaoSocial.setText("");
        jFormattedTextFieldCNPJ.setText("");
        jFormattedTextFieldDataCadastro.setText("");
        jTextFieldNomeFantasia.setText("");
        jTextFieldContato.setText("");        
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

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir o fornecedor?");
        if(resposta == JOptionPane.YES_OPTION) {
            mod.setID(Integer.parseInt(jTextFieldID.getText()));
            dao.Excluir(mod);
            jTextFieldID.setText("");
            jTextFieldRazaoSocial.setText("");
            jFormattedTextFieldCNPJ.setText("");
            jFormattedTextFieldDataCadastro.setText("");
            jTextFieldNomeFantasia.setText("");
            jTextFieldContato.setText("");            
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
            
            jTextFieldPesquisaFornecedor.setText("");

            jTableFornecedores.setVisible(true);

            jButtonNovo.setEnabled(true);
            jButtonSalvar.setEnabled(false);
            jButtonEditar.setEnabled(false);
            jButtonCancelar.setEnabled(false);
            jButtonExcluir.setEnabled(false);
            jButtonPesquisar.setEnabled(true);
            preencherTabela("select *from fornecedores order by razaosocial_fornecedor");

        }

    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CadastroFornecedores dialog = new CadastroFornecedores(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> jComboBoxCidade;
    private javax.swing.JComboBox<String> jComboBoxEstado;
    private javax.swing.JFormattedTextField jFormattedTextFieldCEP;
    private javax.swing.JFormattedTextField jFormattedTextFieldCNPJ;
    private javax.swing.JFormattedTextField jFormattedTextFieldCelular;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataCadastro;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JLabel jLabelCEP;
    private javax.swing.JLabel jLabelCelular;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelCnpj;
    private javax.swing.JLabel jLabelContato;
    private javax.swing.JLabel jLabelDataCadastro;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelEndereco1;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelNomeFantasia;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelPesquisarCliente;
    private javax.swing.JLabel jLabelRazaoSocial;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JPanel jPanelDadosCadastrais;
    private javax.swing.JPanel jPanelPesquisa;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableFornecedores;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldComplemento;
    private javax.swing.JTextField jTextFieldContato;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldNomeFantasia;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JTextField jTextFieldPesquisaFornecedor;
    private javax.swing.JTextField jTextFieldRazaoSocial;
    // End of variables declaration//GEN-END:variables
}
