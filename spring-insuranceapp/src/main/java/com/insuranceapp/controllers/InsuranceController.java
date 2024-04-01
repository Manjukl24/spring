package com.insuranceapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insuranceapp.model.Insurance;

@RestController
public class InsuranceController {
	
@Autowired
IInsurancesServices insuranceService;

@GetMapping("/")
public String home() {
return "home";
}

@GetMapping("/insurances")
List<Insurance> showInsurance() {
	return insuranceService.getAll();
}

@GetMapping("/insurances/insurance-id/{insuranceId}")
Insurance getOne(@PathVariable("insuranceId") int insurance)
return insuranceService.getById(insuranceId);
}
}