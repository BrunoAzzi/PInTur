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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author bruno_azzi
 */
@Entity
@Table(name = "promocao", catalog = "PInTur", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Promocao.findAll", query = "SELECT p FROM Promocao p"),
    @NamedQuery(name = "Promocao.findByCodigo", query = "SELECT p FROM Promocao p WHERE p.codigo = :codigo"),
    @NamedQuery(name = "Promocao.findByDataInicio", query = "SELECT p FROM Promocao p WHERE p.dataInicio = :dataInicio"),
    @NamedQuery(name = "Promocao.findByDataFinal", query = "SELECT p FROM Promocao p WHERE p.dataFinal = :dataFinal"),
    @NamedQuery(name = "Promocao.findByValorPromocional", query = "SELECT p FROM Promocao p WHERE p.valorPromocional = :valorPromocional")})
public class Promocao implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo", nullable = false)
    private Integer codigo;
    @Basic(optional = false)
    @Column(name = "dataInicio", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataInicio;
    @Basic(optional = false)
    @Column(name = "dataFinal", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataFinal;
    @Basic(optional = false)
    @Column(name = "valorPromocional", nullable = false)
    private double valorPromocional;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "promocao")
    private List<Produto> produtoList;

    public Promocao() {
    }

    public Promocao(Integer codigo) {
        this.codigo = codigo;
    }

    public Promocao(Integer codigo, Date dataInicio, Date dataFinal, double valorPromocional) {
        this.codigo = codigo;
        this.dataInicio = dataInicio;
        this.dataFinal = dataFinal;
        this.valorPromocional = valorPromocional;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public double getValorPromocional() {
        return valorPromocional;
    }

    public void setValorPromocional(double valorPromocional) {
        this.valorPromocional = valorPromocional;
    }

    @XmlTransient
    public List<Produto> getProdutoList() {
        return produtoList;
    }

    public void setProdutoList(List<Produto> produtoList) {
        this.produtoList = produtoList;
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
        if (!(object instanceof Promocao)) {
            return false;
        }
        Promocao other = (Promocao) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Promocao[ codigo=" + codigo + " ]";
    }
    
}
