package com.tutor.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OnlineTuApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineTuApplication.class, args);
		System.out.println("Server Started...");
	}

}
