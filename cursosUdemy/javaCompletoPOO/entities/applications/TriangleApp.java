package javaCompletoPOO.entities.applications;

import java.util.Scanner;

import javaCompletoPOO.entities.classes.Triangle;

public class TriangleApp{
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

		double areaX = x.area();
		double areaY = y.area();

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

