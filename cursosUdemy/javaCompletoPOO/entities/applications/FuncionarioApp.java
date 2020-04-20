package javaCompletoPOO.entities.applications;

import java.util.Scanner;

import javaCompletoPOO.entities.classes.Funcionario;

public class FuncionarioApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		Funcionario func = new Funcionario();

		System.out.print("Name: ");
		func.name = sc.nextLine();

		System.out.print("Gross salary: ");
		func.grossSalary = sc.nextDouble();

		System.out.print("Tax: ");
		func.tax = sc.nextDouble();

		System.out.println();
		System.out.println("Employee: " + func);

		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		func.increaseSalary(percentage);

		System.out.println();
		System.out.println("Updated data: " + func);

		sc.close();

	}

}
