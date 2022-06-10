package br.com.getservicos.fishControl.repository.pessoa;

import br.com.getservicos.fishControl.model.pessoa.Contato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Integer> {
}
