package com.ibm.sample;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableOAuth2Sso
@RestController
public class Oauth2oktaSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(Oauth2oktaSampleApplication.class, args);
	}
@GetMapping("/")
public String getLogin(Principal principle) {
	
	return "Welcome " +principle.getName()+ "!! You Successfully Login to system";
	
}
}
