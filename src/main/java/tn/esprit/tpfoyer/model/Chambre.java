package tn.esprit.tpfoyer.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="chambre")
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChambre;

    private Long numeroChambre;

    @Enumerated(EnumType.STRING)
    private TypeChambre typeC;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_bloc")
    @JsonIgnore
    private Bloc bloc;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Reservation> reservations = new ArrayList<>();

    // getters & setters
    public Long getIdChambre(){ return idChambre; }
    public void setIdChambre(Long id){ this.idChambre = id; }
    public Long getNumeroChambre(){ return numeroChambre; }
    public void setNumeroChambre(Long n){ this.numeroChambre = n; }
    public TypeChambre getTypeC(){ return typeC; }
    public void setTypeC(TypeChambre t){ this.typeC = t; }
    public Bloc getBloc(){ return bloc; }
    public void setBloc(Bloc b){ this.bloc = b; }
    public List<Reservation> getReservations(){ return reservations; }
    public void setReservations(List<Reservation> r){ this.reservations = r; }

}
