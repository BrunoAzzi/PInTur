/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import model.Categoria;

/**
 *
 * @author bruno_azzi
 */
public class CategoriaControl {
    
    public static ArrayList<Categoria> listaCategorias(){
        return new ArrayList(Conexao.namedQuery("Categoria.findAll"));
    }
    
}
