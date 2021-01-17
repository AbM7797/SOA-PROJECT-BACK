package org.sid.demo;

import org.sid.demo.dao.EtudiantRepository;
import org.sid.demo.entities.Etudiant;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@EnableDiscoveryClient
@SpringBootApplication
public class ServiceEtudiantApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceEtudiantApplication.class, args);
    }

    /*@Bean
    CommandLineRunner start(EtudiantRepository etudiantRepository) {
        return args -> {
            Stream.of("A","B","C").forEach(e -> {
                etudiantRepository.save(new Etudiant(null,e,e+' '+e));
            });
            etudiantRepository.findAll().forEach(System.out::println);
        };
    }*/

}
