package com.doctorapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import model.Doctor;

@Controller
public class DoctorController {
	@Autowired
   private  IDoctorService doctorService;
	
	@RequestMapping("/")
	public String home(Model model) {
		List<Doctor> doctors = doctorService.getAll();
		model.addAttribute("doctors", doctors);
		return "home";
	}
	
	@RequestMapping("/addDoctor")
	public String addDoctor(Doctor doctor,Model model) {
		System.out.println(doctor);
		doctorService.addDoctor(doctor);
		model.addAttribute("mesage","doctor added successfully");
		return "adminDash";
	}
	
	@RequestMapping("/editDoctor")
	public String editDoctor(@RequestParam("doctorId") int doctorId,Model model) {
		doctorService editDoctor.getById(doctorId);
	model.addAttribute("doctor",doctor);
		return "updateDoctorForm";
}
	@RequestMapping("/updateDoctor")
	public String updateDoctor(@RequestParam("doctorId") int doctorId,
			@RequestParam("fees") double fees,Model model) {
    doctorService updateDoctor(doctorId, fees);
	model.addAttribute("message","doctor update successfully");
		return "adminDash";
}
	
	@RequestMapping("/deleteDoctor")
	public String deleteDoctor(@RequestParam("doctorId") int doctorId,Model model){
	DoctorService.deletedoctor(doctorId);
	model.addAttribute("message","doctor deleted successfully");
		return "adminDash";
}
	
	@RequestMapping("/search")
	public String search(@RequestParam("choice") String choice,Model model) {
		List<Doctor> doctors = doctorService.getBySpeciality(Choice);
		model.addAttribute("doctors",doctors);
		return"home";
	}
	}
		