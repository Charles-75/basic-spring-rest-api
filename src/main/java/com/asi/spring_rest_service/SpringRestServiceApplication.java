package com.asi.spring_rest_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.Entity;

@SpringBootApplication
@EntityScan(basePackages = "com.asi.model")
@ComponentScan(basePackages = "com.asi.controller")
@EnableJpaRepositories(basePackages = "com.asi.repository")

public class SpringRestServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringRestServiceApplication.class, args);
    }

}
