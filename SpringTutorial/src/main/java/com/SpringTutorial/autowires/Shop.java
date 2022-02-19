package com.SpringTutorial.autowires;

public class Shop {
	
	private int sid;
	private String sName;
	private Product products;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public Product getProducts() {
		return products;
	}
	public void setProducts(Product products) {
		this.products = products;
	}
	
	@Override
	public String toString() {
		return "Shop [sid=" + sid + ", sName=" + sName + ", products=" + products + "]";
	}
	
	

	
	
	

}
