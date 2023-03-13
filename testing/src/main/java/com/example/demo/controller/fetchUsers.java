package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class fetchUsers {

	@GetMapping
	public ResponseEntity<String> getUser(){
		return ResponseEntity.ok("working");
	}
	
}
