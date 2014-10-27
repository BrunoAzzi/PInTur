/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package messages;

/**
 *
 * @author bruno_azzi
 */
public enum Warnings {
    
    OBJETO_NAO_ENCONTRADO("A consulta do banco nao retornou resultados.");

    final String mensagem;
    
    private Warnings(String descricao) {
        this.mensagem = descricao;
    }

    public String getMensagem() {
        return mensagem;
    }
    
}
