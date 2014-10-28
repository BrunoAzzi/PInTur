/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.TableModels;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author brunoazzi
 */
public abstract class GenericTableModel extends AbstractTableModel{
    protected ArrayList<Object> registros = new ArrayList();
    
    protected int quantidadeDeColunas;
    protected boolean isEditable;

    public GenericTableModel(int quantidadeDeColunas, boolean isEditable) {
        this.quantidadeDeColunas = quantidadeDeColunas;
        this.isEditable = isEditable;
    }
    
    //METODOS IMPLEMENTADOS
    @Override
    public int getRowCount() {
        return registros.size();
    }

    @Override
    public int getColumnCount() {
        return quantidadeDeColunas;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return isEditable;
    }

    public void deleteAll(){
        registros.clear();
        fireTableDataChanged();
    }
    
    public void deleteRow(int linha){
        registros.remove(linha);
        fireTableDataChanged();
    }
    
    //METODOS ABSTRATOS
    @Override
    public abstract Class<?> getColumnClass(int columnIndex);

    @Override
    public abstract String getColumnName(int columnIndex);
    
}
