package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio_6 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constante π (pi)
        final double PI = 3.14159;

        // Solicitar e ler os valores A, B e C
        System.out.print("Digite o valor de A: ");
        double A = scanner.nextDouble();

        System.out.print("Digite o valor de B: ");
        double B = scanner.nextDouble();

        System.out.print("Digite o valor de C: ");
        double C = scanner.nextDouble();

        // Calcular as áreas
        double areaTriangulo = (A * C) / 2;
        double areaCirculo = PI * Math.pow(C, 2);
        double areaTrapezio = ((A + B) * C) / 2;
        double areaQuadrado = Math.pow(B, 2);
        double areaRetangulo = A * B;

        // Mostrar as áreas na tela
        System.out.printf("Área do triângulo retângulo: %.2f\n", areaTriangulo);
        System.out.printf("Área do círculo: %.2f\n", areaCirculo);
        System.out.printf("Área do trapézio: %.2f\n", areaTrapezio);
        System.out.printf("Área do quadrado: %.2f\n", areaQuadrado);
        System.out.printf("Área do retângulo: %.2f\n", areaRetangulo);

        scanner.close();
	}
}
