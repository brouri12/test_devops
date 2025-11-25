package tn.esprit.tpfoyer.services;

import tn.esprit.tpfoyer.model.Foyer;
import java.util.List;

public interface IFoyerService {
    Foyer addOrUpdate(Foyer foyer);
    void delete(long id);
    List<Foyer> findAllFoyers();
    Foyer findById(long id);



}
