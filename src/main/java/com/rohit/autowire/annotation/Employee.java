package com.rohit.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	@Value("Rohit")
	private String name;
	
	@Autowired
	private Address address1;
	
	@Value("M")
	private String gender;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
//		System.out.println("Autowired");
		return address1;
	}
	public void setAddress(Address address) {
		this.address1 = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void displayInfo() {
		System.out.println("Name is: " + name);
		System.out.println("Gender is: " + gender);
		System.out.println("City: " + address1.getCity());
		System.out.println("State is: " + address1.getState());
	}
	
	
	
}
