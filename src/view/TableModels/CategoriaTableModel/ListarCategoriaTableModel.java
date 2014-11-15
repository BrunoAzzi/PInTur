/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.TableModels.CategoriaTableModel;

import control.CategoriaControl;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Categoria;

/**
 *
 * @author bruno_azzi
 */
public class ListarCategoriaTableModel extends AbstractTableModel{

    public ArrayList<Categoria> categorias = new ArrayList();
    
    protected int quantidadeDeColunas;
    protected boolean isEditable;

    public ListarCategoriaTableModel(int quantidadeDeColunas, boolean isEditable) {
        this.quantidadeDeColunas = quantidadeDeColunas;
        this.isEditable = isEditable;
        categorias.addAll(CategoriaControl.listaCategorias());
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if(columnIndex < 0 || columnIndex >= quantidadeDeColunas) throw new IndexOutOfBoundsException();
        if(columnIndex == InformacaoColunasCategoria.NOME.getValue()) return String.class;
        return String.class;
    }

    @Override
    public String getColumnName(int columnIndex) {
        if(columnIndex > 0 || columnIndex >= quantidadeDeColunas) throw new IndexOutOfBoundsException();
        if(columnIndex == InformacaoColunasCategoria.NOME.getValue()) return InformacaoColunasCategoria.NOME.getDescricao();
        return null;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Categoria categoria;
        
        if(rowIndex < 0 || rowIndex >= categorias.size()) throw new IndexOutOfBoundsException();
        categoria = (Categoria) categorias.get(rowIndex);
        if(columnIndex < 0 || columnIndex >= quantidadeDeColunas) throw new IndexOutOfBoundsException();
        if(columnIndex == InformacaoColunasCategoria.NOME.getValue()) return categoria.getNome();
        return "";
    }
    
    public ArrayList<Categoria> getAllCategorias(){
        return new ArrayList(categorias);
    }

    @Override
    public int getRowCount() {
        return categorias.size();
    }

    @Override
    public int getColumnCount() {
        return quantidadeDeColunas;
    }
    
    public void deleteRow(int rowindex){
        categorias.remove(rowindex);
        fireTableDataChanged();
    }
    
    public void add(Categoria value){
        categorias.add(value);
        fireTableDataChanged();
    }
    
    public Categoria getCategoriaAt(int rowIndex){
        if(rowIndex < 0 || rowIndex >= categorias.size()) throw new IndexOutOfBoundsException();
        return categorias.get(rowIndex);
    }
}
