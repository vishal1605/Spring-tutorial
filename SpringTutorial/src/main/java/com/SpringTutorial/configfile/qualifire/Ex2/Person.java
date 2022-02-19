package com.SpringTutorial.configfile.qualifire.Ex2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Person {
	
	@Autowired
	@Qualifier("car2")
	private Cars car;

	public Cars getCar() {
		return car;
	}

	public void setCar(Cars car) {
		this.car = car;
	}
	
	public void richPerson() {
		System.out.println("He has a lot of car collection");
		System.out.println(car);
	}

}
