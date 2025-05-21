package com.example.online_pharmacy_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
	info = @Info(
		title = "App Name",
		version = "1.1.3",
		description = "App description",
		contact = @Contact(
			name = "jeee",
			email = "jeee@gmail.com"
		)
	)
)
@SpringBootApplication
public class OnlinePharmacyBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlinePharmacyBackendApplication.class, args);
	}
}
