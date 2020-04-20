package javaCompletoPOO.entities.classes;

public class Account {
	private int accountNumber;
	private String name;
	private double balance;

	public Account(int accountNumber, String name, double initialDeposit){
		this.accountNumber = accountNumber;
		this.name = name;
		//this.balance = balance; -- se a regra de negócios mudar, e for alterado algo no dépósito, só será necessário alterar o método deposit, mantendo a integridade do construtor
		deposit(initialDeposit);
	}

	public Account(int accountNumber, String name){
		this.accountNumber = accountNumber;
		this.name = name;
	}

	public void setName(String name){
		this.name = name;
	}

	public void deposit(double deposit){
		this.balance += deposit;
	}

	public void withDraw(double withDraw){
		this.balance -= withDraw + 5.0;
	}

	public String toString(){
		return 	"Account "
				+ this.accountNumber
		       	+ ", Holder: "
		       	+ this.name
		       	+ ", Balance: $ "
		       	+ String.format("%.2f", this.balance);
	}


}
