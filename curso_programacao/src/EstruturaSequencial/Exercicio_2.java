package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Constante π (pi)
        final double PI = 3.14159;

        // Solicitar e ler o valor do raio
        System.out.print("Digite o valor do raio do círculo: ");
        double raio = scanner.nextDouble();

        // Calcular a área do círculo
        double area = PI * Math.pow(raio, 2);

        // Mostrar o resultado na tela com quatro casas decimais
        System.out.printf("A área do círculo de raio %.2f é: %.4f\n", raio, area);

        scanner.close();
	}
}
