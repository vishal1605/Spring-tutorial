package com.SpringTutorial.configfile.qualifire.Ex1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Mediatek implements MobileProcessor {

	@Override
	public void processor() {
		System.out.println("World 2nd best processor");

	}

}
