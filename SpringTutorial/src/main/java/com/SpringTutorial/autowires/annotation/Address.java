package com.SpringTutorial.autowires.annotation;

import org.springframework.stereotype.Component;

@Component
public class Address {
	private String landMark;
	private String city;
	public String getLandMark() {
		return landMark;
	}
	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [landMark=" + landMark + ", city=" + city + "]";
	}
	
	
	

}
