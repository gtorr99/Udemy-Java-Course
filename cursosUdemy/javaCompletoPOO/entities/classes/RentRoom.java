package javaCompletoPOO.entities.classes;

public class RentRoom {
	private String studentName;
	private String email;
	private int roomNumber;

	public RentRoom(String studentName, String email, int roomNumber){
		this.studentName = studentName;
		this.email = email;
		this.roomNumber = roomNumber;
	}

	public String toString(){
		return   roomNumber
				+ ": "
				+ studentName
				+ ", "
				+ email;
	}
}
