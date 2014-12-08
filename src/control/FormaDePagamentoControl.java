/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.Formadepagamento;

/**
 *
 * @author BrunoAzzi
 */
public class FormaDePagamentoControl {

    public static Formadepagamento findById(Integer codigo) {
        return (Formadepagamento) Conexao.singleResultNamedQuery("Formadepagamento.findByCodigo", codigo, "codigo");
    }
    
}
