package exercises4;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,num,in=0,out=0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			num = sc.nextInt();
			if(num>=10 && num<=20)
				in++;
			else 
				out++;
		}
		
		System.out.println(in+" in");
		System.out.println(out+" out");
		
		
		sc.close();
	}

}
