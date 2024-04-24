package exercises3;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String senha;
		Scanner sc = new Scanner(System.in);
		senha = sc.nextLine();
		while (!senha.equals("2002")) {
			System.out.println("Senha Invalida");
			senha = sc.nextLine();
		}
		System.out.println("Acesso Permitido");
		sc.close();
	}

}
