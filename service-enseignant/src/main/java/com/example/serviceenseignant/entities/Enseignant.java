package com.example.serviceenseignant.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Enseignant {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private String adresse;
    private Number telephone;

    @OneToMany(mappedBy = "refClass",cascade = CascadeType.ALL)
    private List<EnseignantIdClass> enseignantIdClasses;

    private Long idMatiere;
}
