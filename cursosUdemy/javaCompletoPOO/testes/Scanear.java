package javaCompletoPOO.testes;

import java.util.Scanner;

public class Scanear {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		String x;
		char y;
		
		x = sc.next();
		System.out.println("Voc� digitou: " + x);
		
		y = sc.next().charAt(0);
		System.out.println("Voc� digitou: " + y);

		sc.close();
	}

}
