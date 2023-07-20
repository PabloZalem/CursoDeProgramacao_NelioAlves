package EstruturaWhile;

import java.util.Scanner;

public class Exercicio_1 {
	public static void main(String[] args) {
        int senhaCorreta = 2002;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite a senha: ");
            int senhaDigitada = scanner.nextInt();

            if (senhaDigitada == senhaCorreta) {
                System.out.println("Acesso Permitido");
                break;
            } else {
                System.out.println("Senha Inválida");
            }
        }

        scanner.close();
    }
}
