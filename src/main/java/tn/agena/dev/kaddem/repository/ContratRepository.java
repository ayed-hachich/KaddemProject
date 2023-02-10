package tn.agena.dev.kaddem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.agena.dev.kaddem.entities.Contrat;

public interface ContratRepository extends JpaRepository<Contrat, Integer> {
}
