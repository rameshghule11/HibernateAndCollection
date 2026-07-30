package com.collection;

public class Shop {

	private String shopname;
	private String shopproduct;
	private String workers;
	private double mony;
	
	public Shop(String shopname, String shopproduct, String workers,double mony) {
		super();
		this.shopname = shopname;
		this.shopproduct = shopproduct;
		this.workers = workers;
		this.mony = mony;
	}
	public String getShopname() {
		return shopname;
	}
	public void setShopname(String shopname) {
		this.shopname = shopname;
	}
	public String getShopproduct() {
		return shopproduct;
	}
	public void setShopproduct(String shopproduct) {
		this.shopproduct = shopproduct;
	}
	public String getWorkers() {
		return workers;
	}
	public void setWorkers(String workers) {
		this.workers = workers;
	}
	public double getMony() {
		return mony;
	}
	public void setMony(double mony) {
		this.mony = mony;
	}
	@Override
	public String toString() {
		return "Shop [shopname=" + shopname + ", shopproduct=" + shopproduct + ", workers=" + workers + ", mony=" + mony
				+ "]";
	}
	
	
}
