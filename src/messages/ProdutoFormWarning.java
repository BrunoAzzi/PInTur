/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package messages;

/**
 *
 * @author BrunoAzzi
 */
public enum ProdutoFormWarning {
    
    PRODUTO_CADASTRO_CAMPOS_INVALIDOS("Campo inválido no cadastro de produtos");
    
    String descricao;

    private ProdutoFormWarning(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
    
}
