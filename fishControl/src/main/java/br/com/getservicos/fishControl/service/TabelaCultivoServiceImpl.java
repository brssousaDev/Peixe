package br.com.getservicos.fishControl.service;

import br.com.getservicos.fishControl.core.service.AbstractCrudService;
import br.com.getservicos.fishControl.model.TabelaCultivo;
import br.com.getservicos.fishControl.model.Tanque;
import br.com.getservicos.fishControl.repository.TabelaCultivoRepository;
import br.com.getservicos.fishControl.repository.impl.TabelaCultivoRepositoryImpl;
import br.com.getservicos.fishControl.service.api.TabelaCultivoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class TabelaCultivoServiceImpl extends AbstractCrudService<TabelaCultivo, Integer> implements TabelaCultivoService {

    @Autowired
    TabelaCultivoRepository tabelaCultivoRepository;

    @Autowired
    TabelaCultivoRepositoryImpl tabelaCultivoRepositoryImpl;

    @Override
    public JpaRepository getRepository() {
        return tabelaCultivoRepository;
    }

    @Override
    public TabelaCultivo getByTanque(Tanque tanque) {
        return tabelaCultivoRepositoryImpl.getByTanque(tanque);
    }
}
