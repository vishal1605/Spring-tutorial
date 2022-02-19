package com.SpringTutorial.configfile.annotation.Ex2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigFile {
	
	@Bean
	public Samsung getConfig() {
		return new Samsung();
	}
	
	@Bean
	public ApplePhone newFunction() {
		return new ApplePhone();
	}

}
