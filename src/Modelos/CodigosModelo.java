/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author João & Queillia
 */
public class CodigosModelo {    

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
    
    
    /*try{
            MaskFormatter form = new MaskFormatter("##.###;###-##");
            jTextFieldCEP.setFormatterFactory(new DefaultFormatterFactory);
            
        }catch
            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher tabela!"); */ 
    
    
    /*public void preencherFornecedores() {
        conecta.conexao();
        conecta.executaSQL("select *from fornecedores order by razaosocial_fornecedor");
        try {
            conecta.rs.first();
            jComboBoxFornecedor.removeAllItems();
            do{
                jComboBoxFornecedor.addItem(conecta.rs.getString("razaosocial_fornecedor"));                
            }while(conecta.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher a lista de fornecedores!"+ex);
        }
        
        conecta.desconexao();
    
    }
    
    public void preencherCategoria() {
        conecta.conexao();
        conecta.executaSQL("select *from categoria order by nome_categoria");
        try {
            conecta.rs.first();
            jComboBoxSexo.removeAllItems();
            do{
                jComboBoxSexo.addItem(conecta.rs.getString("nome_categoria"));                
            }while(conecta.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher a lista de fornecedores!"+ex);
        }
        
        conecta.desconexao();/*
    
    }
    
    /*public void preencherIDFornecedores() {
        conecta.conexao();
        conecta.executaSQL("select *from fornecedores order by id_fornecedor");
        try {
            conecta.rs.first();
            jTextFieldIDFornecedor.setText(String.valueOf(conecta.rs.getString("id_fornecedor_produto")));    
                        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher a lista de fornecedores!"+ex);
        }
        
        conecta.desconexao();
    
    }*/
    
    
    //DefaultComboBoxModel dm = new DefaultComboBoxModel();
    
    //float Total = 0;
    
    //preencherTabelaItensVenda("select *from itens_venda order by id_produto");
    
    //ArrayList<VendaCaixa> itens = new ArrayList<>();
        
        /*try{
            MaskFormatter form = new MaskFormatter("##/##/####");
            jFormattedTextFieldData.setFormatterFactory(new DefaultFormatterFactory(form));
            
        }catch (ParseException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher tabela!"); 
            
}  */
        //Pegar data do sistema
    
    //jComboBoxProdutos.removeAllItems();
    
    //jComboBoxProdutos.addItem(conecta.rs.getString("descricao_produto"));
    
    //conecta.rs.first();
    
    /*public void SomaItens () {
        //nao esta funcionando ainda
        Total = 0;
        int Qtde = 0;
        int item = 0;
        conecta.executaSQL("select * from itens_venda inner join produtos on itens_venda.id_produto = produtos.id_produto where id_vendas="+IDvenda);
        try {
            //conecta.rs.first();
            while(conecta.rs.next()) {
                Qtde = conecta.rs.getInt("qtde_produto");
                item = conecta.rs.getInt("qtde_itens");
                Total = Total + conecta.rs.getInt("qtde_produto")*conecta.rs.getInt("qtde_itens");
            }
            jTextFieldItem.setText(String.valueOf(Total));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao efetuar a soma dos itens da venda!!"+ ex);
        }
    }*/
    
    /*public void preencherItemVenda(String Sql) {
        ArrayList dados = new ArrayList();
        String [] colunas = new String [] {"ID Prod.","Descrição","Qtde","Preço","Sub Total"}; 
        conecta.conexao();
        conecta.executaSQL(Sql);
        
        try{
            conecta.rs.last();
            do{
                float ValorProduto = conecta.rs.getFloat("precovenda_produto");
                int QtdVendida = conecta.rs.getInt("qtde_produto");
                dados.remove(new Object[] {conecta.rs.getInt("id_produto"),conecta.rs.getString("descricao_produto"),conecta.rs.getInt("qtde_produto"),conecta.rs.getFloat("precovenda_produto"), ValorProduto*QtdVendida});                
            }while(conecta.rs.next());                    
        }catch(SQLException ex) {
            
// Preenchendo a tabela
            //JOptionPane.showMessageDialog(rootPane, "Erro ao preencher tabela!");   
        }
        PreencherTabela modelo = new PreencherTabela(dados, colunas);
        
        jTableItensVenda.setModel(modelo);        
        jTableItensVenda.getColumnModel().getColumn(0).setPreferredWidth(60);
        jTableItensVenda.getColumnModel().getColumn(0).setResizable(false);
        
        jTableItensVenda.getColumnModel().getColumn(1).setPreferredWidth(310);
        jTableItensVenda.getColumnModel().getColumn(1).setResizable(false);
        
        jTableItensVenda.getColumnModel().getColumn(2).setPreferredWidth(60);
        jTableItensVenda.getColumnModel().getColumn(2).setResizable(false);
        
        jTableItensVenda.getColumnModel().getColumn(3).setPreferredWidth(310);
        jTableItensVenda.getColumnModel().getColumn(3).setResizable(false);
        
        jTableItensVenda.getColumnModel().getColumn(4).setPreferredWidth(310);
        jTableItensVenda.getColumnModel().getColumn(4).setResizable(false);
                                           
        jTableItensVenda.getTableHeader().setReorderingAllowed(false);
        jTableItensVenda.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTableItensVenda.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);      
        
        conecta.desconexao();
        
    }*/
    
