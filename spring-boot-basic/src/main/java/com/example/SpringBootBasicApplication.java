package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.setter.Employee;

@SpringBootApplication
public class SpringBootBasicApplication  implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBasicApplication.class, args);
	}
@Autowired
ShapeFactory shapefactory;

@Autowired
Waiter waiter;
	
@Override
	public void run(String... args) throws Exception {
	shapeFactory.printArea("s",4,6);
	System.out.println();
	List<string> menus = waiter.viewMenus("i");
	for (String menu :menus) {
		System.out.println(menu);
	}
}
}
