package br.com.getservicos.fishControl.repository;

import br.com.getservicos.fishControl.model.TabelaCultivo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TabelaCultivoRepository extends JpaRepository<TabelaCultivo, Integer> {
}
