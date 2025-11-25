package tn.esprit.tpfoyer.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "foyer")
public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFoyer;

    private String nomFoyer;
    private Long capaciteFoyer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_universite")
    @JsonIgnore
    private Universite universite;

    @OneToMany(mappedBy = "foyer", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore

    private List<Bloc> blocs = new ArrayList<>();

    // getters & setters
    public Long getIdFoyer() { return idFoyer; }
    public void setIdFoyer(Long id) { this.idFoyer = id; }
    public String getNomFoyer() { return nomFoyer; }
    public void setNomFoyer(String n) { this.nomFoyer = n; }
    public Long getCapaciteFoyer() { return capaciteFoyer; }
    public void setCapaciteFoyer(Long c) { this.capaciteFoyer = c; }
    public Universite getUniversite() { return universite; }
    public void setUniversite(Universite u) { this.universite = u; }
    public List<Bloc> getBlocs() { return blocs; }
    public void setBlocs(List<Bloc> b) { this.blocs = b; }
}
