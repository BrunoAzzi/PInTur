/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import javax.persistence.NoResultException;
import javax.persistence.RollbackException;
import javax.swing.JOptionPane;
import messages.DeleteMessages;
import messages.Titles;
import messages.Warnings;
import model.Categoria;
import model.Produto;

/**
 *
 * @author bruno_azzi
 */
public class ProdutoControl {

    public static ArrayList<Produto> listaProdutos() {
        return new ArrayList(Conexao.namedQuery("Produto.findAll"));
    }

    public static ArrayList<Produto> listaProdutosByCategoria(Categoria categoria) {
        ArrayList<Produto> produtos = listaProdutos();
        ArrayList<Produto> novosProdutos = new ArrayList();

        if (categoria.getCodigo() == null) {
            return produtos;
        }

        for (Produto produto : produtos) {
            if (produto.getCategoria().getCodigo() == categoria.getCodigo()) {
                novosProdutos.add(produto);
            }
        }
        return novosProdutos;
    }

    public static ArrayList<Produto> listaProdutosPromocionais() {
        return new ArrayList(Conexao.namedQuery("Produto.findByPromocao"));
    }

    public static Produto findByCodigo(Integer codigo) throws NullPointerException {
        if (codigo == null) {
            throw new NullPointerException("O Código está vazio");
        }
        try {
            return (Produto) Conexao.singleResultNamedQuery("Produto.findByCodigo", codigo, "codigo");
        } catch (NoResultException noResultException) {
            JOptionPane.showMessageDialog(null,
                    Warnings.OBJETO_NAO_ENCONTRADO.getMensagem(),
                    JOptionPane.MESSAGE_PROPERTY,
                    JOptionPane.WARNING_MESSAGE);
            return null;
        }
    }

    public static ArrayList<Produto> findByNome(String nome) {
        return new ArrayList(Conexao.namedQuery("Produto.findByNome"));
    }

    public static void addWithMessage(Produto produto){
        Conexao.persist(produto);
        try {
            Conexao.commit();
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(null,
                    exception.getMessage(),
                    Titles.WARNING.getDescricao(),
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void add(Produto produto) {
        Conexao.persist(produto);
        try {
            Conexao.commit();
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(null,
                    exception.getMessage(),
                    Titles.WARNING.getDescricao(),
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void delete(Produto produto) {
            Conexao.remove(produto);
            try{
            Conexao.commit();    
            }catch(RollbackException rollbackException){
                JOptionPane.showMessageDialog(null,
                    DeleteMessages.PRODUTO_IMPOSSIBILIDADE.getDescricao(),
                    Titles.WARNING.getDescricao(),
                    JOptionPane.ERROR_MESSAGE);
            }catch(Exception exception){
                JOptionPane.showMessageDialog(null,
                    exception.getMessage(),
                    Titles.WARNING.getDescricao(),
                    JOptionPane.ERROR_MESSAGE);
            }
                    
            
    }
}
