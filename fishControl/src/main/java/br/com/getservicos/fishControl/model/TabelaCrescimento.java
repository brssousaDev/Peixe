package br.com.getservicos.fishControl.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class TabelaCrescimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String fase;

    private Integer semana;

    private BigDecimal pesoInicial;

    private BigDecimal pesoFinal;

    public TabelaCrescimento() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFase() {
        return fase;
    }

    public void setFase(String fase) {
        this.fase = fase;
    }

    public Integer getSemana() {
        return semana;
    }

    public void setSemana(Integer semana) {
        this.semana = semana;
    }

    public BigDecimal getPesoInicial() {
        return pesoInicial;
    }

    public void setPesoInicial(BigDecimal pesoInicial) {
        this.pesoInicial = pesoInicial;
    }

    public BigDecimal getPesoFinal() {
        return pesoFinal;
    }

    public void setPesoFinal(BigDecimal pesoFinal) {
        this.pesoFinal = pesoFinal;
    }
}
