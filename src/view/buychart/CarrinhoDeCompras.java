/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.buychart;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import messages.Titles;
import messages.Warnings;
import model.Produto;

/**
 *
 * @author bruno_azzi
 */
public class CarrinhoDeCompras {

    private static TelaCarrinhoDeCompras telaCarrinhoDeCompras;
    private static ArrayList<Produto> produtos = new ArrayList();
    private static ArrayList<Integer> quantidadeDeCompras = new ArrayList();

    public static void addProdutoNoCarrinho(Produto produto) {
        if (produto == null) {
            System.out.println("Produto NULL");
        }

        if (!(produtos.indexOf(produto) >= 0)) {
            produtos.add(produto);
            quantidadeDeCompras.add(1);
        } else {
            if (produto.getQuantidade() > quantidadeDeCompras.get(produtos.indexOf(produto))) {
                quantidadeDeCompras.set(produtos.indexOf(produto), quantidadeDeCompras.get(produtos.indexOf(produto)) + 1);
            } else {
                JOptionPane.showMessageDialog(null,
                        Warnings.QUANTIDADE_DE_PRODUTOS_EXCEDENTE.getDescricao(),
                        Titles.WARNING.getDescricao(),
                        JOptionPane.WARNING_MESSAGE);
            }
        }

    }

    public static void removeAllProdutosFromCarrinho() {
        produtos.clear();
        quantidadeDeCompras.clear();
        telaCarrinhoDeCompras.updateCarrinho();
    }

    public static Integer getQuantidadeDeProdutosNoCarrinho() {
        return produtos.size();
    }

    public static ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public static ArrayList<Integer> getQuantidadeDeCompras() {
        return quantidadeDeCompras;
    }

    public static void removeProduto(Produto produto) {
        quantidadeDeCompras.remove(produtos.indexOf(produto));
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
                valorTotal += quantidadeDeCompras.get(produtos.indexOf(produto)) * produto.getValor();
            } else {
                valorTotal += quantidadeDeCompras.get(produtos.indexOf(produto)) * produto.getPromocao().getValorPromocional();
            }
        }
        return valorTotal;
    }

    public static Integer getQuantidadeDoProduto(Produto produto){
        if (!(produtos.indexOf(produto) >= 0)) {
            return 0;
        }else{
            return quantidadeDeCompras.get(produtos.indexOf(produto));
        }
    }
    
    public static void setQuantidadeDoProduto(Produto produto, Integer quantidade){
        if (!(produtos.indexOf(produto) >= 0)) {
            System.out.println("Produto null em carrinho de compras");
        }else{
            quantidadeDeCompras.set(produtos.indexOf(produto), quantidade);
        }
    }

    public static void updateTelaDeCarrinhos(){
        telaCarrinhoDeCompras.updateCarrinho();
    }
}
