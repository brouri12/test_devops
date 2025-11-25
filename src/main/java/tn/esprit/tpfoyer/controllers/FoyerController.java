package tn.esprit.tpfoyer.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.model.Foyer;
import tn.esprit.tpfoyer.services.IFoyerService;

import java.util.List;

@RestController
@RequestMapping("/foyerController")
@AllArgsConstructor
public class FoyerController {

    private final IFoyerService foyerService;

    @PostMapping("/addFoyer")
    public Foyer addFoyer(@RequestBody Foyer foyer) {
        return foyerService.addOrUpdate(foyer);
    }

    @PutMapping("/updateFoyer")
    public Foyer updateFoyer(@RequestBody Foyer foyer) {
        return foyerService.addOrUpdate(foyer);
    }

    @DeleteMapping("/deleteFoyer")
    public void deleteFoyer(@RequestParam long idFoyer) {
        foyerService.delete(idFoyer);
    }

    @GetMapping("/findAllFoyers")
    public List<Foyer> findAllFoyers() {
        return foyerService.findAllFoyers();
    }

    @GetMapping("/findFoyerById")
    public Foyer findFoyerById(@RequestParam long idFoyer) {
        return foyerService.findById(idFoyer);
    }


}
