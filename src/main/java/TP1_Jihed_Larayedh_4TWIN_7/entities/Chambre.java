package TP1_Jihed_Larayedh_4TWIN_7.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idChambre;
    private long numeroChambre;
    private TypeChambre TypeC;
    @ManyToOne
    @JoinColumn(name = "idBloc")
    Bloc bloc;

    @OneToMany
    private Set<Reservation> reservations;


}
