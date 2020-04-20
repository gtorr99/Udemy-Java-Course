package javaCompletoPOO.testes;

import java.util.Scanner;

public class Debugar {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x = 1, y = 0;
		
		while (x > 0) {
			System.out.println(y += x);
			x = sc.nextInt();
		}
			
		sc.close();
	}
}