package javaCompletoPOO.testes;

import java.util.Scanner;

public class Vetores2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		VetorClass[] vect = new VetorClass[n];

		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new VetorClass(name, price);
		}

		double sum = 0.0;
		for (int i = 0; i < n ; i++ ) {
			sum += vect[i].getPrice();
		}

		double avg = sum / vect.length;
		System.out.println("AVERAGE PRICE = " + String.format("%4.2f",avg));
		sc.close();

	}

}
