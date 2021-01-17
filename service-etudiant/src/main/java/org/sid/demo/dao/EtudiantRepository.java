package org.sid.demo.dao;

import org.sid.demo.entities.Class;
import org.sid.demo.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.core.parameters.P;

import java.util.List;

@RepositoryRestResource
public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {

    long countEtudiantsBySessionEtudiantId(@Param("idSession")Long id);
    long countEtudiantsByClassEtudiantIdAndSessionEtudiantId(@Param("classId")Long classId,@Param("sessionId")Long sessionId);
    long countEtudiantsByResultatAndSessionEtudiantIdAndClassEtudiantId(@Param("resultat")String resultat,@Param("sessionId")Long sessionId,@Param("classId")Long classId);
    long countEtudiantsByResultatAndSessionEtudiantId(@Param("resultat")String resultat,@Param("sessionId")Long sessionId);

    @Query("Select count(e) from Etudiant e")
    long countAllEtudiants();
    List<Etudiant> findBySessionEtudiantIdAndClassEtudiantId(@Param("sessionId")Long sessionId,@Param("classId")Long classId);
    List<Etudiant> findBySessionEtudiantId(@Param("sessionId")Long sessionId);

}
