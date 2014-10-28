/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.TableModels.CategoriaTableModel;

/**
 *
 * @author bruno_azzi
 */
public enum NomeDasColunas {
    
    NOME("Categoria");
    
    String descricao;
    
    NomeDasColunas(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
    
}
