package br.com.getservicos.fishControl.service;

import br.com.getservicos.fishControl.core.service.AbstractCrudService;
import br.com.getservicos.fishControl.model.TabelaCrescimento;
import br.com.getservicos.fishControl.repository.TabelaCrescimentoRepository;
import br.com.getservicos.fishControl.repository.impl.TabelaCrescimentoRepositoryImpl;
import br.com.getservicos.fishControl.repository.impl.TabelaCultivoRepositoryImpl;
import br.com.getservicos.fishControl.service.api.TabelaCrescimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class TabelaCrescimentoServiceImpl extends AbstractCrudService<TabelaCrescimento, Integer> implements TabelaCrescimentoService {

    @Autowired
    TabelaCrescimentoRepository tabelaCrescimentoRepository;

    @Autowired
    TabelaCrescimentoRepositoryImpl tabelaCrescimentoRepositoryImpl;

    @Override
    public JpaRepository getRepository() {
        return tabelaCrescimentoRepository;
    }

    @Override
    public void salvarLista(@NonNull List<TabelaCrescimento> list) {
        list.stream().forEach( item -> {
            tabelaCrescimentoRepository.save(item);
        });
    }

    @Override
    public TabelaCrescimento getByPeso(BigDecimal peso) {
        return tabelaCrescimentoRepositoryImpl.getByPeso(peso);
    }
}
