package br.com.getservicos.fishControl.service.pessoa;

import br.com.getservicos.fishControl.core.service.AbstractCrudService;
import br.com.getservicos.fishControl.model.pessoa.Endereco;
import br.com.getservicos.fishControl.repository.pessoa.EnderecoRepository;
import br.com.getservicos.fishControl.service.api.pessoa.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class EnderecoServiceImpl extends AbstractCrudService<Endereco, Integer> implements EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Override
    public JpaRepository getRepository() {
        return enderecoRepository;
    }
}
