package br.com.getservicos.fishControl.repository.impl;

import br.com.getservicos.fishControl.core.repository.BaseRepository;
import br.com.getservicos.fishControl.model.TabelaCrescimento;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.math.BigDecimal;

@Repository
public class TabelaCrescimentoRepositoryImpl extends BaseRepository {

    public TabelaCrescimentoRepositoryImpl(EntityManager em) {
        super(em);
    }

    public TabelaCrescimento getByPeso(BigDecimal peso) {
        return entityManager.createQuery("SELECT P FROM TabelaCrescimento P " +
                "WHERE P.pesoInicial < :peso AND P.pesoFinal > :peso", TabelaCrescimento.class)
                .setParameter("peso", peso)
                .getResultList()
                .stream()
                .findFirst()
                .orElse(null);
    }
}
