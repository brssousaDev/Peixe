package br.com.getservicos.fishControl.model.pessoa;


import javax.persistence.Entity;

@Entity
public class Cliente extends Pessoa {

    private String nomeFantasia;

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

}
