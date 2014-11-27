/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.TableModels.PromocaoTableModel;


import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.AbstractTableModel;
import model.Produto;
import model.Promocao;

/**
 *
 * @author gustavo_yuri
 */
public class PromocaoTableModel extends AbstractTableModel {

    private ArrayList<Produto> produtos = new ArrayList();
    private ArrayList<Promocao> promocoes = new ArrayList();
    
    private int quantidadeDeColunas;
    private boolean isEditable;

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
        Promocao promocao;
        if(rowIndex < 0 || rowIndex >= produtos.size()) throw new IndexOutOfBoundsException();
        produto = (Produto) produtos.get(rowIndex);
        promocao = (Promocao) promocoes.get(rowIndex);
        if(columnIndex < 0 || columnIndex >= quantidadeDeColunas) throw new IndexOutOfBoundsException();
        if(columnIndex == InformacaoColunasPromocao.NOME.getValue()) return produto.getNome();
        if(columnIndex == InformacaoColunasPromocao.DATA_INICIAL.getValue()) return promocao.getDataInicio();
        if(columnIndex == InformacaoColunasPromocao.DATA_FINAL.getValue()) return promocao.getDataFinal();
        if(columnIndex == InformacaoColunasPromocao.VALOR_PROMOCIONAl.getValue()) return promocao.getValorPromocional();
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
        promocoes.remove(rowIndex);
        produtos.remove(rowIndex);
        fireTableDataChanged();
    }
    
    public void add(Produto produto, Promocao promocao){
        addProduto(produto);
        addPromocao(promocao);
        fireTableDataChanged();
    }

    private void addProduto(Produto value) {
        produtos.add(value);
    }
    
    private void addPromocao(Promocao value) {
        promocoes.add(value);
    }
    
    public ArrayList<Produto> getAllProdutos(){       
        return new ArrayList(produtos);        
    }
    
     public ArrayList<Promocao> getAllPromocoes(){       
        return new ArrayList(promocoes);        
    }
     
    public void clear(){
        promocoes.clear();
        produtos.clear();
        fireTableDataChanged();
    }
}
