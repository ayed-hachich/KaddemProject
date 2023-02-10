package tn.agena.dev.kaddem.entities;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private int idUniv;
    private String nomUniv;
    @OneToMany
    List<Departement> departements;
}
