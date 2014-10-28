/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.TableModels.CategoriaTableModel;

import control.CategoriaControl;
import model.Categoria;
import view.TableModels.GenericTableModel;

/**
 *
 * @author bruno_azzi
 */
public class CategoriaTableModel extends GenericTableModel{

    public CategoriaTableModel() {
        super(1, false);
        registros.addAll(CategoriaControl.listaCategorias());
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if(columnIndex < 0 || columnIndex >= quantidadeDeColunas) throw new IndexOutOfBoundsException();
        if(columnIndex == InformacaoColunas.NOME.getValue()) return String.class;
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
        Categoria categoria;
        
        if(rowIndex < 0 || rowIndex >= registros.size()) throw new IndexOutOfBoundsException();
        categoria = (Categoria) registros.get(rowIndex);
        if(columnIndex < 0 || columnIndex >= quantidadeDeColunas) throw new IndexOutOfBoundsException();
        if(columnIndex == InformacaoColunas.NOME.getValue()) return categoria.getNome();
        return "";
    }
    
    public void add(Categoria categoria){
        registros.add(categoria);
        fireTableDataChanged();
    }
    
}
