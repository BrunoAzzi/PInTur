/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.TableModels.CategoriaTableModel;

/**
 *
 * @author bruno_azzi
 */
public enum InformacaoColunasCategoria {
    
    NOME("Categoria", 0);
    
    String descricao;
    int value;
    
    InformacaoColunasCategoria(String descricao, int value){
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
