/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pintur;

import control.CategoriaControl;
import control.ProdutoControl;
import javax.sound.midi.Soundbank;
import model.Categoria;
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
       ProdutoControl produtoControl = new ProdutoControl();
//       produtoControl.findByNome("teste");
        System.out.println(produtoControl.selectAll()); 
       
    }
}
