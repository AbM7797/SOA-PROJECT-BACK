package org.sid.demo.dao;

import org.sid.demo.entities.Matiere;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface MatiereRepository extends JpaRepository<Matiere,Long> {
    List<Matiere> findAllBySectionsId(@Param("sectionId")Long sectionId);
    @Query("select count(m) from Matiere m")
    long countAllMatieres();

}
