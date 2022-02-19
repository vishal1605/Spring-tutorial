package com.SpringTutorial.configfile.annotation.Ex2;

import org.springframework.beans.factory.annotation.Autowired;

public class Samsung {
	
	@Autowired
	ApplePhone iphone;
	public ApplePhone getIphone() {
		return iphone;
	}


	public void setIphone(ApplePhone iphone) {
		this.iphone = iphone;
	}


	public void function() {
		System.out.println("There is new Floating window function");
		iphone.function();
	}

}
