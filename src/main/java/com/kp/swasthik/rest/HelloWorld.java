package com.kp.swasthik.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello!! from Spring boot in Association with Openshift 3!!";
	}
	
}
