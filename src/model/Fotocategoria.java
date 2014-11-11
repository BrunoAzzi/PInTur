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
import javax.persistence.Table;

/**
 *
 * @author bruno_azzi
 */
@Entity
@Table(name = "fotocategoria", catalog = "PInTur", schema = "")
@NamedQueries({
    @NamedQuery(name = "Fotocategoria.findAll", query = "SELECT f FROM Fotocategoria f"),
    @NamedQuery(name = "Fotocategoria.findByCodigo", query = "SELECT f FROM Fotocategoria f WHERE f.codigo = :codigo"),
    @NamedQuery(name = "Fotocategoria.findByDescricao", query = "SELECT f FROM Fotocategoria f WHERE f.descricao = :descricao")})
public class Fotocategoria implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo", nullable = false)
    private Integer codigo;
    @Basic(optional = false)
    @Column(name = "descricao", nullable = false, length = 100)
    private String descricao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fotoCategoria")
    private List<Categoria> categoriaList;
    @JoinColumn(name = "Foto", referencedColumnName = "codigo", nullable = false)
    @ManyToOne(optional = false)
    private Foto foto;

    public Fotocategoria() {
    }

    public Fotocategoria(Integer codigo) {
        this.codigo = codigo;
    }

    public Fotocategoria(Integer codigo, String descricao) {
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

    public List<Categoria> getCategoriaList() {
        return categoriaList;
    }

    public void setCategoriaList(List<Categoria> categoriaList) {
        this.categoriaList = categoriaList;
    }

    public Foto getFoto() {
        return foto;
    }

    public void setFoto(Foto foto) {
        this.foto = foto;
    }

    @Override
    public String toString() {
        return "model.Fotocategoria[ codigo=" + codigo + " ]";
    }
    
}
