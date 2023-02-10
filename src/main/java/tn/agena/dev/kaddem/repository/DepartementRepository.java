package tn.agena.dev.kaddem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.agena.dev.kaddem.entities.Departement;

public interface DepartementRepository extends JpaRepository<Departement, Integer> {
}
