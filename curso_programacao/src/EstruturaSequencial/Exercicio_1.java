package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio_1 {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

        // Solicitar e ler os dois valores inteiros
        System.out.print("Digite o primeiro valor inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo valor inteiro: ");
        int numero2 = scanner.nextInt();

        // Calcular a soma dos valores
        int soma = numero1 + numero2;

        // Mostrar o resultado na tela
        System.out.println("A soma dos números " + numero1 + " e " + numero2 + " é: " + soma);

        scanner.close();
	}
}
