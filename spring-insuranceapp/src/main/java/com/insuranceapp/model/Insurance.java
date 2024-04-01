package com.insuranceapp.model;

public class Insurance {
	
	private Integer insuranceId;
	private Integer policyName;
	private Integer brand;
	private Integer type;
	private Integer duration;
	private Integer premium;
	public Integer getInsuranceId() {
		return insuranceId;
	}
	public void setInsuranceId(Integer insuranceId) {
		this.insuranceId = insuranceId;
	}
	public Integer getPolicyName() {
		return policyName;
	}
	public void setPolicyName(Integer policyName) {
		this.policyName = policyName;
	}
	public Integer getBrand() {
		return brand;
	}
	public void setBrand(Integer brand) {
		this.brand = brand;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	public Integer getPremium() {
		return premium;
	}
	public void setPremium(Integer premium) {
		this.premium = premium;
	}	

}
