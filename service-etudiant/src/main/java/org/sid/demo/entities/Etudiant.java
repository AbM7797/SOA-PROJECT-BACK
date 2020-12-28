package org.sid.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Etudiant {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    @ManyToOne
    private Session sessionEtudiant;
    @ManyToOne
    private Class classEtudiant;
    @OneToMany(mappedBy = "etudiantAbsence")
    private Set<Absence> absences;
}
