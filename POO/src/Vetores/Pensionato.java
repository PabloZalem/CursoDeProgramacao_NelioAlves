package Vetores;

import java.util.Scanner;

public class Pensionato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxStudents = 5; // Defina o número máximo de estudantes no pensionato
        Estudante[] estudantes = new Estudante[maxStudents];

        while (true) {
            System.out.println("----- Pensionato -----");
            System.out.println("1 - Adicionar estudante");
            System.out.println("2 - Remover estudante");
            System.out.println("3 - Mostrar estudantes");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha após o número

            switch (opcao) {
                case 1:
                    adicionarEstudante(estudantes, scanner);
                    break;
                case 2:
                    removerEstudante(estudantes, scanner);
                    break;
                case 3:
                    mostrarEstudantes(estudantes);
                    break;
                case 4:
                    System.out.println("Encerrando o programa.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }

    private static void adicionarEstudante(Estudante[] estudantes, Scanner scanner) {
        System.out.print("Digite o nome do estudante: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o curso do estudante: ");
        String curso = scanner.nextLine();

        for (int i = 0; i < estudantes.length; i++) {
            if (estudantes[i] == null) {
                estudantes[i] = new Estudante(nome, curso);
                System.out.println("Estudante adicionado com sucesso!");
                return;
            }
        }
        System.out.println("Não é possível adicionar mais estudantes. Pensionato cheio!");
    }

    private static void removerEstudante(Estudante[] estudantes, Scanner scanner) {
        System.out.print("Digite o nome do estudante a ser removido: ");
        String nomeRemover = scanner.nextLine();

        for (int i = 0; i < estudantes.length; i++) {
            if (estudantes[i] != null && estudantes[i].getNome().equals(nomeRemover)) {
                estudantes[i] = null;
                System.out.println("Estudante removido com sucesso!");
                return;
            }
        }
        System.out.println("Estudante não encontrado!");
    }

    private static void mostrarEstudantes(Estudante[] estudantes) {
        System.out.println("----- Lista de Estudantes -----");
        for (Estudante estudante : estudantes) {
            if (estudante != null) {
                System.out.println(estudante);
            }
        }
        System.out.println("-----------------------------");
    }
}

class Estudante {
    private String nome;
    private String curso;

    public Estudante(String nome, String curso) {
        this.nome = nome;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Curso: " + curso;
    }
}
