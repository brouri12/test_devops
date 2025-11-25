package tn.esprit.tpfoyer.services;

import lombok.AllArgsConstructor;
import org.springdoc.core.service.RequestBodyService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import tn.esprit.tpfoyer.model.Bloc;
import tn.esprit.tpfoyer.model.Foyer;
import tn.esprit.tpfoyer.repository.BlocRepository;
import tn.esprit.tpfoyer.repository.FoyerRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class FoyerServiceImpl implements IFoyerService {

    private final FoyerRepository foyerRepository;
    private final RequestBodyService requestBodyBuilder;
    private final BlocRepository blocRepository;

    @Override
    public Foyer addOrUpdate(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    @Override
    public void delete(long id) {
        foyerRepository.deleteById(id);
    }

    @Override
    public List<Foyer> findAllFoyers() {
        return foyerRepository.findAll();
    }

    @Override
    public Foyer findById(long id) {
        return foyerRepository.findById(id).orElse(null);
    }



}
