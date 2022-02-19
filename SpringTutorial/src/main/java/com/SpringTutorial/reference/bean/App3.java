package com.SpringTutorial.reference.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App3 {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/SpringTutorial/reference/bean/config.xml");
		
		Distributer dis = (Distributer)context.getBean("distributer");
		System.out.println(dis);
		

	}

}
