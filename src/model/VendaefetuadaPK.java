/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author bruno_azzi
 */
@Embeddable
public class VendaefetuadaPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "Venda", nullable = false)
    private int venda;
    @Basic(optional = false)
    @Column(name = "Produto", nullable = false)
    private int produto;

    public VendaefetuadaPK() {
    }

    public VendaefetuadaPK(int venda, int produto) {
        this.venda = venda;
        this.produto = produto;
    }

    public int getVenda() {
        return venda;
    }

    public void setVenda(int venda) {
        this.venda = venda;
    }

    public int getProduto() {
        return produto;
    }

    public void setProduto(int produto) {
        this.produto = produto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) venda;
        hash += (int) produto;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VendaefetuadaPK)) {
            return false;
        }
        VendaefetuadaPK other = (VendaefetuadaPK) object;
        if (this.venda != other.venda) {
            return false;
        }
        if (this.produto != other.produto) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.VendaefetuadaPK[ venda=" + venda + ", produto=" + produto + " ]";
    }
    
}
