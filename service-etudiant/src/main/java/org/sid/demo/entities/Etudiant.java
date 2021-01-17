package org.sid.demo.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.rest.core.annotation.RestResource;

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
    private String adresse;
    private Number telephone;
    private String resultat;
    @ManyToOne
    private Session sessionEtudiant;

    @ManyToOne
    private Class classEtudiant;

    @OneToMany(mappedBy = "etudiantAbsence",cascade = CascadeType.ALL)
    private Set<Absence> absences;
}
