package tn.esprit.tpfoyer.services;

import tn.esprit.tpfoyer.model.Reservation;
import java.util.List;

public interface IReservationService {
    Reservation addOrUpdate(Reservation reservation);
    void delete(String id);
    List<Reservation> findAllReservations();
    Reservation findById(String id);

}
