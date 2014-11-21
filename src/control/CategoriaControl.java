/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import model.Categoria;

public class CategoriaControl {
    
    public static ArrayList<Categoria> listaCategorias(){
        return new ArrayList(Conexao.namedQuery("Categoria.findAll"));
    }

    public static void add(Categoria categoria) {
        Conexao.persist(categoria);
    }
    
    public static Categoria findByCodigo(Integer codigo){
        return (Categoria) Conexao.singleResultNamedQuery("Categoria.findByCodigo", codigo, "codigo");
    }
    
    public static Categoria findByNome(String nome){
        return (Categoria) Conexao.singleResultNamedQuery("Categoria.findByNome", nome, "nome");
    } 
    
    public static void deleteById(Integer id){        
//        try {            
            Conexao.remove(findByCodigo(id));
//        } catch (NullPointerException e) {
//            
//        }
    }
    
    public static void delete(Categoria categoria){
        Conexao.remove(categoria);
    }
    
}
