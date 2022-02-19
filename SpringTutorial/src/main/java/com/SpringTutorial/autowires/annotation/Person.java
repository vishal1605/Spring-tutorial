package com.SpringTutorial.autowires.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
	
	
	private Address address;

	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [address=" + address + "]";
	}
	
	@Autowired
	public Person(Address address) {
		super();
		this.address = address;
	}
	

	

}
