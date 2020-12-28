package org.sid.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Section {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String section;

    @ManyToMany
    private Set<Matiere> matiereSection;

    @OneToMany(mappedBy = "sectionClass")
    private Set<Class> classes;
}
