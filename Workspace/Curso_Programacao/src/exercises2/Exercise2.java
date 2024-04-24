package exercises2;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		if (num % 2 == 0)
			System.out.println("PAR");
		else
			System.out.println("IMPAR");
		
		sc.close();
	}

}
