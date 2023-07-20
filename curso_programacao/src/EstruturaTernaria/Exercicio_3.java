package EstruturaTernaria;

public class Exercicio_3 {
	 public static void main(String[] args) {
	        double nota = 7.5;
	        String status;

	        // Verifica se o aluno foi aprovado ou reprovado
	        status = (nota >= 6.0) ? "aprovado" : "reprovado";

	        System.out.println("O aluno está " + status + ".");
	    }
}
