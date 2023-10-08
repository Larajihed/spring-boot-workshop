package TP1_Jihed_Larayedh_4TWIN_7.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
public class Bloc {
    @Id
    private long idBloc;
    private String nomBloc;
    private long capaciteBloc;

    @OneToMany(mappedBy = "bloc")
    private Set<Chambre> chambres;



}
