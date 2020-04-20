package javaCompletoPOO.entities.classes;

public class CurrencyConverter {

	public static double IOF = 0.06;

	public static double dollarToReais(double amount, double dollarPrice){
		return amount * dollarPrice * (1+ IOF);
	}

}
