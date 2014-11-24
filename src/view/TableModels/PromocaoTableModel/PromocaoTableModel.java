/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.TableModels.PromocaoTableModel;


import control.ProdutoControl;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.AbstractTableModel;
import model.Produto;

/**
 *
 * @author gustavo_yuri
 */
public class PromocaoTableModel extends AbstractTableModel {

    public ArrayList<Produto> produtos = new ArrayList();
    
    public int quantidadeDeColunas;
    public boolean isEditable;

    public PromocaoTableModel(int quantidadeDeColunas, boolean isEditable) {
        this.quantidadeDeColunas = quantidadeDeColunas;
        this.isEditable = isEditable;
        //TODO criar retorno de produto que tenham promocao
     //   produtos.addAll(ProdutoControl.listaProdutosPromocionais());       
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if(columnIndex < 0 || columnIndex >= quantidadeDeColunas) throw new IndexOutOfBoundsException();
        if(columnIndex == InformacaoColunasPromocao.NOME.getValue()) return String.class;
        if(columnIndex == InformacaoColunasPromocao.DATA_INICIAL.getValue()) return Date.class;
        if(columnIndex == InformacaoColunasPromocao.DATA_FINAL.getValue()) return Date.class;
        if(columnIndex == InformacaoColunasPromocao.VALOR_PROMOCIONAl.getValue()) return Double.class;        
        return String.class;
    }

    @Override
    public String getColumnName(int columnIndex) {
        if(columnIndex < 0 || columnIndex >= quantidadeDeColunas) throw new IndexOutOfBoundsException();
        if(columnIndex == InformacaoColunasPromocao.NOME.getValue()) return InformacaoColunasPromocao.NOME.getDescricao();
        if(columnIndex == InformacaoColunasPromocao.DATA_INICIAL.getValue()) return InformacaoColunasPromocao.DATA_INICIAL.getDescricao();
        if(columnIndex == InformacaoColunasPromocao.DATA_FINAL.getValue()) return InformacaoColunasPromocao.DATA_FINAL.getDescricao();
        if(columnIndex == InformacaoColunasPromocao.VALOR_PROMOCIONAl.getValue()) return InformacaoColunasPromocao.VALOR_PROMOCIONAl.getDescricao();
        return null;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Produto produto;        
        if(rowIndex < 0 || rowIndex >= produtos.size()) throw new IndexOutOfBoundsException();
        produto = (Produto) produtos.get(rowIndex);
        if(columnIndex < 0 || columnIndex >= quantidadeDeColunas) throw new IndexOutOfBoundsException();
        if(columnIndex == InformacaoColunasPromocao.NOME.getValue()) return produto.getNome();
        if(columnIndex == InformacaoColunasPromocao.DATA_INICIAL.getValue()) return produto.getPromocao().getDataInicio();
        if(columnIndex == InformacaoColunasPromocao.DATA_FINAL.getValue()) return produto.getPromocao().getDataFinal();
        if(columnIndex == InformacaoColunasPromocao.VALOR_PROMOCIONAl.getValue()) return produto.getPromocao().getValorPromocional();
        return "";
    }

    @Override
    public int getRowCount() {
        return produtos.size();
    }

    @Override
    public int getColumnCount() {
        return quantidadeDeColunas;
    }    

    public void deleteRow(int rowIndex) {
        produtos.remove(rowIndex);
        fireTableDataChanged();
    }

    public void add(Produto value) {
        produtos.add(value);
        fireTableDataChanged();
    }
    
    public ArrayList<Produto> getAllProdutos(){       
        return new ArrayList(produtos);        
    }
    public void clear(){
        produtos.clear();
        fireTableDataChanged();
    }
}
