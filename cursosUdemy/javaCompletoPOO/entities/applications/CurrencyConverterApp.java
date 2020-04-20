package javaCompletoPOO.entities.applications;

import javaCompletoPOO.entities.classes.CurrencyConverter;
import java.util.Scanner;

public class CurrencyConverterApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double amount = sc.nextDouble();

		System.out.println();
		System.out.print("How many dollars will be bought? ");
		double dollarPrice = sc.nextDouble();

		System.out.println();
		System.out.printf("Amount to be paid in reais =  %4.2f",
			               CurrencyConverter.dollarToReais(amount, dollarPrice));

		sc.close();

	}

}
