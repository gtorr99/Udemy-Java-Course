package javaCompletoPOO.exercicios;

import java.util.Scanner;

public class SeqEx05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int code1, code2;
		int numPecas1, numPecas2;
		double vUnit1, vUnit2, valorPago;
		
		//code1 = sc.nextInt();
		numPecas1 = sc.nextInt();
		vUnit1 = sc.nextDouble();
		
		//code2 = sc.nextInt();
		numPecas2 = sc.nextInt();
		vUnit2 = sc.nextDouble();
		
		valorPago = vUnit1 * numPecas1 + vUnit2 * numPecas2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", valorPago);
		
		sc.close();
	}

}
