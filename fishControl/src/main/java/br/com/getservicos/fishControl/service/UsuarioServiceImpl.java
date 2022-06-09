package br.com.getservicos.fishControl.service;

import br.com.getservicos.fishControl.core.service.AbstractCrudService;
import br.com.getservicos.fishControl.model.Usuario;
import br.com.getservicos.fishControl.repository.UsuarioRepository;
import br.com.getservicos.fishControl.service.api.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl extends AbstractCrudService<Usuario, Integer> implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;


    @Override
    public JpaRepository getRepository() {
        return usuarioRepository;
    }

}
