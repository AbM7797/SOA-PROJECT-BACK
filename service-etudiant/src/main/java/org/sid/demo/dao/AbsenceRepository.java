package org.sid.demo.dao;

import org.sid.demo.entities.Absence;
import org.sid.demo.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Collection;
import java.util.Date;
import java.util.List;


@RepositoryRestResource
public interface AbsenceRepository  extends JpaRepository<Absence,Long> {
    List<Absence> findByDateAbsence(@Param("dateAbsence")String dateAbsence);
    List<Absence> findByEtudiantAbsenceId(@Param("etudiant")Long etudiantAbsence);
    List<Absence> findByDateAbsenceAndEtudiantAbsenceIdAndMatiereAbsenceId(@Param("dateAbsence")String dateAbsence,@Param("etudiantAbsence")Long etudiantAbsenceId,@Param("matiereAbsence") Long matiereAbsenceId);
    long countAbsencesByMatiereAbsenceIdAndEtudiantAbsenceId(@Param("matiereId")Long matiereId,@Param("etudiantId")Long etudiantId);
    long countAbsencesByEtatAndMatiereAbsenceIdAndEtudiantAbsenceId(@Param("etat")String etat,@Param("matiereId")Long matiereId,@Param("etudiantId")Long etudiantId);
    long countAbsencesByEtatAndEtudiantAbsenceId(@Param("etat")String etat,@Param("etudiantId")Long etudiantId);
    @Query("select count(a) from Absence a,Matiere m,Etudiant e where a.matiereAbsence.id=m.id and a.etudiantAbsence.id = e.id and e.id=?1 and m.id=?2 and(a.etat='absent' or a.etat='present')")
    long countAllAbsencesByEtudiantIdAndMatiereId(@Param("etudiantId")Long etudiantId,@Param("matiereId")Long matiereId);
    List<Absence> findAllByEtudiantAbsenceId(@Param("etudiantId")Long etudiantId);

}
