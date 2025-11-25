package tn.esprit.tpfoyer.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.model.Universite;
import tn.esprit.tpfoyer.services.IUniversiteService;

import java.util.List;

@RestController
@RequestMapping("/universiteController")
@AllArgsConstructor
public class UniversiteController {

    private final IUniversiteService universiteService;

    @PostMapping("/addUniversite")
    public Universite addUniversite(@RequestBody Universite universite) {
        return universiteService.addOrUpdate(universite);
    }

    @PutMapping("/updateUniversite")
    public Universite updateUniversite(@RequestBody Universite universite) {
        return universiteService.addOrUpdate(universite);
    }

    @DeleteMapping("/deleteUniversite")
    public void deleteUniversite(@RequestParam long idUniversite) {
        universiteService.delete(idUniversite);
    }

    @GetMapping("/findAllUniversites")
    public List<Universite> findAllUniversites() {
        return universiteService.findAllUniversites();
    }

    @GetMapping("/findUniversiteById")
    public Universite findUniversiteById(@RequestParam long idUniversite) {
        return universiteService.findById(idUniversite);
    }
}
