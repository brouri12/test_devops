package tn.esprit.tpfoyer.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.model.Bloc;
import tn.esprit.tpfoyer.model.Reservation;
import tn.esprit.tpfoyer.services.IReservationService;

import java.util.List;

@RestController
@RequestMapping("/reservationController")
@AllArgsConstructor
public class ReservationController {

    private final IReservationService reservationService;

    @PostMapping("/addReservation")
    public Reservation addReservation(@RequestBody Reservation reservation) {
        return reservationService.addOrUpdate(reservation);
    }

    @PutMapping("/updateReservation")
    public Reservation updateReservation(@RequestBody Reservation reservation) {
        return reservationService.addOrUpdate(reservation);
    }

    @DeleteMapping("/deleteReservation")
    public void deleteReservation(@RequestParam long idReservation) {
        reservationService.delete(String.valueOf(idReservation));
    }

    @GetMapping("/findAllReservations")
    public List<Reservation> findAllReservations() {
        return reservationService.findAllReservations();
    }

    @GetMapping("/findReservationById")
    public Reservation findReservationById(@RequestParam long idReservation) {
        return reservationService.findById(String.valueOf(idReservation));
    }


}
