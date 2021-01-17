package com.example.serviceenseignant.dao;

import com.example.serviceenseignant.entities.EnseignantIdClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EnseignantIdClassRepository  extends JpaRepository<EnseignantIdClass,Long> {
}
