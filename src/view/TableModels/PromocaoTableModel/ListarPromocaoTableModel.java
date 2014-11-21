/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.TableModels.PromocaoTableModel;


import control.ProdutoControl;
import control.PromocaoControl;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.AbstractTableModel;
import model.Produto;
import model.Promocao;

/**
 *
 * @author evertonm
 */
public class ListarPromocaoTableModel extends AbstractTableModel{

    public ArrayList<Produto> produtos = new ArrayList();
    
    protected int quantidadeDeColunas;
    protected boolean isEditable;

    public ListarPromocaoTableModel(int quantidadeDeColunas, boolean isEditable) {
        this.quantidadeDeColunas = quantidadeDeColunas;
        this.isEditable = isEditable;
        produtos.addAll(ProdutoControl.listaProdutosPromocionais());
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
      if(columnIndex < 0 || columnIndex >= quantidadeDeColunas) throw new IndexOutOfBoundsException();
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
    
    public ArrayList<Promocao> getAllPromocoes(){
        return new ArrayList(produtos);
    }

    @Override
    public int getRowCount() {
        return produtos.size();
    }

    @Override
    public int getColumnCount() {
        return quantidadeDeColunas;
    }
    
    public void deleteRow(int rowindex){
        produtos.remove(rowindex);
        fireTableDataChanged();
    }
    
    public void add(Produto value){
        produtos.add(value);
        fireTableDataChanged();
    }
    
    public Produto getPromocaoAt(int rowIndex){
        if(rowIndex < 0 || rowIndex >= produtos.size()) throw new IndexOutOfBoundsException();
        return produtos.get(rowIndex);
    }
}
