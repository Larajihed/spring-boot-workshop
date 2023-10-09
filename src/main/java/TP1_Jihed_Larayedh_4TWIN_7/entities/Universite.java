package TP1_Jihed_Larayedh_4TWIN_7.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Universite implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    Long idUniversite;

    String nomUniversite;
    String adresse;


    @OneToOne
    @JoinColumn(name = "idFoyer")
    Foyer foyer;

}