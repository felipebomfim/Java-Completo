package exercises1;

import java.util.Locale;
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double PI, raio;
		PI = 3.14159;
		raio = sc.nextDouble();
		
		System.out.printf("A=%.4f\n",PI*raio*raio);
	}

}
