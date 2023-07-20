package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio_5 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar e ler os dados da peça 1
        System.out.print("Digite o código da peça 1: ");
        int codigoPeca1 = scanner.nextInt();

        System.out.print("Digite o número de peças 1: ");
        int numeroPecas1 = scanner.nextInt();

        System.out.print("Digite o valor unitário da peça 1: ");
        double valorUnitarioPeca1 = scanner.nextDouble();

        // Solicitar e ler os dados da peça 2
        System.out.print("Digite o código da peça 2: ");
        int codigoPeca2 = scanner.nextInt();

        System.out.print("Digite o número de peças 2: ");
        int numeroPecas2 = scanner.nextInt();

        System.out.print("Digite o valor unitário da peça 2: ");
        double valorUnitarioPeca2 = scanner.nextDouble();

        // Calcular o valor total a ser pago
        double valorTotalPeca1 = numeroPecas1 * valorUnitarioPeca1;
        double valorTotalPeca2 = numeroPecas2 * valorUnitarioPeca2;
        double valorTotalPago = valorTotalPeca1 + valorTotalPeca2;

        // Mostrar o valor total a ser pago
        System.out.println("Valor total a ser pago: " + valorTotalPago);

        scanner.close();
	}
}
