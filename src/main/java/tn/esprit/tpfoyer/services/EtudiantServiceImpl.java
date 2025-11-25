package tn.esprit.tpfoyer.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.model.Etudiant;
import tn.esprit.tpfoyer.repository.EtudiantRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class EtudiantServiceImpl implements IEtudiantService {

    private final EtudiantRepository etudiantRepository;

    @Override
    public Etudiant addOrUpdate(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public void delete(long id) {
        etudiantRepository.deleteById(id);
    }

    @Override
    public List<Etudiant> findAllEtudiants() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant findById(long id) {
        return etudiantRepository.findById(id).orElse(null);
    }
}
