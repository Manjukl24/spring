package com.spring.setter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	
private String state;
private String city;
public Address() {
	super();
	// TODO Auto-generated constructor stub
}
public Address(String state, String city) {
	super();
	this.state = state;
	this.city = city;
}
public String getState() {
	return state;
}
@Value("Kar")
public void setState(String state) {
	this.state = state;
}
public String getCity() {
	return city;
}
@Value("Ban")
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "Address [state=" + state + ", city=" + city + "]";
}

}
