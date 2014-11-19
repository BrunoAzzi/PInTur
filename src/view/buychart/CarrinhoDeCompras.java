/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.buychart;

import java.util.ArrayList;
import model.Produto;

/**
 *
 * @author bruno_azzi
 */
public class CarrinhoDeCompras {

    private ArrayList<Produto> produtos = new ArrayList();

    public void addProdutoNoCarrinho(Produto produto) {
        if (produto == null) {
            throw new NullPointerException();
        }
        produtos.add(produto);
    }

    public void removeAllProdutosFromCarrinho() {
        produtos.clear();
    }
}
