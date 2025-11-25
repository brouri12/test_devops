package tn.esprit.tpfoyer.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="bloc")
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBloc;

    private String nomBloc;
    private Long capaciteBloc;

    @ManyToOne(fetch = FetchType.LAZY , cascade = CascadeType.ALL)
    @JoinColumn(name = "id_foyer")
    @JsonIgnoreProperties("blocs")
    private Foyer foyer;

    @OneToMany(mappedBy = "bloc", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<Chambre> chambres = new ArrayList<>();

    // getters & setters
    public Long getIdBloc() { return idBloc; }
    public void setIdBloc(Long id) { this.idBloc = id; }
    public String getNomBloc() { return nomBloc; }
    public void setNomBloc(String n) { this.nomBloc = n; }
    public Long getCapaciteBloc() { return capaciteBloc; }
    public void setCapaciteBloc(Long c) { this.capaciteBloc = c; }
    public Foyer getFoyer() { return foyer; }
    public void setFoyer(Foyer f) { this.foyer = f; }
    public List<Chambre> getChambres(){ return chambres; }
    public void setChambres(List<Chambre> c){ this.chambres = c; }
}
