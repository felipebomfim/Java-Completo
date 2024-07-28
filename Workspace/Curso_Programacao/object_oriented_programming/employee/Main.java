package employee;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee();
		
		System.out.print("Name: ");
		employee.name = sc.nextLine();		
		System.out.println(employee.name);
		System.out.print("Gross Salary: ");
		employee.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		System.out.println();
		
		System.out.print("Employee: ");
		System.out.println(employee);
		System.out.println();

		System.out.print("Which percentage to increase salary? ");
		employee.increaseSalary(sc.nextDouble());
		System.out.println();

		System.out.print("Updated data: ");
		System.out.println(employee);
		System.out.println();
		
		sc.close();
	}

}
