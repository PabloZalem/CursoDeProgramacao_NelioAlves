package EstruturaCondicional_if;

import java.util.Scanner;

public class Exercicio_7 {
	public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner sc = new Scanner(System.in);

        // Solicita ao usuário para digitar as coordenadas x e y
        System.out.print("Digite a coordenada x do ponto: ");
        double x = sc.nextDouble();

        System.out.print("Digite a coordenada y do ponto: ");
        double y = sc.nextDouble();

        // Fecha o Scanner, pois não vamos precisar mais dele
        sc.close();

        // Verifica em qual quadrante o ponto está e imprime a mensagem correspondente
        if (x == 0 && y == 0) {
            System.out.println("Origem.");
        } else if (x == 0) {
            System.out.println("Eixo Y.");
        } else if (y == 0) {
            System.out.println("Eixo X.");
        } else if (x > 0 && y > 0) {
            System.out.println("Quadrante 1.");
        } else if (x < 0 && y > 0) {
            System.out.println("Quadrante 2.");
        } else if (x < 0 && y < 0) {
            System.out.println("Quadrante 3.");
        } else if (x > 0 && y < 0) {
            System.out.println("Quadrante 4.");
        }
	}
}
