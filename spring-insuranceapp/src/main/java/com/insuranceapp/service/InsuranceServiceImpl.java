package com.insuranceapp.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.insuranceapp.model.Insurance;
@Service
public class InsuranceServiceImpl implements InsuranceService {
	
	public List<Insurance> getAll() {
		return null;
	}
	@Override
public com.insuranceapp.service.Insurance getById(int insuranceId) {
		List<Insurance> insurances = getAllInsurance();
		for(Insurance insurance :insurances) {
			if(insurance.getInsuranceId(==insurance));
		}
	return null;
}
private List<Insurance> getAllInsurance() {
	return 	Arrays.asList(
			new Insurance(101,"vo-hoo1", "voya","health",10,1000)),
			new Insurance(102,"vo-hoo1", "voya","health",10,2000)),
            new Insurance(103,"vo-hoo1", "voya","health",10,3000)),
            new Insurance(104,"vo-hoo1", "voya","health",10,4000)),
);
}
@Override
public void addInsurance(Insurance insurance) {
	// TODO Auto-generated method stub
	
}
@Override
public void updateInsurance(double premium, int insuranceId) {
	// TODO Auto-generated method stub
	
}
@Override
public void deleteInsurance(int insuranceId) {
	// TODO Auto-generated method stub
	
}
@Override
public List<Insurance> getByBrand(String brand) throws InsuranceNotFoundException {
	// TODO Auto-generated method stub
	return null;
}
@Override
public List<Insurance> getByBrandAndType(String brand, String type) throws InsuranceNotFoundException {
	// TODO Auto-generated method stub
	return null;
}
@Override
public List<Insurance> getByTypeAndLesserPremium(String type, double premium) throws InsuranceNotFoundException {
	// TODO Auto-generated method stub
	return null;
}
}
