package javaCompletoPOO.entities.classes;

public class Student {
	public String studentName;
	public double grade1;
	public double grade2;
	public double grade3;
	public double sum;

	public double finalGrade(){
		return sum = grade1 + grade2 + grade3;
	}

	public String status(){
		if(sum >= 60.00)
			return "PASS";
		else
			return "FAILED"
		           + "\n"
		           + "MISSING "
		           + String.format("%.2f",(60 - sum))
		           + " POINTS";

	}

}
