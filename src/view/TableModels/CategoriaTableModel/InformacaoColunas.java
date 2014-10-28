/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.TableModels.CategoriaTableModel;

/**
 *
 * @author bruno_azzi
 */
public enum InformacaoColunas {
    
    NOME("Categoria", 0);
    
    String descricao;
    int value;
    
    InformacaoColunas(String descricao, int value){
        this.descricao = descricao;
        this.value = value;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getValue() {
        return value;
    }
    
}
