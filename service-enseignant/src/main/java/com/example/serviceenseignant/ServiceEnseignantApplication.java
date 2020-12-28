package com.example.serviceenseignant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient

@SpringBootApplication
public class ServiceEnseignantApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceEnseignantApplication.class, args);
    }

}
