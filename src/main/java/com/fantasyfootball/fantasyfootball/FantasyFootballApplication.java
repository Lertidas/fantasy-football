package com.fantasyfootball.fantasyfootball;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude = {ErrorMvcAutoConfiguration.class})
@RestController
public class FantasyFootballApplication {

//	@GetMapping("/")
//	public String home() {
//		return "Welcome to the backend!";
//	}

	public static void main(String[] args) {
		SpringApplication.run(FantasyFootballApplication.class, args);
	}

}
