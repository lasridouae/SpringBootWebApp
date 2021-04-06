package com.webaap.SpringWebApp.Controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users") //url Mentionner
public class homeController {
	
	@GetMapping
	public String getUser() {
		return "get user ";
	}
	
	@PostMapping
	public String createUser() {
		return "create user ";
	}
	
	@PutMapping
	public String updateUser() {
		return "update user ";
	}
	
	@DeleteMapping
	public String deleteUser() {
		return "delete user  ";
	}

}
