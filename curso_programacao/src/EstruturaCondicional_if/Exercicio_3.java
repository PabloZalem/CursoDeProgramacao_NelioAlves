package EstruturaCondicional_if;

import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner sc = new Scanner(System.in);

        // Solicita ao usuário para digitar os dois números inteiros
        System.out.print("Digite o primeiro número inteiro: ");
        int A = sc.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int B = sc.nextInt();

        // Fecha o Scanner, pois não vamos precisar mais dele
        sc.close();

        // Ordena os números para garantir que A seja sempre o menor valor
        if (A > B) {
            int temp = A;
            A = B;
            B = temp;
        }

        // Verifica se os números são múltiplos entre si e imprime o resultado
        if (B % A == 0) {
            System.out.println("Sao Multiplos.");
        } else {
            System.out.println("Nao sao Multiplos.");
        }
    }
}
