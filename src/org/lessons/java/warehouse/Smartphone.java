package org.lessons.java.warehouse;

public class Smartphone extends Prodotto {
	
	private String imei;
	private int storageCapacity;


	public Smartphone(String name, String brand, int price, int vat,
						String imei, int storageCapacity) {
		super(name, brand, price, vat);
		
		setImei(imei);
		setStorageCapacity(storageCapacity);
		
	}
	
	public String getImei() {
		return imei;
	}
	
	public void setImei(String imei) {
		this.imei = imei;
	}
	
	public int getStorageCapacity() {
		return storageCapacity;
	}
	
	public void setStorageCapacity(int storagCapacity) {
		this.storageCapacity = storagCapacity;
	}
	
	@Override
	public String toString() {
		return "[SmartPhone] " + getInfo()
		+ "\nIMEI: " + getImei() + " - " + getStorageCapacity() + "GB";
	}
}
