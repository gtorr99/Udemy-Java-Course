package javaCompletoPOO.entities.applications;

import javaCompletoPOO.entities.classes.Product;
import java.util.Scanner;

public class StockApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Product p = new Product();
		//double total;
		int addQuantity, removeQuantity;

		System.out.println("Enter product data: ");
		System.out.print("Name: "); p.name = sc.next();
		System.out.print("Price: "); p.price = sc.nextDouble();
		System.out.print("Quantity in stock: "); p.quantity = sc.nextInt();
		
		System.out.println();
		System.out.println("Product data: " + p);
		

		//System.out.printf("\nProduc data: %s, $ %4.2f, %d units, Total: $ %4.2f\n\n", p.name, p.price, p.quantity, total);

		System.out.print("\nEnter the number of products to be added in stock: "); addQuantity = sc.nextInt();
		p.addProducts(addQuantity);
		//total = p.totalValueInStock();

		//System.out.printf("\nUpdated data: %s, $ %4.2f, %d units, Total: $ %4.2f\n\n", p.name, p.price, p.quantity, total);
		System.out.printf("\nUpdated data: " + p);

		System.out.print("\n\nEnter the number of products to be removed from stock: "); removeQuantity = sc.nextInt();
		p.removeProducts(removeQuantity);
		//total = p.totalValueInStock();

		//System.out.printf("\nUpdated data: %s, $ %4.2f, %d units, Total: $ %4.2f\n\n", p.name, p.price, p.quantity, total);
		System.out.printf("\nUpdated data: " + p);
		//System.out.println(p);
		sc.close();
		
	}

}
