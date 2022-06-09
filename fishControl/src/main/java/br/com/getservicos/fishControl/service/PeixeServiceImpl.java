package br.com.getservicos.fishControl.service;

import br.com.getservicos.fishControl.core.service.AbstractCrudService;
import br.com.getservicos.fishControl.model.Peixe;
import br.com.getservicos.fishControl.repository.PeixeRepository;
import br.com.getservicos.fishControl.service.api.PeixeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class PeixeServiceImpl extends AbstractCrudService<Peixe, Integer> implements PeixeService {

    @Autowired
    PeixeRepository peixeRepository;

    @Override
    public JpaRepository getRepository() {
        return peixeRepository;
    }
}
