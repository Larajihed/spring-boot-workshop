package TP1_Jihed_Larayedh_4TWIN_7.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Chambre {
    @Id
    private long idChambre;
    private long numeroChambre;
    private TypeChambre TypeC;
}
