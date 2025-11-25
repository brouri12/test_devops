package tn.esprit.tpfoyer.repository;

import tn.esprit.tpfoyer.model.Bloc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlocRepository extends JpaRepository<Bloc, Long> {

    List<Bloc> findByFoyerIsNull();

    // 2️⃣ Blocs avec capacité > 30
    List<Bloc> findByCapaciteBlocGreaterThan(Long capacite);

    // 3️⃣ Blocs dont le nom commence par 'A'
    List<Bloc> findByNomBlocStartingWithA();

    // 4️⃣ Blocs nom commençant par 'A' ET capacité > 30
    List<Bloc> findByNomBlocStartingWithAAndCapaciteBlocGreaterThan30();

}
