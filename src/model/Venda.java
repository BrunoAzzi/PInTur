/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 *
 * @author bruno_azzi
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Venda.findAll", query = "SELECT v FROM Venda v"),
    @NamedQuery(name = "Venda.findByCodigo", query = "SELECT v FROM Venda v WHERE v.codigo = :codigo"),
    @NamedQuery(name = "Venda.findByData", query = "SELECT v FROM Venda v WHERE v.data = :data"),
    @NamedQuery(name = "Venda.findByTotal", query = "SELECT v FROM Venda v WHERE v.total = :total"),
    @NamedQuery(name = "Venda.findByQuantidadeDeParcelas", query = "SELECT v FROM Venda v WHERE v.quantidadeDeParcelas = :quantidadeDeParcelas")})
public class Venda implements Serializable {
    @Id
    @GeneratedValue
    @Basic(optional = false)
    @Column(name = "codigo", nullable = false)
    private Integer codigo;
    @Basic(optional = false)
    @Column(name = "data", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date data;
    @Basic(optional = false)
    @Column(name = "total", nullable = false)
    private double total;
    @Basic(optional = false)
    @Column(name = "quantidadeDeParcelas", nullable = false)
    private int quantidadeDeParcelas;
    @JoinColumn(name = "FormaDePagamento", referencedColumnName = "codigo", nullable = false)
    @ManyToOne(optional = false)
    private Formadepagamento formaDePagamento;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "venda")
    private List<Vendaefetuada> vendaefetuadaList;

    public Venda() {
    }

    public Venda(Integer codigo) {
        this.codigo = codigo;
    }

    public Venda(Integer codigo, Date data, double total, int quantidadeDeParcelas) {
        this.codigo = codigo;
        this.data = data;
        this.total = total;
        this.quantidadeDeParcelas = quantidadeDeParcelas;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getQuantidadeDeParcelas() {
        return quantidadeDeParcelas;
    }

    public void setQuantidadeDeParcelas(int quantidadeDeParcelas) {
        this.quantidadeDeParcelas = quantidadeDeParcelas;
    }

    public Formadepagamento getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(Formadepagamento formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }
    public List<Vendaefetuada> getVendaefetuadaList() {
        return vendaefetuadaList;
    }

    public void setVendaefetuadaList(List<Vendaefetuada> vendaefetuadaList) {
        this.vendaefetuadaList = vendaefetuadaList;
    }
    @Override
    public String toString() {
        return "model.Venda[ codigo=" + codigo + " ]";
    }
    
}
