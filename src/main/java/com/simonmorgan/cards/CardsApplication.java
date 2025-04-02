package com.simonmorgan.cards;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Cards microservices REST API Documentation",
				description = "Cards API microservice for banking system",
				version = "v1",
				contact = @Contact(
						name = "Simon Morgan",
						email = "simonmakessound@gmail.com",
						url = "https://github.com/Simizzle"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://github.com/Simizzle"
				)
		)
)
public class CardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardsApplication.class, args);
	}

}
