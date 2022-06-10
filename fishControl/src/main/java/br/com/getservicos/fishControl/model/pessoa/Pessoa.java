package br.com.getservicos.fishControl.model.pessoa;

import org.hibernate.annotations.Columns;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;

    private Long cpf_cnpj;

    @OneToMany(mappedBy = "pessoa", cascade = CascadeType.ALL)
    private List<Responsavel> responsavelList;

    @OneToMany(mappedBy = "pessoa", cascade = CascadeType.ALL)
    private List<Contato> contatoList;

    @OneToOne
    private Endereco endereco;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCpf_cnpj() {
        return cpf_cnpj;
    }

    public void setCpf_cnpj(Long cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
    }

    public List<Responsavel> getResponsavelList() {
        return responsavelList;
    }

    public void setResponsavelList(List<Responsavel> responsavelList) {
        this.responsavelList = responsavelList;
    }

    public List<Contato> getContatoList() {
        return contatoList;
    }

    public void setContatoList(List<Contato> contatoList) {
        this.contatoList = contatoList;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pessoa)) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(getId(), pessoa.getId()) && Objects.equals(getNome(), pessoa.getNome()) && Objects.equals(getCpf_cnpj(), pessoa.getCpf_cnpj()) && Objects.equals(getResponsavelList(), pessoa.getResponsavelList()) && Objects.equals(getContatoList(), pessoa.getContatoList()) && Objects.equals(getEndereco(), pessoa.getEndereco());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNome(), getCpf_cnpj(), getResponsavelList(), getContatoList(), getEndereco());
    }
}
