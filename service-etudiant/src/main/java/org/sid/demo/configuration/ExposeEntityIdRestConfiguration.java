package org.sid.demo.configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.sid.demo.entities.*;
import org.sid.demo.entities.Class;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.ConversionService;

import org.springframework.data.geo.GeoModule;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

import org.springframework.hateoas.mediatype.MessageResolver;
import org.springframework.hateoas.mediatype.hal.CurieProvider;
import org.springframework.hateoas.mediatype.hal.HalConfiguration;
import org.springframework.hateoas.server.LinkRelationProvider;
import org.springframework.hateoas.server.mvc.RepresentationModelProcessorInvoker;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ExposeEntityIdRestConfiguration implements RepositoryRestConfigurer {
 @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(Matiere.class);
        config.exposeIdsFor(Section.class);
     config.exposeIdsFor(Class.class);
     config.exposeIdsFor(Etudiant.class);
     config.exposeIdsFor(Absence.class);

     config.exposeIdsFor(Session.class);



 }
}
