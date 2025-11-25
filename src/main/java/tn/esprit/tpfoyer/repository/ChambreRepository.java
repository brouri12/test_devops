package tn.esprit.tpfoyer.repository;

import tn.esprit.tpfoyer.model.Chambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tpfoyer.model.TypeChambre;

import java.util.List;

@Repository
public interface ChambreRepository extends JpaRepository<Chambre, Long> {

    Chambre findByNumeroChambre(long nombre);
    List<Chambre> findByTypeC(TypeChambre typeC);
}
