
package Tela;

import Conexao.ConexaoBD;
import ModeloBeans.BeansDadosEmpresa;
import ModeloDao.DaoDadosEmpresa;

public class DadosEmpresa extends javax.swing.JDialog {
    BeansDadosEmpresa mod = new BeansDadosEmpresa();
    DaoDadosEmpresa control =  new DaoDadosEmpresa();
    ConexaoBD conecta = new ConexaoBD();

    public DadosEmpresa(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabelID = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jLabelNomeEmpresa = new javax.swing.JLabel();
        jTextFieldNomeEmpresa = new javax.swing.JTextField();
        jLabelCnpj = new javax.swing.JLabel();
        jTextFieldCnpj = new javax.swing.JTextField();
        jLabelEndereco = new javax.swing.JLabel();
        jTextFieldEndereco = new javax.swing.JTextField();
        jLabelBairro = new javax.swing.JLabel();
        jTextFieldBairro = new javax.swing.JTextField();
        jLabelCep = new javax.swing.JLabel();
        jTextFieldCep = new javax.swing.JTextField();
        jLabelCidade = new javax.swing.JLabel();
        jTextFieldCidade = new javax.swing.JTextField();
        jLabelEstado = new javax.swing.JLabel();
        jTextFieldEstado = new javax.swing.JTextField();
        jLabelTelefone = new javax.swing.JLabel();
        jTextFieldTelefone = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButtonSalvar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonSalvar.setForeground(new java.awt.Color(102, 102, 255));
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
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

        jButtonEditar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonEditar.setForeground(new java.awt.Color(102, 102, 255));
        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelID.setForeground(new java.awt.Color(102, 102, 255));
        jLabelID.setText("ID");

        jTextFieldID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldID.setForeground(new java.awt.Color(102, 102, 255));
        jTextFieldID.setEnabled(false);

        jLabelNomeEmpresa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelNomeEmpresa.setForeground(new java.awt.Color(102, 102, 255));
        jLabelNomeEmpresa.setText("Nome da empresa");

        jTextFieldNomeEmpresa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldNomeEmpresa.setForeground(new java.awt.Color(102, 102, 255));
        jTextFieldNomeEmpresa.setEnabled(false);

        jLabelCnpj.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelCnpj.setForeground(new java.awt.Color(102, 102, 255));
        jLabelCnpj.setText("CNPJ");

        jTextFieldCnpj.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldCnpj.setForeground(new java.awt.Color(102, 102, 255));
        jTextFieldCnpj.setEnabled(false);

        jLabelEndereco.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelEndereco.setForeground(new java.awt.Color(102, 102, 255));
        jLabelEndereco.setText("Endereço");

        jTextFieldEndereco.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldEndereco.setForeground(new java.awt.Color(102, 102, 255));
        jTextFieldEndereco.setEnabled(false);

        jLabelBairro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelBairro.setForeground(new java.awt.Color(102, 102, 255));
        jLabelBairro.setText("Bairro");

        jTextFieldBairro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldBairro.setForeground(new java.awt.Color(102, 102, 255));
        jTextFieldBairro.setEnabled(false);

        jLabelCep.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelCep.setForeground(new java.awt.Color(102, 102, 255));
        jLabelCep.setText("CEP");

        jTextFieldCep.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldCep.setForeground(new java.awt.Color(102, 102, 255));
        jTextFieldCep.setEnabled(false);

        jLabelCidade.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelCidade.setForeground(new java.awt.Color(102, 102, 255));
        jLabelCidade.setText("Cidade");

        jTextFieldCidade.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldCidade.setForeground(new java.awt.Color(102, 102, 255));
        jTextFieldCidade.setEnabled(false);

        jLabelEstado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelEstado.setForeground(new java.awt.Color(102, 102, 255));
        jLabelEstado.setText("Estado");

        jTextFieldEstado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldEstado.setForeground(new java.awt.Color(102, 102, 255));
        jTextFieldEstado.setEnabled(false);

        jLabelTelefone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelTelefone.setForeground(new java.awt.Color(102, 102, 255));
        jLabelTelefone.setText("Telefone");

        jTextFieldTelefone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldTelefone.setForeground(new java.awt.Color(102, 102, 255));
        jTextFieldTelefone.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelID)
                    .addComponent(jLabelNomeEmpresa)
                    .addComponent(jLabelCnpj)
                    .addComponent(jLabelEndereco)
                    .addComponent(jLabelBairro)
                    .addComponent(jLabelCidade)
                    .addComponent(jLabelTelefone))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(176, 176, 176)
                            .addComponent(jLabelCep)
                            .addGap(18, 18, 18)
                            .addComponent(jTextFieldCep))
                        .addComponent(jTextFieldEndereco)
                        .addComponent(jTextFieldCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextFieldCidade)
                                .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addComponent(jLabelEstado)
                            .addGap(18, 18, 18)
                            .addComponent(jTextFieldEstado))
                        .addComponent(jTextFieldNomeEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelID)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomeEmpresa)
                    .addComponent(jTextFieldNomeEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCnpj)
                    .addComponent(jTextFieldCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEndereco)
                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBairro)
                    .addComponent(jLabelCep)
                    .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCidade)
                    .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEstado)
                    .addComponent(jTextFieldEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelefone)
                    .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonEditar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCancelar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonEditar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        mod.setNome(jTextFieldNomeEmpresa.getText());
        mod.setCNPJ(jTextFieldCnpj.getText());
        mod.setEndereco(jTextFieldEndereco.getText());
        mod.setBairro(jTextFieldBairro.getText());
        mod.setCEP(jTextFieldCep.getText());
        mod.setCidade(jTextFieldCidade.getText());
        mod.setEstado(jTextFieldEstado.getText());
        mod.setTelefone(jTextFieldTelefone.getText());
        control.Salvar(mod);

        jTextFieldNomeEmpresa.setText("");
        jTextFieldCnpj.setText("");
        jTextFieldEndereco.setText("");
        jTextFieldBairro.setText("");
        jTextFieldCep.setText("");
        jTextFieldCidade.setText("");
        jTextFieldEstado.setText("");
        jTextFieldTelefone.setText("");

        jTextFieldNomeEmpresa.setEnabled(false);
        jTextFieldCnpj.setEnabled(false);
        jTextFieldEndereco.setEnabled(false);
        jTextFieldBairro.setEnabled(false);
        jTextFieldCep.setEnabled(false);
        jTextFieldCidade.setEnabled(false);
        jTextFieldEstado.setEnabled(false);
        jTextFieldTelefone.setEnabled(false);

        jButtonEditar.setEnabled(true);
        jButtonSalvar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        jTextFieldNomeEmpresa.setEnabled(false);
        jTextFieldCnpj.setEnabled(false);
        jTextFieldEndereco.setEnabled(false);
        jTextFieldBairro.setEnabled(false);
        jTextFieldCep.setEnabled(false);
        jTextFieldCidade.setEnabled(false);
        jTextFieldEstado.setEnabled(false);
        jTextFieldTelefone.setEnabled(false);

        jTextFieldNomeEmpresa.setText("");
        jTextFieldCnpj.setText("");
        jTextFieldEndereco.setText("");
        jTextFieldBairro.setText("");
        jTextFieldCep.setText("");
        jTextFieldCidade.setText("");
        jTextFieldEstado.setText("");
        jTextFieldTelefone.setText("");

        jButtonEditar.setEnabled(true);
        jButtonSalvar.setEnabled(false);
        jButtonCancelar.setEnabled(false);

    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        jTextFieldNomeEmpresa.setEnabled(true);
        jTextFieldCnpj.setEnabled(true);
        jTextFieldEndereco.setEnabled(true);
        jTextFieldBairro.setEnabled(true);
        jTextFieldCep.setEnabled(true);
        jTextFieldCidade.setEnabled(true);
        jTextFieldEstado.setEnabled(true);
        jTextFieldTelefone.setEnabled(true);

        jButtonEditar.setEnabled(false);
        jButtonSalvar.setEnabled(true);
        jButtonCancelar.setEnabled(true);

    }//GEN-LAST:event_jButtonEditarActionPerformed
    
    public static void main(String args[]) {
                
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DadosEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DadosEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DadosEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DadosEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DadosEmpresa dialog = new DadosEmpresa(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JLabel jLabelCep;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelCnpj;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelNomeEmpresa;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldCep;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldCnpj;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldEstado;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldNomeEmpresa;
    private javax.swing.JTextField jTextFieldTelefone;
    // End of variables declaration//GEN-END:variables
}
