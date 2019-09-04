package com.tecuniversity.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tecuniversity.model.Credentials;

@RestController
@RequestMapping("/matricula")
public class MatriculaController {
	
	@PostMapping("/criaUsuario")
	public ResponseEntity<Credentials> login(@RequestBody Credentials param) {

		System.out.println("bateu aqui ");

		return new ResponseEntity<Credentials>(param, HttpStatus.OK);
	}

}
