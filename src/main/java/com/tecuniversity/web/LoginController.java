package com.tecuniversity.web;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tecuniversity.model.Credentials;

@RestController
@RequestMapping("/home")
public class LoginController {

	Logger logger = LoggerFactory.getLogger(LoginController.class);	
	
	@PostMapping("/login")
	public ResponseEntity<Credentials> login(@RequestBody Credentials param) {

		System.out.println("bateu aqui ");

		return new ResponseEntity<Credentials>(param, HttpStatus.OK);
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "MATEUS COSTA DOS SANTOS";
	}
	
	public void encode() {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String encoded = new BCryptPasswordEncoder().encode("teste");
		String teste = "teste";
		encoder.matches(teste, encoded);
		System.out.println(encoded);
	}
}
