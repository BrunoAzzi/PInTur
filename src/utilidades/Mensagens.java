/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

/**
 *
 * @author brunoazzi
 */
public enum Mensagens {
    
    PRODUTO_ADICIONAR_CONFIRMACAO("Deseja adicionar novo produto?"),
    PRODUTO_CADASTRO_CAMPOs_INVALIDOS("Campo inválido no cadastro de produtos"),
    CATEGORIA_ADICIONAR_CONFIRMACAO("Deseja adicionar nova categoria?"),
    CATEGORIA_CADASTRO_CAMPOs_INVALIDOS("Campo inválido no cadastro de categorias!"),   
    REMOVER_LINHA_NAO_SELECIONADA("Selecionar linha para remoção!"),
    EDITAR_LINHA_NAO_SELECIONADA("Selecionar linha para edição!"),
    WARNING("Aviso!");
    
    String descricao;

    private Mensagens(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
    
    
    
}
