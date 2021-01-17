package com.example.servicecadresadmin.dao;

import com.example.servicecadresadmin.entities.CadreAdmin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CadreAdminRepository extends JpaRepository<CadreAdmin,Long> {
    @Query("select count(c) from CadreAdmin c")
    long countAllCadreAdmins();
}
