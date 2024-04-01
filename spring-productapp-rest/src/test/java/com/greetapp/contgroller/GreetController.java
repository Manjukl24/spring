package com.greetapp.contgroller;

import java.util.List;

import org.assertj.core.util.Arrays;
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
	public String sayHello(@PathVariable("uname") String username){
		return "Hello" + username;
	}
//	}
//	@GetMapping("/say-hello/{uname}")
//	public String sayhello(@RequestParam("uname") String usernsme) {
//		return "Welcome to " + city +","+username;;
//}
//	@GetMapping("/show-courses")
//	public List<String> showcases() {
//		return Arrays.asList("java","Vb","DBMS")
}
