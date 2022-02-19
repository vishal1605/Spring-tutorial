package com.SpringTutorial.starter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/SpringTutorial/starter/coreconfig.xml");
		
		Student s = (Student)context.getBean("student");
		System.out.println(s);

	}

}
