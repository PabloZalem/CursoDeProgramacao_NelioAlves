package EstruturaWhile;

import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite a coordenada X (ou 0 para sair): ");
            int x = scanner.nextInt();

            System.out.print("Digite a coordenada Y (ou 0 para sair): ");
            int y = scanner.nextInt();

            if (x == 0 || y == 0) {
                break;
            }

            if (x > 0 && y > 0) {
                System.out.println("Primeiro quadrante");
            } else if (x < 0 && y > 0) {
                System.out.println("Segundo quadrante");
            } else if (x < 0 && y < 0) {
                System.out.println("Terceiro quadrante");
            } else if (x > 0 && y < 0) {
                System.out.println("Quarto quadrante");
            } else {
                System.out.println("Ponto na origem");
            }
        }

        scanner.close();
    }
}
