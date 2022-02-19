package com.SpringTutorial.constructor;

import java.util.List;

public class Kids {
	private int kid;
	private String name;
	private List<String> books;
	
//	public int getKid() {
//		return kid;
//	}
//	public void setKid(int kid) {
//		this.kid = kid;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public List<String> getBooks() {
//		return books;
//	}
//	public void setBooks(List<String> books) {
//		this.books = books;
//	}
	
	
	public Kids(int kid, String name, List<String> books) {
		super();
		this.kid = kid;
		this.name = name;
		this.books = books;
	}
	@Override
	public String toString() {
		return "Kids [kid=" + kid + ", name=" + name + ", books=" + books + "]";
	}
	
	

}
