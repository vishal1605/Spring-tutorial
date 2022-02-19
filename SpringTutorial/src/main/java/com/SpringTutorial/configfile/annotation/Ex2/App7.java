package com.SpringTutorial.configfile.annotation.Ex2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App7 {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigFile.class);
		Samsung phone = (Samsung)context.getBean(Samsung.class);
		phone.function();

	}

}
