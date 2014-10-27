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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author bruno_azzi
 */
@Entity
@Table(name = "foto", catalog = "PInTur", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Foto.findAll", query = "SELECT f FROM Foto f"),
    @NamedQuery(name = "Foto.findByCodigo", query = "SELECT f FROM Foto f WHERE f.codigo = :codigo")})
public class Foto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo", nullable = false)
    private Integer codigo;
    @Basic(optional = false)
    @Lob
    @Column(name = "image", nullable = false)
    private byte[] image;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "foto")
    private List<Fotoproduto> fotoprodutoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "foto")
    private List<Fotocategoria> fotocategoriaList;

    public Foto() {
    }

    public Foto(Integer codigo) {
        this.codigo = codigo;
    }

    public Foto(Integer codigo, byte[] image) {
        this.codigo = codigo;
        this.image = image;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    @XmlTransient
    public List<Fotoproduto> getFotoprodutoList() {
        return fotoprodutoList;
    }

    public void setFotoprodutoList(List<Fotoproduto> fotoprodutoList) {
        this.fotoprodutoList = fotoprodutoList;
    }

    @XmlTransient
    public List<Fotocategoria> getFotocategoriaList() {
        return fotocategoriaList;
    }

    public void setFotocategoriaList(List<Fotocategoria> fotocategoriaList) {
        this.fotocategoriaList = fotocategoriaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Foto)) {
            return false;
        }
        Foto other = (Foto) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Foto[ codigo=" + codigo + " ]";
    }
    
}
