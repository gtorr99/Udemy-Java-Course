package javaCompletoPOO.exercicios;

import java.util.Scanner;

public class RepEx03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int opcao = sc.nextInt();
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;


		while(opcao != 4){
			switch (opcao){
				case 1:
					alcool++;
					break;

				case 2:
					gasolina++;
					break;

				case 3:
					diesel++;
					break;
				case 4:
					break;

				default:
					System.out.println("Código Inválido!");
					System.out.print("Digitar novamente: ");
			}

			opcao = sc.nextInt();
		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);

		sc.close();
	}

}
