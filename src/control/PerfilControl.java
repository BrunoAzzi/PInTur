/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Categoria;
import model.Perfil;

/**
 *
 * @author bruno_azzi
 */
public class PerfilControl {

    public static ArrayList<Perfil> listaPerfis() {
        return new ArrayList(Conexao.namedQuery("Perfil.findAll"));
    }

    public static void add(Perfil perfil) {
        Conexao.persist(perfil);
        Conexao.commit();
    }

    public static Perfil findByCodigo(Integer codigo) {
        return (Perfil) Conexao.singleResultNamedQuery("Perfil.findByCodigo", codigo, "codigo");
    }

    public static Perfil findByDescricao(String descricao) {
        return (Perfil) Conexao.singleResultNamedQuery("Perfil.findByDescricao", descricao, "descricao");
    }

    public static void delete(Perfil perfil) {
        Conexao.remove(perfil);
        Conexao.commit();
    }
}
