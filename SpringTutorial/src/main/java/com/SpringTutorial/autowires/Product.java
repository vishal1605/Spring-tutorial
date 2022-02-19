package com.SpringTutorial.autowires;


public class Product {
	private String foods;
	private String medicine;
	
	public String getFoods() {
		return foods;
	}
	public void setFoods(String foods) {
		this.foods = foods;
	}
	public String getMedicine() {
		return medicine;
	}
	public void setMedicine(String medicine) {
		this.medicine = medicine;
	}
	@Override
	public String toString() {
		return "Product [foods=" + foods + ", medicine=" + medicine + "]";
	}
	
	
	
	
	

}
