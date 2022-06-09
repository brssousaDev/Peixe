package br.com.getservicos.fishControl.repository.impl;

import br.com.getservicos.fishControl.core.repository.BaseRepository;
import br.com.getservicos.fishControl.model.TabelaCultivo;
import br.com.getservicos.fishControl.model.Tanque;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class TabelaCultivoRepositoryImpl extends BaseRepository{

    public TabelaCultivoRepositoryImpl(EntityManager em) {
        super(em);
    }

    public TabelaCultivo getByTanque(Tanque tanque) {
        return entityManager.createQuery("select c from TabelaCultivo c where c.tanque = :tanque", TabelaCultivo.class)
                .setParameter("tanque", tanque)
                .getResultList()
                .stream()
                .findFirst()
                .orElse(null);
    }


}
