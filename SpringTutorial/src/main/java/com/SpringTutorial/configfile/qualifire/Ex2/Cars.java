package com.SpringTutorial.configfile.qualifire.Ex2;

import org.springframework.stereotype.Component;

public class Cars {
	
	private String firstCar;
	private String seconfCar;
	private String thirdtCar;
	public String getFirstCar() {
		return firstCar;
	}
	public void setFirstCar(String firstCar) {
		this.firstCar = firstCar;
	}
	public String getSeconfCar() {
		return seconfCar;
	}
	public void setSeconfCar(String seconfCar) {
		this.seconfCar = seconfCar;
	}
	public String getThirdtCar() {
		return thirdtCar;
	}
	public void setThirdtCar(String thirdtCar) {
		this.thirdtCar = thirdtCar;
	}
	@Override
	public String toString() {
		return "Cars [firstCar=" + firstCar + ", seconfCar=" + seconfCar + ", thirdtCar=" + thirdtCar + "]";
	}
	
	

}
