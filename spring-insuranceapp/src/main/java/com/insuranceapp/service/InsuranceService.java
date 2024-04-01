package com.insuranceapp.service;

import java.util.List;

import com.insurance.exception.InsuranceNotFoundException;
import com.insuranceapp.model.Insurance;

public interface InsuranceService {
	
	void addInsurance(Insurance insurance);
	void updateInsurance(double premium,int insuranceId);
	void deleteInsurance(int insuranceId);
	List<Insurance> getAll();
	List<Insurance> getByBrand(String brand)throws InsuranceNotFoundException;
	List<Insurance> getByBrandAndType(String brand,String type)throws  InsuranceNotFoundException;
	List<Insurance> getByTypeAndLesserPremium(String type, double premium)throws InsuranceNotFoundException;
	com.insuranceapp.service.Insurance getById(int insuranceId);
	

}
