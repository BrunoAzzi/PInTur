/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.TableModels.PromocaoTableModel;



/**
 *
 * @author gustavo_yuri
 */
public enum InformacaoColunasPromocao {
    
    NOME("Nome", 0),
    DATA_INICIAL("Inicio", 1),
    DATA_FINAL("Final", 2),
    VALOR_PROMOCIONAl("Valor Promocional", 3);
    
    String descricao;
    int value;

    private InformacaoColunasPromocao(String descricao, int value) {
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
