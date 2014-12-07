/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.promocao;
import control.ProdutoControl;
import java.util.ArrayList;
import model.Produto;
import view.buychart.CarrinhoDeCompras;

/**
 *
 * @author everton_m
 */
public class MenuPromocao extends java.awt.Panel {
    
    private ArrayList<Produto> produtosPromocionais = new ArrayList();
    private int produtoIndex;
    /**
     * Creates new form ItemListaPromocao
     */
    public MenuPromocao() {
        initComponents(); 
        initProdutos();
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
        jButtonAddCarrinho = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButtonVoltarPromocao = new javax.swing.JButton();
        jButtonProximaPromocao = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jlValorProdutoPromocional = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 192));
        setPreferredSize(new java.awt.Dimension(651, 100));

        jlNomeProduto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlNomeProduto.setText("<Nome>");
        jlNomeProduto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jlValorProduto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlValorProduto.setText("<Preço>");

        jlImagemItemProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Product-Blacl.png"))); // NOI18N

        jButtonAddCarrinho.setBackground(new java.awt.Color(255, 255, 255));
        jButtonAddCarrinho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Shopping-Cart-01-Black 30x30.png"))); // NOI18N
        jButtonAddCarrinho.setAutoscrolls(true);
        jButtonAddCarrinho.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonAddCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddCarrinhoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Comprar");

        jLabel2.setText("Nome:");

        jLabel3.setText("Promoções");

        jLabel4.setText("Preço:");

        jLabel5.setText("Descrição:");

        jLabel6.setText("<Descrição>");

        jButtonVoltarPromocao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonVoltarPromocao.setText("<");
        jButtonVoltarPromocao.setEnabled(false);
        jButtonVoltarPromocao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarPromocaoActionPerformed(evt);
            }
        });

        jButtonProximaPromocao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonProximaPromocao.setText(">");
        jButtonProximaPromocao.setEnabled(false);
        jButtonProximaPromocao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProximaPromocaoActionPerformed(evt);
            }
        });

        jLabel7.setText("De:");

        jLabel8.setText("Por:");

        jlValorProdutoPromocional.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlValorProdutoPromocional.setText("<Preço>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonVoltarPromocao)
                        .addGap(120, 120, 120)
                        .addComponent(jlImagemItemProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jlNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(13, 13, 13)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jlValorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jlValorProdutoPromocional, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(9, 9, 9)
                .addComponent(jButtonAddCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonProximaPromocao)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonProximaPromocao, jButtonVoltarPromocao});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jlNomeProduto)
                                            .addComponent(jLabel2))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jlValorProduto)
                                                .addComponent(jLabel7)
                                                .addComponent(jLabel4))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jlValorProdutoPromocional)
                                                .addComponent(jLabel8))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jlImagemItemProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonVoltarPromocao, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jButtonProximaPromocao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAddCarrinho, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonProximaPromocao, jButtonVoltarPromocao});

    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddCarrinhoActionPerformed
        Produto novoProdutoDoCarrinho =  produtosPromocionais.get(produtoIndex);
        novoProdutoDoCarrinho.setQuantidade(1);
        CarrinhoDeCompras.addProdutoNoCarrinho(novoProdutoDoCarrinho);
    }//GEN-LAST:event_jButtonAddCarrinhoActionPerformed

    private void jButtonVoltarPromocaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarPromocaoActionPerformed
        if(existePromocoes()){
            if(produtoIndex == 0){
                produtoIndex = produtosPromocionais.size()-1;
                initProdutos();
            }
            else{
                produtoIndex --;
                initProdutos();
            }
        }
    }//GEN-LAST:event_jButtonVoltarPromocaoActionPerformed

    private void jButtonProximaPromocaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProximaPromocaoActionPerformed
        if(existePromocoes()){
            if(produtoIndex == produtosPromocionais.size()-1){
                produtoIndex = 0;
                initProdutos();
            }
            else{
                produtoIndex++;
                initProdutos();
            }
        }
    }//GEN-LAST:event_jButtonProximaPromocaoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddCarrinho;
    private javax.swing.JButton jButtonProximaPromocao;
    private javax.swing.JButton jButtonVoltarPromocao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jlImagemItemProduto;
    private javax.swing.JLabel jlNomeProduto;
    private javax.swing.JLabel jlValorProduto;
    private javax.swing.JLabel jlValorProdutoPromocional;
    // End of variables declaration//GEN-END:variables

    public void initProdutos(){
        for (Produto produto : ProdutoControl.listaProdutosPromocionais()) {
            produtosPromocionais.add(produto);
        }
        if(existePromocoes()){
            jlImagemItemProduto.setIcon(produtosPromocionais.get(produtoIndex).getFotoProduto().getFoto().getIcon());        
            jlNomeProduto.setText(produtosPromocionais.get(produtoIndex).getNome());
            jLabel6.setText(produtosPromocionais.get(produtoIndex).getDescricao());
            jlValorProduto.setText(Double.toString(produtosPromocionais.get(produtoIndex).getValor()));        
            jlValorProdutoPromocional.setText(Double.toString(produtosPromocionais.get(produtoIndex).getPromocao().getValorPromocional()));
        } 
    }
    public boolean existePromocoes(){
        if(produtosPromocionais.size() < 1){
            return false;
        }
        else if(produtosPromocionais.size() == 1){
            return true;
        }
        else{
            jButtonVoltarPromocao.setEnabled(true);
            jButtonProximaPromocao.setEnabled(true);
            return true;
        }
    }
    public Produto getProduto() {
        return produtosPromocionais.get(produtoIndex);
    }
    public boolean visibilidadePromocao(boolean visibilidade){
        
        return visibilidade;
    }
}
