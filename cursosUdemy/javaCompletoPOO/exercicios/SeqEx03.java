package javaCompletoPOO.exercicios;

import java.util.Scanner;

public class SeqEx03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A, B, C, D, Dif;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		Dif = (A * B - C * D);
		
		System.out.println("DIFERENÇA = " + Dif);
		sc.close();
	}

}
