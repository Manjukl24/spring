package com.spring.constructor;

import org.springframework.stereotype.Component;

@Component
public class course {
	
	private String CoursetName;
	private String CoursetFees;
	public String getCoursetName() {
		return CoursetName;
	}
	public void setCoursetName(String coursetName) {
		CoursetName = coursetName;
	}
	public String getCoursetFees() {
		return CoursetFees;
	}
	public void setCoursetFees(String coursetFees) {
		CoursetFees = coursetFees;
	}
	@Override
	public String toString() {
		return "course [CoursetName=" + CoursetName + ", CoursetFees=" + CoursetFees + "]";
	}
	

}
