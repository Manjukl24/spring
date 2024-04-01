package com.insuranceapp.exceptions;

public class InsuranceNotFoundException extends RuntimeException {

	public InsuranceNotFoundException() {
		super();
	}

	public InsuranceNotFoundException(String message) {
		super(message);
	}

}