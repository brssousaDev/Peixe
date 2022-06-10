package br.com.getservicos.fishControl.service.pessoa;

import br.com.getservicos.fishControl.core.service.AbstractCrudService;
import br.com.getservicos.fishControl.model.pessoa.Contato;
import br.com.getservicos.fishControl.repository.pessoa.ContatoRepository;
import br.com.getservicos.fishControl.service.api.pessoa.ContatoService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ContatoServiceImpl extends AbstractCrudService<Contato, Integer> implements ContatoService {

    private ContatoRepository contatoRepository;
    @Override
    public JpaRepository getRepository() {
        return contatoRepository;
    }
}
