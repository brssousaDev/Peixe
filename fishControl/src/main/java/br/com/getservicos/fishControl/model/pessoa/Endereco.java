package br.com.getservicos.fishControl.model.pessoa;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer cep;

    private String rua;

    private Integer numero;

    private String cidade;

    @Enumerated
    private Estados estado;

    private String complemento;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCep() {
        return cep;
    }

    public void setCep(Integer cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Estados getEstado() {
        return estado;
    }

    public void setEstado(Estados estado) {
        this.estado = estado;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Endereco)) return false;
        Endereco endereco = (Endereco) o;
        return Objects.equals(getId(), endereco.getId()) && Objects.equals(getCep(), endereco.getCep()) && Objects.equals(getRua(), endereco.getRua()) && Objects.equals(getNumero(), endereco.getNumero()) && Objects.equals(getCidade(), endereco.getCidade()) && getEstado() == endereco.getEstado() && Objects.equals(getComplemento(), endereco.getComplemento());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCep(), getRua(), getNumero(), getCidade(), getEstado(), getComplemento());
    }
}
