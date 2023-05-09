package org.lessons.java.warehouse;

public class Cuffia extends Prodotto{
	
	private String color;
	private String connectionType;

	public Cuffia(String name, String brand, int price, int vat, String color, String connectionType) {
		super(name, brand, price, vat);
		setColor(color);
		setConnectionType(connectionType);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getConnectionType() {
		return connectionType;
	}

	public void setConnectionType(String connectionType) {
		this.connectionType = connectionType;
	}
	
	@Override
	public String toString() {
		return "[Cuffie] " + getInfo()
		+ "\nColore: " + getColor() + " -  Le cuffie sono: " + getConnectionType();
	}
	
}
