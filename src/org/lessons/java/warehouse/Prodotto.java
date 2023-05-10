package org.lessons.java.warehouse;

import java.util.Random;

public class Prodotto {
	
	private final int code;
	private String name;
	private String brand;
	private int price;
	private int vat;
	
	
	public Prodotto(String name, String brand, int price, int vat) {
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getVat() {
		return vat;
	}
	public void setVat(int vat) {
		this.vat = vat;
	}
	
	public String vatPrice() {
		return String.format("%.2f", (getPrice() + (getPrice() * getVat() / 100f)))  ;
	}
	
	protected String getInfo() {
		return "- ID: " + getCode() + " - " + getName() + " (" + getBrand() + ")"
				+ "\nPrezzo: " + getPrice() + "€ + IVA al " + getVat() + "% = " + vatPrice() + "€";
	}
	
	@Override
	public String toString() {
		return "[Prodotto] " + getInfo();
	}
	

}
