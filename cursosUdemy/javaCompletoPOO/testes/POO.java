package javaCompletoPOO.testes;

import java.util.Scanner;

import javaCompletoPOO.entities.classes.Triangle;

public class POO{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		Triangle x = new Triangle();
		Triangle y = new Triangle();

		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double p = (x.a + x.b + x.c) / 2.0;
		double areaX = Math.sqrt(p * (p-x.a) * (p-x.b) * (p-x.c));

		p = (y.a + y.b + y.c) / 2.0;
		double areaY = Math.sqrt(p * (p-y.a) * (p-y.b) * (p-y.c));

		System.out.printf("Triangule X area: %4.2f\n", areaX);
		System.out.printf("Triangule Y area: %4.2f\n", areaY);

		if (areaX > areaY) {
			System.out.println("Larger area: X");

		}

		else {
			System.out.println("Larger area: Y");

		}



		sc.close();
	}
}
