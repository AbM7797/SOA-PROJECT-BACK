package org.sid.demo.dao;

import org.sid.demo.entities.Class;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@RepositoryRestResource
public interface ClassRepository extends JpaRepository<Class,Long> {
    long countClassesBySectionClassId(@Param("sectionId")Long sectionId);
    @Query("select count(c) from Class c")
    long countAllClasses();
    @Query("select distinct c From Class c,Etudiant e,Session s where c.id=e.classEtudiant.id and s.id=e.sessionEtudiant.id and s.id= ?1")
    List<Class> findClassesBySession(@Param("idSession")Long idSession);
    @Query("select count(distinct c) from Class c,Etudiant e,Session s where c.id=e.classEtudiant.id and s.id=e.sessionEtudiant.id and s.id= ?1")
    long countClassesBySession(@Param("idSession")Long idSession);
}
