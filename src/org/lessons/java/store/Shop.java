package org.lessons.java.store;

import org.lessons.java.warehouse.Cuffia;
import org.lessons.java.warehouse.Prodotto;
import org.lessons.java.warehouse.Smartphone;
import org.lessons.java.warehouse.Televisore;

public class Shop {
	public static void main(String[] args) {
		Prodotto p = new Prodotto("iPhone", "Apple", 1299, 22);
		
		System.err.println("\n---------------------------------\n");
		
		System.out.println(p);
		
		System.err.println("\n---------------------------------\n");
		
		Smartphone sm = new Smartphone("Galaxy", "Samsung", 999, 22, "475869705948", 512);
		
		System.out.println(sm);
		
		System.err.println("\n---------------------------------\n");
		
		Televisore tv = new Televisore("55HSLG500U", "LG", 599, 22, 55, false);
		
		System.out.println(tv);
		
		System.err.println("\n---------------------------------\n");
		
		Cuffia cf = new Cuffia("QuietComfort 45", "Bose", 229, 22, "grey", "wireless");
		
		System.out.println(cf);
	}
}
