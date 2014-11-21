/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.TableModels.UsuarioTableModel;

import control.UsuarioControl;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Perfil;
import model.Usuario;

/**
 *
 * @author bruno_azzi
 */
public class UsuarioTableModel extends AbstractTableModel{
    
    public ArrayList<Usuario> usuarios = new ArrayList();
    
    protected int quantidadeDeColunas;
    protected boolean isEditable;

    public UsuarioTableModel(int quantidadeDeColunas, boolean isEditable) {
        this.quantidadeDeColunas = quantidadeDeColunas;
        this.isEditable = isEditable;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if(columnIndex < 0 || columnIndex >= quantidadeDeColunas) throw new IndexOutOfBoundsException();
        if(columnIndex == InformacaoColunasUsuario.LOGIN.getValue()) return String.class;
        if(columnIndex == InformacaoColunasUsuario.PERFIL.getValue()) return Perfil.class;
        return String.class;
    }

    @Override
    public String getColumnName(int columnIndex) {
        if(columnIndex > 0 || columnIndex >= quantidadeDeColunas) throw new IndexOutOfBoundsException();
        if(columnIndex == InformacaoColunasUsuario.LOGIN.getValue()) return InformacaoColunasUsuario.LOGIN.getDescricao();
        if(columnIndex == InformacaoColunasUsuario.PERFIL.getValue()) return InformacaoColunasUsuario.PERFIL.getDescricao();
        return null;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Usuario usuario;
        
        if(rowIndex < 0 || rowIndex >= usuarios.size()) throw new IndexOutOfBoundsException();
        usuario = (Usuario) usuarios.get(rowIndex);
        if(columnIndex < 0 || columnIndex >= quantidadeDeColunas) throw new IndexOutOfBoundsException();
        if(columnIndex == InformacaoColunasUsuario.LOGIN.getValue()) return usuario.getLogin();
        if(columnIndex == InformacaoColunasUsuario.PERFIL.getValue()) return usuario.getPerfil();
        return "";
    }
    
    public ArrayList<Usuario> getAllUsuarios(){
        return new ArrayList(usuarios);
    }

    @Override
    public int getRowCount() {
        return usuarios.size();
    }

    @Override
    public int getColumnCount() {
        return quantidadeDeColunas;
    }
    
    public void deleteRow(int rowindex){
        usuarios.remove(rowindex);
        fireTableDataChanged();
    }
    
    public void add(Usuario value){
        usuarios.add(value);
        fireTableDataChanged();
    }
    
    public void clear(){
        usuarios.clear();
        fireTableDataChanged();
    }
    
    public Usuario getUsuarioAt(int rowIndex){
        if(rowIndex < 0 || rowIndex >= usuarios.size()) throw new IndexOutOfBoundsException();
        return usuarios.get(rowIndex);
    }
    
    public void update(){
        usuarios.clear();
        usuarios = UsuarioControl.listaUsuarios();
        fireTableDataChanged();
    }
}
