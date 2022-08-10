package com.lti.demo;

public class Products {
	private int id;
	private int pricePerUnit;
	public Products(int id, int pricePerUnit, String name) {
		super();
		this.id = id;
		this.pricePerUnit = pricePerUnit;
		this.name = name;
	}
	private String name;
	public Products(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPricePerUnit() {
		return pricePerUnit;
	}
	public void setPricePerUnit(int pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}
	
}
