package com.security.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class GreetController {
	
	@GetMapping("/greet")
public String greet() {
		return "Have a good day";	
		}

@GetMapping("/user/books/show")
public List<String> showBooks()  {
	return Arrays.asList("java","Vb");
}

@GetMapping("/admin/books/in")
public String addBooks() {
	return "added";
}
}