package com.vinothtechie.JenkinsCiCdApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsCiCdApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsCiCdApplication.class, args);
	}

	@GetMapping("/greetings/{name}")
	public String greet(@PathVariable String name) {
		// Validate the name input
		// Vino Darshan Samy
		/*if (name == null || name.isEmpty()) {
			return "Hello Guest, please provide a valid name.";
		}
		if (name.length() > 20) {
			return "Hello Guest, name is too long. Please provide a name with less than 20 characters.";
		}
		if (!name.matches("[a-zA-Z ]+")) {
			return "Hello Guest, name should only contain alphabets and spaces.";
		}*/
		if (name.contains(" ")) {
			// Split the name by space and take the first part
			String[] parts = name.split(" ");
			name = parts[0];
		}
		return "Hello " + name + " Congratulations you have successfully completed Jenkins CI/CD Demo!";
	}

}
