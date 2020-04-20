package javaCompletoPOO.entities.applications;

import java.util.Scanner;

import javaCompletoPOO.entities.classes.Account;

public class AccountApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account account;

		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		
		sc.nextLine();

		System.out.print("Enter account holder: ");
		String name = sc.nextLine();
		
		System.out.print("Is there an initial deposit (y/n)? ");
		char option = sc.next().charAt(0);
		
		
		if(option == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(accountNumber, name, initialDeposit);
		}

		else{
			account = new Account(accountNumber, name);
		}
		
		
	
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account);

		System.out.println();
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		account.deposit(deposit);

		System.out.println();
		System.out.println("Updated ccount data:");
		System.out.println(account);

		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		account.withDraw(withdraw);

		System.out.println();
		System.out.println("Updated ccount data:");
		System.out.println(account);

		sc.close();

	}

}
