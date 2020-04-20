package javaCompletoPOO.entities.applications;

import javaCompletoPOO.entities.classes.ProductConstrutor;
import java.util.Scanner;

public class StockConstrutorApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int addQuantity, removeQuantity;
		
		System.out.println("Enter product data: ");
		System.out.print("Name: "); 
		String name = sc.next();

		System.out.print("Price: "); 
		double price = sc.nextDouble();

		System.out.print("Quantity in stock: "); 
		int quantity = sc.nextInt();
		
		ProductConstrutor p = new ProductConstrutor(name, price, quantity);

		System.out.println();
		System.out.println("Product data: " + p);
		

		System.out.print("\nEnter the number of products to be added in stock: "); addQuantity = sc.nextInt();
		p.addProducts(addQuantity);
		
		System.out.printf("\nUpdated data: " + p);
		
		System.out.print("\n\nEnter the number of products to be removed from stock: "); removeQuantity = sc.nextInt();
		p.removeProducts(removeQuantity);

		System.out.printf("\nUpdated data: " + p);
		
		sc.close();
		
	}

}
