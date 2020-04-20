package javaCompletoPOO.exercicios;

import java.util.Scanner;

public class ForEx02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int in = 0;
		int out = 0;

		for(int i = 0; i < N; i++){
			int num = sc.nextInt();


			if(num < 10 || num > 20)
				out++;
			else
				in++;
		}
		
		System.out.println(in + " in" + "\n" + out + " out");
		sc.close();
	}

}
