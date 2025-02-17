package org.sid.demo.dao;

import org.sid.demo.entities.Section;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface SectionRepository  extends JpaRepository<Section,Long> {
    @Query("select count(s) from Section s")
    long countAllSections();
}
