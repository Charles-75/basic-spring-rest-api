package com.asi.spring_rest_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.persistence.Entity;

@EnableAutoConfiguration
@EntityScan(basePackages = "com.asi.model")
@ComponentScan(basePackages = "com.asi.controller")
@EnableJpaRepositories(basePackages = "com.asi.repository")
@EnableWebMvc
@Configuration

public class SpringRestServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringRestServiceApplication.class, args);
    }

}
