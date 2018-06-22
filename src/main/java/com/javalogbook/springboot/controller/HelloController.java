package com.javalogbook.springboot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping(value = { "/", "/home" })
	public ResponseEntity<Object> helloSpringBoot() {
		return new ResponseEntity<Object>("Hello Spring Boot!", HttpStatus.OK);
	}
}
