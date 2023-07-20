package FuncoesEmString;

public class ExercicioParaFormatar {
	public static void main(String[] args) {
		String originalString = "  Olá Mundo!   ";

		// Utilizando o método toLowerCase() para converter em minúsculas
		String lowercaseString = originalString.toLowerCase();
		System.out.println("String em minúsculas: " + lowercaseString);

		// Utilizando o método toUpperCase() para converter em maiúsculas
		String uppercaseString = originalString.toUpperCase();
		System.out.println("String em maiúsculas: " + uppercaseString);

		// Utilizando o método trim() para remover espaços em branco no início e no fim
		// da string
		String trimmedString = originalString.trim();
		System.out.println("String sem espaços em branco: " + trimmedString);
	}
}
