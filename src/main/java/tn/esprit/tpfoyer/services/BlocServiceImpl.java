package tn.esprit.tpfoyer.services;

import lombok.AllArgsConstructor;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.model.Bloc;
import tn.esprit.tpfoyer.model.Foyer;
import tn.esprit.tpfoyer.repository.BlocRepository;
import tn.esprit.tpfoyer.repository.FoyerRepository;

import java.util.List;
import java.util.Optional;

import static org.apache.coyote.http11.Constants.a;

@Service
@AllArgsConstructor
public class BlocServiceImpl implements IBlocService {

    private final BlocRepository blocRepository;
    private final FoyerRepository foyerRepository;

    @Override
    public Bloc addOrUpdate(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public void delete(long id) {
        blocRepository.deleteById(id);
    }

    @Override
    public List<Bloc> findAllBloc() {
        return blocRepository.findAll();
    }

    @Override
    public Bloc findById(long id) {
        return blocRepository.findById(id).orElse(null);
    }

    public Bloc affecterbloctofoyer( long idbloc,long idfoyer ) {
        Foyer f = foyerRepository.findById(idfoyer).get();
        Bloc bloc = blocRepository.findById(idbloc).get();
        bloc.setFoyer(f);
        return blocRepository.save(bloc);
    }
    public Bloc desaffecterbloc( long idbloc ) {
        Bloc bloc = blocRepository.findById(idbloc).get();
        bloc.setFoyer(null);
        return blocRepository.save(bloc);
    }

    public List<Bloc> getBlocsNonAffectes() {
        return blocRepository.findByFoyerIsNull();
    }

    public List<Bloc> getBlocsCapSup30() {
        return blocRepository.findByCapaciteBlocGreaterThan(30L);
    }

    public List<Bloc> getBlocsCommencentParA() {
        return blocRepository.findByNomBlocStartingWithA();
    }

    public List<Bloc> getBlocsAEtCapSup30() {
        return blocRepository.findByNomBlocStartingWithAAndCapaciteBlocGreaterThan30();
    }

}
