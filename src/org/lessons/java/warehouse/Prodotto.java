package org.lessons.java.warehouse;

import java.util.Random;

public class Prodotto {
	
	private int code;
	private String name;
	private String brand;
	private double price;
	private double vat;
	
	
	public Prodotto(String name, String brand, double price, double vat) {
		Random rnd = new Random();
		code = rnd.nextInt(99999999);
		setName(name);
		setBrand(brand);
		setPrice(price);
		setVat(vat);
		
	}
	
	
	public int getCode() {
		return code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getVat() {
		return vat;
	}
	public void setVat(double vat) {
		this.vat = vat;
	}
	
	public double vatPrice() {
		return getPrice() + (getPrice() * getVat() / 100);
	}
	
	protected String getInfo() {
		return "- ID: " + getCode() + " - " + getName() + " (" + getBrand() + ")"
				+ "\nPrezzo: " + getPrice() + " + IVA al " + getVat() + " = " + vatPrice();
	}
	
	@Override
	public String toString() {
		return "[Prodotto] " + getInfo();
	}
	

}
