package exercises1;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int int1, int2;
		int soma;
		
		int1 = sc.nextInt();
//		sc.nextLine();
		int2 = sc.nextInt();
//		sc.nextLine();
		
		soma = int1+int2;
		
		System.out.printf("SOMA = %d\n", soma);
		
	}

}
