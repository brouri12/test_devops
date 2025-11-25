package tn.esprit.tpfoyer.model;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "university")
public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUniversite;

    private String nomUniversite;
    private String adresse;

    @OneToMany(mappedBy = "universite", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnoreProperties("universite")
    private List<Foyer> foyers = new ArrayList<>();

    // getters & setters
    public Long getIdUniversite(){ return idUniversite; }
    public void setIdUniversite(Long id){ this.idUniversite = id; }
    public String getNomUniversite(){ return nomUniversite;}
    public void setNomUniversite(String n){ this.nomUniversite = n; }
    public String getAdresse(){ return adresse;}
    public void setAdresse(String a){ this.adresse = a; }
    public List<Foyer> getFoyers(){ return foyers; }
    public void setFoyers(List<Foyer> f){ this.foyers = f; }
}
