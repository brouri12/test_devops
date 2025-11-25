package tn.esprit.tpfoyer.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.model.Chambre;
import tn.esprit.tpfoyer.model.TypeChambre;
import tn.esprit.tpfoyer.services.IChambreService;

import java.util.List;

@RestController
@RequestMapping("/chambreController")
@AllArgsConstructor
public class ChambreController {

    private final IChambreService chambreService;

    @PostMapping("/addChambre")
    public Chambre addChambre(@RequestBody Chambre chambre) {
        return chambreService.addOrUpdate(chambre);
    }

    @PutMapping("/updateChambre")
    public Chambre updateChambre(@RequestBody Chambre chambre) {
        return chambreService.addOrUpdate(chambre);
    }

    @DeleteMapping("/deleteChambre")
    public void deleteChambre(@RequestParam long idChambre) {
        chambreService.delete(idChambre);
    }

    @GetMapping("/findAllChambre")
    public List<Chambre> findAllChambre() {
        return chambreService.findAllChambre();
    }

    @GetMapping("/findChambreById")
    public Chambre findChambreById(@RequestParam long idChambre) {
        return chambreService.findById(idChambre);
    }

    @GetMapping("/findbynumero/{num}")
        public Chambre findbyNumeroChambre(@PathVariable int num) {
        return chambreService.findByNumeroChambre(num);
        }

        @PutMapping("/desafecterres/{idch}/{idres}")
    public Chambre desaffecterreservation(@PathVariable long idch, @PathVariable String idres) {
        return chambreService.desaffecterreservation(idch,idres);
        }

    @GetMapping("/getChambresByType/{type}")
    public List<Chambre> getChambresByType(@PathVariable TypeChambre type) {
        return chambreService.getChambresByType(type);
    }

}
