/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.produto;

import control.ProdutoControl;
import java.util.ArrayList;
import model.Categoria;
import model.Produto;
import utilidades.Tela;

/**
 *
 * @author gustavo_yuri
 */
public class MenuProdutos extends java.awt.Panel {

    int incrementadorX = 0;
    int x = 30;
    int y = 10;
    ArrayList<Produto> produtos = ProdutoControl.listaProdutos();
    ArrayList<ItemListaProduto> itemListaProdutos = new ArrayList();
    private MenuProdutosSelecionados menuProdutosSelecionados;

    /**
     * Creates new form MenuProdutos
     */
    public MenuProdutos() {
        initComponents();
        initListaDeProdutos(new Categoria());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLabelProdutos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(51, 102, 255));
        setPreferredSize(Tela.menuProdutosDimension());

        JLabelProdutos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JLabelProdutos.setForeground(new java.awt.Color(255, 255, 255));
        JLabelProdutos.setText("Produtos");

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));
        jPanel1.setAutoscrolls(true);
        jPanel1.setPreferredSize(new java.awt.Dimension(5000, 5000));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5000, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5000, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLabelProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JLabelProdutos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabelProdutos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public void initListaDeProdutos(Categoria categoria) {
        x = 30;
        y = 10;
        incrementadorX = 0;
        jPanel1.removeAll();
        jPanel1.revalidate();
        jPanel1.repaint();
        itemListaProdutos.clear();
        produtos = ProdutoControl.listaProdutosByCategoria(categoria);

        for (Produto produto : produtos) {
            System.out.println(produto.getNome());
            ItemListaProduto itemListaProduto = new ItemListaProduto();
            itemListaProduto.populaItemListaProduto(produto);
            itemListaProdutos.add(itemListaProduto);
            preparaItemMenu(itemListaProduto);
            itemListaProduto.setVisible(true);
            jPanel1.add(itemListaProduto);
        }
    }

    public void setMenuProdutosSelecionados(MenuProdutosSelecionados menuProdutosSelecionados) {
        this.menuProdutosSelecionados = menuProdutosSelecionados;
        for (ItemListaProduto itemListaProduto : itemListaProdutos) {
            itemListaProduto.setTelaDescricaoProduto(menuProdutosSelecionados);
        }
    }

    private void preparaItemMenu(ItemListaProduto itemListaProduto) {
        itemListaProduto.setBounds(x, y, 142, 222);

        if (incrementadorX < 2) {
            x += 172;
            incrementadorX += 1;
        } else {
            x = 30;
            y += 242;
            incrementadorX = 0;
            //jScrollPane1.setPreferredSize(new Dimension((172*4),(y*500)));

        }
    }
}
