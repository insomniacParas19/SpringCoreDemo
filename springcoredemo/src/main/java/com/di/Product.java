package com.di;

public class Product {

	private int id;
	private String pName;
	private int price;
	private String company;
	
	public Product(int id, String pName, int price, String company) {
		super();
		this.id = id;
		this.pName = pName;
		this.price = price;
		this.company = company;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", pName=" + pName + ", price=" + price + ", company=" + company + "]";
	}
	
	

	
	
}
