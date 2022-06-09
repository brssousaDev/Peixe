package br.com.getservicos.fishControl.core.service.api;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BaseCrudService<T, ID> {

    JpaRepository getRepository();

    List<T> findAll();
    T save(T entity) throws Exception;
    T update(T entity);
    void delete(Integer entity);
    T findById(Integer id);

}
