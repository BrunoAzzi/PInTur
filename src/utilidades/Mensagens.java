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
    PROMOCAO_CADASTRO_CAMPOs_INVALIDOS("Campo inválido no cadastro de promoções!"),
    PROMOCAO_CADASTRO_OBJETO_NULO("Não foi selecionado nenhum produto!"),
    PROMOCAO_CADASTRO_MES_INVALIDO("Somente é possível cadastrar promoções deste mês!"),
    PROMOCAO_CADASTRO_DIA_INVALIDO("A data de fim da promoção não pode ser menor que a data de inicio da promoção!"),
    
    WARNING("Aviso!");
    
    String descricao;

    private Mensagens(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
    
    
    
}
