package javaCompletoPOO.entities.applications;

import javaCompletoPOO.entities.classes.RentRoom;
import java.util.Scanner;

public class RentRoomApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();

		RentRoom[] rooms = new RentRoom[10];

		for (int i = 0; i < n; i++) {
			
			System.out.println();
			System.out.print("Rent #" + (int) (i+1));
			
			sc.nextLine();
			System.out.println();
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			System.out.print("Room: ");
			int number = sc.nextInt();

			rooms[number] = new RentRoom(name, email, number);

		}
		
		System.out.println();
		System.out.println("Busy rooms: ");
		for (int i = 0; i < 10; i++) {
			if(rooms[i] != null){
				System.out.println(rooms[i]);
			}
		}
	
		
		sc.close();

	}

}
