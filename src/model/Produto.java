/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author bruno_azzi
 */
@Entity
@Table(name = "produto", catalog = "PInTur", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Produto.findAll", query = "SELECT p FROM Produto p"),
    @NamedQuery(name = "Produto.findByCodigo", query = "SELECT p FROM Produto p WHERE p.codigo = :codigo"),
    @NamedQuery(name = "Produto.findByNome", query = "SELECT p FROM Produto p WHERE p.nome = :nome"),
    @NamedQuery(name = "Produto.findByDescricao", query = "SELECT p FROM Produto p WHERE p.descricao = :descricao"),
    @NamedQuery(name = "Produto.findByValor", query = "SELECT p FROM Produto p WHERE p.valor = :valor"),
    @NamedQuery(name = "Produto.findByPromocao", query = "SELECT p FROM Produto p WHERE p.promocao IS NOT NULL"),
    @NamedQuery(name = "Produto.findByQuantidade", query = "SELECT p FROM Produto p WHERE p.quantidade = :quantidade")})

public class Produto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo", nullable = false)
    private Integer codigo;
    @Basic(optional = false)
    @Column(name = "nome", nullable = false, length = 45)
    private String nome;
    @Basic(optional = false)
    @Column(name = "descricao", nullable = false, length = 45)
    private String descricao;
    @Basic(optional = false)
    @Column(name = "valor", nullable = false)
    private double valor;
    @Basic(optional = false)
    @Column(name = "quantidade", nullable = false)
    private int quantidade;
    @JoinColumn(name = "Promocao", referencedColumnName = "codigo", nullable = false)
    @ManyToOne(optional = false)
    private Promocao promocao;
    @JoinColumn(name = "Categoria", referencedColumnName = "codigo", nullable = false)
    @ManyToOne(optional = false)
    private Categoria categoria;
    @JoinColumn(name = "FotoProduto", referencedColumnName = "codigo", nullable = false)
    @ManyToOne(optional = false)
    private Fotoproduto fotoProduto;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "produto1")
    private List<Vendaefetuada> vendaefetuadaList;

    public Produto() {
    }
    
    public Produto(String nome){
        this.nome = nome;
    }

    public Produto(Integer codigo) {
        this.codigo = codigo;
    }

    public Produto(Integer codigo, String nome, String descricao, double valor, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Promocao getPromocao() {
        return promocao;
    }

    public void setPromocao(Promocao promocao) {
        this.promocao = promocao;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Fotoproduto getFotoProduto() {
        return fotoProduto;
    }

    public void setFotoProduto(Fotoproduto fotoProduto) {
        this.fotoProduto = fotoProduto;
    }

    @XmlTransient
    public List<Vendaefetuada> getVendaefetuadaList() {
        if(vendaefetuadaList == null) return new ArrayList();
        return vendaefetuadaList;
    }

    public void setVendaefetuadaList(List<Vendaefetuada> vendaefetuadaList) {
        this.vendaefetuadaList = vendaefetuadaList;
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
        if (!(object instanceof Produto)) {
            return false;
        }
        Produto other = (Produto) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return getNome();                
    }
    
}
