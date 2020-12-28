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
public class Matiere {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String matiere;

    @OneToMany(mappedBy = "matiereAbsence")
    private Set<Absence> absences;

    @ManyToMany(mappedBy = "matiereSection")
    private Set<Section> sections;
}
