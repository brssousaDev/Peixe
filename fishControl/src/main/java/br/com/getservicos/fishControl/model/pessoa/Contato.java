package br.com.getservicos.fishControl.model.pessoa;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Contato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated
    private TipoContatoEnum tipoContato;

    private String contato;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "pessoa")
    private Pessoa pessoa;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TipoContatoEnum getTipoContato() {
        return tipoContato;
    }

    public void setTipoContato(TipoContatoEnum tipoContato) {
        this.tipoContato = tipoContato;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contato)) return false;
        Contato contato1 = (Contato) o;
        return Objects.equals(getId(), contato1.getId()) && getTipoContato() == contato1.getTipoContato() && Objects.equals(getContato(), contato1.getContato()) && Objects.equals(getPessoa(), contato1.getPessoa());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTipoContato(), getContato(), getPessoa());
    }
}
