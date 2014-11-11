/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author bruno_azzi
 */
@Entity
@Table(name = "formadepagamento", catalog = "PInTur", schema = "")
@NamedQueries({
    @NamedQuery(name = "Formadepagamento.findAll", query = "SELECT f FROM Formadepagamento f"),
    @NamedQuery(name = "Formadepagamento.findByCodigo", query = "SELECT f FROM Formadepagamento f WHERE f.codigo = :codigo"),
    @NamedQuery(name = "Formadepagamento.findByDescricao", query = "SELECT f FROM Formadepagamento f WHERE f.descricao = :descricao")})
public class Formadepagamento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo", nullable = false)
    private Integer codigo;
    @Basic(optional = false)
    @Column(name = "descricao", nullable = false, length = 45)
    private String descricao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "formaDePagamento")
    private List<Venda> vendaList;

    public Formadepagamento() {
    }

    public Formadepagamento(Integer codigo) {
        this.codigo = codigo;
    }

    public Formadepagamento(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public List<Venda> getVendaList() {
        return vendaList;
    }

    public void setVendaList(List<Venda> vendaList) {
        this.vendaList = vendaList;
    }

    @Override
    public String toString() {
        return "model.Formadepagamento[ codigo=" + codigo + " ]";
    }
    
}
