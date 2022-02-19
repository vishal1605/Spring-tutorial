package com.SpringTutorial.configfile.qualifire.Ex1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App9 {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigFile.class);
		Vishal gptt = (Vishal)context.getBean("vishal");
		gptt.useMobile();

	}

}
