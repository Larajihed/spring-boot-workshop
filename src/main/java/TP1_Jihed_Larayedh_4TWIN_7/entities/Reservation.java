package TP1_Jihed_Larayedh_4TWIN_7.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

@Getter
@Setter
@Entity
public class Reservation {
    @Id
    private String idReservation;
    private Date anneeUniverstitaire;
    private boolean estValide;

    @ManyToMany
    private Set<Etudiant> etudiants;
}
