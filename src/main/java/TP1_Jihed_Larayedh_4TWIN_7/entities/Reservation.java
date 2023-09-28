package TP1_Jihed_Larayedh_4TWIN_7.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
public class Reservation {
    @Id
    private String idReservation;
    private Date anneeUniverstitaire;
    private boolean estValide;
}
