/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import javax.persistence.NoResultException;
import javax.swing.JOptionPane;
import messages.Warnings;
import model.Produto;

/**
 *
 * @author bruno_azzi
 */
public class ProdutoControl {

    public static ArrayList<Produto> selectAll() {
        return new ArrayList(Conexao.namedQuery("Produto.findAll"));
    }

    public static Produto findByCodigo(Integer codigo) throws NullPointerException {
        if (codigo == null) {
            throw new NullPointerException("O Codigo está vazio");
        }

        try {
            return (Produto) Conexao.singleResultNamedQuery("Produto.findByCodigo", codigo, "codigo");
        } catch (NoResultException e) {
            JOptionPane.showMessageDialog(null, Warnings.OBJETO_NAO_ENCONTRADO.getMensagem(), JOptionPane.MESSAGE_PROPERTY, JOptionPane.WARNING_MESSAGE);
            return null;
        }

    }
}
