package com.greetapp.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {
	@GetMapping("/home")
	public String greetMessage() {
		return "Greet page";
	}

	@GetMapping("/say-hello/{uname}")
	public String sayHello(@PathVariable("uname") String username) {
		return "Hello " + username;
	}

	@GetMapping("/show-user-details")
	public String sayhello(@RequestParam("uname") String username, @RequestParam("city") String city) {
		return "Welcome to " + city + "," + username;
	}

	@GetMapping("/show-courses")
	public List<String> showcases() {
		return Arrays.asList("java","Vb","DBMS");
	}
}