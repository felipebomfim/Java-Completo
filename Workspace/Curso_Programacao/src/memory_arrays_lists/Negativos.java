import java.util.Scanner;

public class Negativos {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Quantos numeros voce vai digitar? ");
        int qtdNumerosADigitar = sc.nextInt();

        if (qtdNumerosADigitar<=0||qtdNumerosADigitar>10){
            sc.close();
            throw new RuntimeException("Número inválido!");
        }

        int[] numerosDigitados = new int[qtdNumerosADigitar];
        
        for (int i=0; i<qtdNumerosADigitar; i++){
            System.out.printf("Digite um numero: ");
            numerosDigitados[i] = sc.nextInt();
            // System.out.println();
        }

        System.out.println("NUMEROS NEGATIVOS:");

        for (int i=0; i<qtdNumerosADigitar; i++){
            if (numerosDigitados[i]<0)
                System.out.println(numerosDigitados[i]);
        }

        sc.close();
    }
}
