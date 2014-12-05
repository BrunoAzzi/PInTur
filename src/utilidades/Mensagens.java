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
    
    PRODUTO_ADICIONAR_CONFIRMACAO("Deseja salvar este(s) produto(s)?"),
    PRODUTO_CADASTRO_CAMPOS_INVALIDOS("Campo inválido no cadastro de produtos"),
    CATEGORIA_ADICIONAR_CONFIRMACAO("Deseja salvar esta(s) categoria(s)?"),
    CATEGORIA_CADASTRO_CAMPOS_INVALIDOS("Campo inválido no cadastro de categorias!"),
    CAMPOS_INVALIDOS("Campos inválidos no formulário!"),
    PROMOCAO_CADASTRO_CAMPOS_INVALIDOS("Campos obrigatórios não preenchidos no cadastro de promoções!"),
    PROMOCAO_CADASTRO_OBJETO_NULO("Campo Vazio!"),
    PROMOCAO_CADASTRO_MES_INVALIDO("Somente é possível cadastrar promoções deste mês!"),
    PROMOCAO_CADASTRO_DIA_INVALIDO("A data de fim da promoção não pode ser menor que a data de inicio da promoção!"),
    PROMOCAO_CADASTRO_DIA_MENOR_QUE_DIA_ATUAL("Data de promoção menor que a data atual!"),    
    PROMOCAO_PRODUTO_NAO_SELECIONADO("Não foi selecionado nenhum produto!"),
    PROMOCAO_VALOR_MAIOR_OU_IGUAL_DO_PRODUTO("Valor de promoção precisa ser menor que o valor do produto!"),
    PROMOCAO_VALOR_MAIOR_QUE_ZERO("Valor de promoção precisa ser maior que zero!"),
    PROMOCAO_DATA_INICIAL_NULA("Data inicial não selecionada!"),
    PROMOCAO_DATA_FINAL_NULA("Data final não selecionada!"),
    PROMOCAO_VALOR_NULO("Valor da promoção está vazio!"),
    PROMOCAO_ADICIONAR_CONFIRMACAO("Deseja salvar esta(s) promoção(ões)?"),
   
    REMOVER_LINHA_NAO_SELECIONADA("Selecionar linha para remoção!"),
    EDITAR_LINHA_NAO_SELECIONADA("Selecionar linha para edição!"),
    WARNING_SALVAR_SEM_NENHUM_CADASTRO("Nenhum cadastro encontrado! \nNão foi possível salvar."),
    WARNING("Aviso!"),
    CONFIRM("Confirme!"), 
    ADICIONAR_CONFIRMACAO("Deseja mesmo salvar este(s) registro(s) no banco?"), 
    NAO_TEM_PERMISSAO("Você não tem permissão para acessar a área Admnistrativa!");
    
    String descricao;

    private Mensagens(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
    
    
    
}
