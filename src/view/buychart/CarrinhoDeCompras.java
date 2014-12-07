/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.buychart;

import control.ProdutoControl;
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

    public static void addProdutoNoCarrinho(Produto produto) {
        if (produto == null) {
            System.out.println("Produto NULL");
        }

        if (!(produtos.indexOf(produto) >= 0)) {
            produtos.add(produto);
        } else {
            if (ProdutoControl.findByCodigo(produto.getCodigo()).getQuantidade() < produtos.get(produtos.indexOf(produto)).getQuantidade()) {
                produtos.get(produtos.indexOf(produto)).setQuantidade(
                        produtos.get(produtos.indexOf(produto)).getQuantidade() + 1);
            }else{
                JOptionPane.showMessageDialog(null, 
                        Warnings.QUANTIDADE_DE_PRODUTOS_EXCEDENTE.getDescricao(),
                        Titles.WARNING.getDescricao(),
                        JOptionPane.WARNING_MESSAGE);
            }
        }

    }

    public static void removeAllProdutosFromCarrinho() {
        produtos.clear();
    }

    public static Integer getQuantidadeDeProdutosNoCarrinho() {
        int quantidade = produtos.size();
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
