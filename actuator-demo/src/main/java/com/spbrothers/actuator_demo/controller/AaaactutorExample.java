package com.spbrothers.actuator_demo.controller;

import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/actuatorexample")
public class AaaactutorExample {
	
	@GetMapping("/")
	public ResponseEntity<String> getDemoMesage(){
		return ResponseEntity.ok().body("Hi all Good...!");
	}

	
	
}
