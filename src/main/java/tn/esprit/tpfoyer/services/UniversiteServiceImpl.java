package tn.esprit.tpfoyer.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.model.Universite;
import tn.esprit.tpfoyer.repository.UniversiteRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class UniversiteServiceImpl implements IUniversiteService {

    private final UniversiteRepository universiteRepository;

    @Override
    public Universite addOrUpdate(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public void delete(long id) {
        universiteRepository.deleteById(id);
    }

    @Override
    public List<Universite> findAllUniversites() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite findById(long id) {
        return universiteRepository.findById(id).orElse(null);
    }

}
