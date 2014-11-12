/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.TableModels.ProdutoTableModel;

import control.ProdutoControl;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Produto;

/**
 *
 * @author gustavo_yuri
 */
public class ProdutoTableModel extends AbstractTableModel {

    public ArrayList<Produto> produtos = new ArrayList();
    public int quantidadeDeColunas;
    public boolean isEditable;

    public ProdutoTableModel(int quantidadeDeColunas, boolean isEditable) {
        this.quantidadeDeColunas = quantidadeDeColunas;
        this.isEditable = isEditable;
        produtos.addAll(ProdutoControl.listaProdutos());
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if(columnIndex < 0 || columnIndex >= quantidadeDeColunas) throw new IndexOutOfBoundsException();
        if(columnIndex == InformacaoColunas.NOME.getValue()) return String.class;
        if(columnIndex == InformacaoColunas.DESCRICAO.getValue()) return String.class;
        if(columnIndex == InformacaoColunas.VALOR.getValue()) return Double.class;
        
        return String.class;
    }

    @Override
    public String getColumnName(int columnIndex) {
        if(columnIndex > 0 || columnIndex >= quantidadeDeColunas) throw new IndexOutOfBoundsException();
        if(columnIndex == InformacaoColunas.NOME.getValue()) return InformacaoColunas.NOME.getDescricao();
        return null;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Produto produto;        
        if(rowIndex < 0 || rowIndex >= produtos.size()) throw new IndexOutOfBoundsException();
        produto = (Produto) produtos.get(rowIndex);
        if(columnIndex < 0 || columnIndex >= quantidadeDeColunas) throw new IndexOutOfBoundsException();
        if(columnIndex == InformacaoColunas.NOME.getValue()) return produto.getNome();
        return "";
    }

    @Override
    public int getRowCount() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getColumnCount() {
        throw new UnsupportedOperationException("Not supported yet.");
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
}
