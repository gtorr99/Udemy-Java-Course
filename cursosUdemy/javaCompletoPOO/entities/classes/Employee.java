package javaCompletoPOO.entities.classes;

public class Employee {
	private Integer id;
	private String name;
	private Double salary;

	public Employee(){

	}

	public Employee(Integer id, String name, Double salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public int getId(){
		return id;
	}
	
	public void salaryIncrease(Double percentage){
		salary += salary * percentage / 100.0;
	}

	public String toString(){
		return id + ", " + name + ", " + String.format("%.2f", salary);
	}
	
	
	

}
