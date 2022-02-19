package com.SpringTutorial.configfile.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration   //indicate this is Configuration file
public class AppConfig {
	
	@Bean
	public Student getWork() {
		return new Student();
	}

}
