package FuncoesEmString;

public class Exercicio_2 {
	public static void main(String[] args) {
		String originalString = "Hello, world!";

		// Utilizando o método substring(inicio) para obter uma substring a partir de
		// uma posição específica
		int startIndex = 7; // Início da primeira substring
		String substringFromStartIndex = originalString.substring(startIndex);
		System.out.println("Substring a partir do índice " + startIndex + ": " + substringFromStartIndex);

		// Utilizando o método substring(inicio, fim) para obter uma substring dentro de
		// um intervalo específico
		int endIndex = 12; // Fim da segunda substring (não incluso)
		String substringInRange = originalString.substring(startIndex, endIndex);
		System.out.println("Substring no intervalo [" + startIndex + ", " + endIndex + "): " + substringInRange);
	}
}
