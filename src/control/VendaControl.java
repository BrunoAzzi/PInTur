/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import javax.swing.JOptionPane;
import messages.Titles;
import model.Venda;

/**
 *
 * @author BrunoAzzi
 */
public class VendaControl {
    
    public static void add(Venda venda) {
        Conexao.persist(venda);
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
