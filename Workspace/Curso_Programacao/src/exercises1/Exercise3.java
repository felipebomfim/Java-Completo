package exercises1;

import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		int a,b,c,d;
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		System.out.printf("DIFERENCA = "+ (a*b-c*d));
				
		
		sc.close();
	}
}
