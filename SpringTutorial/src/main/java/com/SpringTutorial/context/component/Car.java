package com.SpringTutorial.context.component;

import org.springframework.stereotype.Component;

@Component
public class Car {
	
	private String myName;
	private String colName;
	
	
	@Override
	public String toString() {
		return "Car [myName=" + myName + ", colName=" + colName + "]";
	}

	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

	public String getColName() {
		return colName;
	}

	public void setColName(String colName) {
		this.colName = colName;
	}

	public void drive() {
		System.out.println("I am driving");
	}

}
