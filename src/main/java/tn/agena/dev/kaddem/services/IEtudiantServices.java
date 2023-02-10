package tn.agena.dev.kaddem.services;
import tn.agena.dev.kaddem.entities.Etudiant;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public interface IEtudiantServices {
    void ajouterEtudiant(Etudiant e);
    void updateEtudiant(Etudiant e);
    List<Etudiant> getAllEtudiant();
    Etudiant getByIdEtudiant(Integer id);
    void deleteEtudiant(Integer id);
}
