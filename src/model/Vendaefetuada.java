/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author bruno_azzi
 */
@Entity
@Table(name = "vendaefetuada", catalog = "PInTur", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vendaefetuada.findAll", query = "SELECT v FROM Vendaefetuada v"),
    @NamedQuery(name = "Vendaefetuada.findByVenda", query = "SELECT v FROM Vendaefetuada v WHERE v.vendaefetuadaPK.venda = :venda"),
    @NamedQuery(name = "Vendaefetuada.findByProduto", query = "SELECT v FROM Vendaefetuada v WHERE v.vendaefetuadaPK.produto = :produto"),
    @NamedQuery(name = "Vendaefetuada.findByQuantidadeVendida", query = "SELECT v FROM Vendaefetuada v WHERE v.quantidadeVendida = :quantidadeVendida")})
public class Vendaefetuada implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected VendaefetuadaPK vendaefetuadaPK;
    @Basic(optional = false)
    @Column(name = "quantidadeVendida", nullable = false)
    private int quantidadeVendida;
    @JoinColumn(name = "Produto", referencedColumnName = "codigo", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Produto produto1;
    @JoinColumn(name = "Venda", referencedColumnName = "codigo", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Venda venda1;

    public Vendaefetuada() {
    }

    public Vendaefetuada(VendaefetuadaPK vendaefetuadaPK) {
        this.vendaefetuadaPK = vendaefetuadaPK;
    }

    public Vendaefetuada(VendaefetuadaPK vendaefetuadaPK, int quantidadeVendida) {
        this.vendaefetuadaPK = vendaefetuadaPK;
        this.quantidadeVendida = quantidadeVendida;
    }

    public Vendaefetuada(int venda, int produto) {
        this.vendaefetuadaPK = new VendaefetuadaPK(venda, produto);
    }

    public VendaefetuadaPK getVendaefetuadaPK() {
        return vendaefetuadaPK;
    }

    public void setVendaefetuadaPK(VendaefetuadaPK vendaefetuadaPK) {
        this.vendaefetuadaPK = vendaefetuadaPK;
    }

    public int getQuantidadeVendida() {
        return quantidadeVendida;
    }

    public void setQuantidadeVendida(int quantidadeVendida) {
        this.quantidadeVendida = quantidadeVendida;
    }

    public Produto getProduto1() {
        return produto1;
    }

    public void setProduto1(Produto produto1) {
        this.produto1 = produto1;
    }

    public Venda getVenda1() {
        return venda1;
    }

    public void setVenda1(Venda venda1) {
        this.venda1 = venda1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vendaefetuadaPK != null ? vendaefetuadaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vendaefetuada)) {
            return false;
        }
        Vendaefetuada other = (Vendaefetuada) object;
        if ((this.vendaefetuadaPK == null && other.vendaefetuadaPK != null) || (this.vendaefetuadaPK != null && !this.vendaefetuadaPK.equals(other.vendaefetuadaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Vendaefetuada[ vendaefetuadaPK=" + vendaefetuadaPK + " ]";
    }
    
}