    /*flag = 1;
        
        preencherTabelaCliente("select * from clientes where nome_cliente like'%"+jTextFieldNomeCliente.getText()+"%'");
        
        jTablePesquisa.setEnabled(true);
        jTextFieldNomeCliente.setText("");*/
          
        
        
        /*PesquisarClientes DialogVenda = new PesquisarClientes(new javax.swing.JDialog(),true); 
        DialogVenda.setVisible(true);*/
    
    //jComboBoxProdutos.setEnabled(true);
        //jTextFieldQtdeProdutos.setEnabled(true);
    
    //jComboBoxProdutos.setEnabled(true);
    
     //jTextFieldProduto.setText("");
    
    /*float subTotal;
        subTotal = Float.valueOf(jTextFieldPrecoProduto.getText())*Integer.parseInt(jTextFieldQtdeProdutos.getText());
        jTextFieldSubTotal.setText(String.valueOf(subTotal));*/
    
    //jTextFieldID.setText(String.valueOf(conecta.rs.getInt("id_venda")));      
    
     /*PreparedStatement pst = conecta.Con.prepareStatement("insert into itens_venda (qtde_itens)values (?)");
            pst.setFloat(1,1);
            pst.execute();
            
            conecta.executaSQL("select * from itens_venda");
            conecta.rs.last();
            IDvenda = conecta.rs.getInt("id_venda");*/
            
            //int resul = qtde - Integer.parseInt(jTextFieldQtdeProdutos.getText());
    
    /*PreparedStatement pst = conecta.Con.prepareStatement("insert into itens_venda (qtde_itens)values (?)");
            pst.setInt(1,1);
            pst.execute();
            
            conecta.executaSQL("select * from itens_venda");
            conecta.rs.last();
            IDvenda = conecta.rs.getInt("id_venda");
            //QtdeItens = conecta.rs.getInt("qtde_itens");*/
    
    //Total = Total + Float.parseFloat(jTextFieldPrecoProduto.getText())*Integer.parseInt(jTextFieldQtdeProdutos.getText());
            //jTextFieldTotal.setText(String.valueOf(Total));
    
    //jTextFieldNomeCliente.setText("");
    
    //Inserindo quantidade de itens
            
            
            
            //jTextFieldID.setText(String.valueOf(conecta.rs.getInt("id_venda")));  
    
    /*float subTotal;
        subTotal = Float.valueOf(jTextFieldPrecoProduto.getText())*Integer.parseInt(jTextFieldQtdeProdutos.getText());
        jTextFieldSubTotal.setText(String.valueOf(subTotal));*/
    
    //dispose();
    
    //jTableItensVenda.setEnabled(false);
    
    //ParcelamentoVenda frm = new ParcelamentoVenda(IDvenda);
        //this.jTextFieldNomeCliente.setText((this.pesquisarClientes.getCliente()));
    
    //preencherTabelaItensVenda("select * from itens_venda inner join produtos on itens_venda.id_produto = produtos.id_produto where id_venda="+IDvenda);
         //preencherTabelaItensVenda("select * from itens_venda inner join produtos on itens_venda.id_produto = produtos.id_produto order by descricao_produto");         
            /*mod.setProduto(jTextFieldProduto.getText());
            mod.setQtdeProduto(Integer.parseInt(jTextFieldQtdeProdutos.getText()));
            mod.setPrecoProduto(Float.valueOf(jTextFieldPrecoProduto.getText()));
            mod.setTotalProduto(Float.valueOf(jTextFieldSubTotal.getText()));
            mod.setIdVenda(IDvenda);*/
            
            //mod.setIdProduto(Integer.parseInt(jTextFieldIDProduto.getText()));
            //mod.setQtdeItens(Integer.parseInt(jTextFieldItem.getText()));
            //addItem.ExcluirItem(mod);
            
            //addItem.ExcluirItem(mod);
            
            //addItem.DeletarItemVenda();
            
            /*preencherItemVenda("select * from produtos inner join itens_venda"
                    + " on produtos.id_produto = itens_venda.id_produto inner join vendas"
                    + " on vendas.id_venda = itens_venda.id_venda where vendas.id_venda="+IDvenda);*/
            
            
            /*Total = Total + Float.parseFloat(jTextFieldPrecoProduto.getText())*Integer.parseInt(jTextFieldQtdeProdutos.getText());
            jTextFieldTotal.setText(String.valueOf(Total));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao pesquisar a quantidade!"+ ex);  
            
        }   */
            
            //System.out.println("linha selecionada "+jTableItensVenda.getSelectedRow());
    
      /*public void recebendo(String recebe) {
        jTextFieldNomeCliente.setText(recebe);
    }*/
    
    
}
