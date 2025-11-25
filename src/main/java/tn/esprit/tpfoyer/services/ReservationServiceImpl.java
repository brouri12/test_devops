package tn.esprit.tpfoyer.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.model.Bloc;
import tn.esprit.tpfoyer.model.Chambre;
import tn.esprit.tpfoyer.model.Reservation;
import tn.esprit.tpfoyer.repository.ChambreRepository;
import tn.esprit.tpfoyer.repository.ReservationRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ReservationServiceImpl implements IReservationService {

    private final ReservationRepository reservationRepository;
    private final ChambreRepository chambreRepository;

    @Override
    public Reservation addOrUpdate(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public void delete(String id) {
        reservationRepository.deleteById(String.valueOf(id));
    }

    @Override
    public List<Reservation> findAllReservations() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation findById(String id) {
        return reservationRepository.findById(id).orElse(null);
    }



}
