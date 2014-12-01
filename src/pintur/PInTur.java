/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pintur;

import control.ProdutoControl;
import control.VendaEfetuadaControl;
import java.util.ArrayList;
import model.Produto;
import model.Vendaefetuada;
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
        
//        GeneratorPDF.gerarPdf(produtos);
        GeneratorPDF.gerarCupomFiscalPDF(produtos);
        System.out.println(VendaEfetuadaControl.listaVendasEfetuadas());
        
    }
}
