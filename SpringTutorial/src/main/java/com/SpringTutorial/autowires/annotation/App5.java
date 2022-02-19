package com.SpringTutorial.autowires.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App5 {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/SpringTutorial/autowires/annotation/config.xml");
		Person p = (Person)context.getBean("person");
		System.out.println(p);
		

	}

}
