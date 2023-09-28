package TP1_Jihed_Larayedh_4TWIN_7.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Foyer {
    @Id
    private int idFoyer;
    private String nomFoyer;
    private long capaciteFoter;
}
