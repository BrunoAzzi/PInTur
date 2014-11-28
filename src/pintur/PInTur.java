/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pintur;

import control.ProdutoControl;
import java.util.ArrayList;
import model.Produto;
import utilidades.GeneratorPDF;

/**
 *
 * @author bruno_azzi
 */
public class PInTur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Produto> produtos = ProdutoControl.listaProdutos();
        
        GeneratorPDF.gerarPdf(produtos);


    }
}
