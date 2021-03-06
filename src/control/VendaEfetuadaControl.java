/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import messages.Titles;
import model.Vendaefetuada;

/**
 *
 * @author gustavo_yuri
 */
public class VendaEfetuadaControl {

    public static ArrayList<Vendaefetuada> retornaListaOrdenadaDeProdutosMaisVendidos() {
        return new ArrayList(Conexao.namedQuery("Vendaefetuada.orderByQuantidadeVendida"));
    }

    public static void add(Vendaefetuada vendaefetuada) {
        Conexao.persist(vendaefetuada);
        try {
            Conexao.commit();
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(null,
                    exception.getMessage(),
                    Titles.WARNING.getDescricao(),
                    JOptionPane.ERROR_MESSAGE);
        }

    }
}
