package javaCompletoPOO.exercicios;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] matrix = new int[sc.nextInt()][sc.nextInt()];

		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {

				matrix[row][column] = sc.nextInt();

			}
		}

		int x = sc.nextInt();

		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {

				if(matrix[row][column] == x){
					System.out.println();
					System.out.print("Position " + row + "," + column + ":");
					if(row > 0){
						System.out.println();
						System.out.print("Up: " + matrix[row-1][column]);
					}
					if(row < matrix.length-1){
						System.out.println();
						System.out.print("Down: " + matrix[row+1][column]);
					}
					if(column > 0){
						System.out.println();
						System.out.print("Left: " + matrix[row][column-1]);
					}
					if(column < matrix[row].length-1){
						System.out.println();
						System.out.print("Right: " + matrix[row][column+1]);
					}
				}

			}
		}

	}

}
