package com.ibm.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.entity.User;
import com.ibm.pojo.Login;
import com.ibm.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService service;
	
	@PostMapping(value = "/user", consumes = "application/json")
	public String addUser(@RequestBody User user) {
		int id = service.addUser(user);
		return "User added with Id: " + id;
	}
	
	@GetMapping(value = "/login", produces = "application/json")
	public ResponseEntity<?> validate(@RequestParam String email, @RequestParam String password) {
		Login login = new Login();
		login.setEmail(email);
		login.setPassword(password);
		try {
			User user = service.authenticate(login);
			return new ResponseEntity<User>(user, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>("Invalid Email or Password", HttpStatus.NOT_FOUND);
		}
	}
}
