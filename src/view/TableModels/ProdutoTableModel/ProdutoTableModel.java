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
        if(columnIndex == InformacaoColunasProduto.NOME.getValue()) return String.class;
        if(columnIndex == InformacaoColunasProduto.DESCRICAO.getValue()) return String.class;
        if(columnIndex == InformacaoColunasProduto.VALOR.getValue()) return Double.class;        
        return String.class;
    }

    @Override
    public String getColumnName(int columnIndex) {
        if(columnIndex > 0 || columnIndex >= quantidadeDeColunas) throw new IndexOutOfBoundsException();
        if(columnIndex == InformacaoColunasProduto.NOME.getValue()) return InformacaoColunasProduto.NOME.getDescricao();
        if(columnIndex == InformacaoColunasProduto.DESCRICAO.getValue()) return InformacaoColunasProduto.DESCRICAO.getDescricao();
        if(columnIndex == InformacaoColunasProduto.VALOR.getValue()) return InformacaoColunasProduto.VALOR.getDescricao();
        return null;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Produto produto;        
        if(rowIndex < 0 || rowIndex >= produtos.size()) throw new IndexOutOfBoundsException();
        produto = (Produto) produtos.get(rowIndex);
        if(columnIndex < 0 || columnIndex >= quantidadeDeColunas) throw new IndexOutOfBoundsException();
        if(columnIndex == InformacaoColunasProduto.NOME.getValue()) return produto.getNome();
        if(columnIndex == InformacaoColunasProduto.DESCRICAO.getValue()) return produto.getDescricao();
        if(columnIndex == InformacaoColunasProduto.VALOR.getValue()) return produto.getValor();
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
}
