package javaCompletoPOO.exercicios;

import java.util.Scanner;

public class CondEx08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double salario, valorImposto;

		salario = sc.nextDouble();

		if(salario < 2000.01)
			System.out.println("Isento");

		else {

			if(salario < 3000.01)
				valorImposto = (salario - 2000) * 0.08;

			else if(salario < 4500.01)
				valorImposto = (salario - 2000) * 0.08 + (salario - 3000) * 0.18;

			else 
				valorImposto = (salario - 2000) * 0.08 + (salario - 3000) * 0.18 + (salario - 4500) * 0.28;
		
			System.out.printf("R$ %.2f\n", valorImposto);
		}
		
		sc.close();
	}

}
