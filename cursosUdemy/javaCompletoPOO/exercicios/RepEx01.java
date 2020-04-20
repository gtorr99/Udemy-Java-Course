package javaCompletoPOO.exercicios;

import java.util.Scanner;

public class RepEx01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Password: ");
		int senha = sc.nextInt();
		
		while(senha != 2002) {
			System.out.println("Senha Invalida");
			System.out.print("Password: ");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		
		sc.close();
	}

}
