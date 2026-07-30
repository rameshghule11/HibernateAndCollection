package com.collection;

public class Product {

	private int productno;
	private String productname;
	private double price;
	
	
	public Product(int productno, String productname, double price) {
		super();
		this.productno = productno;
		this.productname = productname;
		this.price = price;
	}


	public int getProductno() {
		return productno;
	}


	public void setProductno(int productno) {
		this.productno = productno;
	}


	public String getProductname() {
		return productname;
	}


	public void setProductname(String productname) {
		this.productname = productname;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Product [productno=" + productno + ", productname=" + productname + ", price=" + price + "]";
	}
	
	
	
	
}
