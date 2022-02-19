package com.SpringTutorial.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {

	public static void main(String[] args) {
		
ApplicationContext context = new ClassPathXmlApplicationContext("com/SpringTutorial/constructor/config.xml");
		
		Kids k = (Kids)context.getBean("kids");
		System.out.println(k);

	}

}
