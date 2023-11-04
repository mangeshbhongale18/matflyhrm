package com.project.matflyhrm;

import java.io.IOException;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.scheduling.annotation.EnableScheduling;




@SpringBootApplication
@EnableScheduling
public class MatflyHrmApplication {

	
	 
	
	public static void main(String[] args) {
		SpringApplication.run(MatflyHrmApplication.class, args);
	}
	
	
	
}
