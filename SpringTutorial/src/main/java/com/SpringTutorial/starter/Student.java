package com.SpringTutorial.starter;

import java.util.List;

public class Student {
	private int sid;
	private String name;
	private List<String> books;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getBooks() {
		return books;
	}
	public void setBooks(List<String> books) {
		this.books = books;
	}
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", books=" + books + "]";
	}
	
	

}
