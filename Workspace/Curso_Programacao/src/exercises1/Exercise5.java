package exercises1;

import java.util.Locale;
import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		double A,B,C;
		double PI = 3.14159;
		Scanner sc = new Scanner(System.in);
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		double triangulo = A*C/2;
		double circulo = PI*C*C;
		double trapezio = (A+B)/2*C;
		double quadrado = B*B;
		double retangulo = A*B;
		
		System.out.printf("TRIANGULO: %.3f\n",triangulo);
		System.out.printf("CIRCULO: %.3f\n",circulo);
		System.out.printf("TRAPEZIO: %.3f\n",trapezio);
		System.out.printf("QUADRADO: %.3f\n",quadrado);
		System.out.printf("RETANGULO: %.3f\n",retangulo);
		
		
	}

}
