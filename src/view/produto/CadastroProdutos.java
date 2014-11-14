/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.produto;

import control.CategoriaControl;
import control.FotoControl;
import control.FotoProdutoControl;
import control.ProdutoControl;
import java.awt.Component;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.Categoria;
import model.Fotoproduto;
import model.Produto;
import utilidades.ImageChooser;
import utilidades.Imagem;
import utilidades.Mensagens;
import view.TableModels.ProdutoTableModel.ProdutoTableModel;

/**
 *
 * @author gustavo_yuri
 */
public class CadastroProdutos extends java.awt.Frame {

    DefaultComboBoxModel<Categoria> defaultComboBoxModel = new DefaultComboBoxModel();
    ImageChooser imageChooser = new ImageChooser(this);
    ProdutoTableModel produtoTableModel = new ProdutoTableModel(3, false);
    private Component rootPane;
    /**
     * Creates new form CadastroProdutos
     */
    public CadastroProdutos() {
        initComponents();

        for (Categoria categoria : CategoriaControl.listaCategorias()) {
            defaultComboBoxModel.addElement(categoria);
            jcbCategoria.setModel(defaultComboBoxModel);
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jlProdutoImage = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jtfNome = new javax.swing.JTextField();
        jtfDescricao = new javax.swing.JTextField();
        jcbCategoria = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jbNovo = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jbRemover = new javax.swing.JButton();
        jtfValor = new javax.swing.JFormattedTextField();
        jtfQuantidade = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 204));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        jButton1.setText("...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Foto"));
        jPanel1.setMaximumSize(new java.awt.Dimension(110, 110));
        jPanel1.setMinimumSize(new java.awt.Dimension(110, 110));
        jPanel1.setPreferredSize(new java.awt.Dimension(110, 110));

        jlProdutoImage.setAlignmentY(0.0F);
        jlProdutoImage.setMaximumSize(new java.awt.Dimension(105, 105));
        jlProdutoImage.setMinimumSize(new java.awt.Dimension(105, 105));
        jlProdutoImage.setPreferredSize(new java.awt.Dimension(105, 105));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlProdutoImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jlProdutoImage, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jTable1.setModel(produtoTableModel);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getColumn(2).setResizable(false);

        jtfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNomeActionPerformed(evt);
            }
        });

        jLabel7.setText("Nome");

        jLabel8.setText("Descrição");

        jLabel9.setText("Valor");

        jLabel10.setText("Categoria");

        jbNovo.setText("Novo");
        jbNovo.setMaximumSize(new java.awt.Dimension(77, 23));
        jbNovo.setMinimumSize(new java.awt.Dimension(77, 23));
        jbNovo.setPreferredSize(new java.awt.Dimension(77, 23));
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });

        jbSalvar.setText("Salvar");
        jbSalvar.setMaximumSize(new java.awt.Dimension(77, 23));
        jbSalvar.setMinimumSize(new java.awt.Dimension(77, 23));
        jbSalvar.setPreferredSize(new java.awt.Dimension(77, 23));
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbRemover.setText("Remover");
        jbRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRemoverActionPerformed(evt);
            }
        });

        jtfValor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat(""))));
        jtfValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfValorActionPerformed(evt);
            }
        });

        jLabel1.setText("Qtd.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfNome)
                                    .addComponent(jtfDescricao)
                                    .addComponent(jcbCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jtfValor)
                                    .addComponent(jtfQuantidade, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbRemover)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jtfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbRemover))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Exit the Application
     */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void jtfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNomeActionPerformed

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed

        if (camposValidados()) {
            produtoTableModel.add(getProdutoPopulado());
        } else {
            JOptionPane.showMessageDialog(rootPane, Mensagens.PRODUTO_CADASTRO_CAMPOs_INVALIDOS.getDescricao(), Mensagens.WARNING.getDescricao(), JOptionPane.WARNING_MESSAGE);
        }
        limpaCampos();
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        imageChooser.setVisible(true);
        jlProdutoImage.setIcon(Imagem.resizeImage(100, 100, imageChooser.getSingleImageFile()));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtfValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfValorActionPerformed

    private void jbRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRemoverActionPerformed
        if (jTable1.getSelectedRow() >= 0) {
            produtoTableModel.deleteRow(jTable1.getSelectedRow());
        }
    }//GEN-LAST:event_jbRemoverActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        for (Produto produto : produtoTableModel.getAllProdutos()) {
            FotoControl.add(produto.getFotoProduto().getFoto());
            FotoProdutoControl.add(produto.getFotoProduto());
            ProdutoControl.add(produto);
        }
    }//GEN-LAST:event_jbSalvarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CadastroProdutos().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbRemover;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JComboBox jcbCategoria;
    private javax.swing.JLabel jlProdutoImage;
    private javax.swing.JTextField jtfDescricao;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfQuantidade;
    private javax.swing.JFormattedTextField jtfValor;
    // End of variables declaration//GEN-END:variables

    private void limpaCampos() {
        jtfNome.setText("");
        jtfDescricao.setText("");
        jtfValor.setText("");
        jtfQuantidade.setText("");
        jlProdutoImage.setIcon(null);
        imageChooser = new ImageChooser(this);
    }

    private boolean camposValidados() {
        return !(jtfNome.getText().equals("")) && !(jtfDescricao.getText().equals("")) && !(jtfValor.getText().equals("")) && !(jtfQuantidade.getText().equals("")) && (imageChooser.getSingleImageFile() != null);
    }

    private Produto getProdutoPopulado() {
        Produto novoProduto = new Produto();
        Categoria categoriaProduto;
        categoriaProduto = (Categoria) jcbCategoria.getSelectedItem();
        Fotoproduto fotoproduto = new Fotoproduto();
        fotoproduto.setDescricao(imageChooser.getFile());
        fotoproduto.setFoto(imageChooser.getFoto());

        novoProduto.setNome(jtfNome.getText());
        novoProduto.setDescricao(jtfDescricao.getText());
        //TODO verificar erro quando utilizado com formated text field
        novoProduto.setValor(new Double(jtfValor.getText()));
        novoProduto.setCategoria(categoriaProduto);
        novoProduto.setQuantidade(new Integer(jtfQuantidade.getText()));
        novoProduto.setFotoProduto(fotoproduto);     
        
        return novoProduto;
    }
}
