/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import model.Fotoproduto;

/**
 *
 * @author Gustavo Coelho
 */
public class FotoProdutoControl {
    public static ArrayList<Fotoproduto> listaCategorias(){
        return new ArrayList(Conexao.namedQuery("Fotoproduto.findAll"));
    }

    public static void add(Fotoproduto fotoproduto) {
        Conexao.persist(fotoproduto);
    }
}
