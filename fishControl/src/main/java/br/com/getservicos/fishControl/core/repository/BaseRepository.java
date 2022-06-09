package br.com.getservicos.fishControl.core.repository;

import javax.persistence.EntityManager;

public class BaseRepository {

    protected final EntityManager entityManager;

    public BaseRepository(EntityManager em) {
        this.entityManager = em;
    }
}
