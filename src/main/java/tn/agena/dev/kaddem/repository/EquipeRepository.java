package tn.agena.dev.kaddem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.agena.dev.kaddem.entities.Equipe;

public interface EquipeRepository  extends JpaRepository<Equipe,Integer> {
}
