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
		return "Hello " + name + " Congratulations you have successfully completed Jenkins CI/CD Demo!";
	}

}
