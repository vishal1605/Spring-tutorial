package com.SpringTutorial.reference.bean;

public class Distributer {
	
	private Cars carName;
	private String name;
	private String city;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Cars getCarName() {
		return carName;
	}
	public void setCarName(Cars carName) {
		this.carName = carName;
	}
	@Override
	public String toString() {
		return "Distributer [carName=" + carName + ", name=" + name + ", city=" + city + "]";
	}
	
	

}
