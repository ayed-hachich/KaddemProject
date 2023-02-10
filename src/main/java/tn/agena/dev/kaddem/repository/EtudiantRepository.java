package tn.agena.dev.kaddem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.agena.dev.kaddem.entities.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant,Integer> {
}
