package org.sid.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Class {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom_class;
    @OneToMany(mappedBy = "classEtudiant")
    private Set<Etudiant> etudiants;
    @ManyToOne
    private Section sectionClass;
}
