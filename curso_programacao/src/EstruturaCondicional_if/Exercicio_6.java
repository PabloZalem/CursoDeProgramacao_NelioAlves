package EstruturaCondicional_if;

import java.util.Scanner;

public class Exercicio_6 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner sc = new Scanner(System.in);

        // Solicita ao usuário para digitar o valor
        System.out.print("Digite um valor qualquer: ");
        double valor = sc.nextDouble();

        // Fecha o Scanner, pois não vamos precisar mais dele
        sc.close();

        // Verifica em qual intervalo o valor se encontra e imprime a mensagem correspondente
        if (valor >= 0 && valor <= 25) {
            System.out.println("O valor está no intervalo [0, 25].");
        } else if (valor > 25 && valor <= 50) {
            System.out.println("O valor está no intervalo (25, 50].");
        } else if (valor > 50 && valor <= 75) {
            System.out.println("O valor está no intervalo (50, 75].");
        } else if (valor > 75 && valor <= 100) {
            System.out.println("O valor está no intervalo (75, 100].");
        } else {
            System.out.println("Fora de intervalo.");
        }
    }
}
