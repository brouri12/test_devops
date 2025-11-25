package tn.esprit.tpfoyer.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.model.Chambre;
import tn.esprit.tpfoyer.model.Reservation;
import tn.esprit.tpfoyer.model.TypeChambre;
import tn.esprit.tpfoyer.repository.ChambreRepository;
import tn.esprit.tpfoyer.repository.ReservationRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ChambreServiceImpl implements IChambreService {

    private final ChambreRepository chambreRepository;
    private final ReservationRepository reservationRepository;

    @Override
    public Chambre addOrUpdate(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public void delete(long id) {
        chambreRepository.deleteById(id);
    }

    @Override
    public List<Chambre> findAllChambre() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre findById(long id) {
        return chambreRepository.findById(id).orElse(null);
    }

    public Chambre findByNumeroChambre(long numeroChambre) {
        return chambreRepository.findByNumeroChambre(numeroChambre);
    }

    public Chambre desaffecterreservation(long idchombre, String idreservation) {
        Chambre c=chambreRepository.findById(idchombre).get();
        Reservation R=reservationRepository.findById(idreservation).get();
        c.getReservations().remove(R);

    return chambreRepository.save(c);
    }



    public List<Chambre> getChambresByType(TypeChambre type) {
            return chambreRepository.findByTypeC(type);
        }

}
