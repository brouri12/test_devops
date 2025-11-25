package tn.esprit.tpfoyer.model;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "etudiant")
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant;

    private String nomEt;
    private String prenomEt;
    private Long cin;
    private String ecole;
    private LocalDate dateNaissance;

    @OneToMany(mappedBy = "etudiant", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnoreProperties("etudiant")
    private List<Reservation> reservations = new ArrayList<>();

    // getters & setters
    public Long getIdEtudiant(){ return idEtudiant; }
    public void setIdEtudiant(Long id){ this.idEtudiant = id; }
    public String getNomEt(){ return nomEt; }
    public void setNomEt(String n){ this.nomEt = n; }
    public String getPrenomEt(){ return prenomEt; }
    public void setPrenomEt(String p){ this.prenomEt = p; }
    public Long getCin(){ return cin; }
    public void setCin(Long c){ this.cin = c; }
    public String getEcole(){ return ecole; }
    public void setEcole(String e){ this.ecole = e; }
    public LocalDate getDateNaissance(){ return dateNaissance; }
    public void setDateNaissance(LocalDate d){ this.dateNaissance = d; }
    public List<Reservation> getReservations(){ return reservations; }
    public void setReservations(List<Reservation> r){ this.reservations = r; }
}
