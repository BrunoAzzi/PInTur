/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import javax.persistence.RollbackException;
import javax.swing.JOptionPane;
import model.Categoria;
import utilidades.Mensagens;

public class CategoriaControl {
    
    public static ArrayList<Categoria> listaCategorias(){
        return new ArrayList(Conexao.namedQuery("Categoria.findAll"));
    }

    public static void add(Categoria categoria) {
        Conexao.persist(categoria);
        Conexao.commit();
    }
    
    public static Categoria findByCodigo(Integer codigo){
        return (Categoria) Conexao.singleResultNamedQuery("Categoria.findByCodigo", codigo, "codigo");
    }
    
    public static Categoria findByNome(String nome){
        return (Categoria) Conexao.singleResultNamedQuery("Categoria.findByNome", nome, "nome");
    }
    
    public static void delete(Categoria categoria) {
        Conexao.remove(categoria);
        try{
            Conexao.commit();
            JOptionPane.showMessageDialog(null, 
                    Mensagens.DELETAR_CATEGORIA_SUCESSO.getDescricao(), 
                    Mensagens.SUCESSO.getDescricao(), 
                    JOptionPane.INFORMATION_MESSAGE);
        }catch(RollbackException rollbackException){
            Conexao.clear();
            JOptionPane.showMessageDialog(null, 
                    Mensagens.DELETAR_CATEGORIA_IMPOSSIBILIDADE.getDescricao(), 
                    Mensagens.WARNING.getDescricao(), 
                    JOptionPane.WARNING_MESSAGE);
        }
    }
    
}
