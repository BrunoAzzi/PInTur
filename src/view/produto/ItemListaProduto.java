/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.produto;

import model.Produto;
import view.buychart.CarrinhoDeCompras;

/**
 *
 * @author gustavo_yuri
 */
public class ItemListaProduto extends java.awt.Panel {
    
    private Produto produto = new Produto();
    private MenuProdutosSelecionados menuProdutosSelecionados;
    /**
     * Creates new form ItemListaProduto
     */
    public ItemListaProduto() {
        initComponents();        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlNomeProduto = new javax.swing.JLabel();
        jlValorProduto = new javax.swing.JLabel();
        jlImagemItemProduto = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(96, 136, 255));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SetInMenuProdutosSelecionados(evt);
            }
        });

        jlNomeProduto.setForeground(new java.awt.Color(255, 255, 255));
        jlNomeProduto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlNomeProduto.setText("<Nome>");
        jlNomeProduto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jlValorProduto.setForeground(new java.awt.Color(255, 255, 255));
        jlValorProduto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlValorProduto.setText("<Valor>");

        jlImagemItemProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Product-Blacl.png"))); // NOI18N
        jlImagemItemProduto.setMaximumSize(new java.awt.Dimension(60, 60));
        jlImagemItemProduto.setMinimumSize(new java.awt.Dimension(60, 60));
        jlImagemItemProduto.setPreferredSize(new java.awt.Dimension(60, 60));
        jlImagemItemProduto.setVerifyInputWhenFocusTarget(false);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Shopping-Cart-01-Black 30x30.png"))); // NOI18N
        jButton1.setAutoscrolls(true);
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Comprar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addComponent(jlValorProduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlNomeProduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlImagemItemProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlImagemItemProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlNomeProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlValorProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CarrinhoDeCompras.addProdutoNoCarrinho(this.produto);
        System.out.println("adicionado no carrinho!");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void SetInMenuProdutosSelecionados(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SetInMenuProdutosSelecionados
        menuProdutosSelecionados.setProduto(produto);        
    }//GEN-LAST:event_SetInMenuProdutosSelecionados

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jlImagemItemProduto;
    private javax.swing.JLabel jlNomeProduto;
    private javax.swing.JLabel jlValorProduto;
    // End of variables declaration//GEN-END:variables


    public void populaItemListaProduto(Produto produto){
        this.produto = produto;
        jlImagemItemProduto.setIcon(produto.getFotoProduto().getFoto().getIcon());        
        jlNomeProduto.setText(produto.getNome());
        jlValorProduto.setText(Double.toString(produto.getValor())); 
    }

    public Produto getProduto() {
        return produto;
    }

    void setTelaDescricaoProduto(MenuProdutosSelecionados menuProdutosSelecionados) {
        this.menuProdutosSelecionados = menuProdutosSelecionados;
    }
}
