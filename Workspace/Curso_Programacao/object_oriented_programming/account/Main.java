package account;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		int number;
		String holder;
		double initialDepositValue = 0;
		
		System.out.print("Enter account number: ");
		number = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter account holder: ");
		holder = scanner.nextLine();
		System.out.print("Is there an initial deposit(y/n)? ");
		if (scanner.next().charAt(0)=='y') {
			System.out.print("Enter initial deposit value: ");
			initialDepositValue = scanner.nextDouble();
		}
		System.out.println();
		
		Account account = new Account(holder, number, initialDepositValue);
		
		System.out.println("Account data:");
		System.out.println(account);
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		account.deposit(scanner.nextDouble());
		System.out.println(account);
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		account.withdraw(scanner.nextDouble());
		System.out.println(account);
		System.out.println();
		
		
		scanner.close();
	}

}
