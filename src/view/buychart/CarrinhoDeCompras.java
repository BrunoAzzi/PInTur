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

    private static ArrayList<Produto> produtos = new ArrayList();

    public static void addProdutoNoCarrinho(Produto produto) {
        if (produto == null) {
            throw new NullPointerException();
        }
        produtos.add(produto);
    }
    
    public static void removeAllProdutosFromCarrinho(){
        produtos.re
    }
    
}