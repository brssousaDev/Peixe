package br.com.getservicos.fishControl.repository;

import br.com.getservicos.fishControl.model.Tanque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TanqueRepository extends JpaRepository<Tanque, Integer> {
}
