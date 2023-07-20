package EstruturaCondicional_if;

import java.util.Scanner;

public class Exercicio_8 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner sc = new Scanner(System.in);

        // Solicita ao usuário para digitar o salário em Rombus (R$)
        System.out.print("Digite o salário em Rombus (R$): ");
        double salario = sc.nextDouble();

        // Fecha o Scanner, pois não vamos precisar mais dele
        sc.close();

        // Calcula o Imposto de Renda de acordo com a tabela fornecida
        double impostoDeRenda = 0.0;

        if (salario <= 2000.00) {
            impostoDeRenda = 0.0; // Isento
        } else if (salario <= 3000.00) {
            impostoDeRenda = (salario - 2000.00) * 0.08;
        } else if (salario <= 4500.00) {
            impostoDeRenda = (1000.00 * 0.08) + ((salario - 3000.00) * 0.18);
        } else {
            impostoDeRenda = (1000.00 * 0.08) + (1500.00 * 0.18) + ((salario - 4500.00) * 0.28);
        }

        // Imprime o valor do Imposto de Renda com duas casas decimais
        System.out.printf("Imposto de Renda a pagar: R$ %.2f%n", impostoDeRenda);
    }
}
