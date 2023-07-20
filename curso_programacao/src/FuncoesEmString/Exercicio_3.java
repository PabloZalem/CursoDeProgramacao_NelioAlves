package FuncoesEmString;

public class Exercicio_3 {
	public static void main(String[] args) {
        // Exemplo com replace(char, char)
        String originalString1 = "Hello, world!";
        char charToReplace = 'o';
        char replacementChar = '@';
        String replacedString1 = originalString1.replace(charToReplace, replacementChar);
        System.out.println("Resultado do replace(char, char): " + replacedString1);

        // Exemplo com replace(string, string)
        String originalString2 = "Java is fun and Java is cool!";
        String stringToReplace = "Java";
        String replacementString = "Python";
        String replacedString2 = originalString2.replace(stringToReplace, replacementString);
        System.out.println("Resultado do replace(string, string): " + replacedString2);
    }

}
