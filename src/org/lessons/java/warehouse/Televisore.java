package org.lessons.java.warehouse;

public class Televisore extends Prodotto {
	
	private int inch;
	private boolean smart;


	public Televisore(String name, String brand, int price, int vat, int inch, boolean smart) {
		super(name, brand, price, vat);
		
		setInch(inch);
		setSmart(smart);
	}

	
	public int getInch() {
		return inch;
	}
	public void setInch(int inch) {
		this.inch = inch;
	}
	public boolean isSmart() {
		return smart;
	}
	public void setSmart(boolean smart) {
		this.smart = smart;
	}

	@Override
	public String toString() {
		return "[Televisore] " + getInfo()
		+ "\nPollici: " + getInch() + "' - " + (isSmart() ? "Il televisore è una SmartTV" : "Il televisore non è SmartTV");
	}
}
