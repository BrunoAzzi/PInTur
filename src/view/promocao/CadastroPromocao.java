/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.promocao;

import control.ProdutoControl;
import control.PromocaoControl;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import messages.ConfirmMessages;
import messages.PromocaoFormWarning;
import messages.Titles;
import model.Produto;
import model.Promocao;
import utilidades.Mensagens;
import view.TableModels.PromocaoTableModel.PromocaoTableModel;

/**
 *
 * @author everton_m
 */
public class CadastroPromocao extends javax.swing.JFrame {
DefaultListModel defaultListModel = new DefaultListModel();
    /**
     * Creates new form CadastroPromocao
     */
     PromocaoTableModel promocaoTableModel = new PromocaoTableModel(4,false);
     
    public CadastroPromocao() {
        
        initComponents();
        this.setBackground( new Color(255, 255, 192) );
        ProdutoControl produtoControl = new ProdutoControl();
        for (Produto produto : produtoControl.listaProdutos()) {
            defaultListModel.addElement(produto);
            jList1.setModel(defaultListModel);
            
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        Produtos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jDateChooserDateInicial = new com.toedter.calendar.JDateChooser();
        jDateChooserDataFinal = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jFormattedTextFieldValorPromocional = new javax.swing.JFormattedTextField();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldValorProduto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Promoções");
        setBackground(new java.awt.Color(255, 255, 192));
        setResizable(false);

        Produtos.setBackground(new java.awt.Color(255, 255, 192));

        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel1.setText("Produto");

        jButton2.setBackground(new java.awt.Color(51, 102, 255));
        jButton2.setText("Novo");
        jButton2.setBorder(null);
        jButton2.setMaximumSize(new java.awt.Dimension(77, 23));
        jButton2.setMinimumSize(new java.awt.Dimension(77, 23));
        jButton2.setPreferredSize(new java.awt.Dimension(77, 23));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(51, 102, 255));
        jButton3.setText("Remover");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setMaximumSize(new java.awt.Dimension(77, 23));
        jButton3.setMinimumSize(new java.awt.Dimension(77, 23));
        jButton3.setPreferredSize(new java.awt.Dimension(77, 23));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTable1.setModel(promocaoTableModel);
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(jTable1);

        jDateChooserDateInicial.setMaxSelectableDate(new java.util.Date(1577847701000L));
        jDateChooserDateInicial.setMaximumSize(new java.awt.Dimension(89, 20));
        jDateChooserDateInicial.setMinSelectableDate(new java.util.Date(1388545286000L));
        jDateChooserDateInicial.setMinimumSize(new java.awt.Dimension(89, 20));

        jDateChooserDataFinal.setMaxSelectableDate(new java.util.Date(1577847686000L));
        jDateChooserDataFinal.setMaximumSize(new java.awt.Dimension(89, 20));
        jDateChooserDataFinal.setMinSelectableDate(new java.util.Date(1388545263000L));
        jDateChooserDataFinal.setMinimumSize(new java.awt.Dimension(89, 20));

        jLabel2.setText("Data Inicial");

        jLabel3.setText("Data Final");

        jLabel4.setText("Valor Promocional");

        jButton4.setBackground(new java.awt.Color(51, 102, 255));
        jButton4.setText("Salvar");
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setMaximumSize(new java.awt.Dimension(77, 23));
        jButton4.setMinimumSize(new java.awt.Dimension(77, 23));
        jButton4.setPreferredSize(new java.awt.Dimension(77, 23));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel5.setText("Valor");

        jTextFieldValorProduto.setEditable(false);

        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("Atenção: Todos os campos são obrigatórios!");

        javax.swing.GroupLayout ProdutosLayout = new javax.swing.GroupLayout(Produtos);
        Produtos.setLayout(ProdutosLayout);
        ProdutosLayout.setHorizontalGroup(
            ProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(ProdutosLayout.createSequentialGroup()
                        .addGroup(ProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(ProdutosLayout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ProdutosLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ProdutosLayout.createSequentialGroup()
                                        .addGap(88, 88, 88)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ProdutosLayout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldValorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ProdutosLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jFormattedTextFieldValorPromocional, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ProdutosLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jDateChooserDateInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ProdutosLayout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jDateChooserDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel6))
                        .addGap(0, 31, Short.MAX_VALUE))))
        );

        ProdutosLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel2, jLabel3, jLabel4, jLabel5});

        ProdutosLayout.setVerticalGroup(
            ProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addGroup(ProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ProdutosLayout.createSequentialGroup()
                        .addGroup(ProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jDateChooserDateInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooserDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextFieldValorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(ProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jFormattedTextFieldValorPromocional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(4, 4, 4)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addContainerGap())
        );

        ProdutosLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jDateChooserDateInicial, jLabel2});

        ProdutosLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jDateChooserDataFinal, jLabel3});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Produtos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Produtos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         // Produto retirado da lista no qual a promocao sera inserida;

        try {
            
            Produto produto = (Produto) jList1.getSelectedValue();
            
            String promocaoValorTratado = jFormattedTextFieldValorPromocional.getText().replace(',', '.').trim();
            
            Double valorDouble = (new Double(promocaoValorTratado));
            
            Date dataInicio =  jDateChooserDateInicial.getDate();
            Date dataFim =  jDateChooserDataFinal.getDate();
            
            Calendar calendarioInicio = Calendar.getInstance();
            calendarioInicio.setTime(dataInicio);
            
            Calendar calendarioFim = Calendar.getInstance();
            Calendar calendarioComputador = Calendar.getInstance();
            
            calendarioFim.setTime(dataFim);
            calendarioInicio.get(Calendar.MONTH);
            if(valorDouble >= produto.getValor()){
                JOptionPane.showMessageDialog(null, 
                        PromocaoFormWarning.PROMOCAO_VALOR_MAIOR_OU_IGUAL_DO_PRODUTO.getDescricao(),
                        Titles.WARNING.getDescricao(), 
                        JOptionPane.WARNING_MESSAGE);

            }
            else if(valorDouble <= 0){
                        JOptionPane.showMessageDialog(null, 
                PromocaoFormWarning.PROMOCAO_VALOR_MAIOR_QUE_ZERO.getDescricao(),
                Titles.WARNING.getDescricao(), 
                JOptionPane.WARNING_MESSAGE);
            }
            
            else if(calendarioInicio.get(Calendar.MONTH) != calendarioComputador.get(Calendar.MONTH)
                    || calendarioFim.get(Calendar.MONTH) != calendarioComputador.get(Calendar.MONTH)){
                JOptionPane.showMessageDialog(null, 
                        PromocaoFormWarning.PROMOCAO_CADASTRO_MES_INVALIDO.getDescricao(),
                        Titles.WARNING.getDescricao(), 
                        JOptionPane.WARNING_MESSAGE);
            }
            else if(calendarioInicio.get(Calendar.DAY_OF_MONTH) < calendarioComputador.get(Calendar.DAY_OF_MONTH)
                    || calendarioFim.get(Calendar.DAY_OF_MONTH) < calendarioComputador.get(Calendar.DAY_OF_MONTH)){
                JOptionPane.showMessageDialog(null, 
                        PromocaoFormWarning.PROMOCAO_CADASTRO_DIA_MENOR_QUE_DIA_ATUAL.getDescricao(),
                        Titles.WARNING.getDescricao(), 
                        JOptionPane.WARNING_MESSAGE);
            }
                
            else if(calendarioInicio.get(Calendar.DAY_OF_MONTH) > calendarioFim.get(Calendar.DAY_OF_MONTH)){
                JOptionPane.showMessageDialog(null, 
                        PromocaoFormWarning.PROMOCAO_CADASTRO_DIA_INVALIDO.getDescricao(), 
                        Titles.WARNING.getDescricao(), 
                        JOptionPane.WARNING_MESSAGE);
            }

            else if((Produto) jList1.getSelectedValue() == null){
                    JOptionPane.showMessageDialog(null, 
               PromocaoFormWarning.PROMOCAO_PRODUTO_NAO_SELECIONADO.getDescricao(), 
               Titles.WARNING.getDescricao(), 
               JOptionPane.WARNING_MESSAGE);   
            }
            
            else{
                // Nova promocao
                Promocao novaPromocao = new Promocao();
                // Popular a promocao
                populaPromocao(novaPromocao);
                //Adiciona Promocao e Produto na tabela
                promocaoTableModel.add(produto, novaPromocao);
                
                limparCampos();
            }
            
        } catch (NullPointerException e) {
            
            JOptionPane.showMessageDialog(null,
                    PromocaoFormWarning.PROMOCAO_CADASTRO_OBJETO_NULO.getDescricao(), 
                    Titles.WARNING.getDescricao(), 
                    JOptionPane.WARNING_MESSAGE);

        } catch(NumberFormatException e){
            
            JOptionPane.showMessageDialog(null, 
                    PromocaoFormWarning.PROMOCAO_CADASTRO_CAMPOS_INVALIDOS.getDescricao(), 
                    Titles.WARNING.getDescricao(), 
                    JOptionPane.WARNING_MESSAGE);
        }
        

        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(promocaoTableModel.getAllProdutos().size() > 0){
            if (JOptionPane.showConfirmDialog(this,
                    ConfirmMessages.PROMOCAO_ADICIONAR_CONFIRMACAO.getDescricao(),
                    Titles.CONFIRM.getDescricao(), JOptionPane.YES_OPTION,
                    JOptionPane.WARNING_MESSAGE) == JOptionPane.YES_OPTION){

                ArrayList<Promocao> arrayListPromocao = promocaoTableModel.getAllPromocoes();
                ArrayList<Produto> arrayListProduto = promocaoTableModel.getAllProdutos();
                
                
                for (int i = 0; i < arrayListPromocao.size(); i++) {
                    PromocaoControl.add(arrayListPromocao.get(i));
                    arrayListProduto.get(i).setPromocao(
                            arrayListPromocao.get(i));
                    ProdutoControl.add(arrayListProduto.get(i));
                }
                                
                promocaoTableModel.clear();
                this.dispose();
            }
        }
        else{
           JOptionPane.showMessageDialog(this,
                    Mensagens.WARNING_SALVAR_SEM_NENHUM_CADASTRO.getDescricao(),
                    Titles.WARNING.getDescricao(),
                    JOptionPane.WARNING_MESSAGE); 
        }
    }//GEN-LAST:event_jButton4ActionPerformed
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(jTable1.getSelectedRow() >= 0){
            promocaoTableModel.deleteRow(jTable1.getSelectedRow());}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        Produto produto = (Produto) jList1.getSelectedValue();
        jTextFieldValorProduto.setText(String.valueOf(produto.getValor()));
    }//GEN-LAST:event_jList1MouseClicked

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
            java.util.logging.Logger.getLogger(CadastroPromocao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroPromocao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroPromocao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroPromocao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroPromocao().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Produtos;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private com.toedter.calendar.JDateChooser jDateChooserDataFinal;
    private com.toedter.calendar.JDateChooser jDateChooserDateInicial;
    private javax.swing.JFormattedTextField jFormattedTextFieldValorPromocional;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList jList1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldValorProduto;
    // End of variables declaration//GEN-END:variables

    private void populaPromocao(Promocao novaPromocao) {
        novaPromocao.setDataInicio(jDateChooserDateInicial.getDate());
        novaPromocao.setDataFinal(jDateChooserDataFinal.getDate());
        String promocaoValorTratado = jFormattedTextFieldValorPromocional.getText().replace(',', '.').trim();
        novaPromocao.setValorPromocional(new Double(promocaoValorTratado));
    }
    private void limparCampos(){
        jDateChooserDateInicial.setDate(null);
        jDateChooserDataFinal.setDate(null);
        jFormattedTextFieldValorPromocional.setText("");
    }
}
