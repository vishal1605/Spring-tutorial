package com.SpringTutorial.configfile.annotation.Ex3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("student")
public class Student1 {
	
	@Autowired
	Student2 person;
	
	public Student2 getPerson() {
		return person;
	}


	public void setPerson(Student2 person) {
		this.person = person;
	}


	public void talent() {
		System.out.println("Arjun can fly");
		person.talent();
	}

}
