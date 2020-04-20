package javaCompletoPOO.exercicios;
import java.util.Scanner;

public class SeqEx02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double raio, area;
		
		raio = sc.nextDouble();
		area = 3.14159 * Math.pow(raio, 2);
		
		System.out.printf("A=%.4f", area);
		sc.close();
	}

}
