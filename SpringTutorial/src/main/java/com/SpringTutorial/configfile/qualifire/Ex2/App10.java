package com.SpringTutorial.configfile.qualifire.Ex2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App10 {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/SpringTutorial/configfile/qualifire/Ex2/Config.xml");
		Person p = (Person)context.getBean("person");
		p.richPerson();

	}

}
