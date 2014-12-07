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

    private static TelaCarrinhoDeCompras telaCarrinhoDeCompras;
    private static ArrayList<Produto> produtos = new ArrayList();

    public static void addProdutoNoCarrinho(Produto produto) {
        if (produto == null) {
            System.out.println("Produto NULL");
        }

        if (!(produtos.indexOf(produto) >= 0)) {
            produtos.add(produto);
        }else{
            produtos.get(produtos.indexOf(produto)).setQuantidade(
                    produtos.get(produtos.indexOf(produto)).getQuantidade()+1
                    );
        }

    }

    public static void removeAllProdutosFromCarrinho() {
        produtos.clear();
    }

    public static Integer getQuantidadeDeProdutosNoCarrinho() {
        int quantidade = 0;
        for (Produto produto : produtos) {
            quantidade += produto.getQuantidade();
        }
        return quantidade;
    }

    public static ArrayList<Produto> getProdutosNoCarrinho() {
        return produtos;
    }

    public static void removeProduto(Produto produto) {
        produtos.remove(produto);
        telaCarrinhoDeCompras.updateCarrinho();

    }

    static void setTela(TelaCarrinhoDeCompras aThis) {
        telaCarrinhoDeCompras = aThis;
    }

    public static Double getValorTotalDaCompra() {
        double valorTotal = 0;
        for (Produto produto : produtos) {
            if (produto.getPromocao() == null) {
                valorTotal += produto.getQuantidade() * produto.getValor();
            } else {
                valorTotal += produto.getQuantidade() * produto.getPromocao().getValorPromocional();
            }
        }
        return valorTotal;
    }
}
