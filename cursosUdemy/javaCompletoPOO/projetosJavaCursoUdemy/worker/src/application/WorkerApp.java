package worker.src.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
//import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import worker.src.classes.Department;
import worker.src.classes.HourContract;
import worker.src.classes.Worker;
import worker.src. enums.WorkerLevel;

public class WorkerApp {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		// SimpleDateFormat sdf1 = new SimpleDateFormat("MM/yyyy");
		
		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine();

		System.out.print("Enter worker data:");

		System.out.println();
		System.out.print("Name: ");
		String workerName = sc.nextLine();

		System.out.print("Level: ");
		String workerLevel = sc.nextLine();

		System.out.print("Base salary: ");
		double baseSalary = sc.nextDouble();

		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));

		System.out.println();
		System.out.print("How many contracts to this worker? ");
		int numberOfContracts = sc.nextInt();

		for (int i = 0; i < numberOfContracts; i++) {
			System.out.println();
			System.out.printf("Enter contract #%d data:", i+1);

			System.out.println();
			System.out.print("Date (DD/YY/YYYY): ");
			Date contractDate = sdf.parse(sc.next()); 

			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();

			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();

			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);
		}

		
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		// Date monthAndYear = sdf1.parse(sc.next());

		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		// Calendar cal = Calendar.getInstance();
		// cal.setTime(monthAndYear);	
		// int year = cal.get(Calendar.YEAR);
		// int month = cal.get(Calendar.MONTH)+1;
		
		
		System.out.println();
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName()); //composicao
		System.out.print("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
		//System.out.print("Income for " + sdf1.format(monthAndYear) + ": " + String.format("%.2f", worker.income(year, month)));
		

		sc.close();

	}

}
