package com.SpringTutorial.configfile.annotation.Ex3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App8 {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigFile.class);
		Student1 stud = (Student1)context.getBean("student");
		stud.talent();

	}

}
