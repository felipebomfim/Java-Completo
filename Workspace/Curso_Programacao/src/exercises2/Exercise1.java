package exercises2;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		if (num < 0)
			System.out.println("NEGATIVO");
		else
			System.out.println("NAO NEGATIVO");
	}

}
