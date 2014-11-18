/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package messages;

/**
 *
 * @author bruno_azzi
 */
public enum ConfirmMessages {
    
    CERTEZA_DE_EDICAO("Tem certeza de que quer salvar esta edição?");
    
    String descricao;

    private ConfirmMessages(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
    
}
