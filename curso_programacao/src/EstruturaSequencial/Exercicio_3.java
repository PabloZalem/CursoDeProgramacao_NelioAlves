package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio_3 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar e ler os valores A, B, C e D
        System.out.print("Digite o valor de A: ");
        int A = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        int B = scanner.nextInt();

        System.out.print("Digite o valor de C: ");
        int C = scanner.nextInt();

        System.out.print("Digite o valor de D: ");
        int D = scanner.nextInt();

        // Calcular a diferença do produto de A e B pelo produto de C e D
        int diferenca = (A * B) - (C * D);

        // Mostrar o resultado na tela
        System.out.println("A diferença do produto de A e B pelo produto de C e D é: " + diferenca);

        scanner.close();
	}
}
