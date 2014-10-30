/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.Foto;

/**
 *
 * @author bruno_azzi
 */
public class FotoControl {

    public static void add(Foto foto) {
        Conexao.persist(foto);
    }
    
}
