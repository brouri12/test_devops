package tn.esprit.tpfoyer.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.UUID;

@Entity
@Table(name = "reservation")
public class Reservation {
    @Id
    private String idReservation;

    private String anneeUniversitaire;
    private boolean estValide;



    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_etudiant")
    @JsonIgnoreProperties("reservations")
    @JsonIgnore
    private Etudiant etudiant;

    @PrePersist
    public void prePersist() {
        if (idReservation == null || idReservation.isBlank()) {
            idReservation = UUID.randomUUID().toString();
        }
    }

    // getters & setters
    public String getIdReservation(){ return idReservation; }
    public void setIdReservation(String id){ this.idReservation = id; }
    public String getAnneeUniversitaire(){ return anneeUniversitaire; }
    public void setAnneeUniversitaire(String a){ this.anneeUniversitaire = a; }
    public boolean isEstValide(){ return estValide; }
    public void setEstValide(boolean v){ this.estValide = v; }

    public Etudiant getEtudiant(){ return etudiant; }
    public void setEtudiant(Etudiant e){ this.etudiant = e; }
}
