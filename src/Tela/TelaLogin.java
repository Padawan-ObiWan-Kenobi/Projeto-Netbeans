
package Tela;

import Conexao.ConexaoBD;
import ModeloBeans.ControleTeclasSenha;
import ModeloBeans.ControleTeclasUsuario;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class TelaLogin extends javax.swing.JDialog {
    ConexaoBD conecta = new ConexaoBD();

    
    public TelaLogin(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        conecta.conexao();
        jTextFieldUsuario.setDocument(new ControleTeclasUsuario());
        jPasswordFieldSenha.setDocument(new ControleTeclasSenha());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabelLoginUsuario = new javax.swing.JLabel();
        IconeUsuario = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelSenha = new javax.swing.JLabel();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jTextFieldUsuario = new javax.swing.JTextField();
        jButtonSair = new javax.swing.JButton();
        jButtonAcessar = new javax.swing.JButton();
        jButtonResetar = new javax.swing.JButton();
        jLabelEsqueceuSenha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN DE USUÁRIO");
        setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(239, 239, 239));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelLoginUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelLoginUsuario.setForeground(new java.awt.Color(120, 200, 10));
        jLabelLoginUsuario.setText("LOGIN DE USUÁRIO");

        IconeUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/UserLogin4.fw.png"))); // NOI18N

        jLabelUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(120, 200, 10));
        jLabelUsuario.setText("Usuário");

        jLabelSenha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelSenha.setForeground(new java.awt.Color(120, 200, 10));
        jLabelSenha.setText("Senha");

        jPasswordFieldSenha.setBackground(new java.awt.Color(239, 239, 239));
        jPasswordFieldSenha.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPasswordFieldSenha.setForeground(new java.awt.Color(0, 129, 197));
        jPasswordFieldSenha.setToolTipText("Insira sua senha de login");

        jTextFieldUsuario.setBackground(new java.awt.Color(239, 239, 239));
        jTextFieldUsuario.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jTextFieldUsuario.setForeground(new java.awt.Color(0, 129, 197));
        jTextFieldUsuario.setToolTipText("Insira o seu login de entrada");

        jButtonSair.setBackground(new java.awt.Color(0, 129, 197));
        jButtonSair.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonSair.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSair.setText("SAIR");
        jButtonSair.setToolTipText("Finaliza a entrada no sistema");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jButtonAcessar.setBackground(new java.awt.Color(0, 129, 197));
        jButtonAcessar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonAcessar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAcessar.setText("LOGIN");
        jButtonAcessar.setToolTipText("Efetua login no sistema");
        jButtonAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcessarActionPerformed(evt);
            }
        });

        jButtonResetar.setBackground(new java.awt.Color(0, 129, 197));
        jButtonResetar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonResetar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonResetar.setText("RESETAR");
        jButtonResetar.setToolTipText("Reseta sua senha de login");
        jButtonResetar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonResetarMouseClicked(evt);
            }
        });
        jButtonResetar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetarActionPerformed(evt);
            }
        });

        jLabelEsqueceuSenha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelEsqueceuSenha.setForeground(new java.awt.Color(120, 200, 10));
        jLabelEsqueceuSenha.setText("Esqueceu a sua senha !");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(IconeUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelLoginUsuario)
                    .addComponent(jLabelUsuario)
                    .addComponent(jLabelSenha)
                    .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEsqueceuSenha)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonAcessar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSair))
                    .addComponent(jButtonResetar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(26, 26, 26))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabelLoginUsuario)
                        .addGap(28, 28, 28)
                        .addComponent(jLabelUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelSenha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonAcessar)
                            .addComponent(jButtonSair))
                        .addGap(12, 12, 12)
                        .addComponent(jLabelEsqueceuSenha)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonResetar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(IconeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(578, 388));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
           
    }//GEN-LAST:event_formWindowOpened

    private void jButtonResetarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetarActionPerformed
        
    }//GEN-LAST:event_jButtonResetarActionPerformed

    private void jButtonAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcessarActionPerformed

        try {
            conecta.executaSQL("select *from usuarios where nome_usuario='"+jTextFieldUsuario.getText()+"'");
            conecta.rs.first();
            if(conecta.rs.getString("senha_usuario").equals(jPasswordFieldSenha.getText())) {
                TelaInicial tela = new TelaInicial(jTextFieldUsuario.getText());
                tela.setVisible(true);
                dispose();
            }else{
                JOptionPane.showMessageDialog(rootPane, "Usuário logado com sucesso!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Senha ou usuário inválidos!");
        }
    }//GEN-LAST:event_jButtonAcessarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonResetarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonResetarMouseClicked
        ResetarUsuario tela = new ResetarUsuario();
        tela.setVisible(true);          
        //RecuperaLogin(jTextFieldUsuario.getText());
        dispose();
    }//GEN-LAST:event_jButtonResetarMouseClicked

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IconeUsuario;
    private javax.swing.JButton jButtonAcessar;
    private javax.swing.JButton jButtonResetar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabelEsqueceuSenha;
    private javax.swing.JLabel jLabelLoginUsuario;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables

    
}
