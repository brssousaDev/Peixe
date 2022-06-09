package br.com.getservicos.fishControl.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Tanque implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String tanque;

    private Integer capacidade;

    private String dimensao;

    private Boolean limite;

    public Tanque() {
    }

    public Tanque(Integer id, String tanque, Integer capacidade, String dimensao) {
        this.id = id;
        this.tanque = tanque;
        this.capacidade = capacidade;
        this.dimensao = dimensao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTanque() {
        return tanque;
    }

    public void setTanque(String tanque) {
        this.tanque = tanque;
    }

    public Integer getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }

    public String getDimensao() {
        return dimensao;
    }

    public void setDimensao(String dimensao) {
        this.dimensao = dimensao;
    }

    public Boolean getLimite() {
        return limite;
    }

    public void setLimite(Boolean limite) {
        this.limite = limite;
    }
}
