package br.com.getservicos.fishControl.service.pessoa;

import br.com.getservicos.fishControl.core.service.AbstractCrudService;
import br.com.getservicos.fishControl.model.pessoa.Pessoa;
import br.com.getservicos.fishControl.repository.pessoa.PessoaRespository;
import br.com.getservicos.fishControl.service.api.pessoa.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class PessoaServiceImpl extends AbstractCrudService<Pessoa, Integer> implements PessoaService {

    @Autowired
    private PessoaRespository pessoaRespository;

    @Override
    public JpaRepository getRepository() {
        return pessoaRespository;
    }
}
