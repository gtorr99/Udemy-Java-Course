package javaCompletoPOO.exercicios;
import java.util.Scanner;

public class SeqEx01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x, y;
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		System.out.println("SOMA = " + (x + y));
		
		sc.close();
	}

}
