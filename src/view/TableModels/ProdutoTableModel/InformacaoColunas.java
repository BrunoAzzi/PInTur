/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.TableModels.ProdutoTableModel;

/**
 *
 * @author gustavo_yuri
 */
public enum InformacaoColunas {
    
    NOME("Nome", 0),
    DESCRICAO("Descricao", 1),
    VALOR("Valor", 2);
    
    String descricao;
    int value;

    private InformacaoColunas(String descricao, int value) {
        this.descricao = descricao;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public String getDescricao() {
        return descricao;
    }
    
    
    
}
