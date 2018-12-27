package com.oauthjwt.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan({"com.oauthjwt.api", "com.oauthjwt.api.controller"})
@EnableJpaRepositories("com.oauthjwt.api.repository")
@EntityScan("com.oauthjwt.api.domain.entity")
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class ApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}
}

