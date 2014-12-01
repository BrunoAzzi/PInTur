/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import model.Vendaefetuada;

/**
 *
 * @author gustavo_yuri
 */
public class VendaEfetuadaControl {
    
    public static ArrayList<Vendaefetuada> listaVendasEfetuadas(){
        return new ArrayList(Conexao.namedQuery("Vendaefetuada.findByQuantidadeVendida"));
    }
    
}
