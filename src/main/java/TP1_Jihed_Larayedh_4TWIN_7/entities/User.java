package TP1_Jihed_Larayedh_4TWIN_7.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;






@Getter
@Setter
@Entity
public class User {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    int id;
    private String name;
    private String email;
    private int age;
    private int tel;
}
