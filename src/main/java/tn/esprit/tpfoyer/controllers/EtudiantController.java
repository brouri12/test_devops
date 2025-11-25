package tn.esprit.tpfoyer.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.model.Etudiant;
import tn.esprit.tpfoyer.services.IEtudiantService;

import java.util.List;

@RestController
@RequestMapping("/etudiantController")
@AllArgsConstructor
public class EtudiantController {

    private final IEtudiantService etudiantService;

    @PostMapping("/addEtudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantService.addOrUpdate(etudiant);
    }

    @PutMapping("/updateEtudiant")
    public Etudiant updateEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantService.addOrUpdate(etudiant);
    }

    @DeleteMapping("/deleteEtudiant")
    public void deleteEtudiant(@RequestParam long idEtudiant) {
        etudiantService.delete(idEtudiant);
    }

    @GetMapping("/findAllEtudiants")
    public List<Etudiant> findAllEtudiants() {
        return etudiantService.findAllEtudiants();
    }

    @GetMapping("/findEtudiantById")
    public Etudiant findEtudiantById(@RequestParam long idEtudiant) {
        return etudiantService.findById(idEtudiant);
    }
}
