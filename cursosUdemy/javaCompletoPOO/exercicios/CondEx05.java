package javaCompletoPOO.exercicios;
import java.util.Scanner;

public class CondEx05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int opcao, quantidade;
		double valorConta = 0;

		opcao = sc.nextInt();
		quantidade = sc.nextInt();

		switch (opcao){
			case 1:
				valorConta = quantidade * 4.0;
				break;

			case 2:
				valorConta = quantidade * 4.5;
				break;

			case 3:
				valorConta = quantidade * 5.0;
				break;

			case 4:
				valorConta = quantidade * 2.0;
				break;

			default:
				valorConta = quantidade * 1.5;
				break;
		}

		System.out.printf("Total: R$ %.2f\n", valorConta);
		
		sc.close();
	}

}
