package exercises1;

import java.util.Locale;
import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int hours = sc.nextInt();
		double pricePerHour = sc.nextDouble();
		
		double salary = hours*pricePerHour;
		
		System.out.println("NUMBER = "+number);
		System.out.printf("SALARY = U$ %.2f\n",salary);
	}

}
