package com.santosh.springqualifier;

import com.santosh.springqualifier.service.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.santosh.springqualifier"})
public class Application implements CommandLineRunner {
	@Autowired
	@Qualifier("fulltime")
	private Project fulltimeProject;

	@Autowired
	@Qualifier("hourly")
	private Project hourlyProject;

	@Autowired
	@Qualifier("research")
	private Project researchProject;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		fulltimeProject.createProject("Ecommerce app",
				"This is a complete ecommerce solution for groceries items");
	}
}
