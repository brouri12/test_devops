package tn.esprit.tpfoyer.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.model.Bloc;
import tn.esprit.tpfoyer.model.Foyer;
import tn.esprit.tpfoyer.repository.BlocRepository;
import tn.esprit.tpfoyer.services.IBlocService;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping("/blocController")
@AllArgsConstructor
public class BlocController {

  final IBlocService blocService;

  @PostMapping("/addBloc")
  Bloc addBloc(@RequestBody Bloc bloc) {
    return blocService.addOrUpdate(bloc);

  }

  @PutMapping("/updateBloc")
  Bloc updateBloc(@RequestBody Bloc bloc) {
    return blocService.addOrUpdate(bloc);
  }

  @DeleteMapping("deleteBloc")
  void deleteBloc(@RequestParam long idbloc) {
    blocService.delete(idbloc);

  }

  @GetMapping("/findAllBloc")
  List<Bloc> findAllBloc() {
    return blocService.findAllBloc();
  }

  @PutMapping("affecterfoyer/{idbloc}/{idfoyer}")
  Bloc affecterbloctofoyer(@PathVariable long idbloc, @PathVariable long idfoyer) {
    return blocService.affecterbloctofoyer(idbloc, idfoyer);
  }
  @PutMapping("desafercterbloc/{idbloc}")
  Bloc desafercterbloc(@PathVariable long idbloc) {
    return blocService.desaffecterbloc(idbloc);
  }

  @GetMapping("/getBlocsNonAffectes")
  public List<Bloc> getBlocsNonAffectes() {
    return blocService.getBlocsNonAffectes();
  }

  @GetMapping("/getBlocsCapSup30")
  public List<Bloc> getBlocsCapSup30() {
    return blocService.getBlocsCapSup30();
  }

  @GetMapping("/getBlocsCommencentParA")
  public List<Bloc> getBlocsCommencentParA() {
    return blocService.getBlocsCommencentParA();
  }

  @GetMapping("/getBlocsAEtCapSup30")
  public List<Bloc> getBlocsAEtCapSup30() {
    return blocService.getBlocsAEtCapSup30();
  }

}

