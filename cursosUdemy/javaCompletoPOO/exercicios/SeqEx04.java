package javaCompletoPOO.exercicios;

import java.util.Scanner;

public class SeqEx04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int code, hours;
		double salHr, salary;
		
		code = sc.nextInt();
		hours = sc.nextInt();
		salHr = sc.nextDouble();
		
		salary = salHr * hours;
		
		System.out.println("NUMBER = " + code);
		System.out.printf("SALARY = U$ %.2f", salary);
		
		sc.close();
	}

}
