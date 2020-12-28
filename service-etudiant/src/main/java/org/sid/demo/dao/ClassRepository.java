package org.sid.demo.dao;

import org.sid.demo.entities.Class;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ClassRepository extends JpaRepository<Class,Long> {
}
