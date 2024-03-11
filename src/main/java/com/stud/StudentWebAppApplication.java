package com.stud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentWebAppApplication {
	private static final Logger LOGGER =
			LoggerFactory.getLogger(StudentWebAppApplication.class);

	public static void main(String[] args) {
		LOGGER.info("Starts the StudentWebAppApplication...");
		SpringApplication.run(StudentWebAppApplication.class, args);
	}

}
