/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import javax.persistence.NoResultException;
import javax.swing.JOptionPane;
import messages.Warnings;
import model.Promocao;

/**
 *
 * @author everton_m
 */
public class PromocaoControl {
    
    public static ArrayList<Promocao> selectAll(){
        return new ArrayList(Conexao.namedQuery("Promocao.findAll"));
    }

    public static Promocao findByCodigo(Integer codigo) throws NullPointerException {
        if (codigo == null) {
            throw new NullPointerException("O Código está vazio");
        }
        try {
            return (Promocao) Conexao.singleResultNamedQuery("Promocao.findByCodigo", codigo, "codigo");
        } catch (NoResultException e) {
            JOptionPane.showMessageDialog(null, Warnings.OBJETO_NAO_ENCONTRADO.getMensagem(), JOptionPane.MESSAGE_PROPERTY, JOptionPane.WARNING_MESSAGE);
            return null;
        }
    }
        
    public static void add(Promocao promocao){
       Conexao.persist(promocao);
    }
    
    public static void deleteByCodigo(Integer codigo){
        if(codigo == null){
            throw new NullPointerException("O Código está vazio");
        }
        Conexao.remove(codigo);
    }     
    
}
