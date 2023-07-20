package FuncoesEmString;

public class Exercicio_5 {
	public static void main(String[] args) {
		String str = "Hello";
		String[] substrings = str.split("");

		System.out.println("Tamanho do array de substrings: " + substrings.length);
		for (int i = 0; i < substrings.length; i++) {
			System.out.println("Substring " + i + ": \"" + substrings[i] + "\"");
		}
	}
}
