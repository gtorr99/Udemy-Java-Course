package javaCompletoPOO.testes;

import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int countNegatives = 0;

		int[][] matrix = new int[n][n];

		for (int row = 0; row < n; row++) {
			for (int column = 0; column < n; column++) {

				matrix[row][column] = sc.nextInt();

				if(matrix[row][column] < 0)
					countNegatives++;
			}
		}

		System.out.println("Main diagonal:");
		for (int i = 0; i < n; i++) {
			System.out.print(matrix[i][i] + " ");
		}
		
		System.out.println();
		System.out.print("Negative numbers = " + countNegatives);
		sc.close();
	}

}
