package br.com.getservicos.fishControl.repository;

import br.com.getservicos.fishControl.model.EntradaPeixe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntradaPeixeRepository extends JpaRepository<EntradaPeixe, Integer> {
}
