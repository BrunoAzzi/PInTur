/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "vendaefetuada")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vendaefetuada.findAll", query = "SELECT v FROM Vendaefetuada v"),
    @NamedQuery(name = "Vendaefetuada.findByCodigo", query = "SELECT v FROM Vendaefetuada v WHERE v.codigo = :codigo"),
    @NamedQuery(name = "Vendaefetuada.orderByQuantidadeVendida", query= "SELECT v FROM Vendaefetuada v ORDER BY v.quantidadeVendida DESC"),
    @NamedQuery(name = "Vendaefetuada.findByQuantidadeVendida", query = "SELECT v FROM Vendaefetuada v WHERE v.quantidadeVendida = :quantidadeVendida")})
public class Vendaefetuada implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @Basic(optional = false)
    @Column(name = "quantidadeVendida")
    private int quantidadeVendida;
    @JoinColumn(name = "Produto", referencedColumnName = "codigo")
    @ManyToOne(optional = false)
    private Produto produto;
    @JoinColumn(name = "Venda", referencedColumnName = "codigo")
    @ManyToOne(optional = false)
    private Venda venda;

    public Vendaefetuada() {
    }

    public Vendaefetuada(Integer codigo) {
        this.codigo = codigo;
    }

    public Vendaefetuada(Integer codigo, int quantidadeVendida) {
        this.codigo = codigo;
        this.quantidadeVendida = quantidadeVendida;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public int getQuantidadeVendida() {
        return quantidadeVendida;
    }

    public void setQuantidadeVendida(int quantidadeVendida) {
        this.quantidadeVendida = quantidadeVendida;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
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
        if (!(object instanceof Vendaefetuada)) {
            return false;
        }
        Vendaefetuada other = (Vendaefetuada) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.Vendaefetuada[ codigo=" + codigo + " ]";
    }
    
}
