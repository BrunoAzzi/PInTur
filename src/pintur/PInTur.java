/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pintur;

import control.ProdutoControl;
import java.util.ArrayList;
import model.Produto;
import view.produto.ItemListaProduto;

/**
 *
 * @author bruno_azzi
 */
public class PInTur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProdutoControl produtoControle = new ProdutoControl();
        ArrayList<ItemListaProduto> itemListaProdutos = new ArrayList();
        
        for (Produto produto : produtoControle.listaProdutos()) {  
            ItemListaProduto itemListaProduto = new ItemListaProduto();
            itemListaProduto.populaItemListaProduto(produto);
            itemListaProdutos.add(itemListaProduto);
        }       
        
        for (ItemListaProduto itemListaProduto : itemListaProdutos) {
            System.out.println(itemListaProduto.getProduto().getNome());
            System.out.println(itemListaProduto.getProduto().getValor());
        }
        
        
    }
}
