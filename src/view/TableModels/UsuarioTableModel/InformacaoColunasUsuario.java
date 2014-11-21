/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.TableModels.UsuarioTableModel;

/**
 *
 * @author bruno_azzi
 */
public enum InformacaoColunasUsuario {
    
    LOGIN("Login", 0),
    PERFIL("Perfil", 1);
    
    String descricao;
    int value;
    
    InformacaoColunasUsuario(String descricao, int value){
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
