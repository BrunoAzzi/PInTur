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
    
    REMOVER_LINHA_NAO_SELECIONADA("Selecionar linha para remoção!"),
    EDITAR_LINHA_NAO_SELECIONADA("Selecionar linha para edição!"),
    WARNING_SALVAR_SEM_NENHUM_CADASTRO("Nenhum cadastro encontrado! \nNão foi possível salvar."),
    NAO_TEM_PERMISSAO("Você não tem permissão para acessar a área Admnistrativa!"), 
    ADICIONAR_CATEGORIA_SUCESSO("Adicionou-se com sucesso a(s) categoria(s)."), 
    ADICIONAR_PRODUTO_SUCESSO("Adicionou-se com sucesso o(s) produto(s)."),
    QUANTIDADE_INVALIDA("Quantidade de produtos inválida."), 
    VALOR_INVALIDO("Valor do produto inválido."), 
    NOME_INVALIDO("Nome do produto inválido."), 
    DESCRICAO_INVALIDA("Descricao do produto inválida"), 
    IMAGEM_PRODUTO_INVALIDA("Imagem inválida no cadastro de produtos."), 
    VALOR_MENOR_OU_IGUAL_A_ZERO("O valor deve ser um número positivo diferente de zero."), 
    QUANTIDADE_MENOR_OU_IGUAL_A_ZERO("Ä Quantidade de ser um numero positivo inteiro diferente de zero.");
    
    
    String descricao;

    private Mensagens(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
    
    
    
}
