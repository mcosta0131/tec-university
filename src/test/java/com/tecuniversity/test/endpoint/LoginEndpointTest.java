package com.tecuniversity.test.endpoint;


import org.springframework.http.ResponseEntity;

import com.tecuniversity.model.Credentials;
import com.tecuniversity.web.LoginController;

import junit.framework.TestCase;

public class LoginEndpointTest extends TestCase{
	Credentials login = new Credentials();
	
	protected void setUp() {
		login.setSenha("123");
		login.setUsuario(31L);
	}
	
	public void testLogin() {
		
		LoginController loginEndpointTest = new LoginController();
		ResponseEntity<Credentials> reponse =  loginEndpointTest.login(login);
		
		System.out.println(reponse.toString());
		
	}
	
}
