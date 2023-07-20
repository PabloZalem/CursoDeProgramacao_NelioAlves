package EstruturaWhile;

import java.util.Scanner;

public class Exercicio_3 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (true) {
            System.out.println("Digite o código do combustível abastecido:");
            System.out.println("1. Álcool");
            System.out.println("2. Gasolina");
            System.out.println("3. Diesel");
            System.out.println("4. Fim");
            int codigo = scanner.nextInt();

            if (codigo == 4) {
                break;
            } else if (codigo < 1 || codigo > 4) {
                System.out.println("Código inválido. Digite novamente.");
                continue;
            }

            switch (codigo) {
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
            }
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Clientes que abasteceram Álcool: " + alcool);
        System.out.println("Clientes que abasteceram Gasolina: " + gasolina);
        System.out.println("Clientes que abasteceram Diesel: " + diesel);

        scanner.close();
    }
}
