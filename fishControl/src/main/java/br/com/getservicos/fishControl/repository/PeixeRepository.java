package br.com.getservicos.fishControl.repository;

import br.com.getservicos.fishControl.model.Peixe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeixeRepository extends JpaRepository<Peixe, Integer> {
}
