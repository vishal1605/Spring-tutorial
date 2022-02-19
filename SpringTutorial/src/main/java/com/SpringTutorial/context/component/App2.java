package com.SpringTutorial.context.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/SpringTutorial/context/component/config.xml");
		Car car=(Car)context.getBean("car");
		car.setMyName("Vishal");
		car.setColName("Dilkap Colg");
		System.out.println(car);
		car.drive();
	}

}
