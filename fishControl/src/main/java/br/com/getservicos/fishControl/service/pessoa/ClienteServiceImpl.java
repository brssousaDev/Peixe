package br.com.getservicos.fishControl.service.pessoa;

import br.com.getservicos.fishControl.core.service.AbstractCrudService;
import br.com.getservicos.fishControl.model.pessoa.Cliente;
import br.com.getservicos.fishControl.repository.pessoa.ClienteRepository;
import br.com.getservicos.fishControl.service.api.pessoa.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl extends AbstractCrudService<Cliente, Integer> implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public JpaRepository getRepository() {
        return clienteRepository;
    }
}
