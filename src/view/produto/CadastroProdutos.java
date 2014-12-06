/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.produto;

import control.CategoriaControl;
import control.FotoControl;
import control.FotoProdutoControl;
import control.ProdutoControl;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import messages.ConfirmMessages;
import messages.Titles;
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
public class CadastroProdutos extends javax.swing.JFrame {

    DefaultComboBoxModel<Categoria> defaultComboBoxModel = new DefaultComboBoxModel();
    ImageChooser imageChooser = new ImageChooser(this);
    ProdutoTableModel produtoTableModel = new ProdutoTableModel(3, false);

    /**
     * Creates new form CadastroProdutos
     */
    public CadastroProdutos() {
        initComponents();
        carregaComboBoxCategoria();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jtfDescricao = new javax.swing.JTextField();
        jtfValor = new javax.swing.JFormattedTextField();
        jtfQuantidade = new javax.swing.JFormattedTextField();
        jcbCategoria = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jlProdutoImage = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jbRemover = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jbNovo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Produtos");
        setBackground(new java.awt.Color(255, 255, 204));
        setMinimumSize(new java.awt.Dimension(287, 400));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));

        jLabel5.setText("Categoria");

        jLabel4.setText("Qtd.");

        jLabel3.setText("Valor");

        jLabel2.setText("Descricao");

        jLabel1.setText("Nome");

        jcbCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Foto"));
        jPanel1.setMaximumSize(new java.awt.Dimension(110, 110));
        jPanel1.setMinimumSize(new java.awt.Dimension(110, 110));

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

        jButton1.setBackground(new java.awt.Color(51, 102, 255));
        jButton1.setText("Imagem...");
        jButton1.setBorder(null);
        jButton1.setMaximumSize(new java.awt.Dimension(77, 23));
        jButton1.setMinimumSize(new java.awt.Dimension(77, 23));
        jButton1.setPreferredSize(new java.awt.Dimension(77, 23));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jbRemover.setBackground(new java.awt.Color(51, 102, 255));
        jbRemover.setText("Remover");
        jbRemover.setBorder(null);
        jbRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRemoverActionPerformed(evt);
            }
        });

        jbSalvar.setBackground(new java.awt.Color(51, 102, 255));
        jbSalvar.setText("Salvar");
        jbSalvar.setBorder(null);
        jbSalvar.setMaximumSize(new java.awt.Dimension(77, 23));
        jbSalvar.setMinimumSize(new java.awt.Dimension(77, 23));
        jbSalvar.setPreferredSize(new java.awt.Dimension(77, 23));
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbNovo.setBackground(new java.awt.Color(51, 102, 255));
        jbNovo.setText("Novo");
        jbNovo.setBorder(null);
        jbNovo.setMaximumSize(new java.awt.Dimension(77, 23));
        jbNovo.setMinimumSize(new java.awt.Dimension(77, 23));
        jbNovo.setPreferredSize(new java.awt.Dimension(77, 23));
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });

        jTable1.setModel(produtoTableModel);
        jScrollPane1.setViewportView(jTable1);

        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("Atenção: Todos os campos são obrigatórios!");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtfNome))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jtfDescricao)
                                    .addComponent(jtfValor)
                                    .addComponent(jtfQuantidade)
                                    .addComponent(jcbCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jbNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jbRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3, jLabel4, jLabel5});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jbNovo, jbRemover, jbSalvar});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jcbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbRemover))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jbNovo, jbRemover, jbSalvar});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRemoverActionPerformed
        if (jTable1.getSelectedRow() >= 0) {
            produtoTableModel.deleteRow(jTable1.getSelectedRow());
        }else {
            JOptionPane.showMessageDialog(null, Mensagens.REMOVER_LINHA_NAO_SELECIONADA.getDescricao(),
                    Titles.WARNING.getDescricao(),
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jbRemoverActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        if (produtoTableModel.getAllProdutos().size() > 0) {
            if (JOptionPane.showConfirmDialog(null, 
                    ConfirmMessages.PRODUTO_ADICIONAR_CONFIRMACAO.getDescricao(), 
                    Titles.CONFIRM.getDescricao(), JOptionPane.YES_OPTION, 
                    JOptionPane.WARNING_MESSAGE) == JOptionPane.YES_OPTION) {
                
                for (Produto produto : produtoTableModel.getAllProdutos()) {
                    FotoControl.add(produto.getFotoProduto().getFoto());
                    FotoProdutoControl.add(produto.getFotoProduto());
                    ProdutoControl.add(produto);
                }
                
                produtoTableModel.clear();
                this.dispose();
            }
        } else {
            JOptionPane.showMessageDialog(this, Mensagens.WARNING_SALVAR_SEM_NENHUM_CADASTRO.getDescricao(),
                    Titles.WARNING.getDescricao(),
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed

        if (isCamposValidados()) {
            produtoTableModel.add(getProdutoPopulado());
        }
        limpaCampos();
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        imageChooser.setVisible(true);
        try {
            jlProdutoImage.setIcon(Imagem.resizeImage(105, 105, imageChooser.getSingleImageFile()));
        } catch (NullPointerException nullPointerException) {
            System.out.println("No file Selected");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorCadastroProdutosel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroProdutos().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbRemover;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JComboBox jcbCategoria;
    private javax.swing.JLabel jlProdutoImage;
    private javax.swing.JTextField jtfDescricao;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JFormattedTextField jtfQuantidade;
    private javax.swing.JFormattedTextField jtfValor;
    // End of variables declaration//GEN-END:variables

    private void limpaCampos() {
        jtfNome.setText("");
        jtfDescricao.setText("");
        jtfValor.setText("");
        jtfQuantidade.setText("");
        jlProdutoImage.setIcon(null);
        jcbCategoria.setSelectedItem(null);
        imageChooser = new ImageChooser(this);
    }

    private boolean isCamposValidados() {
        int quantidade = 0;

        if (jtfQuantidade.getText().equals("")) {
             JOptionPane.showMessageDialog(null, 
                    Mensagens.QUANTIDADE_INVALIDA.getDescricao(),
                    Titles.WARNING.getDescricao(),
                    JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if (jtfValor.getText().equals("")) {
            JOptionPane.showMessageDialog(null, 
                    Mensagens.VALOR_INVALIDO.getDescricao(),
                    Titles.WARNING.getDescricao(),
                    JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if (jtfNome.getText().equals("")) {
            JOptionPane.showMessageDialog(null, 
                    Mensagens.NOME_INVALIDO.getDescricao(),
                    Titles.WARNING.getDescricao(),
                    JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if (jtfDescricao.getText().equals("")) {
            JOptionPane.showMessageDialog(null, 
                    Mensagens.DESCRICAO_INVALIDA.getDescricao(),
                    Titles.WARNING.getDescricao(),
                    JOptionPane.WARNING_MESSAGE);
            return false;
        }

        if (jlProdutoImage.getIcon() == null) {
            JOptionPane.showMessageDialog(null, 
                    Mensagens.IMAGEM_PRODUTO_INVALIDA.getDescricao(),
                    Titles.WARNING.getDescricao(),
                    JOptionPane.WARNING_MESSAGE);
            return false;
        }

        String produtoValorTratado = jtfValor.getText().replace(',', '.').trim();

        Double valorDouble = (new Double(produtoValorTratado));

        try {
            quantidade = new Integer(jtfQuantidade.getText());
        } catch (NumberFormatException numberFormatException) {
            JOptionPane.showMessageDialog(null, 
                    Mensagens.QUANTIDADE_INVALIDA.getDescricao(),
                    Titles.WARNING.getDescricao(),
                    JOptionPane.WARNING_MESSAGE);
            return false;
        }

        if (valorDouble <= 0) {
            JOptionPane.showMessageDialog(null, 
                    Mensagens.VALOR_MENOR_OU_IGUAL_A_ZERO.getDescricao(),
                    Titles.WARNING.getDescricao(),
                    JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if (quantidade <= 0) {
            JOptionPane.showMessageDialog(null, 
                    Mensagens.QUANTIDADE_MENOR_OU_IGUAL_A_ZERO.getDescricao(),
                    Titles.WARNING.getDescricao(),
                    JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }

    private Produto getProdutoPopulado() {
        Produto novoProduto = new Produto();
        Categoria categoriaProduto;
        categoriaProduto = (Categoria) jcbCategoria.getSelectedItem();
        Fotoproduto fotoproduto = new Fotoproduto();
        fotoproduto.setDescricao(jtfNome.getText() + ".jpg");
        fotoproduto.setFoto(imageChooser.getFoto());
        novoProduto.setNome(jtfNome.getText());
        novoProduto.setDescricao(jtfDescricao.getText());
        String produtoValorTratado = jtfValor.getText().replace(',', '.').trim();
        novoProduto.setValor(new Double(produtoValorTratado));
        novoProduto.setCategoria(categoriaProduto);
        novoProduto.setQuantidade(new Integer(jtfQuantidade.getText()));
        novoProduto.setFotoProduto(fotoproduto);
        return novoProduto;
    }

    private void carregaComboBoxCategoria() {
        for (Categoria categoria : CategoriaControl.listaCategorias()) {
            defaultComboBoxModel.addElement(categoria);
            jcbCategoria.setModel(defaultComboBoxModel);
        }
        jcbCategoria.setSelectedItem(null);
    }
}
