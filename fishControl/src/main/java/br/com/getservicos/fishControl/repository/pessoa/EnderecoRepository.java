package br.com.getservicos.fishControl.repository.pessoa;

import br.com.getservicos.fishControl.model.pessoa.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
}
