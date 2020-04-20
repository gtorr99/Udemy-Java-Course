package javaCompletoPOO.entities.applications;

import java.util.Scanner;

import javaCompletoPOO.entities.classes.Student;

public class StudentApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student aluno = new Student();

		aluno.studentName = sc.nextLine();
		aluno.grade1 = sc.nextDouble();
		aluno.grade2 = sc.nextDouble();
		aluno.grade3 = sc.nextDouble();

		System.out.println("FINAL GRADE = " + String.format("%.2f", aluno.finalGrade()));
		System.out.println(aluno.status());
		sc.close();

	}

}
