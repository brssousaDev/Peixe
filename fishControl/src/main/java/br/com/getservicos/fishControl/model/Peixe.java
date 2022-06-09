package br.com.getservicos.fishControl.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Peixe implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String peixe;

    public Peixe() {
    }

    public Peixe(Integer id, String peixe) {
        this.id = id;
        this.peixe = peixe;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPeixe() {
        return peixe;
    }

    public void setPeixe(String peixe) {
        this.peixe = peixe;
    }
}
