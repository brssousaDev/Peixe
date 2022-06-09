package br.com.getservicos.fishControl.service;

import br.com.getservicos.fishControl.core.service.AbstractCrudService;
import br.com.getservicos.fishControl.model.Tanque;
import br.com.getservicos.fishControl.repository.TanqueRepository;
import br.com.getservicos.fishControl.service.api.TanqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class TanqueServiceImpl extends AbstractCrudService<Tanque, Integer> implements TanqueService {

    @Autowired
    TanqueRepository tanqueRepository;

    @Override
    public JpaRepository getRepository() {
        return tanqueRepository;
    }
}
