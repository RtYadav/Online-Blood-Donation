package com.example.arati;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class AratiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AratiApplication.class, args);
	}

}
