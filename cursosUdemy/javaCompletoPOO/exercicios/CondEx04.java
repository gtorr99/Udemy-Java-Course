package javaCompletoPOO.exercicios;

import java.util.Scanner;

public class CondEx04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int I, F, T;
		
		I = sc.nextInt();
		F = sc.nextInt();
		
		if (F-I < 0)
			T = F + (24-I);
		
		else if (F - I > 0)
			T = F - I;
		
		else
			T = 24;
		
		System.out.println("O JOGO DUROU " + T + " HORA(S)");
		sc.close();
	}

}
