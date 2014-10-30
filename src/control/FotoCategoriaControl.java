/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import model.Fotocategoria;

/**
 *
 * @author bruno_azzi
 */
public class FotoCategoriaControl {
    
    public static ArrayList<Fotocategoria> listaCategorias(){
        return new ArrayList(Conexao.namedQuery("Fotocategoria.findAll"));
    }

    public static void add(Fotocategoria fotoCategoria) {
        Conexao.persist(fotoCategoria.getFoto());
        Conexao.persist(fotoCategoria);
        
    }
    
}
