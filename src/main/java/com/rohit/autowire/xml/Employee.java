package com.rohit.autowire.xml;

public class Employee {
	private String name;
	private Address address1;
	private String gender;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		System.out.println("Autowired");
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
	
	
	
}
