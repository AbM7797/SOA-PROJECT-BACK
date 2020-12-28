package com.example.serviceenseignant.dao;

import com.example.serviceenseignant.entities.Enseignant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EnseignantRepository extends JpaRepository<Enseignant,Long> {
}
