package br.com.getservicos.fishControl.service;

import br.com.getservicos.fishControl.core.service.AbstractCrudService;
import br.com.getservicos.fishControl.model.Temperatura;
import br.com.getservicos.fishControl.repository.TemperaturaRepository;
import br.com.getservicos.fishControl.service.api.TemperaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class TemperaturaServiceImpl extends AbstractCrudService<Temperatura, Integer> implements TemperaturaService {

    @Autowired
    TemperaturaRepository temperaturaRepository;


    @Override
    public JpaRepository getRepository() {
        return temperaturaRepository;
    }
}
