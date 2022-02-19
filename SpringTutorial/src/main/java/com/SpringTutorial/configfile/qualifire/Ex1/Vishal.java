package com.SpringTutorial.configfile.qualifire.Ex1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Vishal {
	
	@Autowired
	@Qualifier("mediatek")
	MobileProcessor pro;
	
	public MobileProcessor getPro() {
		return pro;
	}

	public void setPro(MobileProcessor pro) {
		this.pro = pro;
	}

	public void useMobile() {
		System.out.println("Vishal use Best Mobile with processor");
		pro.processor();
	}

}
