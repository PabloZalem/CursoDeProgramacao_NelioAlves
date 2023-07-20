package EstruturaCondicional_if;

import java.util.Scanner;

public class Exercicio_4 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner sc = new Scanner(System.in);

        // Solicita ao usuário para digitar a hora inicial e a hora final do jogo
        System.out.print("Digite a hora inicial do jogo (0 a 23): ");
        int horaInicial = sc.nextInt();

        System.out.print("Digite a hora final do jogo (0 a 23): ");
        int horaFinal = sc.nextInt();

        // Fecha o Scanner, pois não vamos precisar mais dele
        sc.close();

        // Calcula a duração do jogo em horas
        int duracao;
        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else {
            // Se a hora final for menor que a hora inicial, o jogo terminou no dia seguinte
            duracao = 24 - horaInicial + horaFinal;
        }

        // Imprime a duração do jogo
        System.out.println("A duração do jogo é de " + duracao + " hora(s).");
    }
}
