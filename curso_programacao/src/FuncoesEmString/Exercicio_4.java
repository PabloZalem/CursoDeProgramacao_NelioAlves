package FuncoesEmString;

public class Exercicio_4 {
	public static void main(String[] args) {
        String originalString = "Hello, world! Hello, world!";

        // Utilizando o método indexOf para encontrar o índice da primeira ocorrência de uma substring
        String searchSubstring1 = "world";
        int firstIndex = originalString.indexOf(searchSubstring1);
        System.out.println("Primeira ocorrência de \"" + searchSubstring1 + "\" encontrada no índice: " + firstIndex);

        // Utilizando o método lastIndexOf para encontrar o índice da última ocorrência de uma substring
        String searchSubstring2 = "world";
        int lastIndex = originalString.lastIndexOf(searchSubstring2);
        System.out.println("Última ocorrência de \"" + searchSubstring2 + "\" encontrada no índice: " + lastIndex);
    }
}
