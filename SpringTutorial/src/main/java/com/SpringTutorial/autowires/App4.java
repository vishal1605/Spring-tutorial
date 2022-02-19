package com.SpringTutorial.autowires;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App4 {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/SpringTutorial/autowires/config.xml");
		
		Shop shop = (Shop)context.getBean("shop");
		System.out.println(shop);

	}

}
