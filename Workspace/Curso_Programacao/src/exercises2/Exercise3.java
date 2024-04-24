package exercises2;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b;
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (a%b==0 || b%a==0) 
			System.out.println("Sao Multiplos");
		else
			System.out.println("Nao Sao Multiplos");
		
		sc.close();
	}

}
