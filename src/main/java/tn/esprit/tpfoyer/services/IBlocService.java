
package tn.esprit.tpfoyer.services;

import tn.esprit.tpfoyer.model.Bloc;
import tn.esprit.tpfoyer.model.Foyer;

import java.util.List;
import java.util.Optional;

public interface IBlocService {
    Bloc addOrUpdate(Bloc bloc);
    void delete(long id);
    List<Bloc> findAllBloc();
    Bloc findById(long id);
    public Bloc affecterbloctofoyer( long idfoyer,long idbloc );
    public Bloc desaffecterbloc( long idbloc );
    List<Bloc> getBlocsNonAffectes();
    List<Bloc> getBlocsCapSup30();
    List<Bloc> getBlocsCommencentParA();
    List<Bloc> getBlocsAEtCapSup30();
}
