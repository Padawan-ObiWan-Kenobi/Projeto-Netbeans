/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodigoInutlizado;

/**
 *
 * @author João Elias
 */
public class CodigoClassesInutilzado {
    
    /*nao esta funcionando a verificação do combobox

            if ( ((String)jComboBoxStatus.getSelectedItem()).equals(null) ) {
                JOptionPane.showMessageDialog(null, "Nada foi selecionado");
            } else {
                JOptionPane.showMessageDialog(null, "Foi selecionado " + jComboBoxStatus.getSelectedItem());
            }

            String select = (String) jcomboBoxStatus.getSelectedItem();
            if(resposta.equals("1"))
            JOptionPane.showMessageDialog(null, "Preencha o campo E-MAIL para prosseguir");
            jTextFieldEmail.requestFocus();

            if ( evento.getStateChange() == ItemEvent.SELECTED )
            {
                JOptionPane.showMessageDialog(null, "Voc^e selecionou : " +(jcomboBoxStatus.getSelectedItem()) );
                78 }

        }select=jComboBoxStatus.getSelectedItem().toString();
        if(select.isEmpty() || select.toString()==null){

            int select=jComboBoxStatus.getSelectedIndex();
        }else if (select==0) {
            JOptionPane.showMessageDialog(null, "Preencha o campo STATUS para prosseguir");
            jComboBoxStatus.requestFocus();
        }else if (select==1 || select==2 || select==3) {
            JOptionPane.showMessageDialog(null, "Selecionado uma das opções do campo STATUS");
            jTextPaneObservacoes.requestFocus();*/
    
    
    /*public void preencherStatus() {
        conecta.conexao();
        conecta.executaSQL("select *from clientes order by status_cliente");
        try {
            conecta.rs.first();
            jComboBoxStatus.removeAllItems();
            do{
                jComboBoxStatus.addItem(conecta.rs.getString("status_cliente"));                
            }while(conecta.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher o status do cliente!"+ex);
        }
        
        conecta.desconexao();
    
    }*/
    
    
    //jPanelPesquisa.removeAll();
        //jPanelDadosCadastrais.setVisible(true);
    
    
    //SINTAXE PARA ABRIR NOVA JANELA
    
    //CadastroClientes DialogCadCliente = new CadastroClientes(new javax.swing.JDialog(),true); 
    //DialogCadCliente.setVisible(true);
    //CadastroCategoria DialogCadastroCategoria = new CadastroCategoria(new javax.swing.JDialog(),true); 
    //DialogCadastroCategoria.setVisible(true);
    //CadastroCategoria DialogCadastroCategoria = new CadastroCategoria(new javax.swing.JDialog(),true); 
    //DialogCadastroCategoria.setVisible(true);
   //(new ModeloCadastro3(this,true)).setVisible(true);    
    
    //SINTAXE PARA ABRIR RELATORIO NO JASPERSOFT
    
    /*import net.sf.jasperreports.engine.JRResultSetDataSource;
    import net.sf.jasperreports.engine.JasperFillManager;
    import net.sf.jasperreports.engine.JasperPrint;
    import net.sf.jasperreports.view.JasperViewer;*/
    
    
    /*try{
            MaskFormatter form = new MaskFormatter("##.###;###-##");
            jTextFieldCEP.setFormatterFactory(new DefaultFormatterFactory);
            
        }catch
            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher tabela!"); *
    
}


 /*private void formWindowOpened(java.awt.event.WindowEvent evt) {
        
        //SkyBlue()
        //BrownSugar()
        //DarkStar()
        //DesertGreen()
        //Silver()
        //ExperienceRoyale
        
        try {
            PlasticLookAndFeel.setPlasticTheme(new ExperienceRoyale());
            try {
                UIManager.setLookAndFeel("com.jgoodies.looks.plastic.Plastic3DLookAndFeel");
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(CadastroClientes.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(CadastroClientes.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (InstantiationException ex) {
                Logger.getLooger(CadastroClientes.class.getName()).log(Level,SEVERE, null, ex)
            } catch (IllegalAcessException ex) {
                Logger.getLooger(CadastroClientes.class.getName()).log(Level,SEVERE, null, ex)
            } catch (UnsupportedLookAndFeelException ex) {
                Logger.getLooger(CadastroClientes.class.getName()).log(Level,SEVERE, null, ex)
            }
            
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            
        SwingUtilities.updateComponentTreeUI(this);
                        
        jdpprincipal.setBackground(SystemColor.BLACK)*/
                        
    }
