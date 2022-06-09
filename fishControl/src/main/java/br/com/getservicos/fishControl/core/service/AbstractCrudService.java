package br.com.getservicos.fishControl.core.service;

import br.com.getservicos.fishControl.core.service.api.BaseCrudService;

import java.util.List;
import java.util.Optional;

public abstract class AbstractCrudService<T, ID> implements BaseCrudService<T, ID> {

    public List<T> findAll() { return this.getRepository().findAll();}

    public T save(T entity) throws Exception {
        Object var;
        this.beforeSave(entity);
        this.getRepository().save(entity);
        this.afterSave(entity);
        var = entity;
        return (T) var;
    }

    public T update(T entity) {
        Object var;
        this.beforeUpdate(entity);
        this.getRepository().save(entity);
        this.afterUpdate(entity);
        var = entity;
        return (T) var;
    }

    public void delete(Integer id) {
        T delete = this.findById(id);
        if (delete!=null) {
            this.beforeDelete(delete);
            this.getRepository().delete(delete);
            this.afterDelete(delete);
        }
    }

    public T findById(Integer id) {
        Optional<T> entity = this.getRepository().findById(id);
        return entity.get();
    }


    protected void beforeSave(T entity) {
    }

    protected void afterSave(T entity) {
    }

    protected void beforeUpdate(T entity) {
    }

    protected void afterUpdate(T entity) {
    }

    protected void beforeDelete(T entity) {
    }

    protected void afterDelete(T entity) {
    }
}
