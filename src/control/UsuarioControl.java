/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import model.Usuario;

/**
 *
 * @author bruno_azzi
 */
public class UsuarioControl {

    public static void delete(Usuario usuarioAt) {
        Conexao.remove(usuarioAt);
    }

    public static ArrayList<Usuario> listaUsuarios() {
        return new ArrayList(Conexao.namedQuery("Usuario.findAll"));
    }
    public static void add(Usuario usuario) {
        Conexao.persist(usuario);
    }
    
    public static Usuario findByCodigo(Integer codigo){
        return (Usuario) Conexao.singleResultNamedQuery("Usuario.findByCodigo", codigo, "codigo");
    }
    
    
}
