package com.SpringTutorial.configfile.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App6 {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Student stud = (Student)context.getBean(Student.class);
		stud.homeWork();

	}

}
