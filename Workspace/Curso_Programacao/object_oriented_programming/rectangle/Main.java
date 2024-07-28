package rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rectangle width and height:");
		Rectangle rect = new Rectangle();
		rect.width = sc.nextDouble();
		rect.height = sc.nextDouble();
		
		System.out.println("AREA = " + String.format("%.2f", rect.area()));
		System.out.printf("PERIMETER = %.2f\n", rect.perimeter());
		System.out.printf("DIAGONAL = %.2f\n", rect.diagonal());
		
		
		sc.close();
	}
}
