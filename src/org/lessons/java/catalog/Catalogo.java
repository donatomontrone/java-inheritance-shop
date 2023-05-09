package org.lessons.java.catalog;

import java.util.Scanner;

import org.lessons.java.warehouse.Cuffia;
import org.lessons.java.warehouse.Prodotto;
import org.lessons.java.warehouse.Smartphone;
import org.lessons.java.warehouse.Televisore;

public class Catalogo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Prodotto[] products = new Prodotto[100];
		
		int choise = 0;
		
		int x = 0;
		
		while (choise != 4) {
			System.out.println("Scegli un prodotto da inserire nel catalogo");
			System.out.println("1 - SmartPhone");
			System.out.println("2 - Televisore");
			System.out.println("3 - Cuffie");
			System.out.println("4 - Termina");
			
			choise = in.nextInt();
			
			if (choise == 1) {
				
				
				System.out.println("Inserisci il modello dello SmartPhone");
				String name = in.next(); 

				System.out.println("Inserisci il brand dello SmartPhone");
				String brand = in.next(); 
				
				System.out.println("Inserisci il prezzo dello SmartPhone");
				double price = in.nextDouble(); 
				
				System.out.println("Inserisci l'IMEI dello SmartPhone");
				String imei = in.next();
				
				
				System.out.println("Inserisci la capacità di memoria dello SmartPhone");
				int capacity = in.nextInt();
				
				products[x] = new Smartphone(name, brand, price, 22, imei, capacity);
				
				
				
			} else if (choise == 2) {
				
				System.out.println("Inserisci il modello del televisore");
				String name = in.next(); 

				
				System.out.println("Inserisci il brand dello televisore");
				String brand = in.next(); 
				
				System.out.println("Inserisci il prezzo dello televisore");
				double price = in.nextDouble(); 
				
				System.out.println("Inserisci le dimesioni del televisore (in pollici)");
				int inch = in.nextInt();
				
				System.out.println("Il televisore è smart? ");
				System.out.println("True");
				System.out.println("False");
				boolean smart = in.nextBoolean();
				
				products[x] = new Televisore(name, brand, price, 22, inch, smart);
				
				
			} else if (choise == 3) {
				
				System.out.println("Inserisci il modello delle cuffie");
				String name = in.next();
				
				System.out.println("Inserisci il brand delle cuffie");
				String brand = in.next(); 
				
				System.out.println("Inserisci il prezzo delle cuffie");
				double price = in.nextDouble(); 
				
				System.out.println("Inserisci il colore delle cuffie");
				String color = in.next();
				
				System.out.println("Le cuffie sono wireless o cablate");
				String connection = in.next();
				
				products[x] = new Cuffia(name, brand, price, 22, color, connection);
				
			} 
			
			x++;
			
		}
		
		if (x > 1) {
			
			System.out.println("Ecco i prodotti caricati:");
			for (int i = 0; i < products.length; i++) {
				
				if (products[i] != null) {	
					System.out.println(products[i]);
					System.out.println("-------------------------");
				} 
			} 
		}else {
			System.err.println("Il catalogo è vuoto.");
		}
		
		
			
			
		
		in.close();
		
	}
}
