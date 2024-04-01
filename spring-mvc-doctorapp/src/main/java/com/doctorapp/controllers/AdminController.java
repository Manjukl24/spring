package com.doctorapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ch.qos.logback.core.model.Model;

@Controller
public class AdminController {
	
	@RequestMapping("admin")
	public String admin(Model model) {
		return "adminlogin";
	}
	@RequestMapping("login")
	public String login(@RequestParam("username") String username,@RequestParam("password") String password) {
if(username.equalsIgnoreCase("admin")&& password.equalsIgnoreCase("admin")) {
	return "admin";
}
    return "login";	
}
	@RequestMapping("add-doctor-form")
public String addDoctor (Model model) {
	return "addDoctor";
}
	@RequestMapping("edit-doctor-form")
public String editDoctor(Model model) {
	return "editDoctor";
	}
	@RequestMapping("delete-doctor-form")
public String deleteDoctor(Model model) {
	return "deleteDoctor";
}
}