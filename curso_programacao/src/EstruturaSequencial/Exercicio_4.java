package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio_4 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar e ler os dados do funcionário
        System.out.print("Digite o número do funcionário: ");
        int numeroFuncionario = scanner.nextInt();

        System.out.print("Digite o número de horas trabalhadas: ");
        double horasTrabalhadas = scanner.nextDouble();

        System.out.print("Digite o valor recebido por hora: ");
        double valorHora = scanner.nextDouble();

        // Calcular o salário do funcionário
        double salario = horasTrabalhadas * valorHora;

        // Mostrar o número e o salário do funcionário com duas casas decimais
        System.out.printf("Número do funcionário: %d\n", numeroFuncionario);
        System.out.printf("Salário: %.2f\n", salario);

        scanner.close();
	}
}
