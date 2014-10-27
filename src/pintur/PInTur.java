/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pintur;

import control.Conexao;
import control.ProdutoControl;
import model.Produto;

/**
 *
 * @author bruno_azzi
 */
public class PInTur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Produto p = ProdutoControl.findByCodigo(0);
        Conexao.endConnection();
    }
}
