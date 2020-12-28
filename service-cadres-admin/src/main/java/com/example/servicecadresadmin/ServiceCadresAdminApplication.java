package com.example.servicecadresadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ServiceCadresAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceCadresAdminApplication.class, args);
    }

}
