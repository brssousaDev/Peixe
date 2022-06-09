package br.com.getservicos.fishControl.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class EntradaPeixe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer quantidade;

    private BigDecimal peso;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataEntrada;

    private BigDecimal valor;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "tanque")
    private Tanque tanque;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "peixe")
    private Peixe peixe;

    public EntradaPeixe() {
    }

    public EntradaPeixe(Integer id, Integer quantidade, BigDecimal peso, Date dataEntrada, BigDecimal valor, Tanque tanque, Peixe peixe) {
        this.id = id;
        this.quantidade = quantidade;
        this.peso = peso;
        this.dataEntrada = dataEntrada;
        this.valor = valor;
        this.tanque = tanque;
        this.peixe = peixe;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getPeso() {
        return peso;
    }

    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Tanque getTanque() {
        return tanque;
    }

    public void setTanque(Tanque tanque) {
        this.tanque = tanque;
    }

    public Peixe getPeixe() {
        return peixe;
    }

    public void setPeixe(Peixe peixe) {
        this.peixe = peixe;
    }
}
