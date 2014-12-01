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

/**
 *
 * @author bruno_azzi
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Vendaefetuada.findAll", query = "SELECT v FROM Vendaefetuada v"),
    @NamedQuery(name = "Vendaefetuada.findByVenda", query = "SELECT v FROM Vendaefetuada v WHERE v.vendaefetuadaPK.venda = :venda"),
    @NamedQuery(name = "Vendaefetuada.findByProduto", query = "SELECT v FROM Vendaefetuada v WHERE v.vendaefetuadaPK.produto = :produto"),
    @NamedQuery(name = "Vendaefetuada.findByQuantidadeVendida", query = "SELECT v FROM Vendaefetuada v WHERE v.quantidadeVendida = :quantidadeVendida")})
public class Vendaefetuada implements Serializable {

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
    public String toString() {
        return "model.Vendaefetuada[ vendaefetuadaPK=" + vendaefetuadaPK + " ]";
    }
    
}
