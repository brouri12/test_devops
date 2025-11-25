package tn.esprit.tpfoyer.services;

import tn.esprit.tpfoyer.model.Etudiant;
import java.util.List;

public interface IEtudiantService {
    Etudiant addOrUpdate(Etudiant etudiant);
    void delete(long id);
    List<Etudiant> findAllEtudiants();
    Etudiant findById(long id);
}
