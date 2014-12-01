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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

/**
 *
 * @author bruno_azzi
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Fotoproduto.findAll", query = "SELECT f FROM Fotoproduto f"),
    @NamedQuery(name = "Fotoproduto.findByCodigo", query = "SELECT f FROM Fotoproduto f WHERE f.codigo = :codigo"),
    @NamedQuery(name = "Fotoproduto.findByDescricao", query = "SELECT f FROM Fotoproduto f WHERE f.descricao = :descricao")})
public class Fotoproduto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    @Basic(optional = false)
    @Column(name = "codigo", nullable = false)
    private Integer codigo;
    @Basic(optional = false)
    @Column(name = "descricao", nullable = false, length = 100)
    private String descricao;
    @JoinColumn(name = "Foto", referencedColumnName = "codigo", nullable = false)
    @ManyToOne(optional = false)
    private Foto foto;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fotoProduto")
    private List<Produto> produtoList;

    public Fotoproduto() {
    }

    public Fotoproduto(Integer codigo) {
        this.codigo = codigo;
    }

    public Fotoproduto(Integer codigo, String descricao) {
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

    public Foto getFoto() {
        return foto;
    }

    public void setFoto(Foto foto) {
        this.foto = foto;
    }

    public List<Produto> getProdutoList() {
        return produtoList;
    }

    public void setProdutoList(List<Produto> produtoList) {
        this.produtoList = produtoList;
    }

    @Override
    public String toString() {
        return "model.Fotoproduto[ codigo=" + codigo + " ]";
    }
    
}
