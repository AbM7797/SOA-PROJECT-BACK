package com.example.serviceenseignant.configuration;

import com.example.serviceenseignant.entities.Enseignant;
import com.example.serviceenseignant.entities.EnseignantIdClass;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.stereotype.Component;

@Component
public class ExposeEntityIdRestConfiguration implements RepositoryRestConfigurer {
 @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
       config.exposeIdsFor(Enseignant.class);
       config.exposeIdsFor(EnseignantIdClass.class);
 }
}
