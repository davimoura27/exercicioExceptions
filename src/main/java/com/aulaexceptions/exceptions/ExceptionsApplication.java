package com.aulaexceptions.exceptions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExceptionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExceptionsApplication.class, args);

		 Menu.menu();
		// Divisaodoisnumeros.divisaodoisnumeros();
	}

}
