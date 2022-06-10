package br.com.getservicos.fishControl.service.pessoa;

import br.com.getservicos.fishControl.core.service.AbstractCrudService;
import br.com.getservicos.fishControl.model.pessoa.Responsavel;
import br.com.getservicos.fishControl.repository.pessoa.ResponsavelRespository;
import br.com.getservicos.fishControl.service.api.pessoa.ResponsavelService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ResponsavelServiceImpl extends AbstractCrudService<Responsavel, Integer> implements ResponsavelService {

    private ResponsavelRespository responsavelRespository;

    @Override
    public JpaRepository getRepository() {
        return responsavelRespository;
    }
}
