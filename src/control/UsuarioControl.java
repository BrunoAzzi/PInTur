/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import javax.persistence.RollbackException;
import javax.swing.JOptionPane;
import messages.DeleteMessages;
import messages.Titles;
import model.Usuario;

/**
 *
 * @author bruno_azzi
 */
public class UsuarioControl {

    public static void delete(Usuario usuario) {
        Conexao.remove(usuario);
        try{
            Conexao.commit();
            JOptionPane.showMessageDialog(null, 
                    DeleteMessages.USUARIO_SUCESSO.getDescricao(), 
                    Titles.SUCESSO.getDescricao(), 
                    JOptionPane.INFORMATION_MESSAGE);
        }catch(RollbackException rollbackException){
            Conexao.clear();
            JOptionPane.showMessageDialog(null, 
                    DeleteMessages.USUARIO_IMPOSSIBILIDADE.getDescricao(), 
                    Titles.WARNING.getDescricao(), 
                    JOptionPane.WARNING_MESSAGE);
        }
    }

    public static ArrayList<Usuario> listaUsuarios() {
        return new ArrayList(Conexao.namedQuery("Usuario.findAll"));
    }
    
    public static void add(Usuario usuario) {
        Conexao.persist(usuario);
        try {
            Conexao.commit();
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(null,
                    exception.getMessage(),
                    Titles.WARNING.getDescricao(),
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static Usuario findByCodigo(Integer codigo){
        return (Usuario) Conexao.singleResultNamedQuery("Usuario.findByCodigo", codigo, "codigo");
    }
    
    
}
