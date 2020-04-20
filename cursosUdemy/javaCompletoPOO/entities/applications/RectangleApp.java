package javaCompletoPOO.entities.applications;

import java.util.Scanner;

import javaCompletoPOO.entities.classes.Rectangle;

public class RectangleApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Rectangle rec = new Rectangle();

		System.out.println("Enter rectangle sides' measures");

		System.out.print("Width: ");
		rec.width = sc.nextDouble();

		System.out.print("Height: ");
		rec.height = sc.nextDouble();

		System.out.println(rec);

		sc.close();

	}

}

