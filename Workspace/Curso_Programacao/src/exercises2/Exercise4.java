package exercises2;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int inicio, fim, duracao;
		
		inicio = sc.nextInt();
		fim = sc.nextInt();
		
		if (fim > inicio)
			duracao = fim - inicio;
		else
			duracao = 24 - inicio + fim;
		
		System.out.println("O JOGO DUROU "+ duracao + " HORA(S)");
		
		sc.close();
	}

}
