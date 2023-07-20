package EstruturaCondicional_if;

import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner sc = new Scanner(System.in);

        // Solicita ao usuário para digitar um número inteiro
        System.out.print("Digite um número inteiro: ");

        // Lê o número inteiro fornecido pelo usuário
        int numero = sc.nextInt();

        // Fecha o Scanner, pois não vamos precisar mais dele
        sc.close();

        // Verifica se o número é par ou ímpar e imprime o resultado
        if (numero % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }
    }
}
