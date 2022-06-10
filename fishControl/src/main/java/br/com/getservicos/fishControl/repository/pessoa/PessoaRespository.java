package br.com.getservicos.fishControl.repository.pessoa;

import br.com.getservicos.fishControl.model.pessoa.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRespository extends JpaRepository<Pessoa, Integer> {
}
