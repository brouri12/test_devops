package tn.esprit.tpfoyer.services;

import tn.esprit.tpfoyer.model.Universite;
import java.util.List;

public interface IUniversiteService {
    Universite addOrUpdate(Universite universite);
    void delete(long id);
    List<Universite> findAllUniversites();
    Universite findById(long id);
}
