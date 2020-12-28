package org.sid.demo.dao;

import org.sid.demo.entities.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface SessionRepository  extends JpaRepository<Session,Long> {
}
