package TP1_Jihed_Larayedh_4TWIN_7.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
public class Foyer {
    @Id
    private int idFoyer;
    private String nomFoyer;
    private long capaciteFoter;
    @OneToOne(mappedBy = "Foyer")
    private Universite universite;
    // SI MAX = MANY then use sets else use Attribute
    @OneToMany
    private Set<Bloc> Blocs;

}
