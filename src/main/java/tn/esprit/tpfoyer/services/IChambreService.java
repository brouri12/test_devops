package tn.esprit.tpfoyer.services;

import tn.esprit.tpfoyer.model.Chambre;
import tn.esprit.tpfoyer.model.TypeChambre;

import java.util.List;

public interface IChambreService {
    Chambre addOrUpdate(Chambre chambre);
    void delete(long id);
    List<Chambre> findAllChambre();
    Chambre findById(long id);
    Chambre findByNumeroChambre(long numeroChambre) ;
     Chambre desaffecterreservation(long idchombre, String idreservation) ;
     List<Chambre> getChambresByType(TypeChambre type);
    }
